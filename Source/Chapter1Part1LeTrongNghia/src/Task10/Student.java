package Task10;

import java.util.InputMismatchException;

/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class define for Teacher
 */
public class Student extends Human{
	String studentOfClass;
	private float scoreSemeter1;
	private float scoreSemeter2;
	
	
	public Student(String name, String birthOfDay, String address, String phoneNumber, String studentOfClass,
			float scoreSemeter1, float scoreSemeter2) {
		super(name, birthOfDay, address, phoneNumber);
		this.studentOfClass = studentOfClass;
		this.scoreSemeter1 = scoreSemeter1;
		this.scoreSemeter2 = scoreSemeter2;
	}

	public String getStudentOfClass() {
		return studentOfClass;
	}
	
	public void setStudentOfClass(String studentOfClass) {
		this.studentOfClass = studentOfClass;
	}

	public float getScoreSemeter1() {
		return scoreSemeter1;
	}

	public void setScoreSemeter1(float scoreSemeter1) {
		this.scoreSemeter1 = scoreSemeter1;
	}

	public float getScoreSemeter2() {
		return scoreSemeter2;
	}

	public void setScoreSemeter2(float scoreSemeter2) {
		this.scoreSemeter2 = scoreSemeter2;
	}
	
	/*
	 * Summary: use to calculate AVG score
	 */
	public float calculateAVG() {
		return (this.scoreSemeter1 + this.scoreSemeter2) / 2;
	}
	
	
	/*
	 * Summary: use to validate scoreSemeter1 >= 0 and ScoreSemeter2 >= 0
	 */
	public void validate() {
		if (this.scoreSemeter2 < 0 || this.scoreSemeter1 < 0)
			throw new InputMismatchException("Please you check information again");
	}
	
	/*
	 * Summary: use to print information student
	 */
	public String toString() {
		return "Name: " + name + "\nDay of birth: " + birthOfDay + "\nAddress: " 
				+ address + "\nPhone number: " + phoneNumber + "\nStudent of class: " + studentOfClass
				+ "\nScore semeter 1: " + scoreSemeter1 + "\nScore semeter 2: " + scoreSemeter2
				+ "\nAvg score: " + calculateAVG();
	}
}
