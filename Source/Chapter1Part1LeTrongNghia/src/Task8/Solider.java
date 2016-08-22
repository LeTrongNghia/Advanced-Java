package Task8;
/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class use to define solider
 */
public class Solider {
	public String name;
	public int power;
	public String weapon;
	
	public Solider(String name, int power, String weapon) {
		super();
		this.name = name;
		this.power = power;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	/*
	 * Summary: vinegar 1 point power
	 * output: power
	 */
	public void fight() {
		this.power--;
	}
}
