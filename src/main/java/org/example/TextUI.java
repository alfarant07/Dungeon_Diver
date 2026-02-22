package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiConsumer;
//------------------------------------------------------

public class TextUI {
    public void play(Dungeon d){
        while(!d.isFinished()){
            print(d);
            Action a = ask(d);
            a.execute();
        }
    }
    private void print(Dungeon d){
        Chamber r = d.getCurrentChamber();
        StringBuilder s = new StringBuilder();
        s.append("You are in a chamber with "+r.getDoors().size()+" doors\n");
        s.append("There are "+ r.getItems().size()+ " items in the chamber\n");
        s.append("There are " +r.getBlockedDoors().size() +" Monsters in the chamber");
        r.getBlockedDoors().forEach(((chamber, monster) ->{

            s.append("\n"+monster.getName()+" has health "+monster.getHealthPoints());
            s.append(" Strength of "+monster.getStrengthScore());
            s.append(" Craft of "+monster.getCraftScore());
        }));

        System.out.println(s.toString());
    }
    private Action ask(Dungeon d){
        StringBuilder s = new StringBuilder();
        s.append("Here are your options:\n");
        List<Action> actions = d.getActions();
        for(int i =0; i<actions.size();i++){
            Action a = actions.get(i);
            s.append("\t" + i +":" +a.toString()+"\n");
        }
        System.out.println(s.toString());
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int command = Integer.parseInt(reader.readLine());
            return actions.get(command);
        } catch (IOException e) {
            return new PrintError(d,e);
        }
    }
}
