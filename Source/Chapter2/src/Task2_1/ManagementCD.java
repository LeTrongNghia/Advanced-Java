package Task2_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/* Author: Lê Trọng Nghia
 * Date: 7/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class ManagementCD {
    public static Scanner input = new Scanner(System.in);
    
    /*
     * use to calculate total price of listCD
     * return double
     */
    public static double calTotalPrice(List<CD> listCD) {
        double total = 0;
        for (CD cd : listCD) {
            total += cd.price;
        }
        return total; 
    }
    
    /*
     * use to print listCD
     */
    public static void printList(List<CD> listCD) {
        for (CD cd : listCD) {
            System.out.println(cd.toString());
        }
        System.out.println("-----------------------------------");
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List listCD = new ArrayList();
        Pattern p = Pattern.compile("");
        try{
            int stop = 1;
            do {
                System.out.println("Import infomation CD");
                System.out.print("Id: ");
                String id = input.next();
                System.out.print("Name: ");
                String name = input.next();
                System.out.print("Singer: ");
                String singer = input.next();
                System.out.print("Number of song: ");
                int numberOfSong = input.nextInt();
                if (numberOfSong <= 0)
                    throw new InputMismatchException("Please you check again");
                System.out.print("Price: ");
                double price = input.nextDouble();
                if (price <= 0)
                    throw new InputMismatchException("Please you check again");
                CD cd = new CD(id, name, singer, numberOfSong, price);
                listCD.add(cd);
                Collections.sort(listCD);
                printList(listCD);
                System.out.println("Total price: " + calTotalPrice(listCD));
                System.out.println("Do you continue?");
                System.out.println("(1)Continue (2)Stop");
                stop = input.nextInt();
                if (stop != 1 && stop != 2)
                    throw new InputMismatchException("Please you check again");
            }while (stop == 1);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
