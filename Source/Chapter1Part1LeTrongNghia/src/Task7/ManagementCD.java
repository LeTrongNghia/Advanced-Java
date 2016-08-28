package Task7;
/* Author: Lê Trọng Nghia
 * Date: 20/8/2016
 * Version: V1.0
 * Description: this is main class
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManagementCD {
	public static Scanner input = new Scanner(System.in);
	public static void importCD(CD x) {
		System.out.print("ID: ");
		x.setId(input.nextInt());
		System.out.print("Name: ");
		x.setName(input.next());
		System.out.print("Singer: ");
		x.setSinger(input.next());
		System.out.print("Number of song: ");
		x.setNumberOfSong(input.nextInt());
		System.out.print("Price: ");
		x.setPrice(input.nextDouble());
		if (x.getPrice() < 0 || x.getNumberOfSong() < 0)
			throw new InputMismatchException("Please you check again");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ListCD m = new ListCD();
			boolean stop = false;
			while (stop == false) {
				System.out.println("Do you want to add CD?");
				String w = input.next();
				switch (w.toUpperCase()) {
					case "N":
						stop = true;
						break;
					case "Y": {
						CD cd = new CD();
						System.out.println("Import informationCD:");
						importCD(cd);
						m.add(cd);
						m.printInfo();
					} break;
					default:
						throw new InputMismatchException("Please you check again");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
