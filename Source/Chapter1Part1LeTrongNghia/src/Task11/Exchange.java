package Task11;

import java.util.jar.Attributes.Name;

/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class define for Exchange
 */
public class Exchange {
	public String id;
	public String date;
	public int numberOf;
	
	public Exchange(String id, String date, int numberOf) {
		super();
		this.id = id;
		this.date = date;
		this.numberOf = numberOf;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNumberOf() {
		return numberOf;
	}

	public void setNumberOf(int numberOf) {
		this.numberOf = numberOf;
	}
	
	/*
	 * Summary: use to print information Exchange
	 */
	public String toString() {
		return "Id: " + id + "\nDate: " + date + "\nNumber of: " + numberOf;
	}
	
}
