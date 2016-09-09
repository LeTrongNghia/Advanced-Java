package Task2_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

/* Author: Lê Trọng Nghia
 * Date: 8/9/2016
 * Version: V1.0
 * Description: use to management paragragh
 */
public class ManagementContact {
    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    /*
     * use to show contacts
     */
    public static void print(ArrayList<Contact> list){
        Collections.sort(list);
        for (Contact contact : list) {
            System.out.println(contact.toString());
            System.out.println("-------------------------------");
        }
    }
    
    /*
     * use to search contact
     */
    public static void searchName(ArrayList<Contact> list, String name) {
        int count = 0;
        for (Contact contact : list) {
            if(contact.name.contains(name)) {
                System.out.println(contact.toString());
                System.out.println("-------------------------------");
                count++;
            }
        }
        if(count == 0)
            System.out.println("Not found");
    }
    
    /*
     * use to search contact
     */
    public static Contact search(ArrayList<Contact> list, String s) {
        Contact result = null;
        for (Contact contact : list) {
            if(contact.name.equalsIgnoreCase(s)) {
               result = contact;
            }
            if(contact.phoneNumber.equalsIgnoreCase(s)) {
                result = contact;
            }
        }
        return result;
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        try{
            ArrayList<Contact> contacts = new ArrayList<Contact>();
            Contact contact1 = new Contact("Huy", "0126518532");
            Contact contact2 = new Contact("Nghia", "01265044517");
            contacts.add(contact1);
            contacts.add(contact2);
            int stop = 1;
            do {
                System.out.println("Select function?");
                System.out.println("(1)Show contacs (2)Add contact (3)Search contact (4)Remove (5)Update");
                int choose = Integer.parseInt(input.readLine());
                switch(choose) {
                    case 1: {
                        System.out.println("Contacts");
                        print(contacts);
                    } break;
                    case 2: {
                        System.out.println("Import information contact");
                        System.out.print("Import name: ");
                        String name = input.readLine();
                        System.out.print("Import phone: ");
                        String phoneNumber = input.readLine();
                        Contact contact = new Contact(name, phoneNumber);
                        contacts.add(contact);
                    } break;
                    case 3: {
                        System.out.print("Import contact name: ");
                        String name = input.readLine();
                        searchName(contacts, name);
                    } break;
                    case 4: {
                        System.out.print("Import contact name or phone number: ");
                        String s = input.readLine();
                        Contact remove = search(contacts, s);
                        if (remove == null)
                            System.out.println("Not found");
                        else {
                            System.out.println("Do yoou want to remove?");
                            System.out.println("(1)Yes (2)No");
                            int select = Integer.parseInt(input.readLine());
                            if (select != 1 && select != 2)
                                throw new InputMismatchException("Please you check again");
                            if (select == 1)
                                contacts.remove(remove);
                        }
                    }break;
                    case 5: {
                        System.out.println("Import contact name: ");
                        String nameSearch = input.readLine();
                        Contact search = search(contacts, nameSearch);
                        System.out.println(search.toString());
                        int location = contacts.indexOf(search);
                        System.out.println("Name update: ");
                        String name = input.readLine();
                        System.out.println("Phone update: ");
                        String phone = input.readLine();
                        Contact update = new Contact(name, phone);
                        contacts.set(location, update);
                    } break;
                    default:
                        throw new InputMismatchException("Please you check again");
                }
            } while(stop == 1);
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
