package org.example;

public class Wizard extends Character{
    public static int craftScore=16;
    public static int strengthScore=7;
    public static int healthPoints=11;
    public Wizard(String playerName){
        super(craftScore,strengthScore,healthPoints, playerName);
    }


    public int getStrengthScore() {
        return strengthScore;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getCraftScore() {
        return craftScore;
    }
}
