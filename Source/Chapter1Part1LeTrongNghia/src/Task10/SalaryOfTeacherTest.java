package Task10;

import static org.junit.Assert.*;

import org.junit.Test;
/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class use to test method calculateSalary of teacher
 */
public class SalaryOfTeacherTest {

    @Test
    public void test1() {
        Teacher t = new Teacher("A", null, null, null, null, (float) 1.5, 10000000);
        long ex = 11890000;
        long ac = t.calculateSalary();
        assertEquals(ex, ac);
    }

    @Test
    public void test2() {
        Teacher t = new Teacher("A", null, null, null, null, (float) 2.5, 10000000);
        long ex = 13150000;
        long ac = t.calculateSalary();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test3() {
        Teacher t = new Teacher("A", null, null, null, null, (float) 0, 10050000);
        long ex = 10050000;
        long ac = t.calculateSalary();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test4() {
        Teacher t = new Teacher("A", null, null, null, null, (float) 2.5, 10000000);
        long ex = 13150000;
        long ac = t.calculateSalary();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test5() {
        Teacher t = new Teacher("A", null, null, null, null, (float) 3.5, 0);
        long ex = 4410000;
        long ac = t.calculateSalary();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test6() {
        Teacher t = new Teacher("A", null, null, null, null, (float) 1.7, 10000);
        long ex = 2152000;
        long ac = t.calculateSalary();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test7() {
        Teacher t = new Teacher("A", null, null, null, null, (float) 1.95, 11000000);
        long ex = 13457000;
        long ac = t.calculateSalary();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test8() {
        Teacher t = new Teacher("A", null, null, null, null, (float) 1.25, 10020000);
        long ex = 11595000;
        long ac = t.calculateSalary();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test9() {
        Teacher t = new Teacher("A", null, null, null, null, (float) 2.35, 10120000);
        long ex = 13080999;
        long ac = t.calculateSalary();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test10() {
        Teacher t = new Teacher("A", null, null, null, null, (float) 2.5, 10012200);
        long ex = 13162200;
        long ac = t.calculateSalary();
        assertEquals(ex, ac);
    }
    
}
