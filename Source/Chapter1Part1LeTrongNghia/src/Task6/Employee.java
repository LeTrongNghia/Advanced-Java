package Task6;
/* Author: Lê Trọng Nghia
 * Date: 20/8/2016
 * Version: V1.0
 * Description: class descripte information employee to calculate tax
 */
public class Employee {
	private String name;
	private int nOD;//number of dependents
	private double allowance;
	private float wayCoe;// way coefficient
	final double basicPay = 1260000;
	final double maxRate1 = 250000;// max tax of rate tax
	final double maxRate2 = 500000;
	final double maxRate3 = 1200000;
	final double maxRate4 = 2800000;
	final double maxRate5 = 5000000;
	final double maxRate6 = 8400000;
	
	final double rate1 = 5000000;// rate tax
	final double rate2 = 10000000;
	final double rate3 = 18000000;
	final double rate4 = 32000000;
	final double rate5 = 52000000;
	final double rate6 = 80000000;
	
	public Employee(String name, int nOD, double allowance, float wayCoe) {
		super();
		this.name = name;
		this.nOD = nOD;
		this.allowance = allowance;
		this.wayCoe = wayCoe;
	}

	public Employee() {
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getnOD() {
		return nOD;
	}


	public void setnOD(int nOD) {
		this.nOD = nOD;
	}


	public double getAllowance() {
		return allowance;
	}


	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}


	public float getWayCoe() {
		return wayCoe;
	}


	public void setWayCoe(float wayCoe) {
		this.wayCoe = wayCoe;
	}


	public double getBasicPay() {
		return basicPay;
	}


	/*
	 * use to calculate income
	 * output income
	 */
	public long calculateIncome() {
		return (long) (wayCoe * basicPay + allowance);
	}
	
	/*
	 * use to calculate income
	 * output income
	 */
	public long calculateIncomeTaxable() {
		long iT = this.calculateIncome() - 9000000 - this.getnOD() * 3600000;
		if (iT <= 0)
			return 0;
		else
			return iT;
	}
	
	/*
	 * use to calculate person income tax
	 * output person income tax
	 */
	public long calculatePIT() {
		double iT = this.calculateIncomeTaxable();
		if (iT > rate6) {
			long pIT = (long) (maxRate1 + maxRate2 + maxRate3 + maxRate4 + maxRate5 + maxRate6 + (iT - rate6) * 35 /100); 
			return pIT;
		} else if (iT >= rate5) {
			long pIT = (long) (maxRate1 + maxRate2 + maxRate3 + maxRate4 + maxRate5 + (iT - rate5) * 30 /100); 
			return pIT;
		} else if (iT >= rate4) {
			long pIT = (long) (maxRate1 + maxRate2 + maxRate3 + (iT - rate4) * 25 /100); 
			return pIT;
		} else if (iT >= rate3) {
			long pIT = (long) (maxRate1 + maxRate2 + (iT - rate3) * 20 /100); 
			return pIT;
		} else if (iT >= rate2) {
			long pIT = (long) (maxRate1 + (iT - rate2) * 15 /100); 
			return pIT;
		} else if (iT >= rate1) {
			long pIT = (long) ((iT - rate1) * 10 /100); 
			return pIT;
		} else {
			long pIT = (long) (iT * 5 /100);
			return pIT;
		}
	}
	
	/*
	 * use to calculate real earnings 
	 * output real earnings
	 */
	public long calculateRE() {
		return this.calculateIncome() - this.calculatePIT();
	}
	
}
