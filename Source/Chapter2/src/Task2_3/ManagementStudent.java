package Task2_3;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Task2_2.WordEnglish;

/* Author: Lê Trọng Nghia
 * Date: 7/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class ManagementStudent {
    public static Scanner input = new Scanner(System.in);
    
    /*
     * print liststudent
     */
    public static void printList(TreeMap<Integer,Student> list) {
        for (Map.Entry<Integer,Student> entrySet : list.entrySet()) {
            System.out.println("Id: " + entrySet.getKey() + "-" + entrySet.getValue().toString());
        }
    }
    
    /*
     * search student
     */
    public static void searchStudent(TreeMap<Integer,Student> list, Integer key) {
        int count = 0;
        for (Map.Entry<Integer,Student> entrySet : list.entrySet()) {
            if (entrySet.getKey() == key) {
                System.out.println("Id: " + entrySet.getKey() + "-" + entrySet.getValue().toString());
                count++;
            }  
        }
        if (count == 0)
            System.out.println("Not found");
    }
    
    /*
     * remove student
     */
    public static void removeStudent(TreeMap<Integer,Student> list,int key) {
       if(list.containsKey(key) == false)
           System.out.println("Remove failed");
       else{
           list.remove(key);
           System.out.println("Success");
       }
           
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        try{
            TreeMap<Integer,Student> listStudent = new TreeMap<Integer,Student>();
            Student s1 = new Student("Huy", 18, "HCM");
            Student s2 = new Student("Nghia", 18, "HCM");
            listStudent.put(1, s1);
            listStudent.put(2, s2);
            int stop = 0;
            do {
                System.out.println("Do you choose function?");
                System.out.println("(1)Add Student (2)Search (3)Remove (4)Show listStudent (5)Exit");
                int choose = input.nextInt();
                switch (choose) {
                    case 1: {
                        System.out.println("Import id student: ");
                        int key = input.nextInt();
                        if (key < 0)
                            throw new InputMismatchException("Please you check again");
                        System.out.println("Import name: ");
                        String name = input.next();
                        System.out.println("Import age: ");
                        int age = input.nextInt();
                        if (key < 0)
                            throw new InputMismatchException("Please you check again");
                        System.out.println("Import placeOfbirth: ");
                        String placeOfBirth = input.next();
                        Student s = new Student(name, age, placeOfBirth);
                        listStudent.put(key, s);
                    }break;
                    case 2: {
                        System.out.print("Import id student which you want to search: ");
                        Integer key = input.nextInt();
                        searchStudent(listStudent, key);
                    }break;
                    case 3: {
                        System.out.println("Import id student wich you want to remove");
                        System.out.println("Import id student: ");
                        int key = input.nextInt();
                        removeStudent(listStudent, key);
                    }break;
                    case 4: {
                        System.out.println("All studnet:");
                        printList(listStudent);
                    }break;
                    case 5:
                        stop = 5;
                        break;
                    default:
                        throw new InputMismatchException("Please check again");
                }
            }while(stop == 0);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
