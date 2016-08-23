package Task15;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for stringedInstrument
 */
public class StringedInstrument extends Instrument {
	
	public int numberOfStringed;
	
	public StringedInstrument(String name, String manufacturer, int number) {
		super(name, manufacturer);
		this.numberOfStringed = number;
	}
	
	public int getNumberOfStringed() {
		return numberOfStringed;
	}


	public void setNumberOfStringed(int numberOfStringed) {
		this.numberOfStringed = numberOfStringed;
	}


	/*
	 * Use to descripte how to play
	 */
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + this.name + "\nNumber of string: " + numberOfStringed);
	}
	
	
}
