package Task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this is main class
 */

public class MainClass {

    //create new animal type
    public static Animal inputAnimal() throws IOException {
        Animal animal = new Animal(null, null);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-------------------  -------------------");
        System.out.println("Input name");
        animal.name = input.readLine();
        System.out.println("Input food");
        animal.food = input.readLine();
        return animal;
    }

    //input animal's infomation  then select type, specie will be add to list    
    public static void main(String[] args) {
        try {
            AnimalList lst = new AnimalList();
            Animal animal = new Animal(null, null);
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int select;
            do {
                System.out.println("-------------------  -------------------");
                System.out.println("1.Input information");
                System.out.println("2.Print list ");
                System.out.println("0. Exit");
                System.out.print("Select: ");
                select = Integer.parseInt(input.readLine());
                switch (select) {
                    case 1:
                        animal = inputAnimal();
                        String selection;
                        do {
                            System.out.println("\nSelect animal type:");
                            System.out.println("1. Bird");
                            System.out.println("2. Fish");
                            System.out.println("3. Tiger");
                            System.out.println("4. Boa");
                            System.out.println("0. Exit");
                            System.out.println("Select:");
                            selection = input.readLine();
                            switch (selection) {
                                case "1":
                                    Bird b = new Bird(animal.name, animal.food);
                                    System.out.println(b.toString());
                                    lst.addToList(b);
                                    break;
                                case "2":
                                    Fish f = new Fish(animal.name, animal.food);
                                    System.out.println(f.toString());
                                    lst.addToList(f);
                                    break;
                                case "3":
                                    Tiger t = new Tiger(animal.name, animal.food);
                                    System.out.println(t.toString());
                                    lst.addToList(t);
                                    break;
                                case "4":
                                    Boa boa = new Boa(animal.name, animal.food);
                                    System.out.println(boa.toString());
                                    lst.addToList(boa);
                                    break;
                                default:
                                    break;
                            }
                            System.out.println("Continue ? (Y/N)");
                            selection = input.readLine();
                        } while (selection.toLowerCase().equals("y"));
                        break;
                    case 2:
                        lst.printList();
                        break;
                    default:
                        break;
                }
            } while (select > 0 && select < 3);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }
}
