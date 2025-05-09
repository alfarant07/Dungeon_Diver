package org.example;

import java.util.Random;

public class Spider extends Monster{
    Random r = new Random();
    private int strengthScore;
    private int craftScore=0;
    private int healthPoints;
    public Spider(){
        this.strengthScore =r.nextInt(10);
        this.healthPoints =  r.nextInt(20);
    }

    @Override
    public int getCraftScore() {
        return craftScore;
    }

    @Override
    public int getStrengthScore() {
        return strengthScore;
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }
    public int deductHealthPoints(Character player) {
        int characterAttack = (r.nextInt(6)+1) + player.getCraftScore();
        int monsterAttack = (r.nextInt(6)+1) + this.getCraftScore();
        return characterAttack-monsterAttack;
    }
    public void setHealthPoints(int adjustedHP){
        this.healthPoints-=adjustedHP;
    }
}
