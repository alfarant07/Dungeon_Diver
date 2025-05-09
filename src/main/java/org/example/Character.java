package org.example;

import java.util.ArrayList;

public class Character {
    private int strengthScore;
    private int craftScore;
    private int healthPoints;
    private String playerName;
    private ArrayList<Items> inventory = new ArrayList<>();

    public Character(int craftScore, int strengthScore, int healthPoints,String playerName) {
        this.craftScore = 0;
        this.healthPoints = 0;
        this.strengthScore = 0;
        this.playerName = playerName;
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

    public String getPlayerName() {
        return playerName;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public void addStrengthScore(int modifier){
        this.strengthScore+=modifier;

    }
    public void addCraftScore(int modifier){
        this.craftScore+=modifier;

    }
    public void addHealthpoints(int modifier){
        this.healthPoints+=modifier;
    }
    public void addItem(Items items){
        inventory.add(items);
    }
}
