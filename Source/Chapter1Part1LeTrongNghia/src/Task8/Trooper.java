package Task8;
/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class use to define solider
 */
public class Trooper extends Solider{
	
	public Trooper(String name, int power, String weapon) {
		super(name, power, weapon);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Summary: vinegar 3 point power
	 * output: power
	 */
	public void fight() {
		this.power -= 3;
	}
}
