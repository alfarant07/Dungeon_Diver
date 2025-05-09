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
        this.chamberExit=exit;
        this.player=player;
    }
    public Chamber getCurrentChamber(){
        return currentChamber;
    }
    public boolean isFinished(){
        if(currentChamber == chamberExit) return true;
        return false;
    }
    public ArrayList<Action> getActions(){


    }
}
