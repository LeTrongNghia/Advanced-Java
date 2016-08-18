import static org.junit.Assert.*;

import org.junit.Test;

public class LinearEquationTest {
	@Test
	public void test1() {
		LinearEquation equa = new LinearEquation(5, 5);
		float[] ex = {0,0,-1};
		float[] ac = equa.sloveEquation();
		assertArrayEquals(ex, ac, 0);
	}
	@Test
	public void test2() {
		LinearEquation equa = new LinearEquation(0, 0);
		float[] ex = {1,0,0};
		float[] ac = equa.sloveEquation();
		assertArrayEquals(ex, ac, 0);
	}
	@Test
	public void test3() {
		LinearEquation equa = new LinearEquation(0, 4);
		float[] ex = {0,1,0};
		float[] ac = equa.sloveEquation();
		assertArrayEquals(ex, ac, 0);
	}
	@Test
	public void test4() {
		LinearEquation equa = new LinearEquation(-1, 4);
		float[] ex = {0,0,4};
		float[] ac = equa.sloveEquation();
		assertArrayEquals(ex, ac, 0);
	}
	@Test
	public void test5() {
		LinearEquation equa = new LinearEquation(4, 16);
		float[] ex = {0,0,-4};
		float[] ac = equa.sloveEquation();
		assertArrayEquals(ex, ac, 0);
	}
	@Test
	public void test6() {
		LinearEquation equa = new LinearEquation(4, -16);
		float[] ex = {0,0,4};
		float[] ac = equa.sloveEquation();
		assertArrayEquals(ex, ac, 0);
	}
	@Test
	public void test7() {
		LinearEquation equa = new LinearEquation(-5, -2);
		float[] ex = {0,0,(float) -0.4};
		float[] ac = equa.sloveEquation();
		assertArrayEquals(ex, ac, 0);
	}
	@Test
	public void test8() {
		LinearEquation equa = new LinearEquation(5, -2);
		float[] ex = {0,0,(float) 0.4};
		float[] ac = equa.sloveEquation();
		assertArrayEquals(ex, ac, 0);
	}
	@Test
	public void test9() {
		LinearEquation equa = new LinearEquation(1, -2);
		float[] ex = {0,0,2};
		float[] ac = equa.sloveEquation();
		assertArrayEquals(ex, ac, 0);
	}
	@Test
	public void test10() {
		LinearEquation equa = new LinearEquation(0, -10);
		float[] ex = {0,1,0};
		float[] ac = equa.sloveEquation();
		assertArrayEquals(ex, ac, 0);
	}
}
