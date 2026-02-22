package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @org.junit.jupiter.api.Test
    void wizardConstructor() {
        Character character = new Wizard("Caraxes");
        assertEquals(character.getCraftScore(),16);
        assertEquals(character.getStrengthScore(),0);
        assertEquals(character.getHealthPoints(),11);
        assertEquals(character.getPlayerName(),"Caraxes");

    }

    @org.junit.jupiter.api.Test
    void warriorConstructor() {
        Character character = new Warrior("Balerion");
        assertEquals(character.getCraftScore(),0);
        assertEquals(character.getStrengthScore(),16);
        assertEquals(character.getHealthPoints(),15);
        assertEquals(character.getPlayerName(),"Balerion");
        character.addItem(new Sword(Rarity.LEGENDARY));
        assertEquals(22,character.getStrengthScore());
    }

}