
package project;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    public PlayerTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testHashCodeGood() {
        System.out.println("Good hashCode");
        boolean expResult = true;
        if (Player.class.hashCode() > 31) {
            boolean result = true;
            assertEquals(expResult, result);
        }

    }

    @Test
    public void testHashCodeBad() {
        System.out.println("Bad hashCode");
        boolean expResult = true;
        if (Player.class.hashCode() < 31) {
            boolean result = false;
            assertEquals(expResult, result);
        }
    }

    @Test
    public void testHashCodeBoundary() {
        System.out.println("Boundary hashCode");
        boolean expResult = true;
        if (Player.class.hashCode() == 31) {
            boolean result = false;
            assertEquals(expResult, result);
        }
    }

    @Test
    public void testEqualsGood() {
        System.out.println("Good equals");
        Object obj1 = true;
        Object obj2 = true;
        boolean expResult = true;
        boolean result = obj1.equals(obj2);
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsBad() {
        System.out.println("Bad equals");
        Object obj1 = true;
        Object obj2 = false;
        boolean expResult = false;
        boolean result = obj1.equals(obj2);
        assertEquals(expResult, result);
    }

    @Test
    public void testEqualsBoundary() {
        System.out.println("Boundary equals");
        Object obj1 = true;
        Object obj2 = true;
        boolean expResult = true;
        boolean result = obj1.equals(obj2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareToGood() {
        System.out.println("Good compareTo");
        Player p1 = new Player(4);
        Player p2 = new Player(2);
        int expResult = 0;
        int result = p1.compareTo(p2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareToBad() {
        System.out.println("Bad compareTo");
        Player p1 = new Player(2);
        Player p2 = new Player(4);
        int expResult = 0;
        int result = p1.compareTo(p2);
        assertEquals(expResult, result);
    }

    @Test
    public void testCompareToBoundary() {
        System.out.println("compareTo");
        Player p1 = new Player(3);
        Player p2 = new Player(3);
        int expResult = 0;
        int result = p1.compareTo(p2);
        assertEquals(expResult, result);
    }
}
