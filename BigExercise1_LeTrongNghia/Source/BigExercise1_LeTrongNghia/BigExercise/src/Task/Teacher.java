package Task;


/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: class for teacher
 */
public class Teacher extends PersonInfo {

    private String capitability;
    private boolean isHomeRoomTeacher;

    public Teacher() {

    }

    public Teacher(String capitability, boolean isHomeRoomTeacher) {
        this.capitability = capitability;
        this.isHomeRoomTeacher = isHomeRoomTeacher;
    }

    public Teacher(String capitability, boolean isHomeRoomTeacher, String email, String name, String phoneNumber) {
        super(email, name, phoneNumber);
        this.capitability = capitability;
        this.isHomeRoomTeacher = isHomeRoomTeacher;
    }

    public String getCapitability() {
        return capitability;
    }

    public void setCapitability(String capitability) {
        this.capitability = capitability;
    }

    public boolean isIsHomeRoomTeacher() {
        return isHomeRoomTeacher;
    }

    public void setIsHomeRoomTeacher(boolean isHomeRoomTeacher) {
        this.isHomeRoomTeacher = isHomeRoomTeacher;
    }

    public String getName() {
        return this.getName();
    }


}
