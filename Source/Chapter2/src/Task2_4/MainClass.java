package Task2_4;

import java.util.SortedSet;

/* Author: Lê Trọng Nghia
 * Date: 8/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PetManager<Dog> managerDog = new PetManager<Dog>();
        PetManager<Cat> managerCat = new PetManager<Cat>();
        PetManager<Object> managerPets = new PetManager<Object>();
        
        String Dogs = "chihuahua,chiwawa";
        String Cats = "doremon,doremi";
        String dogNames[] = Dogs.split(",");
        String catNames[] = Cats.split(",");
        for (String dogName : dogNames) {
            managerDog.getPets().add(new Dog(dogName));
        }
        
        for (String catName : catNames) {
            managerCat.getPets().add(new Cat(catName));
        }
        
        if(managerDog != null && !managerDog.getPets().isEmpty()) {
            for (int i = 0; i < managerDog.getPets().size(); i++) {
                managerPets.getPets().add(managerDog.getPets().get(i));
            }
        }
        
        if(managerCat != null && !managerCat.getPets().isEmpty()) {
            for (int i = 0; i < managerCat.getPets().size(); i++) {
                managerPets.getPets().add(managerCat.getPets().get(i));
            }
        }
       
        for (int i = 0; i < managerPets.getPets().size(); i++) {
            System.out.println("--" + managerPets.getPets().get(i).toString());
        }
    }

}
