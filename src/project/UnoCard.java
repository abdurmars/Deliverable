package project;

import project.Card;

/**
 *This program models a playing card from the Uno card game. the program know 
 * the four different color suits of a Uno card and the 15 different ranks of a
 * Uno card playable in the game. Many features of this program make it reusable
 * for other programs that also use playing cards. Most card games use ranks \
 * that range form 1-10 and then some more; ranks 2-9 can be utilized in other 
 * programs. final variables Rank and Color can be reused with only some 
 * additions, as well as their getter methods and card constructor. however, 
 * for the code to be reused in the fashion, the enums color and ranks would 
 * need to be in a separate java class and card class would have to call those
 * variables in those files.
 * for this program I did not use the card class made in class, instead made 
 * the program standalone. If I to extend the original Card class, then likely
 * I would implement the changes I suggested in this class, upon the original 
 * Card class in order to make the code reusable. 
 * This class and Card class are mostly identical except for the enums and the 
 * variable names.  
 *
 * @author Pritam Hooda
 */
public class UnoCard extends Card {


    /**
     * The enum class records the four color suits for the Uno game.
     */
    public enum Color {
        RED, YELLOW, GREEN, BLUE;
    }
    /**
     * The enum class records the 15 ranks of the Uno game. 
     */
    public enum Rank {
        ZERO (0), ONE (1), TWO (2), THREE (3), FOUR (4), FIVE (5), SIX (6), 
        SEVEN (7), EIGHT (8),NINE (9), SKIP (20), REVERSE (20), DRAW_TWO (20), 
        DRAW_FOUR (40), WILDCARD(40);
        
        public int points;
        
        private Rank(int points){
            this.points = points;
        }
        
        public int getPoints(){
            return points;
        }
    }
    
    
    private final Rank rank;
    private final Color color;
    
    /**
     * makes a Uno card object with programmer defined rank and color.
     * 
     * @param rank one of the 15 different ranks in the game.
     * @param color one of the 4 different color suits in the game.
     */
    public UnoCard(Rank rank, Color color){
        this.rank = rank;
        this.color = color;
    }

    /**
     * returns the rank of the Uno card object.
     * 
     * @return the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * returns the color suit of the Uno card object.
     * 
     * @return the color
     */
    public Color getColor() {
        return color;
    }
    
    @Override
    public String toString() {
        return String.format("");
    }
    
    

}
