package Task2;

/* Author: Lê Trọng Nghia
 * Date: 19/8/2016
 * Version: V1.0
 * Description: this class calculate 2 number include operation: +;-;*;/
 */

public class Calculator {
	//variable
	private float firstNumber;
	private float secondNumber;
	
	//constructor
	public Calculator(float firstNumber, float secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	//getter + setter
	public float getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(float firstNumber) {
		this.firstNumber = firstNumber;
	}
	public float getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(float secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	//return addition
	public float add() {
		return this.firstNumber + this.secondNumber;
	}
	
	//return subtraction
	public float sub() {
		return this.firstNumber - this.secondNumber;
	}
	
	//return multiplication
	public float multiplicate() {
		return this.firstNumber * this.secondNumber;
	}
	
	//return division
	public float div() {
		return this.firstNumber / this.secondNumber;
	}
}
