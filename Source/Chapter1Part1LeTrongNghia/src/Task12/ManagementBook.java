package Task12;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for ReferenceBook
 */
public class ManagementBook {
	public static Scanner input = new Scanner(System.in);
	
	/*
	 * Summary: use to import information Book
	 */
	public static void importBook(Book b) {
		System.out.print("Id: ");
		b.id = input.next();
		System.out.print("Date: ");
		b.date = input.next();
		System.out.print("Name: ");
		b.name = input.next();
		System.out.print("Number of: ");
		b.numberOf = input.nextInt();
		System.out.print("Publish: ");
		b.publish = input.next();
		System.out.println("Unit price: ");
		b.unitPrice = input.nextDouble();
	}
	
	/*
	 * Summary: use to import information TextBook
	 */
	public static void importTextBook(TextBook t) {
		System.out.print("Status: ");
		t.setStatus(input.next());
	}
	
	/*
	 * Summary: use to import information Reference book
	 */
	public static void importRefer(ReferenceBook r) {
		System.out.print("Tax: ");
		r.setTax(input.nextInt());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ListBook list = new ListBook();
			String choose = "";
			do {
				Book b = new Book(null, null, null, 0, 0, null);
				System.out.println("Import information for Book");
				importBook(b);
				System.out.println("Choose type: ");
				System.out.println("(1)TextBook. (2)ReferenceBook");
				int type = input.nextInt();
				switch (type) {
					case 1: {
						TextBook text = new TextBook(b.id, b.name, b.date, b.unitPrice, b.numberOf, b.publish, null);
						System.out.println("import information for Text book");
						importTextBook(text);
						list.add(text);
					} break;
					case 2: {
						ReferenceBook refer = new ReferenceBook(b.id, b.name, b.date, b.unitPrice, b.numberOf, b.publish, 0);
						System.out.println("import information for Reference book");
						importRefer(refer);
						list.add(refer);
					} break;
					default:
						throw new InputMismatchException("Don't know");
				}
				list.print();
				System.out.println("Continue? Y/N");
				choose = (input.next().toUpperCase());
			} while (choose.equals("Y"));
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
