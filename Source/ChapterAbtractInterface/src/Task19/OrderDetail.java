package Task19;

/*
 * @author Le Trong Nghia
 * @version 1.0
 * @created 29-Aug-2016 8:37:41 AM
 * @summary use to define for OrderDetail
 */
public class OrderDetail {

	public int amount;
	public Product product;

	public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public OrderDetail(int amount, Product product) {
        super();
        this.amount = amount;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderDetail(){

	}

	public void finalize() throws Throwable {

	}

	/*
	 * use to calculate price for product
	 */
	public double calPrice(){
		return this.amount * this.product.price;
	}

	/*
	 * use to print information of order detail
	 */
	public String toString() {
	    return this.product.toString() + "\t" + this.amount + "\t\t" + this.calPrice();
	}
}