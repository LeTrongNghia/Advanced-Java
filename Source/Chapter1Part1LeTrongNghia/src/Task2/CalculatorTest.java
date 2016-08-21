package Task2;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
/* Author: Lê Trọng Nghia
 * Date: 19/8/2016
 * Version: V1.0
 * Description: this class use to test method add,sub,multiplicate,div of Calculator class
 */
public class CalculatorTest {
	float a1 = 1;
	float b1 = 5;
	float exAdd1 = 6;
	float exSub1 = -4;
	float exMul1 = 5;
	
	float exDiv1 = (float)0.2;
	float a2 = 8;
	float b2 = 2;
	float exAdd2 = 10;
	float exSub2 = 6;
	float exMul2 = 16;
	float exDiv2 = 4;
	
	float a3 = -5;
	float b3 = -2;
	float exAdd3 = -7;
	float exSub3 = -3;
	float exMul3 = 10;
	float exDiv3 = (float)2.5;
	
	float a4 = -10;
	float b4 = 2;
	float exAdd4 = -8;
	float exSub4 = -12;
	float exMul4 = -20;
	float exDiv4 = -5;
	
	float a5 = -9;
	float b5 = 1;
	float exAdd5 = -8;
	float exSub5 = -10;
	float exMul5 = -9;
	float exDiv5 = -9;
	
	float a6 = 12;
	float b6 = 1;
	float exAdd6 = 13;
	float exSub6 = 11;
	float exMul6 = 12;
	float exDiv6 = 12;
	
	float a7 = 122;
	float b7 = 59;
	float exAdd7 = 181;
	float exSub7 = 63;
	float exMul7 = 7198;
	float exDiv7 = (float)2.06779661;
	
	float a8 = 0;
	float b8 = 5;
	float exAdd8 = 5;
	float exSub8 = -5;
	float exMul8 = 0;
	float exDiv8 = 0;
	
	float a9 = 0;
	float b9 = -6;
	float exAdd9 = -6;
	float exSub9 = 6;
	float exMul9 = 0;
	float exDiv9 = 0;
	
	float a10 = -122;
	float b10 = 59;
	float exAdd10 = -63;
	float exSub10 = -181;
	float exMul10 = -7198;
	float exDiv10 = (float)-2.06779661;
	

	@Test
	//Test method add of calculator class
	public void testAdd1() {
		Calculator cal = new Calculator(a1, b1);
		float ac = cal.add();
		assertEquals(exAdd1, ac, 0);
	}
	
	@Test
	public void testAdd2() {
		Calculator cal = new Calculator(a2, b2);
		float ac = cal.add();
		assertEquals(exAdd2, ac, 0);
	}
	
	@Test
	public void testAdd3() {
		Calculator cal = new Calculator(a3, b3);
		float ac = cal.add();
		assertEquals(exAdd3, ac, 0);
	}
	
	@Test
	public void testAdd4() {
		Calculator cal = new Calculator(a4, b4);
		float ac = cal.add();
		assertEquals(exAdd4, ac, 0);
	}
	
	@Test
	public void testAdd5() {
		Calculator cal = new Calculator(a5, b5);
		float ac = cal.add();
		assertEquals(exAdd5, ac, 0);
	}
	
	@Test
	public void testAdd6() {
		Calculator cal = new Calculator(a6, b6);
		float ac = cal.add();
		assertEquals(exAdd6, ac, 0);
	}
	
	@Test
	public void testAdd7() {
		Calculator cal = new Calculator(a7, b7);
		float ac = cal.add();
		assertEquals(exAdd7, ac, 0);
	}
	
	@Test
	public void testAdd8() {
		Calculator cal = new Calculator(a8, b8);
		float ac = cal.add();
		assertEquals(exAdd8, ac, 0);
	}
	
	@Test
	public void testAdd9() {
		Calculator cal = new Calculator(a9, b9);
		float ac = cal.add();
		assertEquals(exAdd9, ac, 0);
	}
	
	@Test
	public void testAdd10() {
		Calculator cal = new Calculator(a10, b10);
		float ac = cal.add();
		assertEquals(exAdd10, ac, 0);
	}
	
	@Test
	//Test method sub of calculator class
	public void testSub1() {
		Calculator cal = new Calculator(a1, b1);
		float ac = cal.sub();
		assertEquals(exSub1, ac, 0);
	}
	
	@Test
	public void testSub2() {
		Calculator cal = new Calculator(a2, b2);
		float ac = cal.sub();
		assertEquals(exSub2, ac, 0);
	}
	
	@Test
	public void testSub3() {
		Calculator cal = new Calculator(a3, b3);
		float ac = cal.sub();
		assertEquals(exSub3, ac, 0);
	}
	
	@Test
	public void testSub4() {
		Calculator cal = new Calculator(a4, b4);
		float ac = cal.sub();
		assertEquals(exSub4, ac, 0);
	}
	
