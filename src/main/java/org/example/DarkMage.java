package org.example;

import java.util.Random;

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
