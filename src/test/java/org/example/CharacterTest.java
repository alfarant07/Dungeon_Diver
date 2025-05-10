package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//------------------------------------------------------
// Assignment_2 (2)
// Written by: (Anthony Alfaro 2148110)
// For SES350 Section (602) – Spring 2025
    /*
        Test made to see the construction of our character objects
        and also to ensure they get their respective modifiers when
        they get an item

     */
//--------------------------------------------------------
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