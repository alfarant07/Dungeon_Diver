package org.example;

public class Game {
    public static void main(String[]args){
        Chamber[] chambers = new Chamber[]{
                new Chamber(new Shield()),
                new Chamber(),
                new Chamber(),
                new Chamber(),
                new Chamber()
        };
        Door.connect(chambers[0],chambers[1],new DarkMage());
        Door.connect(chambers[0],chambers[3]);
        Door.connect(chambers[1], chambers[2], new CustomMonster("Dragon",0,10,5));
        Door.connect(chambers[2],chambers[3]);
        Door.connect(chambers[3],chambers[4]);
        Character player = new Wizard("Gandalf");
        Dungeon d = new Dungeon(chambers[0],chambers[2],player);
        TextUI ui = new TextUI();
        ui.play(d);


    }
}
