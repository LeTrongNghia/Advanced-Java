package Task4;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Le Trong Nghia
 * @date Sep 19, 2016
 * @version 1.0
 * @description this is main class
 */
public class ManagementEmployee {

	/*
	 * print list employee where salary > 3000000
	 */
	public static void printAllowSalary(List<Employee> list) {
		List<Employee> ls = list.stream().filter(i -> i.getSalary() > 3000000).collect(Collectors.toList());
		System.out.println("\nHave " + ls.size() + " emloyee where salary > 3000000");
		ls.forEach(i -> System.out.println(i));
	}
	
	/*
	 * print list employee where name contains "Anh"
	 */
	public static void printAllowName(List<Employee> list) {
		List<Employee> ls = list.stream().filter(i -> i.getFullName().contains("Anh")).collect(Collectors.toList());
		System.out.println("\nList employee where name is contains Anh");
		ls.forEach(i -> System.out.println(i));
	}
	
	/*
	 * avg age of employee
	 */
	public static void staticalAllowAge(List<Employee> list) {
		IntSummaryStatistics st = list.stream().mapToInt(x -> x.getAge()).summaryStatistics();
		System.out.println("\nAvg age of employee: " + (float)st.getAverage());
	}
	
	/*
	 * avg salary of employee
	 * return float avg
	 */
	public static void staticalAllowSalary(List<Employee> list) {
		DoubleSummaryStatistics st = list.stream().mapToDouble(x -> x.getSalary()).summaryStatistics();
		System.out.println("\nMax salary of employee: " + (long)st.getMax());
		System.out.println("Min salary of employee: " + (long)st.getMin());
		System.out.println("Avg salary of employee: " + (long)st.getAverage());
		
	}
	
	/*
	 * use to get salary min
	 * return long min
	 */
	public static long getSalaryMin(List<Employee> list) {
		DoubleSummaryStatistics st = list.stream().mapToDouble(x -> x.getSalary()).summaryStatistics();
		return (long)st.getMin();
	}
	
	/*
	 * use to get salary max
	 * return long max
	 */
	public static long getSalaryMax(List<Employee> list) {
		DoubleSummaryStatistics st = list.stream().mapToDouble(x -> x.getSalary()).summaryStatistics();
		return (long)st.getMax();
	}
	
	/*
	 * use to get salary average
	 * return long salary average
	 */
	public static long getSalaryAvg(List<Employee> list) {
		DoubleSummaryStatistics st = list.stream().mapToDouble(x -> x.getSalary()).summaryStatistics();
		return (long)st.getAverage();
	}

	/*
	 * avg age of employee
	 * return float age average
	 */
	public static float getAvgAge(List<Employee> list) {
		IntSummaryStatistics st = list.stream().mapToInt(x -> x.getAge()).summaryStatistics();
		return (float)st.getAverage();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			ListEmployee manage = new ListEmployee();
			
			System.out.println(manage.toString());
			
			printAllowSalary(manage.getListEmp());
			
			printAllowName(manage.getListEmp());
			
			staticalAllowAge(manage.getListEmp());
			staticalAllowSalary(manage.getListEmp());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
