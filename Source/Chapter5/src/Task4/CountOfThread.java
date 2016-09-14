package Task4;
/* Author: Lê Trọng Nghia
 * Date: 13/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class CountOfThread {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        int counter = 0;
        ThreadCount[] list = new ThreadCount[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + i);
            list[i] = new ThreadCount();
            list[i].start();
            list[i].join();
            counter = list[i].getCount();
        }
        System.out.println("Counter: " + counter);
    }

}
