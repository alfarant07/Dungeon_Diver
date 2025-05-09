package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamberTest {
    public static Chamber[] chambers;
    @BeforeEach
    void setup(){
        chambers = new Chamber[]{
                new Chamber(new Sword()),
                new Chamber(new Shield()),
                new Chamber(new MagicWand()),
                new Chamber(),
                new Chamber()
        };

    }


    @Test
    void getItems() {
        assertEquals(1,chambers[0].getItems().size());
        assertEquals(0,chambers[4].getItems().size());
    }

    @Test
    void addMonster() {
        Door.connect(chambers[0],chambers[1],new DarkMage());
        assertEquals(1,chambers[0].getBlockedDoors().size());
    }

    @Test
    void getDoors() {
        Door.connect(chambers[0],chambers[1]);
        Door.connect(chambers[0],chambers[2]);
        Door.connect(chambers[0],chambers[3]);
        Door.connect(chambers[0],chambers[4]);
        assertEquals(4,chambers[0].getDoors().size());



    }
}