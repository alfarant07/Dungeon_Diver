package org.example;

public class Character {
    private int strengthScore;
    private int craftScore;
    private int healthPoints;
    Role role;
    public Character(Role role){
        this.role=role;
        this.craftScore=role.getCraftScore();
        this.healthPoints=role.getHealthPoints();
        this.strengthScore= role.getStrengthScore();
    }

}
