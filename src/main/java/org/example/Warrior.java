package org.example;

public class Warrior implements Role{
    public int strengthScore = 16;
    public int craftScore = 6;
    public int healthPoints = 15;

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


}
