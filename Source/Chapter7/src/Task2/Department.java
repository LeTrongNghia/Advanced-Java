package Task2;

/* Author: Lê Trọng Nghia
 * Date: 15/9/2016
 * Version: V1.0
 * Description: define for department
 */
public class Department {

    private String id;
    private String name;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void showInfo() {
        System.out.println("\t[id] " + this.id);
        System.out.println("\t[name] " + this.name);
        System.out.println("");
    }

}
