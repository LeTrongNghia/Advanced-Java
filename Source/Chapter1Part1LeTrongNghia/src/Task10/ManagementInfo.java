package Task10;

import java.util.InputMismatchException;
import java.util.Scanner;

import Task9.Computer;
import Task9.Desktop;
import Task9.Laptop;
import Task9.ListComputer;

/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class define for Human
 */
public class ManagementInfo {

	public static Scanner input = new Scanner(System.in);
	
	/*
	 * Summary: use to import information Human
	 */
	public static void importHuman(Human h) {
		System.out.print("Name: ");
		h.name = input.next();
		System.out.print("Date of birth: ");
		h.birthOfDay = input.next();
		System.out.print("Address: ");
		h.address = input.next();
		System.out.print("phone number: ");
		h.phoneNumber = input.next();
	}
	
	/*
	 * Summary: use to import information Teacher
	 */
	public static void importTeacher(Teacher t) {
		System.out.print("Way coefficient : ");
		t.setWayCoe(input.nextFloat());
		System.out.print("Allowance: ");
		t.setAllowance(input.nextDouble());
		System.out.print("leader of class: ");
		t.setClassLeader(input.next());
		t.validate();
	}
	
	/*
	 * Summary: use to import information Student
	 */
	public static void importStudent(Student s) {
		System.out.print("Student of class : ");
		s.setStudentOfClass(input.next());
		System.out.print("Score semeter 1: ");
		s.setScoreSemeter1(input.nextFloat());
		System.out.print("Score semeter 2: ");
		s.setScoreSemeter2(input.nextFloat());
		s.validate();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListHuman list = new ListHuman();
		try {
			String choose = "";
			do {
				Human h = new Human(null, null, null, null);
				System.out.println("Import information for Human");
				importHuman(h);
				System.out.println("Choose type: ");
				System.out.println("(1)Teacher. (2)Student");
				int type = input.nextInt();
				switch (type) {
					case 1: {
						Teacher tea = new Teacher(h.name, h.birthOfDay, h.address, h.phoneNumber, "", 0, 0);
						System.out.println("import information for teacher");
						importTeacher(tea);
						list.add(tea);
					} break;
					case 2: {
						Student stu = new Student(h.name, h.birthOfDay, h.address, h.phoneNumber, null, 0, 0);
						System.out.println("import information for student");
						importStudent(stu);
						list.add(stu);
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
