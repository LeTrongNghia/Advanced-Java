package Task2_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

/* Author: Lê Trọng Nghia
 * Date: 8/9/2016
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
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try{
            String s = "Hạnh phúc phúc lắm chứ, bởi có ai được sinh ra một cách dễ dàng đâu. Mỗi người mẹ mang nặng đẻ đau 9 tháng 10 ngày, ấp ủ trong lòng đứa con dần khôn lớn. Trong cõi lòng ấm áp của người mẹ, một tế bào lớn dần lên thành một sinh linh. Kì diệu thay quá trình ấy. Tôi có cảm giác nó xảy ra như một phép màu.Mà hình như cũng cần thêm chút cơ duyên. Như tôi đã bắt duyên với cuộc đời này. Như hàng triệu con người đã bắt duyên và sinh ra trên cuộc đời này. Nhưng cũng có hàng triệu thai nhi, có lẽ vì không nắm được sợi tơ ấy mà bị tước đi quyền sống. Ở Việt Nam có những nơi người ta gọi là ngọn đồi của những thiên thần, nhưng là thiên thần bị cha mẹ - vì một lí do nào đó - nhẫn tâm bỏ rơi. Hàng ngàn nấm mồ tí xíu trắng toát nằm lạnh lẽo với chút khói nhang vương vất và tấm lòng xót thương từ những người hảo tâm không ruột rà máu mủ. Không thể thống kê hết mỗi năm có bao nhiêu hài nhi bị phá bỏ, chỉ biết một phần trong số đó đã được đưa về nghĩa trang này, kín những đồi rộng. Thế nên, được sinh ra là đã là một sự may mắn, là hạnh phúc hơn biết bao đứa trẻ chưa từng một lần chạm tới cuộc đời.";
            System.out.println("Do you want to use paragraph default?");
            System.out.println("(1)Yes (2)No");
            int select = input.nextInt();
            if (select != 1 && select != 2)
                throw new InputMismatchException("Do you check again");
            if (select == 2) {
                System.out.print("Import paragraph: ");
                s = input.next();
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
