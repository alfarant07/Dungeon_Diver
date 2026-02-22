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
