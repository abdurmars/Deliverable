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
public class UnoCardTest {
    
    public UnoCardTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of getRank method, of class UnoCard.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        UnoCard instance = null;
        UnoCard.Rank expResult = null;
        UnoCard.Rank result = instance.getRank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class UnoCard.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        UnoCard instance = null;
        UnoCard.Color expResult = null;
        UnoCard.Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class UnoCard.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        UnoCard instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
