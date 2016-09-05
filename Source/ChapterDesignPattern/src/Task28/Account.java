package Task28;
import java.util.ArrayList;

/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class Account {
    private ArrayList<Observer> observers = new ArrayList<>();
    private long state;

    public long getState() {
        return state;
    }
    
    public Account(long state) {
        this.state = state;
    }

    public void setState(long state) {
        this.state = state;
        notifyAllObserver(); 
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
    
    public void notifyAllObserver(){
        for(Observer observer : observers) {
            System.out.println(observer.update());
        }
    }
}
