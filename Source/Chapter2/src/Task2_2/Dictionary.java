package Task2_2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* Author: Lê Trọng Nghia
 * Date: 7/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class Dictionary {
    public static Scanner input = new Scanner(System.in);
    
    /*
     * use to search word
     * input String word, Set<WordEnglish> dict
     * output Strign maining
     */
    public static void searchWord(String word, Set<WordEnglish> dict) {
        int count = 0;
        for (WordEnglish wordEnglish : dict) {
            if (wordEnglish.word.equalsIgnoreCase(word)) {
                System.out.println("Meaning: " + wordEnglish.meaning);
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Not found");
        }
    }
    
    /*
     * use to print dictionary
     */
    public static void print(Set<WordEnglish> dic) {
        for (WordEnglish wordEnglish : dic) {
            System.out.println(wordEnglish.toString());
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
            Set dictionary = new TreeSet<WordEnglish>();
            WordEnglish w1 = new WordEnglish("Hello", "Xin chao");
            WordEnglish w2 = new WordEnglish("Bye", "Tam biet");
            dictionary.add(w1);
            dictionary.add(w2);
            int stop = 0;
            do {
                System.out.println("Do you choose function?");
                System.out.println("(1)Add word (2)Search (3)Remove (4)Show dictionary (5)Exit");
                int choose = input.nextInt();
                switch (choose) {
                    case 1: {
                        System.out.println("Import word: ");
                        String word = input.next();
                        System.out.println("Import meaning: ");
                        String meaning = input.next();
                        WordEnglish wordNew = new WordEnglish(word, meaning);
                        dictionary.add(wordNew);
                    }break;
                    case 2: {
                        System.out.print("Import word which you want to search: ");
                        String search = input.next();
                        searchWord(search, dictionary);
                    }break;
                    case 3: {
                        System.out.println("Import word wich you want to remove");
                        System.out.println("Import word: ");
                        String word = input.next();
                        WordEnglish wordDelete = new WordEnglish(word, null);
                        if(dictionary.remove(wordDelete))
                            System.out.println("Delete success");
                        else
                            System.out.println("Not found word");
                    }break;
                    case 4: {
                        System.out.println("All word in dictionary:");
                        print(dictionary);
                    }break;
                    case 5:
                        stop = 5;
                        break;
                    default:
                        throw new InputMismatchException("Please check again");
                }
            }while(stop == 0);
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
       
    }

}
