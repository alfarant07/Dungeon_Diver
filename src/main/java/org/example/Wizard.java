package org.example;

public class Wizard implements Role{
    public int craftScore=16;
    public int strengthScore=7;
    public int healthPoints=11;

    @Override
    public int getStrengthScore() {
        return strengthScore;
    }

    @Override
    public int getHealthPoints() {
        return healthPoints;
    }

    @Override
    public int getCraftScore() {
        return craftScore;
    }
}
