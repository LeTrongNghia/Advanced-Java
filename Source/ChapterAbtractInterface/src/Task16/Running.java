package Task16;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this is main class
 */
public class Running {

public static Scanner input = new Scanner(System.in);
	
	/*
	 * Summary: use to import information car
	 */
	public static void importCar(Car c) {
		System.out.print("Gear: ");
		c.gear = input.next();
		System.out.print("Model: ");
		c.model = input.next();
	}
	
	/*
	 * Summary: use to import information producer
	 */
	public static void importShip(Ship s) {
		System.out.print("Weight: ");
		s.weight = input.nextFloat();
		System.out.println("Load: ");
		s.load = input.nextFloat();
		System.out.print("Speed straight: ");
		s.SpeedStraight = input.nextFloat();
		System.out.print("Speed reverse: ");
		s.speedReverse = input.nextFloat();
		System.out.print("Spend to start: ");
		s.spentToStart = input.nextFloat();
		System.out.print("Type fuel: ");
		s.typeFuel = input.next();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ListVehicle list = new ListVehicle();
			System.out.println("Import information vehicle");
			System.out.print("Id: ");
			String id = input.next();
			System.out.print("Owner: ");
			String owner = input.next();
			System.out.print("Color: ");
			String color = input.next();
			System.out.print("Manufacturer: ");
			String manufacturer = input.next();
			System.out.print("Distance: ");
			float distance = input.nextFloat();
			System.out.print("Time: ");
			float time = input.nextFloat();
			System.out.print("Use fuel: ");
			float useFuel = input.nextFloat();
			String choose = "";
			do {
				System.out.println("Choose type: ");
				System.out.println("(1)Car. (2)Ship");
				int type = input.nextInt();
				switch (type) {
					case 1: {
						Car c = new Car(distance, time, useFuel, id, owner, color, manufacturer, null, null);
						System.out.println("import information for Car");
						importCar(c);
						list.add(c);
					} break;
					case 2: {
						Ship ship = new Ship(distance, time, useFuel, id, owner, color, manufacturer, 0, 0, 0, 0, 0, null);
						System.out.println("import information for ship");
						importShip(ship);
						list.add(ship);
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
