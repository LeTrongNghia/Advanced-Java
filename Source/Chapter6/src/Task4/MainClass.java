package Task4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/* Author: Lê Trọng Nghia
 * Date: 14/9/2016
 * Version: V1.0
 * Description: class description information employee to calculate tax
 */
public class MainClass {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    /*
     * use to save employee in file
     * input Employee e
     */
    public static void write(Employee e) throws FileNotFoundException {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(
                    "/home/hocvien/workspace/Chapter6/src/Task4/document.txt",true)))) {
            out.writeObject(e);
        } catch (IOException ex) {
            System.out.print("Error: " + ex);
        }
    }
    
    /*
     * use to save employee in file
     * input Employee e
     */
    public static List<Employee> read() throws FileNotFoundException {
        List<Employee> list = new ArrayList<Employee>();
        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(
                        "/home/hocvien/workspace/Chapter6/src/Task4/document.txt")))) {
                while(true) {
                    Employee e = (Employee)in.readObject();
                    list.add(e);
                }
        } catch (ClassNotFoundException | IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return list;
    }
    
    /*
     * Search employee
     */
    public static Employee Search(List<Employee> list, String name) {
        Employee e = null;
        for (Employee employee : list) {
            if (employee.name.equalsIgnoreCase(name)) {
                e = employee;
            }
        }
        return e;
    }
    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        try {
            Employee e1 = new Employee("Lê Trọng Nghĩa", 2, 1000000, (float)2.3);
            Employee e2 = new Employee("Lê Trọng Nhân", 2, 1000000, (float)2.5);
            write(e1);
            write(e2);
            int stop = 1;
            while (stop == 1) {
                System.out.println("Select function");
                System.out.println("(1)Add employee (2)Print list (3)Search");
                int select = Integer.parseInt(input.readLine());
                switch(select) {
                    case 1: {
                        System.out.print("Import name: ");
                        String name = input.readLine();
                        System.out.print("Import number of dependence: ");
                        int nOD = Integer.parseInt(input.readLine());
                        System.out.print("Import allowance: ");
                        double allowance = Double.parseDouble(input.readLine());
                        System.out.print("Import wayCoe: ");
                        float wayCoe = Float.parseFloat(input.readLine());
                        Employee newEmp = new Employee(name, nOD, allowance, wayCoe);
                        write(newEmp);
                    } break;
                    case 2: {
                        List<Employee> list = read();
                        list.forEach(i -> System.out.println(i.toString()));
                    } break;
                    case 3: {
                        List<Employee> list = read();
                        System.out.print("Import name: ");
                        String name = input.readLine();
                        Employee search = Search(list, name);
                        System.out.println(search.toString());
                    } break;
                    default:
                        throw new InputMismatchException("Dont know");
                }
                System.out.println("Do you continue?");
                System.out.println("(1)Yes (2)No");
                stop = Integer.parseInt(input.readLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
