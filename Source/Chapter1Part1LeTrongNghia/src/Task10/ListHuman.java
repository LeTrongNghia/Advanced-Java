package Task10;
/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class use to manage list human
 */
public class ListHuman {
	public Human[] listHuman = new Human[100];
	public int count = 0;
	
	public ListHuman() {
		super();
	}
	
	/*
	 * Summary use to add human in list.
	 * Parameter: Human object.
	 */
	public void add(Human h) {
		listHuman[count] = h;
		count++;
	}
	
	/*
	 * Summary use to print information in list.
	 */
	public void print() {
		for (int i = 0; i < count; i++){
			System.out.println(listHuman[i].toString());
			System.out.println("---------------------");
		}
	}
}
