package Task2_3;
/* Author: Lê Trọng Nghia
 * Date: 7/9/2016
 * Version: V1.0
 * Description: use to define for student
 */
public class Student{
    public String name;
    public int age;
    public String placeOfBirth;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPlaceOfbirth() {
        return placeOfBirth;
    }
    public void setPlaceOfbirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    
    public Student(String name, int age, String placeOfBirth) {
        super();
        this.name = name;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
    }
    
    public String toString() {
        return "Name: " + this.name + "\tAge: " + this.age + "\tPlcae of birth: " + this.placeOfBirth;
    }
    
}
