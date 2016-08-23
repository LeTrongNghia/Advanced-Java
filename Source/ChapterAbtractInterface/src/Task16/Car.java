package Task16;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for car
 */
public class Car extends Vehicle implements ISpeed,IUseFuel{
	public String gear;
	public String model;
	
	public Car(float distance, float time, float useFuel, String id, String owner, String color, String manufacturer,
			String gear, String model) {
		super(distance, time, useFuel, id, owner, color, manufacturer);
		this.gear = gear;
		this.model = model;
	}

	/*
	 * (non-Javadoc)
	 * @see Task16.Vehicle#consumpteFuel()
	 */
	@Override
	public float spendToFuel() {
		// TODO Auto-generated method stub
		return distance / useFuel;
	}
	
	/*
	 * (non-Javadoc)
	 * @see Task16.Vehicle#speed()
	 */
	@Override
	public float calculateSpeed() {
		// TODO Auto-generated method stub
		return distance * time;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Distance: " + distance + "\nTime: " + time + "\nUseFuel: " + useFuel + "\nId: " + id + "\nOwner: " + owner
				+ "\nColor: " + color + "\nManufaceturer: " + manufacturer + "\nSpeed reverse: " + "\nGear: " + gear + "\nModel: "
				+ model + "\nSpeed: " + calculateSpeed() + "\nSpent to fuel: " + spendToFuel();
	}
}
