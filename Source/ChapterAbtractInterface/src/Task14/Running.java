package Task14;

import java.awt.geom.RectangularShape;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this is main class
 */
public class Running {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("Type shape:");
			System.out.println("(1)Cirle (2)Retangle (3)Square");
			int type = input.nextInt();
			switch (type) {
				case 1: {
					Circle c = new Circle(0);
					System.out.print("Import r:");
					c.r = input.nextDouble();
					System.out.println("Perimete: " + c.perimeter());
					System.out.println("Area: " + c.area());
				} break;
				case 2: {
					Retangle r = new Retangle(0, 0);
					System.out.print("Import width: ");
					r.width = input.nextDouble();
					System.out.print("Import height: ");
					r.height = input.nextDouble();
					System.out.println("Perimete: " + r.perimeter());
					System.out.println("Area: " + r.area());
				} break;
				case 3: {
					Square s = new Square(0);
					System.out.print("Import edge:");
					s.edge = input.nextDouble();
					System.out.println("Perimete: " + s.perimeter());
					System.out.println("Area: " + s.area());
				} break;
				default:
					throw new InputMismatchException("Please you check again");
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
