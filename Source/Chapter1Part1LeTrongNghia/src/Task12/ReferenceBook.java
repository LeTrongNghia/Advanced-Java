package Task12;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for ReferenceBook
 */
public class ReferenceBook extends Book{
	private int tax;

	public ReferenceBook(String id, String name, String date, double unitPrice, int numberOf, String publish,
			int tax) {
		super(id, name, date, unitPrice, numberOf, publish);
		this.tax = tax;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}
	
	/*
	 * Use to print information reference book
	 */
	public String toString() {
		return "Id: " + id + "\nName: " + name + "\nDate: " + date + "\nUnitPrice: " + unitPrice
				+ "\nNumberOf: " + numberOf + "\nPublish: " + publish + "\nTotal money: " + calcualateTTotal();
	}
	
	/*
	 * Use to calculate total money
	 */
	public long calcualateTTotal() {
		return (long)((numberOf * unitPrice) + (numberOf * unitPrice * tax / 100));
	}
}
