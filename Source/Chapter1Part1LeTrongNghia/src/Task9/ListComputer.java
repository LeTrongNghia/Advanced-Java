package Task9;
/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class use to manage list computer
 */
public class ListComputer {
	public Computer[] listCom = new Computer[100];
	public int count = 0;
	
	public ListComputer() {
		super();
	}
	
	/*
	 * Summary use to add computer in list.
	 * Parameter: Computer object.
	 */
	public void add(Computer c) {
		listCom[count] = c;
		count++;
	}
	
	/*
	 * Summary use to print information in list.
	 */
	public void print() {
		double totalLapTop = 0;
		double totalDesktop = 0;
		for (int i = 0; i < count; i++){
			System.out.println(listCom[i].toString());
			System.out.println("---------------------");
			if(listCom[i] instanceof Laptop)
				totalLapTop += listCom[i].calculatorMoney();
			else
				totalDesktop += listCom[i].calculatorMoney();
		}
		System.out.println("Total laptop: " + totalLapTop);
		System.out.println("Total desktop: " + totalDesktop);
	}
}
