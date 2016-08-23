package Task16;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for vehicle
 */
public abstract class Vehicle extends Moving {
	
	public String id;
	public String owner;
	public String color;
	public String manufacturer;
	
	public Vehicle(float distance, float time, float useFuel, String id, String owner, String color,
			String manufacturer) {
		super(distance, time, useFuel);
		this.id = id;
		this.owner = owner;
		this.color = color;
		this.manufacturer = manufacturer;
	}
	
}
