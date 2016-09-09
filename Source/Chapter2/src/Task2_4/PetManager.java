package Task2_4;

import java.util.ArrayList;
import java.util.List;

/* Author: Lê Trọng Nghia
 * Date: 8/9/2016
 * Version: V1.0
 * Description: use to define Pet manager
 */
public class PetManager<T> {
    private List<T> pets;
    
    public void setPets(List<T> pets){
        this.pets = pets;
    }
    
    
    public List<T> getPets() {
        if (pets == null) {
            pets = new ArrayList<>();
        }
        return this.pets;
    }
    
    public String toString(){
        String s = "";
        for (T t : pets) {
            s += t.toString();
        }
        return s;
    }
}
