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
     *
     * @param item
     */
    public Chamber(Items item) {
        itemsInChamber.add(item);
        chamberNum++;
        chamberName = "Chamber:" + chamberNum;

    }

    /**
     *
     * @return
     */
    public ArrayList<Items> getItems() {
        return itemsInChamber;
    }

    /**
     *
     * @param neighbor
     */
    public void addEdge(Chamber neighbor) {
        if(neighbor!=this) {
            this.adj.add(neighbor);
        }
    }

    /**
     *
     * @param monster
     * @param destination
     */
    public void addMonster(Monster monster, Chamber destination) {
        this.blockedDoors.put(destination, monster);
    }

    /**
     *
     * @param destination
     */
    public void removeMonster(Chamber destination){
        this.blockedDoors.remove(destination);
    }

    /**
     *
     * @return
     */
    public ArrayList<Chamber> getDoors() {
        return adj;
    }

    /**
     *
     * @return
     */
    public HashMap<Chamber,Monster> getBlockedDoors(){
        return blockedDoors;
    }

    /**
     *
     * @param destination
     * @return
     */
    public boolean monsterBlockingDoor(Chamber destination){
        return this.getBlockedDoors().containsKey(destination);
    }

    /**
     *
     * @param item
     */
    public void removeItem(Items item){
        itemsInChamber.remove(item);
    }

    /**
     *
     * @return
     */
    public String getChamberName(){
        return this.chamberName;
    }

    /**
     *
     * @return
     */
    public static int getChamberNum() {
        return chamberNum;
    }

    /**
     *
     * @return
     */
    public ArrayList<Chamber> getAdj() {
        return adj;
    }
}
