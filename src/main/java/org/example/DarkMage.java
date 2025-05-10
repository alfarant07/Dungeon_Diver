package org.example;

import java.util.Random;
//------------------------------------------------------
// Assignment_2 (2)
// Written by: (Anthony Alfaro 2148110)
// For SES350 Section (602) – Spring 2025
    /*
        A dedicated subclass of monster one of the classes made before reading the implementation
        sets random stats of this monster for more of a fun factor and its getters and setters
        are essential for game logic

     */
//--------------------------------------------------------
public class DarkMage extends Monster{
    private int strengthScore =0;
    private int craftScore;
    private int healthPoints;
    private String name = "DarkMage";
    Random r = new Random();
    public DarkMage(){
        this.craftScore= r.nextInt(20);
        this.healthPoints=r.nextInt(15);

    }

    @Override
    /**
     *returns health points
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    /**
     * returns craftscore
     */
    public int getCraftScore() {
        return craftScore;
    }

    /**
     *
     * @return strengthscore
     */
    @Override
    public int getStrengthScore() {
        return strengthScore;
    }

    /**
     *takes a player object and clashes their craft scores
     * @param player object to clash attributes
     * @return
     */
    public int deductHealthPoints(Character player) {
        int characterAttack = (r.nextInt(6)+1) + player.getCraftScore();
        int monsterAttack = (r.nextInt(6)+1) + this.getCraftScore();
        return characterAttack-monsterAttack;
    }

    /**
     *decrements monsters hp by adjusted
     * @param adjustedHP takes a int to decrease health by
     */
    public void setHealthPoints(int adjustedHP){
        this.healthPoints-=adjustedHP;
    }

    /**
     *
     * @return the monsters name
     */
    public String getName() {
        return name;
    }
}
