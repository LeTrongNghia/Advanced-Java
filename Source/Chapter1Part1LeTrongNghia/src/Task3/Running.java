package Task3;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Author: Lê Trọng Nghia
 * Date: 19/8/2016
 * Version: V1.0
 * Description: this is main class
 */
public class Running {
	public static Scanner input = new Scanner(System.in);
	//Import awaypoints
	public static void importPoint(Pointer p) {
		System.out.print("x = ");
		float x = input.nextFloat();
		p.setX(x);
		System.out.print("y = ");
		float y = input.nextFloat();
		p.setY(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Pointer pointA = new Pointer();
			Pointer pointB = new Pointer();
			System.out.println("Import point A:");
			importPoint(pointA);
			System.out.println("Import point B:");
			importPoint(pointB);
			Distance distance = new Distance(pointA, pointB);
			System.out.println("Distance is: " + distance.getDistance());
		} catch (InputMismatchException e) {
			System.out.println("Error " + e.getMessage());
		}
	}

}

