package org.example;

import javax.annotation.processing.SupportedSourceVersion;

public class Fight extends Action {
    private Character player;
    private Monster monster;
    private Chamber destination;
    private Dungeon d;

    public Fight(Monster monster, Character player, Chamber destination, Dungeon dungeon) {
        super("Fight Monster:" + monster.getName());
        this.player = player;
        this.monster = monster;
        this.destination = destination;
        d = dungeon;
    }

    public void execute() {
            int damageTaken = this.monster.deductHealthPoints(this.player);
            if (damageTaken > 0) {
                this.monster.setHealthPoints(damageTaken);
            } else {
                this.player.setHealthPoints(damageTaken);
            }
            if (monster.getHealthPoints() <= 0) {
                System.out.println(d.getCurrentChamber().getBlockedDoors().entrySet());
                d.getCurrentChamber().removeMonster(destination);
                System.out.println(d.getCurrentChamber().getBlockedDoors().entrySet());
                System.out.println("Monster has been slain");
            }
        }

    }

