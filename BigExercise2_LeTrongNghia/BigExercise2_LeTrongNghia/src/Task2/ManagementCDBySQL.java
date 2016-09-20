package Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;

/**
 * @author Le Trong Nghia
 * @date Sep 19, 2016
 * @version 1.0
 * @description this is main class for SQL
 */
public class ManagementCDBySQL {
	public static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	/*
	 * use to print listCD
	 */
	public static void printList(List<CD> list) {
		if (list == null)
			System.out.println("List is empty");
		System.out.println("----------------List CD--------------");
		list.forEach(i -> System.out.println(i.toString()));
	}
	
	/*
	 * use to check id have in list
	 * input id, List<CD>
	 * if count == 1 return true else false
	 */
	public static boolean checkID(int id, List<CD> list) {
		int count = 0;
		for (CD cd : list) {
			if (cd.getId() == id)
				count++;
		}
		return count == 1;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		// TODO Auto-generated method stub
		try {
			CDController cdController = new CDController();
			List<CD> list = cdController.getListCD();
			boolean stop = false;//validate condition stop for loop do..while
			do {
				System.out.println("------------------Select function----------------");
				System.out.println("1 - Show list CD");
				System.out.println("2 - Search name");
				System.out.println("3 - Update CD");
				System.out.println("4 - Delete CD");
				System.out.println("5 - Add CD");
				System.out.println("6 - Exit");
				int choose = Integer.parseInt(input.readLine());
				switch (choose) {
					case 1: {
						list = cdController.getListCD();
						printList(list);
					} break;
					case 2: {
						System.out.println("Input keyword: ");
						String key = input.readLine();
						List<CD> search = cdController.searchCD(key);
						printList(search);
					} break;
					case 3: {
						printList(list);
						System.out.print("Input id: ");
						int id = Integer.parseInt(input.readLine());
						if (id <= 0)
							throw new InputMismatchException("id <= 0");
						if (!checkID(id, list)) {
							System.out.println("id is not exist");
						} else {
							System.out.print("Input number of songs: ");
							int numbers = Integer.parseInt(input.readLine());
							if (numbers <= 0)
								throw new InputMismatchException("number of songs <= 0");
							System.out.print("Input prices: ");
							double price = Double.parseDouble(input.readLine());
							if (numbers <= 0)
								throw new InputMismatchException("price <= 0");
							if (cdController.updateCD(id, numbers, price) > 0)
								System.out.println("Update susccess");
							else
								System.out.println("Failed");
						}
					} break;
					case 4: {
						printList(list);
						System.out.print("Input id: ");
						int id = Integer.parseInt(input.readLine());
						if (id <= 0)
							throw new InputMismatchException("id <= 0");
						if (!checkID(id, list))
							System.out.println("id is not exist");
						else {
							System.out.println("Do you want to delete? Y/N");
							String s = input.readLine();
							if(s.equalsIgnoreCase("y")) {
								if (cdController.deleteCD(id) > 0)
									System.out.println("Delete susccess");
								else
									System.out.println("Failed");
							}
						}
					} break;
					case 5: {
						CD newCD = new CD();
						System.out.print("Input name: ");
						newCD.setName(input.readLine());
						System.out.print("Input singer: ");
						newCD.setSinger(input.readLine());
						System.out.print("Input number of songs: ");
						int numbers = Integer.parseInt(input.readLine());
						if (numbers <= 0)
							throw new InputMismatchException("Number of songs <= 0");
						newCD.setNumberOfSongs(numbers);
						System.out.print("Input number of songs: ");
						double price = Double.parseDouble(input.readLine());
						if (price <= 0)
							throw new InputMismatchException("Price <= 0");
						newCD.setPrice(price);
						if (cdController.addCD(newCD) > 0)
							System.out.println("Insert susccess");
						else
							System.out.println("Failed");
					}break;
					case 6: {
						stop = true;
					} break;
					default:
						throw new InputMismatchException("Don't know");
				}
			} while(stop == false);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
