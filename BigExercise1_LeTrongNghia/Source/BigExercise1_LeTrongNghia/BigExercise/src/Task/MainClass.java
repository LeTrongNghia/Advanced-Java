package Task;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

/**
 * @author: Lê Trọng Nghĩa
 * @date: 6-9-2016
 * @version: 1.0
 * @description: This is main class
 */
public class MainClass {

    public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    /*
     * define fixed list object
     */
    public static Class classRoom = new Class();
    public static MarkTable markTable = new MarkTable();
    public static Contract contract = new Contract();
    public static Attendance attendance = new Attendance();
    public static boolean period;
    public static LocalDateTime now = LocalDateTime.now();

    /*
     * use to check if now is morning or everning
     */
    public static void checkNow() {
        period = now.getHour() >= 12;
    }

    /*
     * use to set attendance
     */
    public static String setAttendance(int select) {
        if (select > 5 || select < 0) {
            throw new IllegalArgumentException("Selected wrong");
        }
        switch (select) {
            case 1:
                return "In time";
            case 2:
                return "Late";
            case 3:
                return "Leave soon";
            case 4:
                return "Trunt";
            case 5:
                return "Late + Trunt";
            default:
                return "";
        }
    }

    /*
     * use to choose and set attendance for student
     */
    public static void attendance() throws IOException {
        checkNow();
        System.out.println(" Today is: " + now.getDayOfMonth() + "/" + now.getMonthValue() + "/" + now.getYear());
        if (period) {
            attendance.setPeriod(true);
            System.out.println("Attendance for evening");
        } else {
            attendance.setPeriod(false);
            System.out.println("Attendance for morning");
        }
        while (true) {
            System.out.println("Select date to attend");
            attendance.printListDate();
            System.out.println("0. Exit");
            System.out.print("Select date: ");
            int selectDate = Integer.parseInt(input.readLine());
            if (selectDate == 0) {
                break;
            }

            int selectStudent = 1;
            int selectAttend = 1;
            while (selectStudent > 0 && selectStudent < classRoom.getLstStudents().size()) {
                System.out.println("--- List student in class ---");
                classRoom.printListStudent();
                System.out.println("0. Exit");
                System.out.print("\nSelect student : ");
                selectStudent = Integer.parseInt(input.readLine());
                if (selectStudent == 0) {
                    break;
                }
                if (selectStudent > classRoom.getLstStudents().size()) {
                    System.out.println("Please choose again");
                }
                Student student = classRoom.findStudentInClass(selectStudent - 1);
                while (student == null) {
                    System.out.print("Wrong selection, please rechoose: ");
                    selectStudent = Integer.parseInt(input.readLine());
                    student = classRoom.findStudentInClass(selectStudent - 1);
                }
                System.out.println("\nSet attendance for student " + student.getName());
                System.out.println("1. In time");
                System.out.println("2. Late");
                System.out.println("3. Leave soon");
                System.out.println("4. Trunt");
                System.out.println("5. Late + leave soon");
                System.out.print("Select state: ");
                selectAttend = Integer.parseInt(input.readLine());
                while (selectAttend > 5 || selectAttend < 0) {
                    System.out.print("Wrong choose, please re choose :");
                    selectAttend = Integer.parseInt(input.readLine());
                }
                String state = setAttendance(selectAttend);
                //  int position = classRoom.getStudentPosition(student);                
                attendance.attendStudent(student, state, selectStudent, selectDate);

            }
            System.out.println("Continue ? Yes(1) No (0)");
            int cont = Integer.parseInt(input.readLine());
            if (cont == 0) {
                break;
            }
        }
    }

    /*
     * use select subject then select student to input Mark
     */
    public static void mark() throws IOException {
        while (true) {
            classRoom.printListSubject();
            System.out.print("Select subject: ");
            int selectSubject = Integer.parseInt(input.readLine());
            if (selectSubject == 0) {
                break;
            }
            Subject subject = classRoom.findSubjectInClass(selectSubject - 1);
            while (subject == null) {
                System.out.print("Wrong selection, please rechoose: ");
                selectSubject = Integer.parseInt(input.readLine());
                subject = classRoom.findSubjectInClass(selectSubject - 1);
            }

            classRoom.printListStudent();
            System.out.print("Select student: ");
            int selectStudent = Integer.parseInt(input.readLine());
            if (selectStudent == 0) {
                break;
            }
            Student student = classRoom.findStudentInClass(selectStudent - 1);
            while (student == null) {
                System.out.print("Wrong selection, please rechoose: ");
                selectStudent = Integer.parseInt(input.readLine());
                student = classRoom.findStudentInClass(selectStudent - 1);
            }

            System.out.println("Input practice Mark");
            float pracMark = Float.parseFloat(input.readLine());
            System.out.println("Input active Mark");
            float actMark = Float.parseFloat(input.readLine());
            System.out.println("Input attendance Mark");
            float attMark = Float.parseFloat(input.readLine());
            checkNow();
            Mark ds = new Mark(actMark, attMark, period, pracMark, student, subject);
            markTable.addMarkToTable(ds);
            System.out.println("Continue ? Yes(1) No (0)");
            int cont = Integer.parseInt(input.readLine());
            if (cont == 0) {
                break;
            }
        }
    }

    /*
     * use to input final test Mark
     */
    public static void markFinal() throws IOException {
        while (true) {
            classRoom.printListStudent();
            System.out.print("Select student: ");
            int selectStudent = Integer.parseInt(input.readLine());
            if (selectStudent == 0) {
                break;
            }
            Student student = classRoom.findStudentInClass(selectStudent - 1);
            while (student == null) {
                System.out.print("Wrong selection, please rechoose: ");
                selectStudent = Integer.parseInt(input.readLine());
                student = classRoom.findStudentInClass(selectStudent - 1);
            }

            System.out.println("Input practice test Mark");
            float pracMark = Float.parseFloat(input.readLine());
            System.out.println("Input test Mark");
            float testMark = Float.parseFloat(input.readLine());

            System.out.println("Continue ? Yes(1) No (0)");
            int cont = Integer.parseInt(input.readLine());
            if (cont == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            int select;
            do {
                System.out.println("\n---- Select function -----");
                System.out.println("1. Attend student");
                System.out.println("2. View attendance table");
                System.out.println("3. Mark daily");
                System.out.println("4. Mark table");
                System.out.println("5. Mark of specific student");
                System.out.println("6. Mark final test");
                System.out.println("8. View class information");
                System.out.println("9. View list subject available");
                System.out.println("0. Exit");
                select = Integer.parseInt(input.readLine());
                switch (select) {
                    case 1:
                        attendance();
                        break;
                    case 2:
                        attendance.printAttendanceTable();
                        break;
                    case 3:
                        mark();
                        break;
                    case 4:
                        markTable.printMarkTable();
                        break;
                    case 5:
                        classRoom.printListStudent();
                        System.out.print("Select student: ");
                        int selectStudent = Integer.parseInt(input.readLine());
                        Student student = classRoom.findStudentInClass(selectStudent - 1);
                        markTable.printStudentMark(student);
                        break;
                    case 6:
                        break;
                    case 8:
                        System.out.println("-- Class information --");
                        System.out.println(classRoom.toString());
                        break;
                    default:
                        break;
                }
            } while (select < 9 && select > 0);
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }

}
