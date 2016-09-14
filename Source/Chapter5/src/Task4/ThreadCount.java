package Task4;

import com.sun.swing.internal.plaf.synth.resources.synth;

/* Author: Lê Trọng Nghia
 * Date: 13/9/2016
 * Version: V1.0
 * Description: find max of arr
 */
public class ThreadCount extends Thread{
    private static int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ThreadCount() {
        super();
    }
    
    public synchronized void count() {
        
    }
    
    @Override
    public synchronized void run() {
        // TODO Auto-generated method stub
        try {
            for (int i = 0; i < 10; i++) {
                this.count = count + 1;
                System.out.println(this.count);
            } 
            ThreadCount.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
