package Task9;

import java.util.InputMismatchException;

/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class use to define computer
 */
public class Computer {
	public String Id;
	public double unitPrice;
	public String manufacturer;
	public int numberOf;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getManufactuer() {
		return manufacturer;
	}
	public void setManufactuer(String manufactuer) {
		this.manufacturer = manufactuer;
	}
	public int getNumberOf() {
		return numberOf;
	}
	public void setNumberOf(int numberOf) {
		this.numberOf = numberOf;
	}
	
	public Computer(String id, double unitPrice, String manufactuer, int numberOf) {
		super();
		Id = id;
		this.unitPrice = unitPrice;
		this.manufacturer = manufactuer;
		this.numberOf = numberOf;
	}
	
	/*
	 * Summary: use to calculate money for computer
	 * output: double total money
	 */
	public double calculatorMoney() {
		return this.numberOf * this.unitPrice;
	}
	
	/*
	 * Summary: use to print information computer
	 * output: String information computer include id, manufacturer and unit price
	 */
	public String toString() {
		return "Id: " + this.Id + "\nManufacturer: " + this.manufacturer + "\nUnit price: " + this.unitPrice;
	}
	
	/*
	 * Summary: use to validate unitprice must > 0 and numberOf must > 0
	 */
	public void validate() {
		if (this.unitPrice <= 0 || this.numberOf <= 0)
			throw new InputMismatchException("Please you check information again");
	}
}
