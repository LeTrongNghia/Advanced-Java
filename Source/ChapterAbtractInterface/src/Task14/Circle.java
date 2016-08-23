package Task14;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for circle
 */
public class Circle extends Shape{
	public double r;
	final float pi = (float) 3.14;
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	
	public Circle(double r) {
		super();
		this.r = r;
	}

	/*
	 * use to calculate perimeter of circle
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * pi * r;
	}

	
	/*
	 * use to calculate area of circle
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return pi * r * r;
	}
	
}
