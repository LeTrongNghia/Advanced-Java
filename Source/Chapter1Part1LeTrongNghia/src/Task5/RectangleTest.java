package Task5;

import static org.junit.Assert.*;

import org.junit.Test;

import Task3.Pointer;
/* Author: Lê Trọng Nghia
 * Date: 19/8/2016
 * Version: V1.0
 * Description: this is class test for method calculatePerimete and calculateArea of Reactangle class.
 */
public class RectangleTest {
	Pointer p1 = new Pointer(0,2);
	Pointer p2 = new Pointer(1,5);
	Pointer p3 = new Pointer(-5,7);
	Pointer p4 = new Pointer(4,-7);
	Pointer p5 = new Pointer(-2,0);
	
	
	//Test calculatePerimete
	@Test
	public void testPer1() {
		Rectangle rec = new Rectangle(p1, p2);
		float ac = rec.calculatePerimete();
		float ex = 8;
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPer2() {
		Rectangle rec = new Rectangle(p1, p3);
		float ac = rec.calculatePerimete();
		float ex = 20;
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPer3() {
		Rectangle rec = new Rectangle(p1, p4);
		float ac = rec.calculatePerimete();
		float ex = 26;
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPer4() {
		Rectangle rec = new Rectangle(p1, p5);
		float ac = rec.calculatePerimete();
		float ex = 8;
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPer5() {
		Rectangle rec = new Rectangle(p2, p3);
		float ac = rec.calculatePerimete();
		float ex = 16;
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPer6() {
		Rectangle rec = new Rectangle(p2, p4);
		float ac = rec.calculatePerimete();
		float ex = 30;
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPer7() {
		Rectangle rec = new Rectangle(p2, p5);
		float ac = rec.calculatePerimete();
		float ex = 16;
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPer8() {
		Rectangle rec = new Rectangle(p3, p4);
		float ac = rec.calculatePerimete();
		float ex = 46;
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPer9() {
		Rectangle rec = new Rectangle(p3, p5);
		float ac = rec.calculatePerimete();
		float ex = 20;
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testPer10() {
		Rectangle rec = new Rectangle(p4, p5);
		float ac = rec.calculatePerimete();
		float ex = 26;
		assertEquals(ex, ac, 0.1);
	}
	
	//Test calculateArea
		@Test
		public void testArea1() {
			Rectangle rec = new Rectangle(p1, p2);
			float ac = rec.calculateArea();
			float ex = 3;
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testArea2() {
			Rectangle rec = new Rectangle(p1, p3);
			float ac = rec.calculateArea();
			float ex = 25;
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testArea3() {
			Rectangle rec = new Rectangle(p1, p4);
			float ac = rec.calculateArea();
			float ex = 36;
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testArea4() {
			Rectangle rec = new Rectangle(p1, p5);
			float ac = rec.calculateArea();
			float ex = 4;
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testArea5() {
			Rectangle rec = new Rectangle(p2, p3);
			float ac = rec.calculateArea();
			float ex = 12;
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testArea6() {
			Rectangle rec = new Rectangle(p2, p4);
			float ac = rec.calculateArea();
			float ex = 36;
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testArea7() {
			Rectangle rec = new Rectangle(p2, p5);
			float ac = rec.calculateArea();
			float ex = 15;
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testArea8() {
			Rectangle rec = new Rectangle(p3, p4);
			float ac = rec.calculateArea();
			float ex = 126;
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testArea9() {
			Rectangle rec = new Rectangle(p3, p5);
			float ac = rec.calculateArea();
			float ex = 21;
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testArea10() {
			Rectangle rec = new Rectangle(p4, p5);
			float ac = rec.calculateArea();
			float ex = 42;
			assertEquals(ex, ac, 0.1);
		}
}
