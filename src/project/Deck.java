/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game
 *
 * @author Pritam Hooda
 */
public class Deck {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;

    public Deck(int size) {
           

    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> showCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void addCard(ArrayList<Card> card) {
        
        // do code here

    }

    public Card remove() {

        // tO do code here
        return null; // to be changed later 

    }
    
    @Override
    public String toString(){
        
        // to do code here
        return ""; // to be changed later
    }
    

}//end class
