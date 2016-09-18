package Task1;
/* Author: Lê Trọng Nghia
 * Date: 15/9/2016
 * Version: V1.0
 * Description: define for contact
 */
public class Contact {
    private String numberPhone;
    private String name;
    
    public Contact(String numberPhone, String name) {
        this.numberPhone = numberPhone;
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getName() {
        return name;
    }
    
    public void showInfo(){
        System.out.println("[Name]: "+this.name);
        System.out.println("[Number phone]: "+this.numberPhone);
        System.out.println("");
    }
}
