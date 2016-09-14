package Task1;
/* Author: Lê Trọng Nghia
 * Date: 13/9/2016
 * Version: V1.0
 * Description: this is thread demo
 */
public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;
    
  
    
    public ThreadDemo(String threadName) {
        super();
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    public String getThreadName() {
        return threadName;
    }
    
    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }
    
    @Override
    public void run() {
        System.out.println("Running " + this.threadName);
        try{
            for (int i = 3; i > 0; i--) {
                System.out.println("Thread " + this.threadName + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + this.threadName + " interruoted.");
        }
        System.out.println("Thread " + this.threadName + "Exiting.");
    }
    
    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Starting " + this.threadName);
        if(t == null)
        {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
