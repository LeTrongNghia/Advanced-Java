package Task28;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.activation.MailcapCommandMap;

/* @Author: Lê Trọng Nghia
 * @Date: 5/9/2016
 * @Version: V1.0
 */
public class MainClass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        try{
            Account account = new Account(10000000);
            MobileObserver mobi = new MobileObserver(account);
            EmailObserver email = new EmailObserver(account);
            System.out.println("Import amount:");
            long amount = input.nextLong();
            if(amount >= account.getState())
                throw new InputMismatchException("Please you check account again");
            account.setState((account.getState() - amount));
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
