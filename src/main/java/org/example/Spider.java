package org.example;

import java.util.Random;
//------------------------------------------------------
// Assignment_2 (2)
// Written by: (Anthony Alfaro 2148110)
// For SES350 Section (602) – Spring 2025
    /*
        A subclass of Monster again made this before reading implementation sadly
        but Spider is a craft based monster and is able to fight our player
        using dice rolls and its respective class stats

     */
//--------------------------------------------------------
public class Spider extends Monster{
    Random r = new Random();
    private int strengthScore;
    private int craftScore=0;
    private int healthPoints;
    private String name = "Spider";

    /**
     *default constructor for psider and sets a random attribute
     */
    public Spider(){
        this.strengthScore =r.nextInt(10);
        this.healthPoints =  r.nextInt(20);
    }

    /**
     *
     * @return the spiders craft score
     */
    @Override
    public int getCraftScore() {
        return craftScore;
    }

    /**
     *
     * @return the spiders strength score
     */
    @Override
    public int getStrengthScore() {
        return strengthScore;
    }

    /**
     *
     * @return spiders health points
     */
    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     *
     * @return the spiders name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     *Computes the difference between two attacks needed in fight logic
     * @param player needed to compute scores
     * @return difference between the two attacks
     */
    public int deductHealthPoints(Character player) {
        int characterAttack = (r.nextInt(6)+1) + player.getCraftScore();
        int monsterAttack = (r.nextInt(6)+1) + this.getCraftScore();
        return characterAttack-monsterAttack;
    }

    /**
     *
     * @param adjustedHP sets the spiders hp to the difference of fight
     */
    public void setHealthPoints(int adjustedHP){
        this.healthPoints-=adjustedHP;
    }
}
