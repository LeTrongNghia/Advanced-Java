package Task9;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this is main class
 */
public class ManagementComputer {
	public static Scanner input = new Scanner(System.in);
	
	/*
	 * Summary: use to import information computer
	 */
	public static void importComputer(Computer c) {
		System.out.print("Id: ");
		c.Id = input.next();
		System.out.print("Manufacturer: ");
		c.manufacturer = input.next();
		System.out.print("Unit price: ");
		c.unitPrice = input.nextDouble();
		System.out.print("Number: ");
		c.numberOf = input.nextInt();
		c.validate();
	}
	
	/*
	 * Summary: use to import information Desktop
	 */
	public static void importDesktop(Desktop d) {
		System.out.print("Cpu: ");
		d.setCpu(input.next());
		System.out.print("Ram: ");
		d.setRam(input.next());
	}
	
	/*
	 * Summary: use to import information Desktop
	 */
	public static void importLaptop(Laptop l) {
		System.out.print("Weight: ");
		l.setWeight(input.nextFloat());
		System.out.print("Baretty: ");
		l.setBaretty(input.nextFloat());
		System.out.print("Screen: ");
		l.setSizeScreen(input.nextFloat());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ListComputer list = new ListComputer();
			String choose = "";
			do {
				Computer c = new Computer(null, 0, null, 0);
				System.out.println("Import information for computer");
				importComputer(c);
				System.out.println("Choose type: ");
				System.out.println("(1) Desktop. (2) Laptop");
				int type = input.nextInt();
				switch (type) {
					case 1: {
						Desktop des = new Desktop(c.Id, c.unitPrice, c.manufacturer, c.numberOf, null, null);
						System.out.println("import information for desktop");
						importDesktop(des);
						list.add(des);
					} break;
					case 2: {
						Laptop lap = new Laptop(c.Id, c.unitPrice, c.manufacturer, c.numberOf, 0, 0 , 0);
						System.out.println("import information for laptop");
						importLaptop(lap);
						list.add(lap);
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
