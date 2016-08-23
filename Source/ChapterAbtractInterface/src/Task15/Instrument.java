package Task15;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for instrument
 */
public abstract class Instrument {
	public String name;
	public String manufacturer;
	public Instrument(String name, String manufacturer) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
	}
	
	/*
	 * use to descripte how to play instrument
	 */
	public abstract void play();
}
