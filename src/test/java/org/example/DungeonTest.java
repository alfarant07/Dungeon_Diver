package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DungeonTest {
    public static Chamber[] chambers;
    public static Dungeon d;
    public static Character player;


    @BeforeEach
    void setup(){
       chambers = new Chamber[]{
                new Chamber(new Sword()),
                new Chamber(new Shield()),
                new Chamber(new MagicWand()),
                new Chamber(),
                new Chamber()
        };
       player = new Character(10,5,15,"Rhaegar");
       d = new Dungeon(chambers[0],chambers[3],player);
    }

    @Test
    void getCurrentChamber() {
        assertEquals(d.getCurrentChamber(),chambers[0]);
    }

    @Test
    void isFinished() {
        assertEquals(false,d.isFinished());
        d.setCurrentChamber(chambers[3]);
        assertEquals(true,d.isFinished());
        d.setCurrentChamber(chambers[1]);
        assertEquals(false,d.isFinished());
        player.setHealthPoints(-20);
        assertEquals(true,d.isFinished());
    }

    @Test
    void validDungeon(){
        Door.connect(chambers[0],chambers[1]);
        Door.connect(chambers[0],chambers[2]);
        assertFalse(d.validDungeon(chambers[0],chambers[3]));
        Door.connect(chambers[0],chambers[3]);
        assertTrue(d.validDungeon(chambers[0],chambers[3]));
    }
}