package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Chamber {
    private ArrayList<Items> itemsInChamber;
    private int numDoors;
    private ArrayList<Chamber> adj = new ArrayList<>();
    private HashMap<Monster, Chamber> blockedDoors = new HashMap<>();

    public Chamber(){
    }
    public Chamber(Items item){
        itemsInChamber.add(item);
    }
    public ArrayList<Items> getItems(){
        return itemsInChamber;
    }
    public void addEdge(Chamber neighbor){
        this.adj.add(neighbor);
    }
    public void addMonster(Monster monster,Chamber destination){
        this.blockedDoors.put(monster,destination);
    }
    public ArrayList<Chamber> getDoors(){
        return adj;
    }

}
