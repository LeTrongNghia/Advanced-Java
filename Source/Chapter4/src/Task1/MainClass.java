package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Author: Lê Trọng Nghia
 * Date: 12/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            //Create list1
            List<String> list1 = Arrays.asList("xin","chao","","cac","ban","toi","ten"
                    ,"","la","le","","trong","","nghia","");
            list1.stream().forEach(i -> System.out.println(i));
            
            //count elements have value = null
            int count = (int) list1.stream().filter(i -> i.equals("")).count();
            System.out.println("Elements are null: " +count);
            
            //count elements have length >=5
            count = (int) list1.stream().filter(i -> i.length() >= 5).count();
            System.out.println("Elements have lengh >= 5: " + count);
            
            //count elements have start with "a"
            count = (int) list1.stream().filter(i -> i.startsWith("a")).count();
            System.out.println("Elements start with a: " + count);
            
            //count elements is "happy"
            count = (int) list1.stream().filter(i -> i.equalsIgnoreCase("happy")).count();
            System.out.println("Elements is happy: " + count);
            
            //create list2 from list1
            List<String> list2 = list1.stream().filter(i -> i.equals("")).collect(Collectors.toList());
            System.out.println("List 2");
            list2.stream().forEach(i -> System.out.println("-" + i));
            
            //Create list3 from list1
            List<String> list3 = list1.stream().filter(i -> i.length() >= 3 && i.length() <= 6)
                    .collect(Collectors.toList());
            System.out.println("List 3");
            list3.stream().forEach(i -> System.out.print(i + ","));
            System.out.println();
            
            //create list4 from list1
            List<String> list4 = list1.stream().map(i -> i + " happy").collect(Collectors.toList());
            System.out.println("List 4");
            list4.stream().forEach(i -> System.out.println(i));
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
