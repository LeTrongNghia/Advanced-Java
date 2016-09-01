package Task31;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author SockLaoGia
 * @version 1.0
 * @created 01-Sep-2016 2:12:41 PM
 */
public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Import type AoDai (1)Traditional (2)Modern");
            int type = input.nextInt();
            switch (type) {
                case 1: {
                    Factory f = new FactoryTraditional();
                    AoDai m = f.sew();
                    System.out.println(m.getAoDai());
                } break;
                
                case 2: {
                    Factory f = new FactoryTraditional();
                    AoDai m = f.sew();
                    System.out.println(m.getAoDai());
                } break;
                default:
                    throw new InputMismatchException("Dont know");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
