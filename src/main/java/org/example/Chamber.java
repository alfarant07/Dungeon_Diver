package org.example;

import java.util.ArrayList;

public class Chamber {
    private ArrayList<Items> itemsInChamber;
    private int numDoors;
    private ArrayList<Chamber> adj = new ArrayList<>();

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

}
