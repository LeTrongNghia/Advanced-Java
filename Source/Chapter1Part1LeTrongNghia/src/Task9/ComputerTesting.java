package Task9;

import static org.junit.Assert.*;

import org.junit.Test;

/* Author: Lê Trọng Nghia
 * Date: 21/8/2016
 * Version: V1.0
 * Description: this class use to test calculate total money computer
 */
public class ComputerTesting {

    @Test
    public void test1() {
        Computer c = new Computer("1", 12000000, "Dell", 1);
        long ex = 12000000;
        long ac = c.calculatorMoney();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test2() {
        Computer c = new Computer("1", 1500000, "Dell", 4);
        long ex = 6000000;
        long ac = c.calculatorMoney();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test3() {
        Computer c = new Computer("1", 12000000, "Dell", 2);
        long ex = 24000000;
        long ac = c.calculatorMoney();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test4() {
        Computer c = new Computer("1", 12000000, "Dell", 8);
        long ex = 96000000;
        long ac = c.calculatorMoney();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test5() {
        Computer c = new Computer("1", 12000000, "Dell", 7);
        long ex = 84000000;
        long ac = c.calculatorMoney();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test6() {
        Computer c = new Computer("1", 12000000, "Dell", 10);
        long ex = 120000000;
        long ac = c.calculatorMoney();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test7() {
        Computer c = new Computer("1", 12000000, "Dell", 16);
        long ex = 192000000;
        long ac = c.calculatorMoney();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test8() {
        Computer c = new Computer("1", 12000000, "Dell", 11);
        long ex = 132000000;
        long ac = c.calculatorMoney();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test9() {
        Computer c = new Computer("1", 12000000, "Dell", 14);
        long ex = 168000000;
        long ac = c.calculatorMoney();
        assertEquals(ex, ac);
    }
    
    @Test
    public void test10() {
        Computer c = new Computer("1", 12000000, "Dell", 3);
        long ex = 36000000;
        long ac = c.calculatorMoney();
        assertEquals(ex, ac);
    }
}
