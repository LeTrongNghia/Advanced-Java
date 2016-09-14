package Task1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/* Author: Lê Trọng Nghia
 * Date: 13/9/2016
 * Version: V1.0
 * Description: this is main class
 */
public class MainClass {
    public static void getResource(ResourceBundle message) {
        List<String> list = new ArrayList<>();
        Enumeration<String> keys = message.getKeys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = message.getString(key);
            list.add(value);
        }
        
        list.forEach(i -> System.out.println(i));
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            String languageDefault = "en";
            String countryDefault = "US";
            Locale currentLocal = new Locale(languageDefault, countryDefault);
            ResourceBundle message = ResourceBundle.getBundle("Task1/resource_en_US", currentLocal);
            getResource(message);
            while (true) {
                System.out.println("1. Select English");
                System.out.println("2. Select VietNamese");
                Scanner sc = new Scanner(System.in);
                int select = sc.nextInt();
                switch (select) {
                    case 1:
                        languageDefault = "en";
                        countryDefault = "US";
                        currentLocal = new Locale(languageDefault, countryDefault);
                        message = ResourceBundle.getBundle("Task1/resource_en_US", currentLocal);
                        getResource(message);
                        break;
                    case 2:
                        languageDefault = "vi";
                        countryDefault = "VN";
                        currentLocal = new Locale(languageDefault, countryDefault);
                        message = ResourceBundle.getBundle("Task1/resource_vi_VN", currentLocal);
                        getResource(message);
                        break;
                    default:
                        return;
                }
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
