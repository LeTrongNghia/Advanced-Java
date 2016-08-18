
public class LinearEquation {
	//variable
	float a;
	float b;
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
	//return result
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
