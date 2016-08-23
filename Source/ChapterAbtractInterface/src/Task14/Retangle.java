package Task14;

import javax.xml.ws.WebEndpoint;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for retangle
 */
public class Retangle extends Shape {
	public double width;
	public double height;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Retangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	/*
	 * use to calculate perimeter of retangle
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return (width + height) * 2;
	}
	
	/*
	 * use to calculate area of retangle
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
	
}
