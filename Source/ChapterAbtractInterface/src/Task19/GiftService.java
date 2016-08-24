package Task19;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 24/8/2016
 * Version: V1.0
 * Description: this is main class for gift service
 */
public class GiftService {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Import information for gift box");
            System.out.print("Shape: ");
            String shape = input.nextLine();
            System.out.print("Color: ");
            String color = input.nextLine();
            
            GiftBox gb = new GiftBox(shape, color);
            GiftBox.Gift gift = gb.new Gift(null, 0d);
            
            System.out.print("Import information for gift");
            System.out.print("Name: ");
            gift.name = input.nextLine();
            System.out.println("Weight: ");
            gift.weight = input.nextDouble();
            
            System.out.println(gift.toString());
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
