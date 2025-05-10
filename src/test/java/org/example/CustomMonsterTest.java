package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomMonsterTest {
    private Monster monster;
    private Monster tarrasque;
    @BeforeEach

    void setup(){
        monster = new CustomMonster("Dragon",100,20,50);
        tarrasque = new CustomMonster("Tarrasque", -20, 4000,100);
    }
    @Test
    void getHealthPoints() {
        assertEquals(20,monster.getHealthPoints());
        assertEquals(4000,tarrasque.getHealthPoints());
    }

    @Test
    void getCraftScore() {
        assertEquals(100,monster.getCraftScore());
        assertEquals(0,tarrasque.getCraftScore());
    }

    @Test
    void getStrengthScore() {
        assertEquals(0,monster.getStrengthScore());
        assertEquals(100,tarrasque.getStrengthScore());
    }

    @Test
    void getName() {
    }
}