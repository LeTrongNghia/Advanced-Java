package Task15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Running {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Import name: ");
			String name = input.nextLine();
			System.out.print("Import manufaceturer: ");
			String manu = input.nextLine();
			System.out.println("Select type instrument (1)StringedInstrument (2)NonStringedInstrument");
			int select = input.nextInt();
			switch (select) {
				case 1: {
					System.out.print("Import number of string: ");
					int number = input.nextInt();
					StringedInstrument st = new StringedInstrument(name, manu, number);
					st.play();
				} break;
				case 2: {
					System.out.print("Import how to play: ");
					String use = input.next();
					NoStringedInstrument nst = new NoStringedInstrument(name, manu, use);
					nst.play();
				} break;
				default:
					throw new InputMismatchException("Pleasr uoy check again");
					
			}
		} catch (InputMismatchException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
