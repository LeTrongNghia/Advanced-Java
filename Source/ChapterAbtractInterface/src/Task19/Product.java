package Task19;

/*
 * @author Le Trong Nghia
 * @version 1.0
 * @created 29-Aug-2016 8:37:41 AM
 * @summary use to define for product
 */
public class Product {

	String name;
	double price;

	public Product(){

	}

	public void finalize() throws Throwable {

	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Product(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    /*
     * use to print information of product
     */
    public String toString() {
        return this.name + "\t" + this.price;
    }
}