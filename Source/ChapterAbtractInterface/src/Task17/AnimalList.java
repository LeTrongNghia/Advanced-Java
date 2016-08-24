package Task17;

import java.util.ArrayList;
import java.util.Iterator;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for List animal
 */
public class AnimalList {

    ArrayList<Animal> lst = new ArrayList<>();

    public void addToList(Animal o) {
        lst.add( o);
    }

    /*
     * use to print infomation list
     */
    public void printList() {
        for (Iterator<Animal> iterator = lst.iterator(); iterator.hasNext();) {
            Animal next = iterator.next();
            System.out.println(next.toString());
        }
    }
}
