package Task13;

import Task6.Employee;

/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for Saler
 */
public class Saler extends Employee{
	public double salarySale;
	public int saleRate;
	public double getSalarySale() {
		return salarySale;
	}
	public void setSalarySale(double salarySale) {
		this.salarySale = salarySale;
	}
	public int getSaleRate() {
		return saleRate;
	}
	public void setSaleRate(int saleRate) {
		this.saleRate = saleRate;
	}
	public Saler(String name, int nOD, double allowance, float wayCoe, double salarySale, int saleRate) {
		super(name, nOD, allowance, wayCoe);
		this.salarySale = salarySale;
		this.saleRate = saleRate;
	}
	
	/*
	 * use to calculate bonus
	 */
	public long calculateBonus() {
		return (long)salarySale * saleRate / 100;
	}
	
	/*
	 * use to print information
	 */
	@Override
	public String toString() {
		return "Salary sale: " + salarySale + "\nSale rate: " + saleRate + super.toString();
	}
	
}
