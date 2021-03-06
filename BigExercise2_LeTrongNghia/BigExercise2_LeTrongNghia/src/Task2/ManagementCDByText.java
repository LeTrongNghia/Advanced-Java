package Task2;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Le Trong Nghia
 * @date Sep 20, 2016
 * @version 1.0
 * @description this is main class for ManagementCDByText
 */
public class ManagementCDByText {
	/*
	 * use to write list cd on managementCD.txt
	 * input List<CD>
	 */
	public static void writeTxt(List<CD> list) throws FileNotFoundException, IOException {
		ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(
				new FileOutputStream("src/Task2/manageCD.txt",false)));
		try {
			for(CD cd : list){
				out.writeObject(cd);
			}
			out.flush();
			out.close();
			System.out.println("write success!");
		} catch (IOException e) {
			System.err.println(e);
		}
	}
	
	/*
	 * use to read list cd on managementCD.txt
	 * output List<CD>
	 */
	public static List<CD> readTxt() throws ClassNotFoundException, IOException {
		List<CD> list = null;
		FileInputStream f = new FileInputStream("src/Task2/manageCD.txt");
		try {
			ObjectInputStream input = new ObjectInputStream(f);
			list = new ArrayList<CD>();
			while (true) {
				CD cd = (CD) input.readObject();
				list.add(cd);
			}
		} catch (EOFException eo) {
			
		} catch (StreamCorruptedException st) {
			System.err.println(st.getMessage());
		}
		printList(list);
		return list;
		
	}
	
	/*
	 * use to print list
	 * input List<CD>
	 */
	public static void printList(List<CD> list) {
		System.out.println("----------------List CD--------------");
		list.forEach(i -> System.out.println(i.toString()));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		try {
			CDController cdContoller = new CDController();
			List<CD> list = cdContoller.getListCD();
			
			writeTxt(list);
			
			list = readTxt();
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	
	}

}
