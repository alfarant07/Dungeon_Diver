package org.example;

public class Pick extends Action{
    private Character player;
    private Items item;
    public Pick(Character player, Items item){
        super("Pick up Item"+ Items.getName());
        player = player;
    }
    public void execute(){
        player.addItem(item);

    }
}
