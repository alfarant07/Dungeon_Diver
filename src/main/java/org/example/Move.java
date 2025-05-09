package org.example;

public class Move extends Action{
    private Dungeon d;
    private Chamber destination;
    public Move(Dungeon d, Chamber destination){
        super("Move to" + destination);
        this.d = d;
        this.destination = destination;
    }
    public void execute(){
        if(!destination.monsterBlockingDoor(destination)) {
            d.setCurrentChamber(destination);
        }else{
            System.out.print("Monster blocking the path");
        }
    }
}
