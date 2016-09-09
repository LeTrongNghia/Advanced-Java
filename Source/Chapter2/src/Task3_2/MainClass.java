package Task3_2;

import java.util.Arrays;
import java.util.List;

/* Author: Lê Trọng Nghia
 * Date: 8/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> amounts = Arrays.asList(new Integer[]{2,3,4,7});
        int price = 5200;
        amounts.forEach(e -> {
            System.out.println("Thanh tien = " + price * e + "vnd");
        });
    }

}
