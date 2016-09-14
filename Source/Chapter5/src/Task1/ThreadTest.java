package Task1;
/* Author: Lê Trọng Nghia
 * Date: 13/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class ThreadTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ThreadDemo demo1 = new ThreadDemo("Google");
        demo1.start();
        //System.out.println(demo1.getPriority());
        ThreadDemo demo2 = new ThreadDemo("Faceboook");
        demo2.start();
        //System.out.println(demo2.getPriority());
        ThreadDemo demo3 =new ThreadDemo("Yahoo");
        demo3.start();
        //System.out.println(demo3.getPriority());
    }

}
