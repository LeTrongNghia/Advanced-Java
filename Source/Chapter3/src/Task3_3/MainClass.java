package Task3_3;
import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 9/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class MainClass {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final float PI = (float) 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Import darius: ");
        double r = input.nextDouble();
        Area circle = (double x1, double x2) -> x1 * x2 * PI;
        System.out.println("S = pI * (r * r) = " + circle.calArea(r, r));
        System.out.println("Import width: ");
        double w = input.nextDouble();
        System.out.println("Import length: ");
        double l = input.nextDouble();
        Area retangle = (double x1, double x2) -> x1 * x2;
        System.out.println("S = w * l = " + retangle.calArea(w, l));
    }
}


