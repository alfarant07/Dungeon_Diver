package org.example;

import java.util.Random;

public class CustomMonster extends Monster{
    private int strengthScore =0;
    private int craftScore;
    private int healthPoints;
    private String name = "";
    Random r = new Random();
    public CustomMonster(String name, int craft, int hp,int strength){
        if(craft>0){
            strengthScore=0;
        }else if(strength>0){
            craft=0;
        }
        this.name = name;
        this.craftScore = craft;
        this.healthPoints = hp;
        this.strengthScore =strength;
    }
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public int getCraftScore() {
        return craftScore;
    }

    @Override
    public int getStrengthScore() {
        return strengthScore;
    }

    public int deductHealthPoints(Character player) {
        int characterAttack = (r.nextInt(6)+1) + player.getCraftScore();
        int monsterAttack = (r.nextInt(6)+1) + this.getCraftScore();
        return characterAttack-monsterAttack;
    }
    public void setHealthPoints(int adjustedHP){
        this.healthPoints-=adjustedHP;
    }

    public String getName() {
        return name;
    }
}

