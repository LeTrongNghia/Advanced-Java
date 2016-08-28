package Task13;

import java.util.InputMismatchException;
import java.util.Scanner;

import Task6.Employee;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this is main class
 */
public class CalculatorSalary {

	public static Scanner input = new Scanner(System.in);
	
	/*
	 * Summary: use to import information Employee
	 */
	public static void importEmployee(Employee e) {
		System.out.print("Name: ");
		e.setName(input.next());
		System.out.print("Allowance: ");
		e.setAllowance(input.nextDouble());
		System.out.print("Number of dependent: ");
		e.setnOD(input.nextInt());
		System.out.print("way coefficient: ");
		e.setWayCoe(input.nextFloat());
	}
	
	/*
	 * Summary: use to import information Saler
	 */
	public static void importSaler(Saler s) {
		System.out.print("Salary sale: ");
		s.salarySale = input.nextDouble();
		System.out.println("Salary rate: ");
		s.saleRate = input.nextInt();
	}
	
	/*
	 * Summary: use to import information producer
	 */
	public static void importProducer(Producer p) {
		System.out.println("Number of product: ");
		p.numberOfProduct = input.nextInt();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ListEmployee list = new ListEmployee();
			String choose = "";
			do {
				Employee e = new Employee();
				System.out.println("Import information for Employee");
				importEmployee(e);
				System.out.println("Choose type: ");
				System.out.println("(1)Saler. (2)Producer");
				int type = input.nextInt();
				switch (type) {
					case 1: {
						Saler s = new Saler(e.name, e.nOD, e.allowance, e.wayCoe, 0, 0);
						System.out.println("import information for Saler");
						importSaler(s);
						list.add(s);
					} break;
					case 2: {
						Producer pro = new Producer(e.name, e.nOD, e.allowance, e.wayCoe, 0);
						System.out.println("import information for producer");
						importProducer(pro);
						list.add(pro);
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
