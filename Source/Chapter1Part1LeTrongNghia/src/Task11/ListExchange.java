package Task11;
/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class use to manage list exchange
 */
public class ListExchange {
	public Exchange[] list = new Exchange[100];
	public int count = 0;
	
	public ListExchange() {
		super();
	}
	
	/*
	 * Summary use to add exchange in list.
	 * Parameter: Exchange object.
	 */
	public void add(Exchange e) {
		list[count] = e;
		count++;
	}
	
	/*
	 * Summary use to print information in list.
	 */
	public void print() {
		double totalGold = 0;
		int countGold = 0;
		double totalMoney = 0;
		int countMoney = 0;
		for (int i = 0; i < count; i++){
			System.out.println(list[i].toString());
			System.out.println("---------------------");
			if(list[i] instanceof Gold) {
				totalGold += ((Gold)list[i]).calculateMoney();
				countGold++;
			} else {
				totalMoney += ((Money)list[i]).calculateTotal();
				countMoney++;
			}
		}
		System.out.println("Total gold: " + (long)totalGold);
		System.out.println("Total money: " + (long)totalMoney);
		System.out.println("Avg gold: " + (long)(totalGold / countGold));
		System.out.println("Avg money: " + (long)(totalMoney / countMoney));
	}
}
