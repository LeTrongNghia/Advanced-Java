/*
 * @author Le Trong Nghia
 * @date 6/9/2016
 * @version v1.0
 * @summary this class use to define for PersonInfo.
 */
public abstract class PersonInfo {
    public String fullName;
    public String phoneNumber;
    public String email;
    
    public PersonInfo(String fullName, String phoneNumber, String email) {
        super();
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
