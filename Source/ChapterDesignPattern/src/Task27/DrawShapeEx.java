package Task27;

import java.util.InputMismatchException;
import java.util.Scanner;

/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class DrawShapeEx {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Select shape");
            System.out.println("(1)Circle / (2)Rectangle");
            int choose = input.nextInt();
            switch (choose) {
                case 1: {
                    Shape s = new Circle();
                    System.out.println("Do you decorate red border for shape?");
                    System.out.println("(1)Yes (2)No");
                    int select = input.nextInt();
                    switch (select) {
                        case 1: {
                            RedShapeDecorator red = new RedShapeDecorator(s);
                            System.out.println(red.draw());
                        }break;
                        case 2: {
                            NomalShapeDecorator nol = new NomalShapeDecorator(s);
                            System.out.println(nol.draw());
                        }break;
                        default:
                            throw new InputMismatchException("Please you check information again which you import");
                    }
                }break;
                case 2: {
                    Shape s = new Rectangle();
                    System.out.println("Do you decorate red border for shape?");
                    System.out.println("(1)Yes (2)No");
                    int select = input.nextInt();
                    switch (select) {
                        case 1: {
                            RedShapeDecorator red = new RedShapeDecorator(s);
                            System.out.println(red.draw());
                        }break;
                        case 2: {
                            NomalShapeDecorator nol = new NomalShapeDecorator(s);
                            System.out.println(nol.draw());
                        }break;
                        default:
                            throw new InputMismatchException("Please you check information again which you import");
                    }
                }break;
                default:
                    throw new InputMismatchException("Please you check information again which you import");
            } 
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
