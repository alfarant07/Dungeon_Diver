package org.example;

public class Door {
    public static void connect(Chamber source, Chamber destination){
        source.addEdge(destination);
        destination.addEdge(source);
    }
    public static void connect(Chamber source, Chamber destination, Monster monster){
        source.addEdge(destination);
        destination.addEdge(source);
        source.addMonster(monster,destination);
    }

}
