package org.example;

public class Pick extends Action{
    private Character player;
    private Items item;
    private Chamber current;
    public Pick(Character player, Items pickedUpItem,Chamber currentChamber){
        super("Pick up Item:"+ Items.getName());
        this.item = pickedUpItem;
        this.player = player;
        current=currentChamber;
    }
    public void execute(){
        player.addItem(item);
        current.removeItem(item);
    }
}
