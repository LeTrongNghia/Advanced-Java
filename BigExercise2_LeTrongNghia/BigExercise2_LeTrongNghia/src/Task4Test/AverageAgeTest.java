package Task4Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import Task4.Employee;
import Task4.ManagementEmployee;

/**
 * @author Le Trong Nghia
 * @date Sep 20, 2016
 * @version 1.0
 * @description test age average
 */
public class AverageAgeTest {
	ManagementEmployee manage = new ManagementEmployee();
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
	
    List<Employee> lstEmployee1 = Arrays.asList(emp1,emp2,emp3);
    List<Employee> lstEmployee2 = Arrays.asList(emp4,emp5,emp6);
    List<Employee> lstEmployee3 = Arrays.asList(emp7,emp8,emp9);
    List<Employee> lstEmployee4 = Arrays.asList(emp10,emp11,emp12);
    List<Employee> lstEmployee5 = Arrays.asList(emp13,emp14,emp15);

    //Test for the average age of employees
    @Test
    public void averageAge1() {
        float ex = (float) 20;
        float ac = ManagementEmployee.getAvgAge(lstEmployee1);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageAge2() {
        float ex = (float) 21.6666;
        float ac = ManagementEmployee.getAvgAge(lstEmployee1);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageAge3() {
        float ex = (float) 21;
        float ac = ManagementEmployee.getAvgAge(lstEmployee2);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageAge4() {
        float ex = (float) 21.6666;
        float ac = ManagementEmployee.getAvgAge(lstEmployee2);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageAge5() {
        float ex = (float) 21;
        float ac = ManagementEmployee.getAvgAge(lstEmployee3);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageAge6() {
        float ex = 1;
        float ac = ManagementEmployee.getAvgAge(lstEmployee3);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageAge7() {
        float ex = (float)24.66666;
        float ac = ManagementEmployee.getAvgAge(lstEmployee4);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageAge8() {
        float ex = 3;
        float ac = ManagementEmployee.getAvgAge(lstEmployee4);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageAge9() {
        float ex = (float)20.33333;
        float ac = ManagementEmployee.getAvgAge(lstEmployee5);
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void averageAge10() {
        float ex = 5;
        float ac = ManagementEmployee.getAvgAge(lstEmployee5);
        assertEquals(ex, ac, 0.01);
    }

}
