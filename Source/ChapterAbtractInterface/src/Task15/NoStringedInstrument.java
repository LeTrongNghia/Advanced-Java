package Task15;
/* Author: Lê Trọng Nghia
 * Date: 23/8/2016
 * Version: V1.0
 * Description: this class define for nostringedIntrument
 */
public class NoStringedInstrument extends Instrument{
	public String use;

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public NoStringedInstrument(String name, String manufacturer, String use) {
		super(name, manufacturer);
		this.use = use;
	}

	/*
	 * Use to descripte how to play
	 */
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(use);
	}
	
	
}
