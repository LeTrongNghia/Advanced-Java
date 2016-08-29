package Task19;

/*
 * @author Le Trong Nghia
 * @version 1.0
 * @created 29-Aug-2016 8:37:41 AM
 * @summary use to define for Customer
 */

public class Customer extends PersonalInformation {

	String customerID;
	public Order[] listOrder = new Order[100];
	public int count = 0;

	public Customer(){

	}

	public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    
    public Customer(String customerID) {
        super();
        this.customerID = customerID;
    }

    public void finalize() throws Throwable {

	}
    
    /*
     * use to add order in listOrder
     */
    public void addOrder(Order o) {
        listOrder[count] = o;
        count++;
    }
   
    /*
     * use to print information customer
     */
    public String toString() {
        String s = "";
        if (count != 0) {
            for (int i = 0; i < count; i++) {
                s += listOrder[i].toString() + "\n---------------------------------------" + "\n";
            }
        }
        return "ID: " + this.customerID + "\nName: " + this.name + "\nAddress: " + this.address 
                + "\nEmail: " + this.email + "\nPhone: " + this.phoneNumber + "\n" + s;
    }
}