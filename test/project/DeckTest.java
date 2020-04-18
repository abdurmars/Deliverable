/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Harry Om
 */
public class DeckTest {
    
   
    
    

    /**
     * Test of showCards method, of class Deck.
     */
    @Test
    public void testShowCards() {
        System.out.println("showCards");
        Deck instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.showCards();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class Deck.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        Deck instance = null;
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class Deck.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        ArrayList<Card> card = null;
        Deck instance = null;
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Deck.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Deck instance = null;
        Card expResult = null;
        Card result = instance.remove();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Deck.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Deck instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
