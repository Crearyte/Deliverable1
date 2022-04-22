
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

    /**
     * Test of getPlayerId method, of class Player.
     */
    @Test
    public void testGetPlayerId() {
        System.out.println("getPlayerId");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPlayerId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayerId method, of class Player.
     */
    @Test
    public void testSetPlayerId() {
        System.out.println("setPlayerId");
        int playerId = 0;
        Player instance = null;
        instance.setPlayerId(playerId);
    }

    /**
     * Test of getPlayerName method, of class Player.
     */
    @Test
    public void testGetPlayerName() {
        System.out.println("getPlayerName");
        Player instance = null;
        String expResult = "";
        String result = instance.getPlayerName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayerName method, of class Player.
     */
    @Test
    public void testSetPlayerName() {
        System.out.println("setPlayerName");
        String playerName = "";
        Player instance = null;
        instance.setPlayerName(playerName);
    }

    /**
     * Test of getPoints method, of class Player.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        Player instance = null;
        int expResult = 0;
        int result = instance.getPoints();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPoints method, of class Player.
     */
    @Test
    public void testSetPoints() {
        System.out.println("setPoints");
        int points = 0;
        Player instance = null;
        instance.setPoints(points);
    }

    /**
     * Test of getResult method, of class Player.
     */
    @Test
    public void testGetResult() {
        System.out.println("getResult");
        Player instance = null;
        String expResult = "";
        String result = instance.getResult();
        assertEquals(expResult, result);
    }

    /**
     * Test of setResult method, of class Player.
     */
    @Test
    public void testSetResult() {
        System.out.println("setResult");
        String result_2 = "";
        Player instance = null;
        instance.setResult(result_2);
    }

    /**
     * Test of hashCode method, of class Player.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Player instance = null;
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Player.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Player instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Player.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Player o = null;
        Player instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }
    
}
