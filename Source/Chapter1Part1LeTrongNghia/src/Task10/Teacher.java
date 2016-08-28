package Task10;

import java.util.InputMismatchException;

/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class define for Teacher
 */
public class Teacher extends Human{
	private final double basicPay = 1260000;
	private String classLeader;
	private float wayCoe;// way coefficient
	private double allowance;

	public Teacher(String name, String birthOfDay, String address, String phoneNumber, String classLeader, float wayCoe,
			double allowance) {
		super(name, birthOfDay, address, phoneNumber);
		this.classLeader = classLeader;
		this.wayCoe = wayCoe;
		this.allowance = allowance;
	}

	public String getClassLeader() {
		return classLeader;
	}

	public void setClassLeader(String classLeader) {
		this.classLeader = classLeader;
	}

	public float getWayCoe() {
		return wayCoe;
	}

	public void setWayCoe(float wayCoe) {
		this.wayCoe = wayCoe;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getBasicPay() {
		return basicPay;
	}
	
	/*
	 * Summary: use to calculate salary of teacher
	 * output double salary
	 */
	public long calculateSalary() {
		return (long)(this.wayCoe * this.basicPay + this.allowance);
	}
	
	/*
	 * Summary: use to validate waycoe > 0 and allowance >= 0
	 */
	public void validate() {
		if (this.wayCoe <= 0 || allowance < 0)
			throw new InputMismatchException("Please you check information again");
	}
	
	/*
	 * Summary: use to print information Teacher
	 */
	public String toString() {
		return "Name: " + name + "\nDay of birth: " + birthOfDay 
				+ "\nAddress: " + address + "\nPhone number: " + phoneNumber
				+ "\nWaycore: " + wayCoe + "\nallowance: " + allowance + "\nLeader of class: " + classLeader
				+ "\nSalary: " + calculateSalary();
	}
}
