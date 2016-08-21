package Task5;

import Task3.Pointer;
/* Author: Lê Trọng Nghia
 * Date: 19/8/2016
 * Version: V1.0
 * Description: this class descripte reatangle
 */
public class Rectangle {
	private Pointer pointA;
	private Pointer pointB;
	
	public Rectangle(Pointer pointA, Pointer pointB) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
	}
	
	/*
	 * This method use to calculate width of rectangle
	 * Ouput width
	 */
	public float calculateWidth() {
		float w = (float)Math.sqrt((pointA.getY() - pointB.getY()) * (pointA.getY() - pointB.getY()));
		return w;
	}
	
	/*
	 * This method use to calculate height of rectangle
	 * Ouput width
	 */
	public float calculateHeight() {
		float w = (float)Math.sqrt((pointA.getX() - pointB.getX()) * (pointA.getX() - pointB.getX()));
		return w;
	}
	
	/*
	 * This method use to calculate perimete of rectangle
	 * Ouput perimte
	 */
	public float calculatePerimete() {
		return 2 * (this.calculateHeight() + this.calculateWidth());
	} 
	
	/*
	 * This method use to calculate area of rectangle
	 * Ouput area
	 */
	public float calculateArea() {
		return this.calculateHeight() * this.calculateWidth();
	} 
}
