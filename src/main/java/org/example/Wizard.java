package org.example;

public class Wizard extends Character{
    public static int craftScore=16;
    public static int strengthScore=0;
    public static int healthPoints=11;
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
