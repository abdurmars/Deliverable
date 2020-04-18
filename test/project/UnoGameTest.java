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
public class UnoGameTest {
    
    public UnoGameTest() {
    }
    
    @BeforeEach
    public void setUp() {
    }

    /**
     * Test of play method, of class UnoGame.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        UnoGame instance = new UnoGame();
        instance.play();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declareWinner method, of class UnoGame.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        UnoGame instance = new UnoGame();
        instance.declareWinner();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
