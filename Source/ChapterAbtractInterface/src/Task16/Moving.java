package Task16;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for moving
 */
public class Moving {
	public float distance;
	public float time;
	public float useFuel;
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public float getUseFuel() {
		return useFuel;
	}
	public void setUseFuel(float useFuel) {
		this.useFuel = useFuel;
	}
	public Moving(float distance, float time, float useFuel) {
		super();
		this.distance = distance;
		this.time = time;
		this.useFuel = useFuel;
	}
	
}
