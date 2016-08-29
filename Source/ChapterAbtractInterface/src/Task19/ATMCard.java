package Task19;

/*
 * @author Le Trong Nghia
 * @version 1.0
 * @created 29-Aug-2016 8:37:41 AM
 * @summary use to define for ATM
 */

public class ATMCard extends Card {

	private double balance = 5000000;
	public ATMCard(){

	}

	public ATMCard(double balance) {
        super();
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void finalize() throws Throwable {
		super.finalize();
	}

    public void setName() {
        this.name = "Le Trong Nghia";
    }
    /*
     * (non-Javadoc)
     * @see Task19.Card#pay()
     */
	public double pay(Order o){
	    double total = o.calTotal();
	    if(balance > total) {
	        balance -= total;
	        return balance;
	    }
	    else 
	        return 0;
	}

	/*
	 * use to print information of ATM card
	 */
	public String toString(){
	    return "Owner: " + this.name + "\nBlance: " + this.balance;
	}
}