package Task5;

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
	
	public static void importPoint(Pointer a) {
		System.out.print("x = ");
		float x = input.nextFloat();
		a.setX(x);
		System.out.print("y = ");
		float y = input.nextFloat();
		a.setY(y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Pointer pointA = new Pointer();
			Pointer pointB = new Pointer();
			System.out.println("Import waypoint A");
			importPoint(pointA);
			System.out.println("Import waypoint B");
			importPoint(pointB);
			Rectangle rec = new Rectangle(pointA, pointB);
			if (rec.calculateHeight() == 0 || rec.calculateWidth() == 0) {
				System.out.println("This is not rectangle");
			}
			else {
				System.out.println("Perimete is " + rec.calculatePerimete());
				System.out.println("Area is " + rec.calculateArea());
			}
		} catch (InputMismatchException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
