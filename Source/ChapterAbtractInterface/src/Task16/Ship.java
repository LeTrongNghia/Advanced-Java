package Task16;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for ship
 */
public class Ship extends Vehicle implements ISpeed,IUseFuel{
	public float weight;
	public float load;
	public float speedReverse;
	public float SpeedStraight;
	public float spentToStart;
	public String typeFuel;
	
	
	public Ship(float distance, float time, float useFuel, String id, String owner, String color, String manufacturer,
			float weight, float load, float speedReverse, float speedStraight, float spentToStart, String typeFuel) {
		super(distance, time, useFuel, id, owner, color, manufacturer);
		this.weight = weight;
		this.load = load;
		this.speedReverse = speedReverse;
		SpeedStraight = speedStraight;
		this.spentToStart = spentToStart;
		this.typeFuel = typeFuel;
	}

	/*
	 * (non-Javadoc)
	 * @see Task16.IUseFuel#spendToFuel()
	 */
	@Override
	public float spendToFuel() {
		return distance / time - speedReverse + SpeedStraight;
	}
	
	/*
	 * (non-Javadoc)
	 * @see Task16.ISpeed#calculateSpeed()
	 */
	@Override
	public float calculateSpeed() {
		// TODO Auto-generated method stub
		return distance / (useFuel - spentToStart);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Distance: " + distance + "\nTime: " + time + "\nUseFuel: " + useFuel + "\nId: " + id + "\nOwner: " + owner
				+ "\nColor: " + color + "\nManufaceturer: " + manufacturer + "\nWeight: " + weight + "\nLoad: " + load
				+ "\nSpeed reverse: " + speedReverse + "\nSpeed straight: " + SpeedStraight + "\nSpend to fuel when start: " + spentToStart
				+ "\nType fuel: " + typeFuel + "\nSpeed: " + calculateSpeed() + "\nSpent to fuel: " + spendToFuel();
	}
}
