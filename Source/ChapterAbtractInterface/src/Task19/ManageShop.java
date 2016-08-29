package Task19;

import java.text.ParseException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @author Le Trong Nghia
 * @version 1.0
 * @created 29-Aug-2016 8:37:41 AM
 * @summary this is main class
 */

public class ManageShop {
    public static Scanner input = new Scanner(System.in);
    
    /*
     * use to import customer
     */
    public static void importCustomer(Customer c) {
        System.out.print("Customer ID: ");
        c.customerID = input.next();
        System.out.print("Name: ");
        c.name = input.next();
        System.out.print("Address: ");
        c.address = input.next();
        System.out.print("Email: ");
        c.email = input.next();
        System.out.print("Phone: ");
        c.phoneNumber = input.next();
    }
    
    public static void main(String[] args) throws ParseException {
        // TODO Auto-generated method stub

        try {
            CreditCard cre1 = new CreditCard();
            System.out.println(cre1.getLimitedDate());
            Product[] productList = new Product[10];
            productList[0] = new Product("Ram ddr3 - 2G", 250000);
            productList[1] = new Product("Ram ddr3 - 4G", 500000);
            productList[2] = new Product("Ram ddr3 - 8G", 750000);
            productList[3] = new Product("HDD - 500Gb", 750000);
            productList[4] = new Product("HDD - 1Tb", 1200000);
            productList[5] = new Product("SSD - 60Gb", 700000);
            productList[6] = new Product("SSD - 120Gb", 1250000);
            productList[7] = new Product("SSD - 240Gb", 2000000);
            productList[8] = new Product("USB - 4Gb", 50000);
            productList[9] = new Product("USB - 8Gb", 75000);
            System.out.println("-------- Danh sach san pham ------------");
            System.out.println("Stt" + "\tName" + "\t\tPrice");
            for(int i = 0; i < productList.length; i++) {
                System.out.println((i + 1) + "\t" + productList[i].name + "\t" + productList[i].price);
            }
            int stop;
            Order order = new Order();
            do {
                System.out.print("Please select product which you want: ");
                int select = input.nextInt();
                OrderDetail orderDetail = new OrderDetail();
                System.out.print("Please import quantity: ");
                orderDetail.amount = input.nextInt();
                if (orderDetail.amount <= 0) 
                    throw new InputMismatchException("Please you check again");
                orderDetail.product = productList[select];
                order.addOrderDetail(orderDetail);
                order.dateOrdered = new Date();
                System.out.println("Do you want to continue? (1)Yes (2)No");
                stop = input.nextInt();
                if (stop != 1 && stop != 2)
                    throw new InputMismatchException("Please you check again1");
            } while(stop == 1);
            System.out.println("Do you export order? (1)Yes (2)No");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    order.exportOrder = true;
                    break;
                case 2:
                    order.exportOrder = true;
                    break;
                default:
                    throw new InputMismatchException("Please you check again");
            }
            order.status = "new";
            Customer c = new Customer();
            System.out.println("Please provide your information");
            importCustomer(c);
            System.out.println("------------- Information your order-----------");
            System.out.println(c.toString());
            System.out.println(order.toString());
            System.out.println("Select payment method (1)ATM (2)CreditCard");
            int type = input.nextInt();
            switch(type) {
                case 1: {
                    ATMCard atm = new ATMCard();
                    double result = atm.pay(order);
                    if (result == 0) {
                        System.out.println("Your card has not enough money to payment");
                    } else {
                        System.out.println(atm.toString());
                    }
                } break;
                case 2: {
                    CreditCard cre = new CreditCard();
                    double result = cre.pay(order);
                    if (result == 0) {
                        System.out.println("Your card is expired or you can not loan any more");
                    } else {
                        System.out.println(cre.toString());
                    }

                }break;
                default:
                    throw new InputMismatchException("Please you check again");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
