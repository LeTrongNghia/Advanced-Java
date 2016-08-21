package Task3;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

/* Author: Lê Trọng Nghia
 * Date: 19/8/2016
 * Version: V1.0
 * Description: this class descripte for pointer.
 */

public class DistanceTest {

	Pointer p1 = new Pointer(0,2);
	Pointer p2 = new Pointer(0,5);
	Pointer p3 = new Pointer(-5,7);
	Pointer p4 = new Pointer(4,-7);
	Pointer p5 = new Pointer(-2,0);
	
	@Test
	public void test1() {
		Distance d = new Distance(p1, p2);
		float ex = 3;
		float ac = d.getDistance();
		assertEquals(ex, ac, 0.1);
	}
	
	@Test
	public void test2() {
		Distance d = new Distance(p1, p3);
		float ex = (float) 7.071;
		float ac = d.getDistance();
		assertEquals(ex, ac, 0.1);
	}
	
	@Test
	public void test3() {
		Distance d = new Distance(p1, p4);
		float ex = (float) 9.848;
		float ac = d.getDistance();
		assertEquals(ex, ac, 0.1);
	}
	
	@Test
	public void test4() {
		Distance d = new Distance(p1, p5);
		float ex = (float) 2.828;
		float ac = d.getDistance();
		assertEquals(ex, ac, 0.1);
	}
	
	@Test
	public void test5() {
		Distance d = new Distance(p2, p3);
		float ex = (float) 5.385;
		float ac = d.getDistance();
		assertEquals(ex, ac, 0.1);
	}
	
	@Test
	public void test6() {
		Distance d = new Distance(p2, p4);
		float ex = (float) 12.649;
		float ac = d.getDistance();
		assertEquals(ex, ac, 0.1);
	}
	
	@Test
	public void test7() {
		Distance d = new Distance(p2, p5);
		float ex = (float)5.385;
		float ac = d.getDistance();
		assertEquals(ex, ac, 0.1);
	}
	
	@Test
	public void test8() {
		Distance d = new Distance(p3, p4);
		float ex = (float) 16.643;
		float ac = d.getDistance();
		assertEquals(ex, ac, 0.1);
	}
	
	@Test
	public void test9() {
		Distance d = new Distance(p3, p5);
		float ex = (float) 7.615;
		float ac = d.getDistance();
		assertEquals(ex, ac, 0.1);
	}
	
	@Test
	public void test10() {
		Distance d = new Distance(p4, p5);
		float ex = (float) 9.219;
		float ac = d.getDistance();
		assertEquals(ex, ac, 0.1);
	}
}
