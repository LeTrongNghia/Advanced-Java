package Task8;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this is main class
 */
public class PlayingGame {
	public static Scanner input = new Scanner(System.in);
	
	/*
	 * Summary: use to import infomation Infantryman
	 * Parameter: object infantryman
	 */
	public static void importSoldier(Infantryman i) {
		System.out.print("Name: ");
		i.setName(input.next());
		System.out.print("Power: ");
		i.setPower(input.nextInt());
		if (i.getPower() < 0)
			throw new InputMismatchException("Please you check information again");
		System.out.print("Weapon: ");
		i.setWeapon(input.next());
	}
	
	/*
	 * Summary: use to import infomation trooper
	 * Parameter: object tropper
	 */
	public static void importSoldier(Trooper i) {
		System.out.print("Name: ");
		i.setName(input.next());
		System.out.print("Power: ");
		i.setPower(input.nextInt());
		if (i.getPower() <= 0)
			throw new InputMismatchException("Please you check information again");
		System.out.print("Weapon: ");
		i.setWeapon(input.next());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Infantryman inf = new Infantryman("", 0, "");
			Trooper trop = new Trooper("", 0, "");
			System.out.println("Import information for Infantryman");
			importSoldier(inf);
			System.out.println("Import information for trooper");
			importSoldier(trop);
			while (inf.getPower() > 0 && trop.getPower() > 0) {
				System.out.println("Choose (1)infantryman or (2)tropper");
				int choose = input.nextInt();
				switch (choose) {
					case 1: {
						trop.fight();
						System.out.println("Trooper: " + trop.getPower());
					} break;
					case 2: {
						inf.fight();
						System.out.println("Infantryman: " + inf.getPower());
					} break;
					default: 
						throw new InputMismatchException("don't know");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
