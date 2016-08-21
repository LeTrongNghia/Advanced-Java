package Task4;

import java.util.InputMismatchException;
import java.util.Scanner;

import Task3.Pointer;
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
			Pointer pointO = new Pointer();
			Pointer pointR = new Pointer();
			System.out.println("Import awaypoint O:");
			importPoint(pointO);
			System.out.println("Import awaypoint R:");
			importPoint(pointR);
			Circle circle = new Circle(pointO, pointR);
			if (circle.getRadius() == 0)
				System.out.println("This is not circle");
			else {
				System.out.println("Peprimeter = " + circle.calculatePeprimeter());
				System.out.println("Area = " + circle.calculateArea());
			}
		} catch (InputMismatchException e) {
			System.out.println("Error " + e.getMessage());
		}
	}

}
