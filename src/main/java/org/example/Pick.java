package org.example;

    /*
        Another subclass of action pick allows us to create Action objects
        while having its own concrete implementation of picking up items
        and adding to our players inventory

     */
//--------------------------------------------------------
public class Pick extends Action{
    private Character player;
    private Items item;
    private Chamber current;

    /**
     *creates action object based on prompt
     * player and chamber dependencys needed for addition to player inventory
     * and removal from chamber list
     * @param player
     * @param pickedUpItem
     * @param currentChamber
     */
    public Pick(Character player, Items pickedUpItem,Chamber currentChamber){
        super("Pick up Item:"+ Items.getName());
        this.item = pickedUpItem;
        this.player = player;
        current=currentChamber;
    }

    /**
     *picks up item and adds it to characters inventory
     * while removing it from chambers list
     */
    public void execute(){
        player.addItem(item);
        current.removeItem(item);
    }
}
