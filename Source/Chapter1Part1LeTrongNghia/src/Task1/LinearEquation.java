package Task1;
/* Author: Lê Trọng Nghia
 * Date: 18/8/2016
 * Version: V1.0
 * Description: this class solve linear equation ax+b=0
 */

public class LinearEquation {
	//variable
	private float a;
	private float b;
	
	//getter + setter
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	
	//contructor
	public LinearEquation(float a, float b){
		this.a = a;
		this.b = b;
	}
	
	public LinearEquation() {
		
	}
	
	/*
	 * output result of sloveEquation
	 */
	public float[] sloveEquation(){
		float[] rs = new float[3];
		if (a == 0) {
			if (b == 0)
				rs[0] = 1;//infinity
			else
				rs[1] = 1;//no solution
		}
		else
			rs[2] = -b / a;
		return rs; 
	} 
}
