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


    /**
     * Creates chatacter object on given inputs
     * @param craftScore determines this character craftScore
     * @param strengthScore sets this characters StrengthScore
     * @param healthPoints sets this charaters health score
     * @param playerName sets this players name
     */
    public Character(int craftScore, int strengthScore, int healthPoints,String playerName) {
        this.craftScore = craftScore;
        this.healthPoints = healthPoints;
        this.strengthScore = strengthScore;
        this.playerName = playerName;
    }

    /**
     *
     * @returns this craft score
     */
    public int getCraftScore() {
        return this.craftScore;
    }

    /**
     *
     * @return this strength score
     */
    public int getStrengthScore() {
        return this.strengthScore;
    }

    /**
     *
     * @return characters healthPoints
     */
    public int getHealthPoints() {
        return this.healthPoints;
    }

    /**
     *
     * @return characters name
     */
    public String getPlayerName() {
        return this.playerName;
    }

    /**
     *
     * @param healthPoints takes healthpoints and sets characters hp to that
     */
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    /**
     *  augments characters strength by modifier amount
     * @param modifier decided by items rarity
     */
    public void addStrengthScore(int modifier){
        this.strengthScore= this.strengthScore+modifier;

    }

    /**
     * augments characters craft by modifier amount
     * @param modifier decided by items rarity
     */
    public void addCraftScore(int modifier){
        this.craftScore= this.craftScore + modifier;

    }

    /**
     *  augments players hp by modifier amount
     * @param modifier decided by shield rarity
     */
    public void addHealthpoints(int modifier){
        this.healthPoints=this.healthPoints+modifier;
    }

    /**
     * adds item to players inventory
     * @param items passed from the chambers item list
     */
    public void addItem(Items items){
        inventory.add(items);
        if(leftHand ==null){
            equipLeft(items);
        } else if (rightHand==null) {
            equipRight(items);
        }
    }

    /**
     *  equipds left hand if empty and applys respective modifier
     * @param item item is passed into left hand
     */
    public void equipLeft(Items item){
        this.leftHand = item;
        item.applyModifier(this);
    }

    /**
     * equipds right hand if empty
     * @param item is set to right hand and applys modifier
     */
    public void equipRight(Items item){
        this.rightHand = item;
        item.applyModifier(this);
    }
    }
