package org.example;

import java.util.ArrayList;

public class Dungeon {
    private int doors;
    private Chamber chamberEntrance;
    private Chamber chamberExit;
    private Chamber currentChamber;
    private Character player;
    private ArrayList<Action> actionsAvailable =new ArrayList<>();

    public Dungeon(Chamber entrance, Chamber exit, Character player){
        this.chamberEntrance=entrance;
        this.currentChamber = chamberEntrance;
        this.chamberExit=exit;
        this.player=player;
    }
    public Chamber getCurrentChamber(){
        return currentChamber;
    }
    public boolean isFinished(){
        if(currentChamber == chamberExit || player.getHealthPoints()<0) return true;
        return false;
    }
    public void setCurrentChamber(Chamber destination){
        this.currentChamber = destination;
    }
    public ArrayList<Action> getActions(){
        
    }


}
