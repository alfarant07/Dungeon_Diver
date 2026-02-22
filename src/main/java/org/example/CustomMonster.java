package org.example;

import java.util.Random;

public class CustomMonster extends Monster{
    private int strengthScore =0;
    private int craftScore;
    private int healthPoints;
    private String name = "";
    Random r = new Random();

    /**
     *
     * @param name
     * @param craft
     * @param hp
     * @param strength
     */
    public CustomMonster(String name, int craft, int hp,int strength){
        if(craft>0){
            this.strengthScore=0;
            this.craftScore=craft;
        }else if(strength>0){
            this.craftScore=0;
            this.strengthScore=strength;
        }
        this.name = name;
        this.healthPoints = hp;
    }

    /**
     *
     * @return customMonster healthpoints
     */
    public int getHealthPoints() {
        return healthPoints;
    }

    /**
     *
     * @return customMonsters craftScore
     */
    @Override
    public int getCraftScore() {
        return craftScore;
    }

    /**
     *
     * @return customMonsters Strengthscore
     */
    @Override
    public int getStrengthScore() {
        return strengthScore;
    }

    /**
     *fight compares either craft or strength score of the to
     * @param player takes player object to fight
     * @returns the difference between both attacks important for fight logic
     */
    public int deductHealthPoints(Character player) {
        int characterAttack =0;
        int monsterAttack=0;
        if (this.craftScore > 0) {
             characterAttack = (r.nextInt(6) + 1) + player.getCraftScore();
             monsterAttack = (r.nextInt(6) + 1) + this.getCraftScore();

        } else {
             characterAttack = (r.nextInt(6) + 1) + player.getStrengthScore();
             monsterAttack = (r.nextInt(6) + 1) + this.getStrengthScore();
    }
        return characterAttack-monsterAttack;
    }

    /**
     *
     * @param adjustedHP takes adjusted ap and decrements health by it
     */
    public void setHealthPoints(int adjustedHP){
        this.healthPoints-=adjustedHP;
    }

    /**
     *
     * @return monster name
     */
    public String getName() {
        return name;
    }
}

