package org.example;

import java.util.ArrayList;

public class Character {
    private int strengthScore;
    private int craftScore;
    private int healthPoints;
<<<<<<< HEAD
    private String playerName;
    public Character(int craftScore, int strengthScore, int healthPoints,String playerName){
        this.craftScore=0;
        this.healthPoints=0;
        this.strengthScore=0;
        this.playerName =playerName;
=======
    private int armorScore;
    private ArrayList<Items> inventory = new ArrayList<>();
    private int leftHandItem=0;
    private int rightHandItem=0;
    Role role;
    public Character(Role role){
        this.role=role;
        this.craftScore=role.getCraftScore();
        this.healthPoints=role.getHealthPoints();
        this.strengthScore= role.getStrengthScore();
>>>>>>> 532fc85 (Implemented inventory and armor score field.)
    }
    public Character(Role role,Items leftHand){
        if(leftHand instanceof Shield) healthPoints+=leftHand.getValue();
        if(leftHand instanceof Sword) strengthScore += leftHand.getValue();
        if(leftHand instanceof MagicWand) craftScore += leftHand.getValue();
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
}
