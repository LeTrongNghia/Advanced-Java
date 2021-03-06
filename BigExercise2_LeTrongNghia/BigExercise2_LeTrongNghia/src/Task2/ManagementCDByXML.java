package Task2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Le Trong Nghia
 * @date Sep 20, 2016
 * @version 1.0
 * @description class for ManagementCDByXML
 */
public class ManagementCDByXML {

	/*
	 * use to write list cd on ManageCD.xml
	 * input List<CD>
	 */
	public static void writeXML(List<CD> list){
		
		Path path = Paths.get("src/Task2/manageCD.xml");
		
		//check file is exists
		if(!Files.exists(path)){
			File file = new File("src/Task2/manageCD.xml");
		}
		
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			
			//create root elements
			Document doc = builder.newDocument();
			Element rootElement = doc.createElement("CDs");
			doc.appendChild(rootElement);
			
			for(int i = 0; i < list.size(); i++){
				CD c = list.get(i);
				
				//cd element
				Element cd = doc.createElement("CD");
				rootElement.appendChild(cd);
				
				//id element
				Element id = doc.createElement("id");
				id.appendChild(doc.createTextNode(String.valueOf(c.getId())));
				cd.appendChild(id);
				
				//name element
				Element name = doc.createElement("name");
				name.appendChild(doc.createTextNode(c.getName()));
				cd.appendChild(name);
				
				//singer element
				Element singer = doc.createElement("singer");
				singer.appendChild(doc.createTextNode(c.getSinger()));
				cd.appendChild(singer);
				
				//number of songs element
				Element numberSongs = doc.createElement("numbersongs");
				numberSongs.appendChild(doc.createTextNode(String.valueOf(c.getNumberOfSongs())));
				cd.appendChild(numberSongs);
				
				//price element
				Element price = doc.createElement("price");
				price.appendChild(doc.createTextNode(String.valueOf(c.getPrice())));
				cd.appendChild(price);
				
			}
			//Write the information into file manageCD.xml
			TransformerFactory tranformer = TransformerFactory.newInstance();
			Transformer tf = tranformer.newTransformer();
			tf.setOutputProperty(OutputKeys.INDENT, "yes");
			tf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("src/Task2/manageCD.xml"));
			tf.transform(source, result);
			
		} catch (ParserConfigurationException | TransformerException e) {
			System.err.println(e.getMessage());
		}
		
	}
	
	/*
	 * use to get node list by tag name
	 * input String path, String name
	 * output node list
	 */
	public static NodeList readListNode(String path, String name){
		
		File fXmlFile = new File(path);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		NodeList nList = null;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			nList = doc.getElementsByTagName(name);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.err.println(e.getMessage());
		}
		return nList;
	}
	
	
	/*
	 * use to read file xml
	 * output List<CD>
	 */
	public static List<CD> readXML(){
		List<CD> list = new ArrayList<CD>();
		NodeList nList = readListNode("src/Task2/manageCD.xml", "CD");
		if(nList != null){
			for(int i = 0; i < nList.getLength(); i++){
				Node node = nList.item(i);
				Element element = (Element) node;
				String name = element.getElementsByTagName("name").item(0).getChildNodes().item(0).getNodeValue();
				int id = Integer.parseInt(element.getElementsByTagName("id").item(0).getTextContent());
				String singer =  element.getElementsByTagName("singer").item(0).getChildNodes().item(0).getNodeValue();
				int number = Integer.parseInt(element.getElementsByTagName("numbersongs").item(0).getChildNodes().item(0).getNodeValue());
				double price = Double.parseDouble(element.getElementsByTagName("price").item(0).getChildNodes().item(0).getNodeValue());
				CD cd = new CD(id, name, singer, number, price);
				list.add(cd);
			}
		}
		return list;
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try {

			CDController control = new CDController();
			List<CD> list = control.getListCD();
		
			writeXML(list);
			list = readXML();
			list.forEach(e -> System.out.println(e.toString()));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
