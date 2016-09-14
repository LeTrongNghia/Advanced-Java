package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.regex.Pattern;

/* Author: Lê Trọng Nghia
 * Date: 13/9/2016
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
            String languageDefault = "en";
            String countryDefault = "US";
            Locale currentLocal = new Locale(languageDefault, countryDefault);
            ResourceBundle message = ResourceBundle.getBundle("Task2/resource_en_US", currentLocal);
            
            Scanner input = new Scanner(System.in);
            System.out.println(message.getString("selectlang"));
            System.out.println("(1)" + message.getString("english") + "(2)" + message.getString("vietnames"));
            int select = input.nextInt();
            switch (select) {
                case 1:
                    languageDefault = "en";
                    countryDefault = "US";
                    currentLocal = new Locale(languageDefault, countryDefault);
                    message = ResourceBundle.getBundle("Task2/resource_en_US", currentLocal);
                    break;
                case 2:
                    languageDefault = "vi";
                    countryDefault = "VN";
                    currentLocal = new Locale(languageDefault, countryDefault);
                    message = ResourceBundle.getBundle("Task2/resource_vi_VN", currentLocal);
                    break;
                default:
                    return;
            }
            int stop = 1;
            do {
                System.out.println(message.getString("import"));
                System.out.print(message.getString("id") + ": ");
                String id = input.next();
                System.out.print(message.getString("name") + ": ");
                String name = input.next();
                System.out.print(message.getString("singer") + ": ");
                String singer = input.next();
                System.out.print(message.getString("number") + ": ");
                int numberOfSong = input.nextInt();
                if (numberOfSong <= 0)
                    throw new InputMismatchException(message.getString("check"));
                System.out.print(message.getString("price") + ": ");
                double price = input.nextDouble();
                if (price <= 0)
                    throw new InputMismatchException(message.getString("check"));
                CD cd = new CD(id, name, singer, numberOfSong, price);
                listCD.add(cd);
                Collections.sort(listCD);
                printList(listCD);
                System.out.println(message.getString("sumprice") + calTotalPrice(listCD));
                System.out.println(message.getString("continue"));
                System.out.println("(1)" + message.getString("yes") + "(2)" + message.getString("no"));
                stop = input.nextInt();
                if (stop != 1 && stop != 2)
                    throw new InputMismatchException(message.getString("check"));
            }while (stop == 1);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
