
package project;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CardGameTest {
    
    public CardGameTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getNumberOfPlayers method, of class CardGame.
     */
    @Test
    public void testGetNumberOfPlayers() {
        System.out.println("getNumberOfPlayers");
        CardGame instance = new CardGame();
        int expResult = 0;
        int result = instance.getNumberOfPlayers();
        assertEquals(expResult, result);

    }

    /**
     * Test of getPlayers method, of class CardGame.
     */
    @Test
    public void testGetPlayers() {
        System.out.println("getPlayers");
        CardGame instance = new CardGame();
        List<Player> expResult = null;
        List<Player> result = instance.getPlayers();
        assertEquals(expResult, result);
    }

    /**
     * Test of distributeCardsForPlayers method, of class CardGame.
     */
    @Test
    public void testDistributeCardsForPlayers() {
        System.out.println("distributeCardsForPlayers");
        List<Player> plys = null;
        CardGame instance = new CardGame();
        instance.distributeCardsForPlayers(plys);
    }

    /**
     * Test of playGame method, of class CardGame.
     */
    @Test
    public void testPlayGame() {
        System.out.println("playGame");
        int numberOfPlayers = 0;
        CardGame instance = new CardGame();
        instance.playGame(numberOfPlayers);
    }

    /**
     * Test of displayWinners method, of class CardGame.
     */
    @Test
    public void testDisplayWinners() {
        System.out.println("displayWinners");
        CardGame instance = new CardGame();
        instance.displayWinners();
    }
    
}
