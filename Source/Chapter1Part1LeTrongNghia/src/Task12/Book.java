package Task12;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for Book
 */
public class Book {
	public String id;
	public String name;
	public String date;
	public double unitPrice;
	public int numberOf;
	public String publish;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getNumberOf() {
		return numberOf;
	}
	public void setNumberOf(int numberOf) {
		this.numberOf = numberOf;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public Book(String id, String name, String date, double unitPrice, int numberOf, String publish) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.unitPrice = unitPrice;
		this.numberOf = numberOf;
		this.publish = publish;
	}
	
	/*
	 * Use to print information Book
	 */
	public String toString() {
		return "Id: " + id + "\nName: " + name + "\nDate: " + date + "\nUnitPrice: " + unitPrice
				+ "\nNumberOf: " + numberOf + "\nPublish: " + publish;
	}
}
