/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package project;


/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author megha,2020
 */
public abstract class Game 
{
    private String player;// the players of the game
    
    public Game(String player)
    {
       setPlayer(player);
    }

    /**
     * @return the gameName
     */
    
     /**
     * @return the players of this game
     */
    public String getPlayer() 
    {
        return player;
    }

    /**
     * @param player the players of this game
     */
    public void setPlayer(String player) 
    {
        this.player = player;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

   
    
}//end class
