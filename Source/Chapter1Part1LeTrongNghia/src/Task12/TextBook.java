package Task12;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for Book
 */
public class TextBook extends Book{
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public TextBook(String id, String name, String date, double unitPrice, int numberOf, String publish,
			String status) {
		super(id, name, date, unitPrice, numberOf, publish);
		this.status = status;
	}
	
	/*
	 * use to calculatetotalMoney 
	 */
	public long calculateTotalMoney() {
		long total;
		if (status.toLowerCase().equals("new"))
			total = (long)(numberOf * unitPrice);
		else
			total = (long)(numberOf * unitPrice * 50 / 100);
		return total;
	}	
	
	/*
	 * Use to print information reference book
	 */
	public String toString() {
		return "Id: " + id + "\nName: " + name + "\nDate: " + date + "\nUnitPrice: " + unitPrice
				+ "\nNumberOf: " + numberOf + "\nPublish: " + publish + "\nTotal money: " + calculateTotalMoney();
	}
}
