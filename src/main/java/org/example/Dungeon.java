package org.example;

import java.util.*;

    /*
        A dungeon class which is pretty much our graph unlike the chambers which our individual
        vertices the dungeon implements a chamberEntrance to dedicate our spawn point and chamberExit
        need this to compute wether the game is finished once we reach the exist or if the player
        dies.DUngeon builds the available actions in our current chamber.

        P.S implemented a dfs to make sure our dungeon is valid sadly cannot implement it
        without changing game file but meant to be a sort of error checker and prevent
        an impossible dungeon used for testing though.

     */
//--------------------------------------------------------
public class Dungeon {
    private int doors;
    private Chamber chamberEntrance;
    private Chamber chamberExit;
    private Chamber currentChamber;
    private Character player;
    private ArrayList<Action> actionsAvailable = new ArrayList<>();

    /**
     *
     * @param entrance
     * @param exit
     * @param player
     */
    public Dungeon(Chamber entrance, Chamber exit, Character player) {
        this.chamberEntrance = entrance;
        this.currentChamber = chamberEntrance;
        this.chamberExit = exit;
        this.player = player;
    }

    /**
     *
     * @return currentChamber
     */
    public Chamber getCurrentChamber() {
        return currentChamber;
    }

    /**
     * if the currentCHamber is exit or character dies game is finished
     * @return status of the game
     */
    public boolean isFinished() {
        if (currentChamber == chamberExit || player.getHealthPoints() < 0) return true;
        return false;
    }

    /**
     * updates currentChamber when character moves
     * @param destination chamber
     */
    public void setCurrentChamber(Chamber destination) {
        this.currentChamber = destination;
    }

    /**
     * the following method utilizes for each loops
     * to create Action objects based on how many actions are available in the chamber
     * that is determined by the length of the list of items
     * the doors in the chambers
     * and the amount of monsters blocking the door
     * @returns a list of available actions
     */
    public ArrayList<Action> getActions() {
        actionsAvailable.clear();
        for (Items items : currentChamber.getItems()) {
            Action item = new Pick(player, items, currentChamber);
            actionsAvailable.add(item);
        }
        for (Chamber chamber : currentChamber.getDoors()) {
            Action doors = new Move(this, chamber);
            actionsAvailable.add(doors);
        }
        //https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#forEach-java.util.function.BiConsumer-
        currentChamber.getBlockedDoors().forEach((chamber, monster) -> {
            if (monster.getHealthPoints() > 0) {
                actionsAvailable.add(new Fight(monster, player, chamber, this));
            }
        });
        return actionsAvailable;
    }

    /**
     * A dfs algorithm to ensure that the dungeon is valid made for testing with hopes of implementing
     * in game logic by implementing in game after the dungeon has been made but dont want to alter
     * game file
     * @param chamberEntrance root of our dfs
     * @param chamberExit looking to see if chamber exit is in our visited list
     * @return wether an exit exist or not
     */
    public boolean validDungeon(Chamber chamberEntrance, Chamber chamberExit) {
        Set<Chamber> visited = new HashSet<>();
        Stack<Chamber> stack = new Stack<>();
        stack.push(chamberEntrance);
        while(!stack.isEmpty()){
            Chamber current = stack.pop();
            visited.add(current);
            for(Chamber neighbor: current.getDoors()){
                if(!visited.contains(neighbor)){
                    stack.push(neighbor);
                }
            }
            }
        if(!visited.contains(chamberExit))return false;
        return true;
    }
}

