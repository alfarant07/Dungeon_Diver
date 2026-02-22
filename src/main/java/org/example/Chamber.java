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

    /**
     * Chamber constructor that increments static chamberNum variable to label chambers on name
     */
    public Chamber() {
        chamberNum++;
        chamberName = "Chamber " + chamberNum;
    }

    /**
     * Overwritten constructor
     * @param item object added to chamber list
     */
    public Chamber(Items item) {
        itemsInChamber.add(item);
        chamberNum++;
        chamberName = "Chamber:" + chamberNum;

    }

    /**
     *
     * @return chambers list of item
     */
    public ArrayList<Items> getItems() {
        return itemsInChamber;
    }

    /**
     *
     * @param neighbor adds an edge to adjacent neighbor to mimic groph data structure
     */
    public void addEdge(Chamber neighbor) {
        if(neighbor!=this) {
            this.adj.add(neighbor);
        }
    }

    /**
     *Hashmap maps a monster to a destination and prevents access to that chamber
     * so long as the monster is alive
     * @param monster object guards door
     * @param destination needed to know which door the monster is guarding
     */
    public void addMonster(Monster monster, Chamber destination) {
        this.blockedDoors.put(destination, monster);
    }

    /**
     * once the monster has been killed we remove the monster from the hashmap
     * @param destination chamber
     */
    public void removeMonster(Chamber destination){
        this.blockedDoors.remove(destination);
    }

    /**
     *
     * @return the adjacency list of our chamber
     */
    public ArrayList<Chamber> getDoors() {
        return adj;
    }

    /**
     *
     * @return the HashMap containing which chambers are blocked
     */
    public HashMap<Chamber,Monster> getBlockedDoors(){
        return blockedDoors;
    }

    /**
     * Checks wether the destination chamber has a monster blocking it
     * @param destination chamber
     * @return true if blocked false if not
     */
    public boolean monsterBlockingDoor(Chamber destination){
        return this.getBlockedDoors().containsKey(destination);
    }

    /**
     *
     * @param item object is removed from chambers item list
     */
    public void removeItem(Items item){
        itemsInChamber.remove(item);
    }

    /**
     *
     * @return name of the current chamber
     */
    public String getChamberName(){
        return this.chamberName;
    }



}
