package Task4;

/**
 * @author Le Trong Nghia
 * @date Sep 19, 2016
 * @version 1.0
 * @description class for Employee
 */
public class Employee {
	private String fullName;
	private int age;
	private long salary;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Employee(String fullName, int age, long salary) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.fullName + "\t\tAge: " + this.age + "\tSalary: " + this.salary;
	}
}
