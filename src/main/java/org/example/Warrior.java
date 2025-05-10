package org.example;

public class Warrior extends Character{
    public static int strengthScore = 16;
    public static int craftScore = 0;
    public static int healthPoints = 15;
    public  Warrior(String playerName){
        super(craftScore,strengthScore,healthPoints,playerName);
    }

//    public int getCraftScore() {
//        return this.craftScore;
//    }
//
//    public int getStrengthScore() {
//        return this.strengthScore;
//    }
//
//    public int getHealthPoints() {
//        return this.healthPoints;
//    }


}
