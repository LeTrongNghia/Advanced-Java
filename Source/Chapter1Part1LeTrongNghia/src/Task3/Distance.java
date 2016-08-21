package Task3;

/* Author: Lê Trọng Nghia
 * Date: 19/8/2016
 * Version: V1.0
 * Description: this class calculate distance between point A and point B
 */

public class Distance {
	private Pointer A;
	private Pointer B;
	
	public Distance(Pointer a, Pointer b) {
		super();
		A = a;
		B = b;
	}


	/*
	 * Method will distance of A and B
	 * Input: point A and point B
	 */
	public float getDistance() {
		float result = (float) Math.sqrt((A.getX() - B.getX()) * (A.getX() - B.getX()) 
									+ (A.getY() - B.getY()) * (A.getY() - B.getY()));
		return result;
	}
}
