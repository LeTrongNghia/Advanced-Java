package Task;

/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: class for mark
 */
public class Mark {

    private float activeMark;
    private float attendanceMark;
    private boolean period; // true mean morning
    private float practiceMark;
    private MarkTable markTable;
    private Student student;
    Subject subject;

    public Mark() {

    }

    public Mark(float activeMark, float attendanceMark, boolean period, float practiceMark, Student selectStudent, Subject subject) {
        this.activeMark = activeMark;
        this.attendanceMark = attendanceMark;
        this.period = period;
        this.practiceMark = practiceMark;
        this.student = selectStudent;
        this.subject = subject;
    }

    public void finalize() throws Throwable {

    }

    //calculate Mark of a period
    public double calPeriodMark() {
        return activeMark * 0.1 + attendanceMark * 0.3 + practiceMark * 0.6;
    }

    public MarkTable getM_MarkTable() {
        return markTable;
    }

    public void setM_MarkTable(MarkTable m_MarkTable) {
        this.markTable = m_MarkTable;
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

    public float getActiveMark() {
        return activeMark;
    }

    public void setActiveMark(float activeMark) {
        this.activeMark = activeMark;
    }

    public float getAttendanceMark() {
        return attendanceMark;
    }

    public void setAttendanceMark(float attendanceMark) {
        this.attendanceMark = attendanceMark;
    }

    public boolean isPeriod() {
        return period;
    }

    public void setPeriod(boolean period) {
        this.period = period;
    }

    public float getPracticeMark() {
        return practiceMark;
    }

    public void setPracticeMark(float practiceMark) {
        this.practiceMark = practiceMark;
    }

    @Override
    public String toString() {
        return student.getName() + " Mark: " + this.calPeriodMark() + " isMorning :" + this.period + " Subject: " + this.subject.getName();
    }

}
