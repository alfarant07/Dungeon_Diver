package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Chamber {
    private ArrayList<Items> itemsInChamber = new ArrayList<>();
    private int numDoors;
    private ArrayList<Chamber> adj = new ArrayList<>();
    private HashMap<Chamber, Monster> blockedDoors = new HashMap<>();
    private static int chamberNum;
    private String chamberName;

    public Chamber() {
        chamberNum++;
        chamberName = "Chamber " + chamberNum;
    }

    public Chamber(Items item) {
        itemsInChamber.add(item);
        chamberNum++;
        chamberName = "Chamber:" + chamberNum;

    }

    public ArrayList<Items> getItems() {
        return itemsInChamber;
    }

    public void addEdge(Chamber neighbor) {
        if(neighbor!=this) {
            this.adj.add(neighbor);
        }
    }
    public void addMonster(Monster monster, Chamber destination) {
        this.blockedDoors.put(destination, monster);
    }
    public void removeMonster(Chamber destination){
        this.blockedDoors.remove(destination);
    }

    public ArrayList<Chamber> getDoors() {
        return adj;
    }
    public HashMap<Chamber,Monster> getBlockedDoors(){
        return blockedDoors;
    }

    public boolean monsterBlockingDoor(Chamber destination){
        return this.getBlockedDoors().containsKey(destination);
    }
    public void removeItem(Items item){
        itemsInChamber.remove(item);
    }
    public String getChamberName(){
        return this.chamberName;
    }
}
