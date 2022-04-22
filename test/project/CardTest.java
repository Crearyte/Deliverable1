
package project;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CardTest {
    
    public CardTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getCdNumber method, of class Card.
     */
    @Test
    public void testGetCdNumber() {
        System.out.println("getCdNumber");
        Card instance = null;
        Card.CARDNUMBER expResult = null;
        Card.CARDNUMBER result = instance.getCdNumber();
    }

    /**
     * Test of getCdType method, of class Card.
     */
    @Test
    public void testGetCdType() {
        System.out.println("getCdType");
        Card instance = null;
        Card.CARDTYPE expResult = null;
        Card.CARDTYPE result = instance.getCdType();
    }

    /**
     * Test of getPackOfCards method, of class Card.
     */
    @Test
    public void testGetPackOfCards() {
        System.out.println("getPackOfCards");
        List<Card> expResult = null;
        List<Card> result = Card.getPackOfCards();
    }

    /**
     * Test of shuffleCards method, of class Card.
     */
    @Test
    public void testShuffleCards() {
        System.out.println("shuffleCards");
        List<Card> cards = null;
        Card.shuffleCards(cards);
    }

    /**
     * Test of compareTo method, of class Card.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Card o = null;
        Card instance = null;
        int expResult = 0;
        int result = instance.compareTo(o);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
