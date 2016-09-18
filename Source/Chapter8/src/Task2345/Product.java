package Task2345;


/* Author: Lê Trọng Nghia
 * Date: 16/9/2016
 * Version: V1.0
 * Description: define for category controller
 */
public class Product {

	int id;
	String name;
	double price;
	int amount;
	int categoryID;
	
	public Product() {
		super();
	}

	
	public Product(int id, String name, double price, int amount, int categoryID) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.categoryID = categoryID;
	}
	
	public Product(String name, double price, int amount, int categoryID) {
		super();
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.categoryID = categoryID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", amount=" + amount + ", categoryID="
				+ categoryID + "]";
	}
	
	
}
