package Task2_5;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 8/9/2016
 * Version: V1.0
 * Description: this is main class
 */

public class ManagementEmployee {
    public static Scanner input = new Scanner(System.in);
    
    /*
     * print list buy sort allow salary 
     */
    public static void printList(ArrayList<Employee> list) {
        Collections.sort(list);
        for (Employee employee : list) {
            System.out.println(employee.toString());
            System.out.println("---------------------------------");
        }
        
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
            ArrayList<Employee> listEmployee = new ArrayList<Employee>();
            Employee emp1 = new Employee("Huy", 18, 1200000);
            Employee emp2 = new Employee("Nghia", 18, 1500000);
            Employee emp3 = new Employee("Phuong", 18, 1300000);
            listEmployee.add(emp1);
            listEmployee.add(emp2);
            listEmployee.add(emp3);
            int stop = 1;
            do {
                System.out.println("Select function");
                System.out.println("(1)Add employee (2)Print list");
                int choose = input.nextInt();
                switch (choose) {
                    case 1: {
                        System.out.println("Import information employee");
                        System.out.print("Import name: ");
                        String name = input.next();
                        System.out.print("Import age: ");
                        int age = input.nextInt();
                        System.out.print("Import salary: ");
                        long salary = input.nextLong();
                        Employee emp = new Employee(name, age, salary);
                        listEmployee.add(emp);
                    } break;
                    case 2: {
                        System.out.println("Information list");
                        printList(listEmployee);
                    } break;
                    default:
                        throw new InputMismatchException("Please you check again");
                }
                System.out.println("Do you continue?");
                System.out.println("(1)Yes (2)No");
                stop = input.nextInt();
                if (stop != 1 && stop != 2)
                    throw new InputMismatchException("Please you check again");
            }while (stop == 1);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
