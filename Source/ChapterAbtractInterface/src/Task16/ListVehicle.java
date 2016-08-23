package Task16;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for list vehicle
 */
public class ListVehicle {
	Vehicle[] list = new Vehicle[100];
	
	public int count = 0;
	
	/*
	 * Summary use to add vehicle in list.
	 * Parameter:  object.
	 */
	public void add(Vehicle v) {
		list[count] = v;
		count++;
	}
	
	/*
	 * Summary use to print information in list.
	 */
	public void print() {
		for (int i = 0; i < count; i++){
			System.out.println(list[i].toString());
			System.out.println("---------------------");
		}
		
	}
}
