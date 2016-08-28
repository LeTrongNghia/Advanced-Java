package Task13;

import Task12.Book;
import Task12.ReferenceBook;
import Task12.TextBook;
import Task6.Employee;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for list employee
 */
public class ListEmployee {
	Employee[] list = new Employee[100];
	public int count = 0;
	
	/*
	 * Summary use to add employee in list.
	 * Parameter: Exchange object.
	 */
	public void add(Employee e) {
		list[count] = e;
		count++;
	}
	
	/*
	 * Summary use to print information in list.
	 */
	public void print() {
		double totalSaler = 0;
		int countSaler = 0;
		double totalProducer = 0;
		int countProducer = 0;
		for (int i = 0; i < count; i++){
			System.out.println(list[i].toString());
			System.out.println("---------------------");
			if(list[i] instanceof Saler) {
				totalSaler += ((Saler)list[i]).calculateRE();
				countSaler++;
			} else {
				totalProducer += ((Producer)list[i]).calculateRE();
				countProducer++;
			}
		}
		System.out.println("Total Producer: " + (long)totalProducer);
		System.out.println("Total Saler: " + (long)totalSaler);
		System.out.println("Avg Producer: " + (long)(totalProducer / countProducer));
		System.out.println("Avg Saler: " + (long)(totalSaler / countSaler));
	}
}
