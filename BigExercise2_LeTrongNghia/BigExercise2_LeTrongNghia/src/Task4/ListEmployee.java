package Task4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Le Trong Nghia
 * @date Sep 19, 2016
 * @version 1.0
 * @description class for list employee
 */
public class ListEmployee {
	private List<Employee> listEmp;
	
	public List<Employee> getListEmp() {
		return listEmp;
	}

	//Create 15 employee
	Employee emp1 = new Employee("Ha Tan Dien", 18, 10000000);
	Employee emp2 = new Employee("Huynh Tan Hoa", 22, 12000000);
	Employee emp3 = new Employee("Vo Van Minh", 20, 15000000);
	Employee emp4 = new Employee("Nguyen Quốc Huy", 21, 9000000);
	Employee emp5 = new Employee("Nguyen Thi Lan Phuong", 24, 20000000);
	Employee emp6 = new Employee("Le Trong Nhan", 18, 10500000);
	Employee emp7 = new Employee("Le Trong Nghia", 18, 16000000);
	Employee emp8 = new Employee("Duong Kim Hien", 19, 8000000);
	Employee emp9 = new Employee("Do Minh Quan", 26, 32000000);
	Employee emp10 = new Employee("Nguyen Hoang Phu Tien", 29, 50000000);
	Employee emp11 = new Employee("Nguyen Van Cuong", 22, 10000000);
	Employee emp12 = new Employee("Nguyen Tan Dung", 23, 5000000);
	Employee emp13 = new Employee("Nguyen Thanh Huy", 26, 14000000);
	Employee emp14 = new Employee("Vo Tinh Anh", 17, 2000000);
	Employee emp15 = new Employee("Tran Ngoc Dan", 18, 13000000);
	
	public ListEmployee() {
		//Validate null
		if (this.listEmp == null) {
			listEmp = new ArrayList<Employee>();
		}
		
		//Add 15 employee
		listEmp.add(emp1);
		listEmp.add(emp2);
		listEmp.add(emp3);
		listEmp.add(emp4);
		listEmp.add(emp5);
		listEmp.add(emp6);
		listEmp.add(emp7);
		listEmp.add(emp8);
		listEmp.add(emp9);
		listEmp.add(emp10);
		listEmp.add(emp11);
		listEmp.add(emp12);
		listEmp.add(emp13);
		listEmp.add(emp14);
		listEmp.add(emp15);
	}
	
	/*
	 * print list employee
	 * return String s
	 */
	@Override
	public String toString() {
		String s = "";
		for (Employee employee : listEmp) {
			s += employee.toString() + "\n";
		}
		return s;
	}
	
}
