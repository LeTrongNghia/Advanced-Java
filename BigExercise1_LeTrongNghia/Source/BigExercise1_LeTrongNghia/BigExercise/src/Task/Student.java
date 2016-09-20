package Task;

/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: class for student
 */
public class Student extends PersonInfo {

    private String birthDay;

    public Student() {

    }

    public Student(String birthDay) {
        this.birthDay = birthDay;
    }

    public Student(String birthDay, String email, String name, String phoneNumber) {
        super(email, name, phoneNumber);
        this.birthDay = birthDay;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "\tBirthDay: " + this.birthDay;
    }

}
