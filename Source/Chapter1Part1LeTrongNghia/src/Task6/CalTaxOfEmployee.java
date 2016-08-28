package Task6;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 20/8/2016
 * Version: V1.0
 * Description: this is main class
 */
public class CalTaxOfEmployee {
	
	public static void validate(int nOD, double allow, float wc) {
		if(nOD < 0 || allow < 0 || wc <= 0)
			throw new InputMismatchException("Please you check information again");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Import name: ");
			String name = input.nextLine();
			System.out.print("Import number of dependents: ");
			int nOD = input.nextInt();
			System.out.print("Import allowance: ");
			double allowance = input.nextDouble();  
			System.out.print("Import way coefficient: ");
			float wc = input.nextFloat();
			validate(nOD, allowance, wc);
			Employee emp = new Employee(name, nOD, allowance, wc);
			System.out.println("Income: " + emp.calculateIncome());
			System.out.println("income taxable: " + emp.calculateIncomeTaxable());
			System.out.println("Person income tax: " + emp.calculatePIT());
			System.out.println("Real earnings: " + emp.calculateRE());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
