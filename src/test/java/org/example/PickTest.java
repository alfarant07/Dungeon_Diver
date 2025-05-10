package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//------------------------------------------------------
// Assignment_2 (2)
// Written by: (Anthony Alfaro 2148110)
// For SES350 Section (602) – Spring 2025
    /*
        Test the Actions available to the player and ensure functionality

     */
//--------------------------------------------------------
class PickTest {
    private Character player;
    private Chamber[] chambers;
    private Dungeon d;
    private Items sword;
    @BeforeEach
    void setup() {
        player = new Character(0, 20, 200, "Daemon");
        sword = new Sword();
        chambers = new Chamber[]{
                new Chamber(sword),
                new Chamber(new Shield())
        };
        Door.connect(chambers[0],chambers[1]);
        d = new Dungeon(chambers[0],chambers[1],player);

    }

    @Test
    void execute() {
        Pick pick = new Pick(player,sword, chambers[0]);
        assertEquals(1,chambers[0].getItems().size());
        pick.execute();
        assertEquals(0,chambers[0].getItems().size());
        pick.execute();
        assertEquals(0,chambers[0].getItems().size());
    }
}