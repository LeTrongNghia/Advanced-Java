package Task;
import java.util.ArrayList;

/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: class for marktable
 */
public class MarkTable {

    private Mark Mark;
    private String date;
    private Student student;
    private Subject subject;

    private float finalMark;
    private float finalPracticeMark;
    ArrayList<Mark> lstMark = new ArrayList<>();

    /*
     * use to add daily Mark to table
     * input Mark ds
     */
    public void addMarkToTable(Mark ds) {
        lstMark.add(ds);
    }

    /*
     * use to print all Mark in table
     */
    public void printMarkTable() {
        for (Mark Mark : lstMark) {
            System.out.println(Mark.toString());
        }
    }

    /*
     * use to get final Mark for each subject
     * input Subject s
     */
    public void finalMark(Subject s) {
        double total = 0;
        int number = 0;
        for (Mark Mark : lstMark) {
            if (Mark.getSubject().equals(s)) {
                total += Mark.calPeriodMark();
                number++;
            }
        }
        double result = total / number;
        System.out.println("Final Mark for " + s.getName() + " = " + result);
    }

    /*
     * use to print specific student's Mark
     */
    public void printStudentMark(Student student) {

        for (Mark Mark : lstMark) {
            if (Mark.getStudent().equals(student)) {
                System.out.println(Mark.toString());
                finalMark(Mark.getSubject());
            }
        }
    }

    public Mark getMark() {
        return Mark;
    }

    public void setMark(Mark Mark) {
        this.Mark = Mark;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public MarkTable() {

    }

    public MarkTable(Mark Mark, String date, Student student) {
        this.Mark = Mark;
        this.date = date;
        this.student = student;
    }

    public void finalize() throws Throwable {

    }

    public float getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(float finalMark) {
        this.finalMark = finalMark;
    }

    public float getFinalPracticeMark() {
        return finalPracticeMark;
    }

    public void setFinalPracticeMark(float finalPracticeMark) {
        this.finalPracticeMark = finalPracticeMark;
    }

}