	@Test
	public void testSub5() {
		Calculator cal = new Calculator(a5, b5);
		float ac = cal.sub();
		assertEquals(exSub5, ac, 0);
	}
	
	@Test
	public void testSub6() {
		Calculator cal = new Calculator(a6, b6);
		float ac = cal.sub();
		assertEquals(exSub6, ac, 0);
	}
	
	@Test
	public void testSub7() {
		Calculator cal = new Calculator(a7, b7);
		float ac = cal.sub();
		assertEquals(exSub7, ac, 0);
	}
	
	@Test
	public void testSub8() {
		Calculator cal = new Calculator(a8, b8);
		float ac = cal.sub();
		assertEquals(exSub8, ac, 0);
	}
	
	@Test
	public void testSub9() {
		Calculator cal = new Calculator(a9, b9);
		float ac = cal.sub();
		assertEquals(exSub9, ac, 0);
	}
	
	@Test
	public void testSub10() {
		Calculator cal = new Calculator(a10, b10);
		float ac = cal.sub();
		assertEquals(exSub10, ac, 0);
	}
	
	@Test
	//Test method multiplicate of calculator class
	public void testMul1() {
		Calculator cal = new Calculator(a1, b1);
		float ac = cal.multiplicate();
		assertEquals(exMul1, ac, 0);
	}
	
	@Test
	public void testMul2() {
		Calculator cal = new Calculator(a2, b2);
		float ac = cal.multiplicate();
		assertEquals(exMul2, ac, 0);
	}
	
	@Test
	public void testMul3() {
		Calculator cal = new Calculator(a3, b3);
		float ac = cal.multiplicate();
		assertEquals(exMul3, ac, 0);
	}
	
	@Test
	public void testMul4() {
		Calculator cal = new Calculator(a4, b4);
		float ac = cal.multiplicate();
		assertEquals(exMul4, ac, 0);
	}
	
	@Test
	public void testMul5() {
		Calculator cal = new Calculator(a5, b5);
		float ac = cal.multiplicate();
		assertEquals(exMul5, ac, 0);
	}
	
	@Test
	public void testMul6() {
		Calculator cal = new Calculator(a6, b6);
		float ac = cal.multiplicate();
		assertEquals(exMul6, ac, 0);
	}
	
	@Test
	public void testMul7() {
		Calculator cal = new Calculator(a7, b7);
		float ac = cal.multiplicate();
		assertEquals(exMul7, ac, 0);
	}
	
	@Test
	public void testMul8() {
		Calculator cal = new Calculator(a8, b8);
		float ac = cal.multiplicate();
		assertEquals(exMul8, ac, 0);
	}
	
	@Test
	public void testMul9() {
		Calculator cal = new Calculator(a9, b9);
		float ac = cal.multiplicate();
		assertEquals(exMul9, ac, 0);
	}
	
	@Test
	public void testMul10() {
		Calculator cal = new Calculator(a10, b10);
		float ac = cal.multiplicate();
		assertEquals(exMul10, ac, 0);
	}
	
	@Test
	//Test method division of calculator class
	public void testDiv1() {
		Calculator cal = new Calculator(a1, b1);
		float ac = cal.div();
		assertEquals(exDiv1, ac, 0);
	}
	
	@Test
	public void testDiv2() {
		Calculator cal = new Calculator(a2, b2);
		float ac = cal.div();
		assertEquals(exDiv2, ac, 0);
	}
	
	@Test
	public void testDiv3() {
		Calculator cal = new Calculator(a3, b3);
		float ac = cal.div();
		assertEquals(exDiv3, ac, 0);
	}
	
	@Test
	public void testDiv4() {
		Calculator cal = new Calculator(a4, b4);
		float ac = cal.div();
		assertEquals(exDiv4, ac, 0);
	}
	
	@Test
	public void testDiv5() {
		Calculator cal = new Calculator(a5, b5);
		float ac = cal.div();
		assertEquals(exDiv5, ac, 0);
	}
	
	@Test
	public void testDiv6() {
		Calculator cal = new Calculator(a6, b6);
		float ac = cal.div();
		assertEquals(exDiv6, ac, 0);
	}
	
	@Test
	public void testDiv7() {
		Calculator cal = new Calculator(a7, b7);
		float ac = cal.div();
		assertEquals(exDiv7, ac, 0);
	}
	
	@Test
	public void testDiv8() {
		Calculator cal = new Calculator(a8, b8);
		float ac = cal.div();
		assertEquals(exDiv8, ac, 0);
	}
	
	@Test
	public void testDiv9() {
		Calculator cal = new Calculator(a9, b9);
		float ac = cal.div();
		assertEquals(exDiv9, ac, 0);
	}
	
	@Test
	public void testDiv10() {
		Calculator cal = new Calculator(a10, b10);
		float ac = cal.div();
		assertEquals(exDiv10, ac, 0);
	}
}
