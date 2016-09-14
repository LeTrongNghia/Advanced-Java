package Task3_4;

import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 9/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Import x1: ");
        int x1 = input.nextInt();
        System.out.print("Import x2: ");
        int x2 = input.nextInt();
        
        Operator sum = (Integer o1, Integer o2) -> (double)o1 + o2;
        Operator div = (Integer o1, Integer o2) -> (double)o1 / o2;
        Operator mul = (Integer o1, Integer o2) -> (double)o1 * o2;
        Operator sub = (Integer o1, Integer o2) -> (double)o1 - o2;
        
        System.out.println("x1 + x2 = " + sum.operate(x1, x2));
        System.out.println("x1 - x2 = " + sub.operate(x1, x2));
        System.out.println("x1 * x2 = " + mul.operate(x1, x2));
        System.out.println("x1 / x2 = " + div.operate(x1, x2));
       
    }

}
