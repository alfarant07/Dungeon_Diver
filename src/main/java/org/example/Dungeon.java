package org.example;

import java.util.*;

public class Dungeon {
    private int doors;
    private Chamber chamberEntrance;
    private Chamber chamberExit;
    private Chamber currentChamber;
    private Character player;
    private ArrayList<Action> actionsAvailable = new ArrayList<>();

    public Dungeon(Chamber entrance, Chamber exit, Character player) {
        this.chamberEntrance = entrance;
        this.currentChamber = chamberEntrance;
        this.chamberExit = exit;
        this.player = player;
    }

    public Chamber getCurrentChamber() {
        return currentChamber;
    }

    public boolean isFinished() {
        if (currentChamber == chamberExit || player.getHealthPoints() < 0) return true;
        return false;
    }

    public void setCurrentChamber(Chamber destination) {
        this.currentChamber = destination;
    }

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

