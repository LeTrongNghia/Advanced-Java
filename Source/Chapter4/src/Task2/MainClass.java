package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/* Author: Lê Trọng Nghia
 * Date: 12/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class MainClass {
    public static boolean validatePrime(int s) {
        int count = 0;
        for (int i = 2; i <= s; i++) {
            if (s % i == 0)
                count++;
        }
        if (count == 1)
            return true;
        else
            return false;
    }

    public static boolean validateSquareNumbers(int x){
        int i = (int) Math.sqrt(x);
        if(i * i == x)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       try{
           //Create list 1
           Random r = new Random();
           List<Integer> list1 = new ArrayList<Integer>();
           r.ints(0,10).limit(15).forEach(i -> list1.add(i));
           System.out.println("--------------List 1-----------");
           list1.forEach(i -> System.out.println(i));
           
           //Create list 2
           List<Integer> list2 = list1.stream().map(i -> i * i).collect(Collectors.toList());
           System.out.println("-------------List 2--------------");
           list2.forEach(i -> System.out.println(i));
           
           
           IntSummaryStatistics list2s = list2.stream().mapToInt(x -> x).summaryStatistics();
           //Max list 2
           System.out.println("Max list 2: " + list2s.getMax());
           //Min list 2
           System.out.println("Min list 2: " + list2s.getMin());
           //Sum list 2
           System.out.println("Sum list 2: " + list2s.getSum());
           //Avg list 2
           System.out.println("Avg list 2: " + list2s.getAverage());
           
           //Create list 3
           List<Integer> list3 = list1.stream().filter(x -> validatePrime(x)).collect(Collectors.toList());
           System.out.println("---------------List3--------------");
           list3.forEach(i -> System.out.println(i));
           
           //Create list 4
           List<Integer> list4 = list1.stream().filter(x -> validateSquareNumbers(x)).collect(Collectors.toList());
           System.out.println("---------------List4--------------");
           list4.forEach(i -> System.out.println(i));
           
       } catch (InputMismatchException e) {
           System.out.println("Error: " + e.getMessage());
       }
        
    }

}
