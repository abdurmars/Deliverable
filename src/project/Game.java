/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package project;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author megha,2020
 */
public abstract class Game {

    private Player player;// the players of the game

    //ugugyuguygy
    public Game() {

    }

    /**
     * @return the gameName
     */
    /**
     * @return the players of this game
     */
    

    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

}//end class
