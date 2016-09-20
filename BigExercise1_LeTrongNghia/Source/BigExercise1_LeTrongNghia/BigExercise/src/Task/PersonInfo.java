package Task;

/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: class for person info
 */
public class PersonInfo {

    String email;
    String name;
    String phoneNumber;

    public PersonInfo() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public PersonInfo(String email, String name, String phoneNumber) {
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\tEmail: " + this.email + "\tPhone: " + this.phoneNumber;
    }

}
