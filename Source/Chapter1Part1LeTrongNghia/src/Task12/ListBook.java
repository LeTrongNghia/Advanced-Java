package Task12;

import Task11.Exchange;
import Task11.Gold;
import Task11.Money;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for list book
 */
public class ListBook {
	Book[] list = new Book[100];
	public int count = 0;
	
	/*
	 * Summary use to add exchange in list.
	 * Parameter: Exchange object.
	 */
	public void add(Book b) {
		list[count] = b;
		count++;
	}
	
	/*
	 * Summary use to print information in list.
	 */
	public void print() {
		double totalTextBook = 0;
		int countTextBook = 0;
		double totalReferance = 0;
		int countRefer = 0;
		for (int i = 0; i < count; i++){
			System.out.println(list[i].toString());
			System.out.println("---------------------");
			if(list[i] instanceof TextBook) {
				totalTextBook += ((TextBook)list[i]).calculateTotalMoney();
				countTextBook++;
			} else {
				totalReferance += ((ReferenceBook)list[i]).calcualateTTotal();
				countRefer++;
			}
		}
		System.out.println("Total gold: " + (long)totalTextBook);
		System.out.println("Total money: " + (long)totalReferance);
		System.out.println("Avg gold: " + (long)(totalTextBook / countTextBook));
		System.out.println("Avg money: " + (long)(totalReferance / countRefer));
	}
}
