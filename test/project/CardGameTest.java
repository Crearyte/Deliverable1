
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
    public void testGetNumberOfPlayersBoundry() {
        System.out.println("getNumberOfPlayersBoundry Testing default 2 Players Passed");
        CardGame instance = new CardGame();
        boolean expResult = false;
        boolean result = true;
        
        if (instance.getNumberOfPlayers() >= 2 && instance.getNumberOfPlayers()<=4){ //Number of Players should pass if the number is between 2-4
        expResult = true;
        }
        assertEquals(expResult, result);

    }
      /**
     * Test of getNumberOfPlayers method, of class CardGame.
     */
    @Test
    public void testGetNumberOfPlayersGood() {
        System.out.println("getNumberOfPlayers Good Testing 4 players Passed");
        CardGame instance = new CardGame();
        boolean expResult = false;
        boolean result = true;
        instance.setNumberOfPlayers(4);
        if (instance.getNumberOfPlayers() >= 2 && instance.getNumberOfPlayers()<=4){ //Number of Players should pass if the number is between 2-4
        expResult = true;
        }
        assertEquals(expResult, result);

    }
      /**
     * Test of getNumberOfPlayers method, of class CardGame.
     */
    @Test
    public void testGetNumberOfPlayersBad() {
        System.out.println("getNumberOfPlayers testing 1 Player Passed");
        CardGame instance = new CardGame();
        boolean expResult = false;
        boolean result = false;
        instance.setNumberOfPlayers(1);
        if (instance.getNumberOfPlayers() >= 2 && instance.getNumberOfPlayers()<=4){ //Number of Players should pass if the number is between 2-4
        expResult = true;
        }
        assertEquals(expResult, result);

    }

    /**
     * Test of getPlayers method, of class CardGame.
     */
    @Test
    public void testGetPlayersBoundry() {
        CardGame instance = new CardGame();
        
        Player P1 = new Player(0);
        P1.setPlayerId(1);
        P1.setPlayerName("Player 1");
        P1.setPoints(0);
        P1.setResult("Winner");
        instance.getPlayers().add(P1);
       
        System.out.println("getPlayersBoundry Passed");
        boolean expResult = false;
        boolean result = true;
        if (instance.getPlayers().size()== 1 ){
            expResult = true;
        }
       
        assertEquals(expResult, result);
    }
    /**
     * Test of getPlayers method, of class CardGame.
     */
    @Test
    public void testGetPlayersGood() {
        CardGame instance = new CardGame();
        
        Player P1 = new Player(0);
        Player P2 = new Player(0);
        Player P3 = new Player(0);
        Player P4 = new Player(0);
        P1.setPlayerId(1);
        P1.setPlayerName("Player 1");
        P1.setPoints(0);
        P1.setResult("Winner");
        P2.setPlayerId(2);
        P2.setPlayerName("Player 2");
        P2.setPoints(0);
        P2.setResult("Loser");
        P1.setPlayerId(3);
        P1.setPlayerName("Player 3");
        P1.setPoints(0);
        P1.setResult("Loser");
        P2.setPlayerId(4);
        P2.setPlayerName("Player 4");
        P2.setPoints(0);
        P2.setResult("Loser");
        instance.getPlayers().add(P1);
        instance.getPlayers().add(P2);
        instance.getPlayers().add(P3);
        instance.getPlayers().add(P4);
       
        System.out.println("getPlayersGood Passed");
        boolean expResult = false;
        boolean result = true;
        if (instance.getPlayers().size() >= 2 ){
            expResult = true;
        }
       
        assertEquals(expResult, result);
    }
    /**
     * Test of getPlayers method, of class CardGame.
     */
    @Test
    public void testGetPlayersBad() {
        CardGame instance = new CardGame();
        System.out.println("getPlayersBad Passed");
        boolean expResult = false;
        boolean result = false;
        
        if (instance.getPlayers().size()>= 1 ){
            expResult = true;
        }
       
        assertEquals(expResult, result);
    }

    /**
     * Test of distributeCardsForPlayers method, of class CardGame.
     */
    @Test
    public void testDistributeCardsForPlayers() {
        boolean expResult = false;
        boolean result = true;
        System.out.println("distributeCardsForPlayers Passed");
        List<Player> plys = null;
        CardGame instance = new CardGame();
        instance.distributeCardsForPlayers(plys);
        assertEquals(expResult, result);
    }

    /**
     * Test of playGame method, of class CardGame.
     */
    @Test
    public void testPlayGame() {
        System.out.println("playGame Passed");
        int numberOfPlayers = 0;
        CardGame instance = new CardGame();
        instance.playGame(numberOfPlayers);
    }

    /**
     * Test of displayWinners method, of class CardGame.
     */
    @Test
    public void testDisplayWinners() {
        System.out.println("displayWinners Passed");
        CardGame instance = new CardGame();
        instance.displayWinners();
    }
    
}
