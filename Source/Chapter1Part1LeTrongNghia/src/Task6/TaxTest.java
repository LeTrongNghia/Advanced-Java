package Task6;

import static org.junit.Assert.*;

import org.junit.Test;
/* Author: Lê Trọng Nghia
 * Date: 20/8/2016
 * Version: V1.0
 * Description: this class use to test method calculate real earning
 */
public class TaxTest {

	@Test
	public void test1() {
		Employee em = new Employee("An",1,0,2);
		long ac = em.calculateRE();
		long ex = 2520000;
		assertEquals(ex, ac);
	}
	@Test
	public void test2() {
		Employee em = new Employee("An",1,100000,(float) 2.67);
		long ac = em.calculateRE();
		long ex = 3464200;
		assertEquals(ex, ac);
	}
	@Test
	public void test3() {
		Employee em = new Employee("An",3,0,(float) 2.5);
		long ac = em.calculateRE();
		long ex = 3150000;
		assertEquals(ex, ac);
	}
	@Test
	public void test4() {
		Employee em = new Employee("An",0,0,2);
		long ac = em.calculateRE();
		long ex = 2520000;
		assertEquals(ex, ac);
	}
	@Test
	public void test5() {
		Employee em = new Employee("An",2,200000,(float) 1.2);
		long ac = em.calculateRE();
		long ex = 1712000;
		assertEquals(ex, ac);
	}
	@Test
	public void test6() {
		Employee em = new Employee("An",1,100000,(float) 1.5);
		long ac = em.calculateRE();
		long ex = 1990000;
		assertEquals(ex, ac);
	}
	@Test
	public void test7() {
		Employee em = new Employee("An",0,0,(float) 2.83);
		long ac = em.calculateRE();
		long ex = 3565799;
		assertEquals(ex, ac);
	}
	@Test
	public void test8() {
		Employee em = new Employee("An",1,210000,2);
		long ac = em.calculateRE();
		long ex = 2730000;
		assertEquals(ex, ac);
	}
	@Test
	public void test9() {
		Employee em = new Employee("An",1,1200000,(float) 3.5);
		long ac = em.calculateRE();
		long ex = 5610000;
		assertEquals(ex, ac);
	}
	@Test
	public void test10() {
		Employee em = new Employee("An",1,10000000,(float) 2.9);
		long ac = em.calculateRE();
		long ex = 13601300;
		assertEquals(ex, ac);
	}
	
}
