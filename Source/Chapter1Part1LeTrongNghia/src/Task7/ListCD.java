package Task7;
/* Author: Lê Trọng Nghia
 * Date: 20/8/2016
 * Version: V1.0
 * Description: this class use to manage list CD
 */
public class ListCD {
	public CD[] listCD = new CD[100];
	public int count = 0;
	

	public ListCD() {
	}

	/*
	 * this method use to print information list CD
	 */
	public void printInfo() {
		System.out.println("---Information of list cd---");
		for(int i = 0; i < this.count; i++) {
			System.out.println("CD no " + i);
			System.out.println(this.listCD[i].toString());
		}
		System.out.println("Total: " + sumPrice());
	}
	
	/*
	 * this method use to sum price listCD
	 */
	public double sumPrice() {
		double tong = 0;
		for(int i = 0; i < this.count; i++) {
			tong += listCD[i].getPrice();
		}
		return tong;
	}
	
	/*
	 * this method use to add CD
	 */
	public void add(CD a) {
		this.listCD[this.count] = a;
		this.count = this.count + 1;
	}
}
