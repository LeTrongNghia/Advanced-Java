package Task9;
/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class use to define laptop
 */
public class Laptop extends Computer {
	
	private float weight;
	private float baretty;
	private float sizeScreen;
	
	public Laptop(String id, double unitPrice, String manufactuer, int numberOf, float weight, float baretty,
			float sizeScreen) {
		super(id, unitPrice, manufactuer, numberOf);
		this.weight = weight;
		this.baretty = baretty;
		this.sizeScreen = sizeScreen;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getBaretty() {
		return baretty;
	}

	public void setBaretty(float baretty) {
		this.baretty = baretty;
	}

	public float getSizeScreen() {
		return sizeScreen;
	}

	public void setSizeScreen(float sizeScreen) {
		this.sizeScreen = sizeScreen;
	}
	
	/*
	 * Summary: use to print information computer
	 * output: String information desktop include id, manufacturer, unit price, weight, baretty, sizeScreen
	 */
	public String toString() {
		return "Id: " + this.Id + "\nManufacturer: " + this.manufacturer + "\nUnit price: " + this.unitPrice
				+ "\nWeight: " + this.weight + "\nBaretty: " + this.baretty + "\nScreen: " + this.sizeScreen; 
	}
}
