package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.InputMismatchException;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/* Author: Lê Trọng Nghia
 * Date: 12/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
          //Create list
            List<Student> list = new ArrayList<Student>();
            Student s1 = new Student("Nghia", 8.5,18);
            Student s2 = new Student("Huy", 9.3,12);
            Student s3 = new Student("Quynh", 8.3,20);
            Student s4 = new Student("Phuong", 7.5,26);
            Student s5 = new Student("Dien", 7.35,17);
            Student s6 = new Student("Tien", 8.12,23);
            Student s7 = new Student("Hoa", 5.7,21);
            Student s8 = new Student("Tuan", 6.77,20);
            Student s9 = new Student("Thanh", 8.22,19);
            Student s10 = new Student("Anh", 6.8,15);
            
            list.add(s10);
            list.add(s9);
            list.add(s8);
            list.add(s7);
            list.add(s6);
            list.add(s5);
            list.add(s4);
            list.add(s3);
            list.add(s2);
            list.add(s1);
            
            list.forEach(i -> System.out.println(i.toString()));
            
            //count student age >= 18
            int count = (int) list.stream().filter(i -> i.age >= 18).count();
            System.out.println("Number of student have age >= 18: " + count);
            
            //count student have name starts with "H"
            count = (int) list.stream().filter(i -> i.name.startsWith("H")).count();
            System.out.println("Number of student have name starts with H: " + count);
            list.stream().filter(i -> i.name.startsWith("H")).peek(i -> System.out.println(i.toString()));
            
            List<Double> score = new ArrayList<Double>();
            list.forEach(i -> score.add(i.avgScore));
            
            DoubleSummaryStatistics scores = score.stream().mapToDouble(i -> i).summaryStatistics();
            System.out.println("Avg socre max: " + scores.getMax());
            System.out.println("Avg score min: " + scores.getMin());
            System.out.println("Avg socre of avg: " + scores.getAverage());

            List<Student> listVeryGood = list.stream().filter(i -> i.avgScore >= 8).collect(Collectors.toList());
            System.out.println("List very good");
            listVeryGood.forEach(i -> System.out.println(i.toString()));
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
