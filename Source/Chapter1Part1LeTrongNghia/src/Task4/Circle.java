package Task4;

import Task3.Distance;
import Task3.Pointer;

/* Author: Lê Trọng Nghia
 * Date: 19/8/2016
 * Version: V1.0
 * Description: this class descripte circle
 */

public class Circle {
	final float pi = (float) 3.14;
	private Pointer A;
	private Pointer B;
	
	public Circle(Pointer a, Pointer b) {
		super();
		A = a;
		B = b;
	}

	//return radius
	public float getRadius() {
		Distance d = new Distance(A, B);
		return d.getDistance();
	}
	
	//return perimeter
	public float calculatePeprimeter() {
		float radius = this.getRadius();
		return 2 * pi * radius;
	}
	
	//return area
	public float calculateArea() {
		float radius = this.getRadius();
		return 2 * pi * radius * radius;
	}
}
