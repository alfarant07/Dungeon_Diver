package org.example;

import java.util.ArrayList;

public class Character {
    private int strengthScore;
    private int craftScore;
    private int healthPoints;
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
    }
    public Character(Role role,Items leftHand){
        if(leftHand instanceof Shield) healthPoints+=leftHand.getValue();
        if(leftHand instanceof Sword) strengthScore += leftHand.getValue();
        if(leftHand instanceof MagicWand) craftScore += leftHand.getValue();
    }



}
