package Task;


import java.util.ArrayList;


/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: class for classroom
 */
public class Class {

    private Contract contract;
    private Teacher homeRoomTeacher;
    private String name;
    private Subject subject;
    private Teacher subjectTeacher;
    private int totalLesson;
    public Student student;
    public Subject m_Subject;
    public Teacher teacher;

    public ArrayList<Subject> lstSubjects = new ArrayList<>();
    public ArrayList<Student> lstStudents = new ArrayList<>();
    public ArrayList<Teacher> lstSubjectTeacher = new ArrayList<>();

    //init class and assign some default value
    public void initClass() {
        homeRoomTeacher = new Teacher("", true, "ktphuong2000@gmail.com", "Ms.Phuong", "`12345678");
        subjectTeacher = homeRoomTeacher;
        lstSubjectTeacher.add(subjectTeacher);
        subjectTeacher.setCapitability("Linux, Java");
        contract = new Contract("30/11/2016", "1234567", "12/8/2016", this);
        name = "T3h";
        student = new Student("18/05/1992", "reaflower2010@gmail.com", "Nguyen Quoc Huy", "0906610833");
        lstStudents.add(student);
        student = new Student("22/2/1992", "nghiais@gmail.com", "Le Trong nghia", "1234566779");
        lstStudents.add(student);
        subject = new Subject("30/11/2016", "JAva advanced", 60, "12/8/2016", new MarkExam("DesignPattern", true), null);
        MarkExam ex = new MarkExam("Practice test....", true);
        subject.setMarkExam(ex);
        lstSubjects.add(subject);
        subject = new Subject("30/10/2016", "Linux advamce", 30, "12/10/2016", new MarkExam("C on linux", true), null);
        ex = new MarkExam("Normal test....", false);
        subject.setMarkExam(ex);
        lstSubjects.add(subject);

        subjectTeacher = new Teacher("Le ngoc tien", false, "tientien@yahoo.com", "Mr.Tien", "09868297521");
        subjectTeacher.setCapitability("Linux");
        lstSubjectTeacher.add(subjectTeacher);
        totalLesson = subject.getNumberOfLesson();

    }

    public Class() {
        this.initClass();
    }

    public Class(Contract contract, Teacher homeRoomTeacher, String name, Subject subject, Teacher subjectTeacher, int totalLesson, Student student, Subject m_Subject, Teacher teacher) {
        this.contract = contract;
        this.homeRoomTeacher = homeRoomTeacher;
        this.name = name;
        this.subject = subject;
        this.subjectTeacher = subjectTeacher;
        this.totalLesson = totalLesson;
        this.student = student;
        this.m_Subject = m_Subject;
        this.teacher = teacher;
    }

    public void finalize() throws Throwable {

    }

    public ArrayList<Subject> getLstSubjects() {
        return lstSubjects;
    }

    public ArrayList<Student> getLstStudents() {
        return lstStudents;
    }

    public ArrayList<Teacher> getLstSubjectTeacher() {
        return lstSubjectTeacher;
    }

    @Override
    public String toString() {
        String lstSubject = "";
        totalLesson = 0;
        for (Subject subject : lstSubjects) {
            lstSubject += subject.getName() + "\t|";
            totalLesson += subject.getNumberOfLesson();
        }
        String lstTeacher = "";
        for (Teacher teacher : lstSubjectTeacher) {
            lstTeacher += teacher.toString() + "\n";
        }

        return "Class : " + name + this.contract.toString() + "\nHome room teacher: " + this.homeRoomTeacher.toString()
                + "\nSubject teacher: \n" + lstTeacher
                + "\nSubject : " + lstSubject
                + "\nTotal lesson : " + this.totalLesson;
    }

    /*
     * student to class and check if success
     */
    public boolean addStudent(Student s) {
        if (s == null) {
            return false;
        }
        lstStudents.add(s);
        return true;
    }

    /*
     * use to add subject to class and check if success
     */
    public boolean addSubject(Subject s) {
        if (s == null) {
            return false;
        }
        lstSubjects.add(s);
        return true;
    }

    /*
     * use to add subject teacher to class and check if success
     */
    public boolean addTeacher(Teacher t) {
        if (t == null) {
            return false;
        }
        lstSubjectTeacher.add(t);
        return true;
    }

  /*
   * use to print all student in class
   */
    public void printListStudent() {
        int i = 1;
        for (Student student : lstStudents) {
            System.out.println(i + ". " + student.getName());
            i++;
        }
    }

    /*
     * use to print all subject have been teach in class
     */
    public void printListSubject() {
        int i = 1;
        for (Subject subject : lstSubjects) {
            System.out.println(i + ". " + subject.getName());
            i++;
        }
    }

    /*
     * use to print all teacher in class
     */
    public void printListTeacher() {
        int i = 1;
        for (Teacher teacher : lstSubjectTeacher) {
            System.out.println(i + ". " + teacher.getName());
            i++;
        }
    }

    /*
     * use to get single student in class
     */
    public Student findStudentInClass(int position) {
        return lstStudents.get(position);
    }

    /*
     * use to get student position in class
     */
    public int getStudentPosition(Student s) {
        return lstStudents.indexOf(s);
    }

    /*
     * use to get single subject in class
     */
    public Subject findSubjectInClass(int position) {
        return lstSubjects.get(position);
    }

    /*
     * use to get subject position in class
     */
    public int getSubjectPosition(Subject s) {
        return lstSubjects.indexOf(s);
    }
}
