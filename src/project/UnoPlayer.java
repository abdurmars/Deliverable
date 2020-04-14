/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Pritam Hooda
 */
public class UnoPlayer extends Player {

    private Deck hand; // to be changed later
    private int points;
    private int score;

    public UnoPlayer(String name) {
        super(name);
        hand = new Deck();
    }

    public Deck getHand() {

        return null;
    }

    public void setHand(Deck hand) {

    }

    public int getPoints() {

        return points;
    }

    public int getScore() {

        return score;
    }

    public void skip() {

    }

    @Override
    public void play() {

    }

    @Override
    public String toString(){
        
        return "";
    } 
    

}
