package org.example;

public class Warrior extends Character{
    public static int strengthScore = 16;
    public static int craftScore = 6;
    public static int healthPoints = 15;
    public  Warrior(String playerName){
        super(craftScore,strengthScore,healthPoints,playerName);
    }

    public int getCraftScore() {
        return craftScore;
    }

    public int getStrengthScore() {
        return strengthScore;
    }

    public int getHealthPoints() {
        return healthPoints;
    }


}
