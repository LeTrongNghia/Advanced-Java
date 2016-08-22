package Task11;

import java.util.InputMismatchException;

/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class define for exchange money
 */
public class Money extends Exchange{
	final double exchangeRateUSDBuy = 22260;
	final double exchangeRateEURBuy = 24998;
	final double exchangerateAUDBuy = 16802;
	final double exchangeRateUSDSell = 22330;
	final double exchangeRateEURSell = 25297;
	final double exchangeRateAUDSell = 17054;
	
	public String type;
	public String typeExchange;
	public Money(String id, String date, int numberOf, String type, String typeExChange) {
		super(id, date, numberOf);
		this.type = type;
		this.typeExchange = typeExChange;
	}
	
	/*
	 * Summary: use to calculate money buy
	 */
	public long calculateBuy() {
		long total = 0;
		switch (type.toUpperCase()) {
			case "USD":
				total = (long)exchangeRateUSDBuy * this.numberOf;
				break;
			case "EUR":
				total = (long)exchangeRateEURBuy * this.numberOf;
				break;
			case "AUD":
				total = (long)exchangerateAUDBuy * this.numberOf;
				break;
			default:
				throw new InputMismatchException("Please you check again");
		}
		return total;
	}
	
	/*
	 * Summary: use to calculate money sell
	 */
	public long calculateSell() {
		long total = 0;
		switch (type.toUpperCase()) {
			case "USD":
				total = (long)exchangeRateUSDSell * this.numberOf;
				break;
			case "EUR":
				total = (long)exchangeRateEURSell * this.numberOf;
				break;
			case "AUD":
				total = (long)exchangeRateAUDSell * this.numberOf;
				break;
			default:
				throw new InputMismatchException("Please you check again");
		}
		return total;
	}
	
	public long calculateTotal() {
		long total = 0;
		if (this.typeExchange.toLowerCase() == "buy") {
			total += calculateBuy();
		} else
			total += calculateSell();
		return total;
	}
	
	/*
	 * Summary: use to print information Exchange Gold
	 */
	public String toString() {
		return "Id: " + id + "\nDate: " + date + "\nNumber of: " + numberOf 
				+ "\nType: " + type + "\nTotal money: " + calculateTotal();
	}
}
