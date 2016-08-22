package Task11;

import java.util.InputMismatchException;

/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class define for exchange gold
 */
public class Gold extends Exchange{
	final double unitPrice24k = 3514100;
	final double unitPrice18k = 2597800;
	public String type;
	
	
	public Gold(String id, String date, int numberOf, String type) {
		super(id, date, numberOf);
		this.type = type;
	}

	/*
	 * Summary: use to calculate money
	 */
	public long calculateMoney() {
		long total = 0;
		switch (type) {
			case "24k":
				total = (long)unitPrice24k * this.numberOf;
				break;
			case "18k":
				total = (long)unitPrice18k * this.numberOf;
				break;
			default:
				throw new InputMismatchException("Please you check again");
		}
		return total;
	}
	
	/*
	 * Summary: use to print information Exchange Gold
	 */
	public String toString() {
		return "Id: " + id + "\nDate: " + date + "\nNumber of: " + numberOf 
				+ "\nType: " + type + "\nTotal money: " + calculateMoney();
	}
}
