package Task4;

import static org.junit.Assert.*;

import org.junit.Test;

import Task3.Pointer;
/* Author: Lê Trọng Nghia
 * Date: 19/8/2016
 * Version: V1.0
 * Description: this class use to test method calculate peprimeter and calculate area
 */

public class CircleTest {
	Pointer p1 = new Pointer(0,2);
	Pointer p2 = new Pointer(0,5);
	Pointer p3 = new Pointer(-5,7);
	Pointer p4 = new Pointer(4,-7);
	Pointer p5 = new Pointer(-2,0);
	
	//Test area
	@Test
	public void testArea1() {
		Circle cr = new Circle(p1, p2);
		float ex =(float)56.52;
		float ac = cr.calculateArea();
		assertEquals(ex, ac, 0.1);
	}

	@Test
	public void testArea2() {
		Circle cr = new Circle(p1, p3);
		float ex =(float)314;
		float ac = cr.calculateArea();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea3() {
		Circle cr = new Circle(p1, p4);
		float ex =(float)609.16;
		float ac = cr.calculateArea();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea4() {
		Circle cr = new Circle(p1, p5);
		float ex =(float)50.239;
		float ac = cr.calculateArea();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea5() {
		Circle cr = new Circle(p2, p3);
		float ex =(float)182.12;
		float ac = cr.calculateArea();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea6() {
		Circle cr = new Circle(p2, p4);
		float ex =(float)1004.8;
		float ac = cr.calculateArea();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea7() {
		Circle cr = new Circle(p2, p5);
		float ex =(float)182.12;
		float ac = cr.calculateArea();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea8() {
		Circle cr = new Circle(p3, p4);
		float ex =(float)1739.558;
		float ac = cr.calculateArea();
		assertEquals(ex, ac, 0.1);
	}
	@Test
	public void testArea9() {
		Circle cr = new Circle(p3, p5);
		float ex =(float)364.24;
		float ac = cr.calculateArea();
		assertEquals(ex, ac, 0.1);
	}
	
	@Test
	public void testArea10() {
		Circle cr = new Circle(p4, p5);
		float ex =(float)533.8;
		float ac = cr.calculateArea();
		assertEquals(ex, ac, 0.1);
	}
	
	//Test peprimeter
		@Test
		public void testPep1() {
			Circle cr = new Circle(p1, p2);
			float ex =(float)18.84;
			float ac = cr.calculatePeprimeter();
			assertEquals(ex, ac, 0.1);
		}

		@Test
		public void testPep2() {
			Circle cr = new Circle(p1, p3);
			float ex =(float)44.406;
			float ac = cr.calculatePeprimeter();
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testPep3() {
			Circle cr = new Circle(p1, p4);
			float ex =(float)61.85;
			float ac = cr.calculatePeprimeter();
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testPep4() {
			Circle cr = new Circle(p1, p5);
			float ex =(float)17.762;
			float ac = cr.calculatePeprimeter();
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testPep5() {
			Circle cr = new Circle(p2, p3);
			float ex =(float)33.818;
			float ac = cr.calculatePeprimeter();
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testPep6() {
			Circle cr = new Circle(p2, p4);
			float ex =(float)79.436;
			float ac = cr.calculatePeprimeter();
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testPep7() {
			Circle cr = new Circle(p2, p5);
			float ex =(float)33.818;
			float ac = cr.calculatePeprimeter();
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testPep8() {
			Circle cr = new Circle(p3, p4);
			float ex =(float)104.52;
			float ac = cr.calculatePeprimeter();
			assertEquals(ex, ac, 0.1);
		}
		@Test
		public void testPep9() {
			Circle cr = new Circle(p3, p5);
			float ex =(float)47.827;
			float ac = cr.calculatePeprimeter();
			assertEquals(ex, ac, 0.1);
		}
		
		@Test
		public void testPep10() {
			Circle cr = new Circle(p4, p5);
			float ex =(float)57.898;
			float ac = cr.calculatePeprimeter();
			assertEquals(ex, ac, 0.1);
		}
}
