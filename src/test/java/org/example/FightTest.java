package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FightTest {
    public static Character player;
    public static Monster dragon;
    public static Chamber[] chambers;
    public static Dungeon d;

    @BeforeEach
    void setup() {
        player = new Character(0, 20, 200, "Daemon");
        dragon = new CustomMonster("Vhagar", 0, 15, 20);
        chambers = new Chamber[]{
                new Chamber(new Sword()),
                new Chamber(new Shield())
        };
        Door.connect(chambers[0],chambers[1],dragon);
        d = new Dungeon(chambers[0],chambers[1],player);

    }

    @Test
    void execute() {
        Fight battle = new Fight(dragon,player,chambers[1],d);
        while(player.getHealthPoints()>0||dragon.getHealthPoints()>0) {
            battle.execute();
        }
    }
}