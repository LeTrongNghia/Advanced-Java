package Task2;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/* Author: Lê Trọng Nghia
 * Date: 14/9/2016
 * Version: V1.0
 * Description: use to management paragragh
 */

public class ManagementParagraph {
    public static Scanner input = new Scanner(System.in);
    
    /*
     * use to split word and put in array list
     * input String s;
     * output ArrayList<String> 
     */
    public static HashMap<String, Integer>  splitWord(String s) {
        HashMap<String,Integer> listWord = new HashMap<String,Integer>(); 
        StringTokenizer str = new StringTokenizer(s);
        while(str.hasMoreTokens()) {
            String temp = str.nextToken();
            if(listWord.containsKey(temp)) {
                int i = listWord.get(temp);
                listWord.put(temp, i + 1);
            } else {
                listWord.put(temp, 1);
            }
        }
        return listWord;
    }
    
    /*
     * use to 
     */
    public static void print(HashMap<String, Integer> list){
        for (String key : list.keySet()) {
            System.out.println("Word: " + key + "\tSo lan: " + list.get(key));
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub
        try {
            Path path = Paths.get("/home/hocvien/workspace/Chapter6/src/Task2/document.txt");
            List<String> f = Files.readAllLines(path);
           
            String s = "";
            for (String string : f) {
                s += string;
            }
            HashMap<String, Integer> list = splitWord(s);
            int stop = 1;
            do {
                System.out.println("Select function");
                System.out.println("(1)Print paragraph (2)Show list word (3)Search word");
                int choose = input.nextInt();
                switch (choose) {
                    case 1: {
                        System.out.println(s);
                    } break;
                    case 2: {
                        print(list);
                    } break;
                    case 3: {
                        System.out.println("Import word which you want to search");
                        String search = input.next();
                        if (list.containsKey(search)) {
                            System.out.println("Word: " + search + " have in list word");
                        } else {
                            System.out.println("Not found");
                        }
                    } break;
                    default:
                        throw new InputMismatchException("Please you check again");
                }
                System.out.println("Do you continue?");
                System.out.println("(1)Yes (2)No");
                stop = input.nextInt();
                if (stop != 1 && stop != 2)
                    throw new InputMismatchException("Do you check again");
            } while(stop == 1);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

}
