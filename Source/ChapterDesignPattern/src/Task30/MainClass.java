package Task30;

import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 1/9/2016
 * Version: V1.0
 * Description: class use to define for Rectangle
 */
public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        ShapeFactory shapeFactory = new ShapeFactory();
        System.out.print("Import type shape: ");
        String type = input.next();
        Shape shape = shapeFactory.getShape(type);
        shape.draw();
    }

}
