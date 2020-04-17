
Skip to content
Pull requests
Issues
Marketplace
Explore
@hoodap
abdurmars /
Deliverable

1
0

    0

Code
Issues 0
Pull requests 1
Actions
Projects 0
Wiki
Security
Insights
Deliverable/src/project/Game.java /
@hoodap hoodap - renammed group of cards to Deck.java 75352e8 4 days ago
60 lines (51 sloc) 1.27 KB
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
    private final String gameName;//the title of the game
    private Player player; // the players of the game
    
    public Game(String givenName)
    {
        gameName = givenName;
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public Player getPlayer() 
    {
        return player;
    }

    /**
     * @param player
     */
    public void setPlayers(Player player) 
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

    © 2020 GitHub, Inc.
    Terms
    Privacy
    Security
    Status
    Help

    Contact GitHub
    Pricing
    API
    Training
    Blog
    About

