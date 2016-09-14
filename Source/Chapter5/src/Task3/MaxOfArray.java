package Task3;

import java.util.Random;
import java.util.Scanner;

import Task2.SumThread;

/* Author: Lê Trọng Nghia
 * Date: 13/9/2016
 * Version: V1.0
 * Description: find max of arr
 */
public class MaxOfArray {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
     // TODO Auto-generated method stub
        Scanner intput = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = intput.nextInt();
        int arr[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(100);
        }
        System.out.println("Input num of thread");
        int numThreads = intput.nextInt();
        int max = max(arr, numThreads);
        String strArr = "";
        for (int i : arr) {
            strArr += i + " ";
        }
        System.out.println("Array: " + strArr);
        System.out.println("Max: " + max);
    }
    public static int max(int[]arr, int numThreads) throws InterruptedException {
        int len = arr.length;
        int max = 0;
        ThreadMax[] ts = new ThreadMax[numThreads];
        for (int i = 0; i < numThreads; i++) {
            ts[i] = new ThreadMax((i * len) / numThreads, (i + 1) * len / numThreads, arr);
            ts[i].start();
        }
        
        for(int i = 0; i < numThreads; i++) {
            ts[i].join();
            System.out.println("Max of thread " + (i + 1) + " " + ts[i].getMax());
            if (max < ts[i].getMax()) {
                max = ts[i].getMax();
            }
        }
        return max;
    }
}
