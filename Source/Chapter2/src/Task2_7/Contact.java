package Task2_7;
/* Author: Lê Trọng Nghia
 * Date: 8/9/2016
 * Version: V1.0
 * Description: use to define contact
 */
public class Contact implements Comparable<Contact> {
    public String name;
    public String phoneNumber;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public Contact(String name, String phoneNumber) {
        super();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    /*
     * use to compare Contact allow name
     */
    @Override
    public int compareTo(Contact o) {
        // TODO Auto-generated method stub
        return (this.name).compareTo(o.name);
    }
    
    /*
     * use to print contact
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        
        return "Name: " + this.name + "\nPhone: " + phoneNumber;
    }
}
