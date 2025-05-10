package org.example;

import java.util.ArrayList;

public class Character {
    private int strengthScore;
    private int craftScore;
    private int healthPoints;
    private String playerName;
    private ArrayList<Items> inventory = new ArrayList<>();
    private Items leftHand;
    private Items rightHand;

    public Character(int craftScore, int strengthScore, int healthPoints,String playerName) {
        this.craftScore = craftScore;
        this.healthPoints = healthPoints;
        this.strengthScore = strengthScore;
        this.playerName = playerName;
    }
    public int getCraftScore() {
        return this.craftScore;
    }

    public int getStrengthScore() {
        return this.strengthScore;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
    public void addStrengthScore(int modifier){
        this.strengthScore= this.strengthScore+modifier;

    }
    public void addCraftScore(int modifier){
        this.craftScore= this.craftScore + modifier;

    }
    public void addHealthpoints(int modifier){
        this.healthPoints=this.healthPoints+modifier;
    }
    public void addItem(Items items){
        inventory.add(items);
        if(leftHand ==null){
            equipLeft(items);
        } else if (rightHand==null) {
            equipRight(items);
        }
    }
    public void equipLeft(Items item){
        this.leftHand = item;
        item.applyModifier(this);
    }
    public void equipRight(Items item){
        this.rightHand = item;
        item.applyModifier(this);
    }
    }
