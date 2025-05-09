package org.example;

public class Character {
    private int strengthScore;
    private int craftScore;
    private int healthPoints;
    private String playerName;
    public Character(int craftScore, int strengthScore, int healthPoints,String playerName){
        this.craftScore=0;
        this.healthPoints=0;
        this.strengthScore=0;
        this.playerName =playerName;
    }


    public int getCraftScore() {
        return craftScore;
    }

    public int getStrengthScore() {
        return strengthScore;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
