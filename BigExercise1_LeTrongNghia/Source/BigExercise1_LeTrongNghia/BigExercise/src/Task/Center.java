package Task;

/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: class for center
 */
public class Center {

    private String address;
    private String name;
    public Teacher teacher;
    public Student student;
    public Contract contract;
    public Class classRom;

    public Center() {

    }

    public void finalize() throws Throwable {

    }

    public Center(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Center:\n" + "Address: " + this.address + "\tName: " + this.name;
    }

}
