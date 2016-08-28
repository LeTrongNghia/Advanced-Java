package Task13;

import Task6.Employee;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for Saler
 */
public class Producer extends Employee{
	final int norms = 1000;
	final float rateBonus = (float) 0.5;
	
	public int numberOfProduct;

	public Producer(String name, int nOD, double allowance, float wayCoe, int numberOfProduct) {
		super(name, nOD, allowance, wayCoe);
		this.numberOfProduct = numberOfProduct;
	}
	
	/*
	 * use to calculate bonus
	 */
	public long calculateBonus() {
		return (long)((numberOfProduct - norms) * rateBonus);
	}
	
	/*
	 * use to calculate income
	 * output income
	 */
	public long calculateIncome() {
		return (long) (getWayCoe() * getBasicPay() + getAllowance() + calculateBonus());
	}

	/*
	 * use to print information
	 */
	@Override
	public String toString() {
		return "Norms: " + norms + "\nRate bonus: " +rateBonus + super.toString();
	}
	
	
}
