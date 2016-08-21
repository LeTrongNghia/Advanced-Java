package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Author: Lê Trọng Nghia
 * Date: 19/8/2016
 * Version: V1.0
 * Description: this is main class
 */
public class Running {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("a = ");
			float a = input.nextFloat();
			System.out.print("b = ");
			float b = input.nextFloat();
			if(b == 0)
				throw new InputMismatchException("b must different 0");
			Calculator cal = new Calculator(a, b);
			System.out.println("a + b = " + cal.add());
			System.out.println("a - b = " + cal.sub());
			System.out.println("a x b = " + cal.multiplicate());
			System.out.println("a : b = " + cal.div());
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
