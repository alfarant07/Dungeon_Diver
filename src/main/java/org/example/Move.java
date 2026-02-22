package org.example;

    /*
        Move subclass of action allowing for creation of one of the three distinct
        actions our player can take its sibling being pick and fight allows us
        to move the player iff the monster blocking a door is dead or never existed

     */
//--------------------------------------------------------
public class Move extends Action{
    private Dungeon d;
    private Chamber destination;

    /**
     * Move constructor that creates action object using prompt and chamber name
     * dungeon and destination dependency needed for execute loigc
     * @param d
     * @param destination
     */
    public Move(Dungeon d, Chamber destination){
        super("Move to:" + destination.getChamberName());
        this.d = d;
        this.destination = destination;
    }

    /**
     * moves only when a monster is not blocking the path
     */
    public void execute(){
        if(!d.getCurrentChamber().monsterBlockingDoor(destination)) {
            d.setCurrentChamber(destination);
        }else{
            System.out.print("Monster blocking the path");
        }
    }
}
