package org.example;
//------------------------------------------------------
// Assignment_2 (2)
// Written by: (Anthony Alfaro 2148110)
// For SES350 Section (602) – Spring 2025
    /*
        A subclass of Character pretty much a preset role of character with hard coded values
        and cant be custom

     */
//--------------------------------------------------------
public class Wizard extends Character{
    public static int craftScore=16;
    public static int strengthScore=0;
    public static int healthPoints=11;

    /**
     *     * this constructor takes a player name and assigns Character object to wizard stats
     * @param playerName
     */
    public Wizard(String playerName){
        super(craftScore,strengthScore,healthPoints, playerName);
    }


//    public int getStrengthScore() {
//        return this.strengthScore;
//    }
//
//    public int getHealthPoints() {
//        return this.healthPoints;
//    }
//
//    public int getCraftScore() {
//        return this.craftScore;
//    }
}
