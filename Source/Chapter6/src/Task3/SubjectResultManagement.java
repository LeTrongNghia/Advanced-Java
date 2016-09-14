package Task3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

/* Author: Lê Trọng Nghia
 * Date: 14/9/2016
 * Version: V1.0
 * Description: use to management subject result
 */

public class SubjectResultManagement {

    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static Path file = Paths.get("/home/hocvien/workspace/Chapter6/src/Task3/tongketnamhoc.txt");
    static int numberExcellent = 0;
    static int numberGreate = 0;
    static int numberAverange = 0;
    static int numberWeak = 0;
    static int numberStudentGrade10 = 0;
    static int numberStudentGrade11 = 0;
    static int numberStudentGrade12 = 0;
    static double scoreOfGrade10 = 0;
    static double scoreOfGrade11 = 0;
    static double scoreOfGrade12 = 0;

    /*
     * use to compute averange score
     */
    public static double averangeScore(double avgScore1, double avgScore2) {
        return (avgScore1 + avgScore2 * 2) / 3;
    }

    //result studying base on score
    public static String result(double avgScore) {
        if (avgScore < 5) {
            return "Weak";
        } else if (avgScore >= 5 && avgScore < 7) {
            return "Averange";
        } else if (avgScore >= 7 && avgScore < 8) {
            return "Great";
        } else {
            return "Excellent";
        }
    }

    /*
     * load student from file
     */
    public static void load() throws FileNotFoundException {
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file.toString())))) {
            System.out.println("Name\t | Grade | Avg score 1 | Avg score 2 | Averange score | Result");
            String name;
            int grade;
            double avgScore1;
            double avgScore2;
            while (true) {
                name = in.readUTF();
                grade = in.readInt();
                avgScore1 = in.readDouble();
                avgScore2 = in.readDouble();
                double averangScore = averangeScore(avgScore1, avgScore2);
                if (averangScore > 8) {
                    numberExcellent++;
                }
                if (averangScore < 8 && averangScore > 7) {
                    numberGreate++;
                }
                if (averangScore > 6 && averangScore < 7) {
                    numberAverange++;
                }
                if (averangScore < 6) {
                    numberWeak++;
                }
                if (grade == 10) {
                    numberStudentGrade10++;
                    scoreOfGrade10 += averangScore;
                }
                if (grade == 11) {
                    numberStudentGrade11++;
                    scoreOfGrade11 += averangScore;
                }
                if (grade == 12) {
                    numberStudentGrade12++;
                    scoreOfGrade12 += averangScore;
                }
                System.out.println(name + "\t | " + grade + " | "
                        + avgScore1 + " | " + avgScore2 + " | "
                        + String.format("%.2f", averangScore) + " | " + result(averangScore));
            }
        } catch (Exception e) {
            System.out.println("Done");
        }
    }

    /*
     * load number of each type rank
     */
    public static void printRank() {
        System.out.println("Number of excellent student : " + numberExcellent);
        System.out.println("Number of great student : " + numberGreate);
        System.out.println("Number of averange student : " + numberAverange);
        System.out.println("Number of weak student : " + numberWeak);
    }

    /*
     * load averange socre of each grade
     */
    public static void printGradeScore() {
        System.out.println("Number of grade 10 student : " + numberStudentGrade10);
        System.out.println("Averange score of student grade 10 : " + String.format("%.2f", scoreOfGrade10 / numberStudentGrade10));
        System.out.println("Number of grade 11 student : " + numberStudentGrade11);
        System.out.println("Averange score of student grade 11 : " + String.format("%.2f", scoreOfGrade12 / numberStudentGrade11));
        System.out.println("Number of grade 12 student : " + numberStudentGrade12);
        System.out.println("Averange score of student grade 12 : " + String.format("%.2f", scoreOfGrade11 / numberStudentGrade12));
    }

    /*
     * add new student to list
     */
    public static void addStudent(String name, int grade, double avgScore1, double avgScore2) {
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file.toFile(), true)))) {
            out.writeUTF(name);
            out.writeInt(grade);
            out.writeDouble(avgScore1);
            out.writeDouble(avgScore2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("Select function");
                System.out.println("(1)Statistic (2)Add new student (0)Exit");
                int select = Integer.parseInt(input.readLine());
                if (select == 0) {
                    return;
                }
                switch (select) {
                    case 1:
                        load();
                        printRank();
                        printGradeScore();
                        break;
                    case 2:
                        System.out.print("Student name : ");
                        String name = input.readLine();
                        System.out.print("Student grade : ");
                        int grade = Integer.parseInt(input.readLine());
                        System.out.print("Student averange score semestry 1 : ");
                        double avgScore1 = Double.parseDouble(input.readLine());
                        System.out.print("Student averange score semestry 2 : ");
                        double avgScore2 = Double.parseDouble(input.readLine());
                        addStudent(name, grade, avgScore1, avgScore2);
                        break;
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }

}
