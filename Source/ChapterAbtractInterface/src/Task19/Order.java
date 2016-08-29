package Task19;

import java.util.Date;

/*
 * @author Le Trong Nghia
 * @version 1.0
 * @created 29-Aug-2016 8:37:41 AM
 * @summary use to define for Order
 */
public class Order {

	public Date dateOrdered;
	public boolean exportOrder;
	public String status;
	public OrderDetail[] listOrdDetail = new OrderDetail[100];
	public int count = 0;

	public Order(Date dateOrdered, boolean exportOrder, String status) {
        super();
        this.dateOrdered = dateOrdered;
        this.exportOrder = exportOrder;
        this.status = status;
    }

    public Date getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public boolean isExportOrder() {
        return exportOrder;
    }

    public void setExportOrder(boolean exportOrder) {
        this.exportOrder = exportOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(){

	}

	public void finalize() throws Throwable {

	}

	/*
	 * use to calculate total money for order
	 */
	public double calTotal(){
	    double total = 0;
	    if (count == 0)    
	        return 0;
	    else {
	        for (int i = 0; i < count; i++) {
	            total += this.listOrdDetail[i].calPrice();
	        }
	    }
	    return total;
	}

	/*
	 * use to print information order
	 */
	public String toString() {
	    String s = "";
	    if (count != 0) {
	        for (int i = 0; i < count; i++) {
	            s += listOrdDetail[i].toString() + "\n--------------------------------------------------------------" + "\n";
	        }
	    }
	    return "Date: " + this.dateOrdered + "\nExport order: " + this.exportOrder 
	            + "\nStatus: " + this.status + "\n----------------------------------------------------------------\n"
	    +"Product name\tPrice\t\tQuantity\tSub total\n" + s + "\nTotal: " + calTotal();
	}
	
	/*
	 * use to add oerder detail in list order detail
	 */
	public void addOrderDetail(OrderDetail o) {
	    listOrdDetail[count] = o;
	    count++;
	}
}