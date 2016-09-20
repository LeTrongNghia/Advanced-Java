package Task;

import java.util.ArrayList;

/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: class for attendance
 */
public class Attendance {

    private boolean period;
    private String state;
    private final ArrayList<Student> listStudent = new Class().lstStudents;
    private final String[][] attendanceTable = new String[100][100];

    /*
     * use to check and find if there are student in table
     */
    public int findStudent(Student s) {
        for (int i = 0; i < attendanceTable.length; i++) {
            if (attendanceTable[i][0].equals(s.toString())) {
                return i;
            }
        }
        return -1;
    }

    /*
     * use to print list date which having attendance
     */
    public void printListDate() {
        for (int i = 1; i < attendanceTable[0].length; i++) {
            if (attendanceTable[0][i] != null) {
                System.out.println(i + ". " + attendanceTable[0][i]);
            }
        }

    }

    /*
     * use to set attendace for student, select date and position in list then replace state
     */
    public void attendStudent(Student s, String state, int position, int selectDate) {
        for (int i = 1; i < attendanceTable.length; i++) {
            for (int j = 0; j < attendanceTable.length; j++) {
                if (attendanceTable[0][selectDate] != null) {
                    attendanceTable[position][selectDate] = state;
                }
            }
        }
    }

    /*
     * use to init attendance and assign some default value
     */
    public Attendance() {
        attendanceTable[0][0] = "Name/Date";
        attendanceTable[0][1] = "6/9/2016";
        attendanceTable[0][2] = "7/9/2016";
        attendanceTable[0][3] = "8/9/2016";
        attendanceTable[0][4] = "9/9/2016";
        attendanceTable[0][5] = "10/9/2016";
        attendanceTable[0][6] = "11/9/2016";
        attendanceTable[0][7] = "12/9/2016";
        attendanceTable[0][8] = "13/9/2016";

        for (int i = 1; i < listStudent.size() + 1; i++) {
            attendanceTable[i][0] = listStudent.get(i - 1).getName();
        }
    }

    /*
     * use to print information attendance table
     */
    public void printAttendanceTable() {
        for (int i = 0; i < listStudent.size() + 1; i++) {
            for (int j = 0; j < attendanceTable[i].length; j++) {
                if (attendanceTable[i][j] != null) {
                    System.out.print(attendanceTable[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }

    public boolean isPeriod() {
        return period;
    }

    public void setPeriod(boolean period) {
        this.period = period;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
