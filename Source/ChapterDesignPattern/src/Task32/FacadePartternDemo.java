package Task32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class FacadePartternDemo {

    //return location base on user selection
    public static String setLocation(String s) {
        switch (s) {
            case "1":
                return "HCM";
            case "2":
                return "HN";
            default:
                return "not selected";
        }
    }

    //main method select user input
    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to booking system, please choose as your wish");
            System.out.println("1. Flight");
            System.out.println("2. Restaurant");
            System.out.println("3. Train");
            System.out.print("Select : ");
            int select = Integer.parseInt(input.readLine());
            BookingMaker maker = new BookingMaker();
            switch (select) {
                case 1:
                    System.out.println("Input fly-date: ");
                    String flyDate = input.readLine();
                    System.out.println("Input fly-time: ");
                    String flyTime = input.readLine();
                    System.out.println("Select destination : \n\t(1) HCM\n\t(2)HN");
                    String des = setLocation(input.readLine());
                    maker.bookFlight(flyDate, flyTime, des);
                    break;
                case 2:
                    System.out.println("Input from date: ");
                    String fromDate = input.readLine();
                    System.out.println("Input to date: ");
                    String toTime = input.readLine();
                    System.out.println("Select location : \n\t(1) HCM\n\t(2)HN");
                    String loc = setLocation(input.readLine());
                    maker.bookRestaurant(fromDate, toTime, loc);
                    break;
                case 3:
                    System.out.println("Input start-date: ");
                    String trainDate = input.readLine();
                    System.out.println("Input start-time: ");
                    String trainTime = input.readLine();
                    System.out.println("Select destination : \n\t(1) HCM\n\t(2)HN");
                    String dest = setLocation(input.readLine());
                    maker.bookTrain(trainDate, trainTime, dest);
                    break;
                default:
                    System.out.println("We are not supporting this");
                    break;
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }
}
