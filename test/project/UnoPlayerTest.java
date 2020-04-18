/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Harry Om
 */
public class UnoPlayerTest {
    
    public UnoPlayerTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of getHand method, of class UnoPlayer.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        UnoPlayer instance = null;
        Deck expResult = null;
        Deck result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHand method, of class UnoPlayer.
     */
    @Test
    public void testSetHand() {
        System.out.println("setHand");
        Deck hand = null;
        UnoPlayer instance = null;
        instance.setHand(hand);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPoints method, of class UnoPlayer.
     */
    @Test
    public void testGetPoints() {
        System.out.println("getPoints");
        UnoPlayer instance = null;
        int expResult = 0;
        int result = instance.getPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class UnoPlayer.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        UnoPlayer instance = null;
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of skip method, of class UnoPlayer.
     */
    @Test
    public void testSkip() {
        System.out.println("skip");
        UnoPlayer instance = null;
        instance.skip();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of play method, of class UnoPlayer.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        UnoPlayer instance = null;
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UnoPlayer.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UnoPlayer instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
