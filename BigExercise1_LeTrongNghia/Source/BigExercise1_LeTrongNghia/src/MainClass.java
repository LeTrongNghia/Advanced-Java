import java.util.Scanner;

/*
 * @author Le Trong Nghia
 * @date 6/9/2016
 * @version v1.0
 * @summary this is main class.
 */
public class MainClass {
    public static Scanner input = new Scanner(System.in);
    
    /*
     * import information teacher
     */
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
               
        /*
         * Data Teacher
         */
        String[] s = {"java","C++"};
        Teacher teachet1 = new Teacher("Phuong", "0123456789", "ktphuong@gmail.com",s);
        Teacher teacher2 = new Teacher("Tinh", "0124528923", "tinh@gmail.com", s);
        
        /*
         * Data list class
         */
        Class A = new Class("1", "GCS", "10/7/2016", "10/10/2016", 120, teachet1);
        Class B = new Class("2", "GCS", "10/7/2016", "10/10/2016", 120, teacher2);
        
        /*
         * 
         */
        System.out.println(teacher2.toString());
    }

}
