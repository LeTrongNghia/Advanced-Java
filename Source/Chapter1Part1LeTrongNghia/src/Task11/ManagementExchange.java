package Task11;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this is main class
 */
public class ManagementExchange {
public static Scanner input = new Scanner(System.in);
	
	/*
	 * Summary: use to import information Exchange
	 */
	public static void importExchange(Exchange e) {
		System.out.print("Id: ");
		e.id = input.next();
		System.out.print("Date: ");
		e.date = input.next();
		System.out.print("Number of: ");
		e.numberOf = input.nextInt();
	}
	
	/*
	 * Summary: use to import information Gold
	 */
	public static void importGold(Gold g) {
		System.out.print("Type 24k / 18k: ");
		g.type = input.next();
	}
	
	/*
	 * Summary: use to import information Student
	 */
	public static void importMoney(Money m) {
		System.out.print("Type USD/AUD/EUD ");
		m.type = input.next();
		System.out.print("Type exchange Buy/Sell");
		m.typeExchange = input.next();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListExchange list = new ListExchange();
		try {
			String choose = "";
			do {
				Exchange e = new Exchange(null, null, 0);
				System.out.println("Import information for Exchange");
				importExchange(e);
				System.out.println("Choose type: ");
				System.out.println("(1)Gold. (2)Money");
				int type = input.nextInt();
				switch (type) {
					case 1: {
						Gold g = new Gold(e.id, e.date, e.numberOf, null);
						System.out.println("import information for exchange gold");
						importGold(g);
						list.add(g);
					} break;
					case 2: {
						Money m = new Money(e.id, e.date, e.numberOf, null, null);
						System.out.println("import information for exchange money");
						importMoney(m);
						list.add(m);
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
