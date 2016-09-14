package Task1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

/* Author: Lê Trọng Nghia
 * Date: 14/9/2016
 * Version: V1.0
 * Description: use to management dairy
 */
public class DairyManagement {

    
    static Path file = Paths.get("/home/hocvien/workspace/Chapter6/src/Task1/daily.txt");

    /*
     * use to view daily
     */
    public static void viewDiary() throws FileNotFoundException, IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(file.toString())));
        String date;
        String content;
        try {
            while (true) {
                date = in.readUTF();
                content = in.readUTF();
                System.out.println(date + " \n " + content);
            }
        } catch (EOFException e) {
            System.out.println("Success");
        }
    }
    
    /*
     * Write daily
     */
    public static void writeDiary(String content) throws FileNotFoundException {
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println("Import content: ");

        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file.toString(), true)//true for append new content
        ))) {

            out.writeUTF(s.format(new Date()));
            out.writeUTF(content);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.println("Select function");
                System.out.println("(1)View diary (2)Write new diary (0)Exit");
                int select = Integer.parseInt(input.readLine());
                if (select == 0) {
                    return;
                }
                switch (select) {
                    case 1:
                        viewDiary();
                        break;
                    case 2:
                        System.out.println("Import content");
                        String content = input.readLine();
                        writeDiary(content);
                        break;
                    default:
                }                
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }
}
