package Task4Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import Task4.Employee;
import Task4.ManagementEmployee;

import static org.junit.Assert.*;

/**
 * @author Le Trong Nghia
 * @date Sep 20, 2016
 * @version 1.0
 * @description test for average test
 */
public class AverageSalaryTest {

	ManagementEmployee manage = new ManagementEmployee();
	Employee emp1 = new Employee("Ha Tan Dien", 18, 1000000);
	Employee emp2 = new Employee("Huynh Tan Hoa", 22, 1200000);
	Employee emp3 = new Employee("Vo Van Minh", 20, 1500000);
	Employee emp4 = new Employee("Nguyen Quốc Huy", 21, 900000);
	Employee emp5 = new Employee("Nguyen Thi Lan Phuong", 24, 2000000);
	Employee emp6 = new Employee("Le Trong Nhan", 18, 1050000);
	Employee emp7 = new Employee("Le Trong Nghia", 18, 1600000);
	Employee emp8 = new Employee("Duong Kim Hien", 19, 800000);
	Employee emp9 = new Employee("Do Minh Quan", 26, 3200000);
	Employee emp10 = new Employee("Nguyen Hoang Phu Tien", 29, 5000000);
	Employee emp11 = new Employee("Nguyen Van Cuong", 22, 1000000);
	Employee emp12 = new Employee("Nguyen Tan Dung", 23, 500000);
	Employee emp13 = new Employee("Nguyen Thanh Huy", 26, 1400000);
	Employee emp14 = new Employee("Vo Tinh Anh", 17, 200000);
	Employee emp15 = new Employee("Tran Ngoc Dan", 18, 1300000);
	
    List<Employee> lstEmployee1 = Arrays.asList(emp1,emp2,emp3);
    List<Employee> lstEmployee2 = Arrays.asList(emp4,emp5,emp6);
    List<Employee> lstEmployee3 = Arrays.asList(emp7,emp8,emp9);
    List<Employee> lstEmployee4 = Arrays.asList(emp10,emp11,emp12);
    List<Employee> lstEmployee5 = Arrays.asList(emp13,emp14,emp15);

    //Test for the average salary of employees
    @Test
    public void averageSalary1() {
        long ex = 1233333;
        long ac = manage.getSalaryAvg(lstEmployee1);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageSalary2() {
        long ex = 6440000;
        long ac = manage.getSalaryAvg(lstEmployee1);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageSalary3() {
        long ex = 1316666;
        long ac = manage.getSalaryAvg(lstEmployee2);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageSalary4() {
        long ex = 6440000;
        long ac = manage.getSalaryAvg(lstEmployee2);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageSalary5() {
        long ex = 1866666;
        long ac = manage.getSalaryAvg(lstEmployee3);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageSalary6() {
        long ex = 1;
        long ac = manage.getSalaryAvg(lstEmployee3);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageSalary7() {
        long ex = 2166666;
        long ac = manage.getSalaryAvg(lstEmployee4);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageSalary8() {
        long ex = 3;
        long ac = manage.getSalaryAvg(lstEmployee4);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageSalary9() {
        long ex = 966666;
        long ac = manage.getSalaryAvg(lstEmployee5);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageSalary10() {
        long ex = 5;
        long ac = manage.getSalaryAvg(lstEmployee5);
        assertEquals(ex, ac, 0.01);
    }
}
