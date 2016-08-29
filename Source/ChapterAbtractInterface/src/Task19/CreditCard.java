package Task19;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @author Le Trong Nghia
 * @version 1.0
 * @created 29-Aug-2016 8:37:41 AM
 * @summary use to define for Credit card
 */
public class CreditCard extends Card {
    private Date limitedDate = new Date(116, 12, 12);
	private double maxLoan = 5000000;
	private String type = "Diamon";

	public Date getLimitedDate() {
        return limitedDate;
    }

    public void setLimitedDate(Date limitedDate) {
        this.limitedDate = limitedDate;
    }

    public double getMaxLoan() {
        return maxLoan;
    }

    public void setMaxLoan(double maxLoan) {
        this.maxLoan = maxLoan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
    }

    public CreditCard(String cardID, String vertificationType, Order order, Date limitedDate, double maxLoan,
            String type) {
        super(cardID, vertificationType, order);
        this.limitedDate = limitedDate;
        this.maxLoan = maxLoan;
        this.type = type;
    }

    public CreditCard(){

	}
    
    public void setName() {
        
    }

	public void finalize() throws Throwable {
		super.finalize();
	}

	/*
	 * (non-Javadoc)
	 * @see Task19.Card#pay()
	 */
	public double pay(Order o){
	    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		if(f.format(o.dateOrdered).compareTo(f.format(limitedDate)) <= 0) {
		    return 0;
		} else if(this.maxLoan <= o.calTotal()) {
		    return 0;
		} else {
		    this.maxLoan -= o.calTotal();
		    return this.maxLoan;
		}
	}
	
	/*
	 * Use to print information of credit card
	 */
	public String toString() {
	    return "Owner: " + "Le Trong Nghia" + "\nLimited date: " + this.limitedDate 
	            + "\nMax loan: " + this.maxLoan + "\nType: " + this.type;
	}

}