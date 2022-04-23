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
     *  Boundry Test of getCdNumber method, of class Card.
     */
    @Test
    public void testGetCdNumberBoundry() {
        Card instance = new Card();
        instance.setCdNumber(Card.CARDNUMBER.TWO);
        
        
        
        instance.getCdNumber();
        
        
        System.out.println("getCdNumberBoundry Testing passed ");
        boolean expResult= false;
        boolean result=true;
        if(instance.getCdNumber().equals(Card.CARDNUMBER.TWO)){
        
           expResult = true;
        
        }
        assertEquals(expResult,result);
        
        
    }
   
    
    /**
     *  Good Test of getCdNumber method, of class Card.
     */
    @Test
    public void testGetCdNumberGood() {
        Card instance = new Card();
        instance.setCdNumber(Card.CARDNUMBER.ACE);
        
       
        
     
          
        
        System.out.println("getCdNumbergood  Testing passed ");
        boolean expResult= false;
        boolean result=true;
        if(instance.getCdNumber().equals(Card.CARDNUMBER.TWO)||instance.getCdNumber().equals(Card.CARDNUMBER.THREE)||instance.getCdNumber().equals(Card.CARDNUMBER.FOUR)||instance.getCdNumber().equals(Card.CARDNUMBER.FIVE)||instance.getCdNumber().equals(Card.CARDNUMBER.SIX)
                ||instance.getCdNumber().equals(Card.CARDNUMBER.SEVEN)||instance.getCdNumber().equals(Card.CARDNUMBER.EIGHT)||instance.getCdNumber().equals(Card.CARDNUMBER.NINE)
                ||instance.getCdNumber().equals(Card.CARDNUMBER.TEN)||instance.getCdNumber().equals(Card.CARDNUMBER.JACK)||instance.getCdNumber().equals(Card.CARDNUMBER.QUEEN)||instance.getCdNumber().equals(Card.CARDNUMBER.KING)||instance.getCdNumber().equals(Card.CARDNUMBER.ACE)){
            
        
           expResult = true;
        
        }
        assertEquals(expResult,result);
        
        
    }
    /**
     *  BadTest of getCdNumber method, of class Card.
     */
    @Test
    public void testGetCdNumberBad() {
        Card instance = new Card();
        instance.setCdNumber(Card.CARDNUMBER.TWO);
        
        
        
        instance.getCdNumber();
        
        
        System.out.println("getCdNumberBad Testing passed ");
        boolean expResult= true;
        boolean result=true;
        if(instance.getCdNumber().equals(Card.CARDNUMBER.ACE)){
        
           expResult = false;
        
        }
        assertEquals(expResult,result);
        
        
    }
    
    /**
     * Boundry Test of getCdType method, of class Card.
     */
   
    @Test
    public void testGetCdTypeBoundry() {
        Card instance = new Card();
        instance.setCdType(Card.CARDTYPE.CLUB);
        
        
        
       
        
        
        System.out.println("getCdTypeBoundry Testing passed ");
        boolean expResult= false;
        boolean result=true;
        if(instance.getCdType().equals(Card.CARDTYPE.CLUB)){
        
           expResult = true;
        
        }
        assertEquals(expResult,result);
        
        
    }
    /**
     *  Good Test of getCdType method, of class Card.
     */
    @Test
    public void testGetCdTypeGood() {
        Card instance = new Card();
        instance.setCdType(Card.CARDTYPE.DIAMOND);
        
       
        
     
          
        
        System.out.println("getCdTypegood  Testing passed ");
        boolean expResult= false;
        boolean result=true;
        if(instance.getCdType().equals(Card.CARDTYPE.HEARTS)||instance.getCdType().equals(Card.CARDTYPE.CLUB)
                ||instance.getCdType().equals(Card.CARDTYPE.DIAMOND)||instance.getCdType().equals(Card.CARDTYPE.SPADE)){
            
        
           expResult = true;
        
        }
        assertEquals(expResult,result);
        
        
    }
    
    /**
     *  BadTest of getCdType method, of class Card.
     */
    @Test
    public void testGetCdTypeBad() {
        Card instance = new Card();
        instance.setCdType(Card.CARDTYPE.CLUB);
        
        
        
        
        
        
        System.out.println("getCdTyperBad Testing passed ");
        boolean expResult= true;
        boolean result=true;
        if(instance.getCdType().equals(Card.CARDTYPE.HEARTS)){
        
           expResult = false;
        
        }
        assertEquals(expResult,result);
        
        
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
