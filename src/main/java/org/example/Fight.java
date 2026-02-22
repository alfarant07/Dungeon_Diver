package org.example;

import javax.annotation.processing.SupportedSourceVersion;

    /*
        An implementation of action takes a monster and player object
        and execute calls monster.deductHealthPoints on the player
        the difference is then use to determine who takes damage
        should the player die the quest ends
        should the monster die it is removed from the hashMap and free
        the destination to travel allowing

     */
//--------------------------------------------------------
public class Fight extends Action {
    private Character player;
    private Monster monster;
    private Chamber destination;
    private Dungeon d;

    /**
     *Following constructor calls the superclass constructor and creates an object off the given prompts
     * @param monster needed for execute logic
     * @param player needed for execute logic
     * @param destination once monster killed removed it from destination mapping
     * @param dungeon dependency needed to edit map
     */
    public Fight(Monster monster, Character player, Chamber destination, Dungeon dungeon) {
        super("Fight Monster:" + monster.getName());
        this.player = player;
        this.monster = monster;
        this.destination = destination;
        d = dungeon;
    }

    /**
     * execute calls monster deduct health points and assings the damage taken to monster
     * if positive or negative to player
     * once the monster is killed we remove it from the mapping
     */
    public void execute() {
            int damageTaken = this.monster.deductHealthPoints(this.player);
            if (damageTaken > 0) {
                this.monster.setHealthPoints(damageTaken);
            } else {
                this.player.setHealthPoints(damageTaken);
            }
            if (monster.getHealthPoints() <= 0) {
//                System.out.println(d.getCurrentChamber().getBlockedDoors().entrySet());
                d.getCurrentChamber().removeMonster(destination);
//                System.out.println(d.getCurrentChamber().getBlockedDoors().entrySet());
                System.out.println("Monster has been slain");
            }
        }

    }

