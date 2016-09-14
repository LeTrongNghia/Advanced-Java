package Task2;

import java.util.Random;
import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 13/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class SumOfArrayThread {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        Scanner intput = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = intput.nextInt();
        int arr[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(10);
        }
        System.out.println("Input num of thread");
        int numThreads = intput.nextInt();
        int sum = sum(arr, numThreads);
        String strArr = "";
        for (int i : arr) {
            strArr += i + " ";
        }
        System.out.println("Array: " + strArr);
        System.out.println("Sum: " + sum);
    }
    
    public static int sum(int[]arr, int numThreads) throws InterruptedException {
        int len = arr.length;
        int sum = 0;
        SumThread[] ts = new SumThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            ts[i] = new SumThread((i * len) / numThreads, (i + 1) * len / numThreads, arr);
            ts[i].start();
        }
        
        for(int i = 0; i < numThreads; i++) {
            ts[i].join();
            sum += ts[i].getSum();
        }
        return sum;
    }
}
