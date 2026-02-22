package org.example;

public class Door {
    /**
     *Connects two chambers by adding them in each others adjacency list
     * @param source adds edge to destination from soucre
     * @param destination adds edge to source from destination
     */
    public static void connect(Chamber source, Chamber destination){
        source.addEdge(destination);
        destination.addEdge(source);
    }

    /**
     *Connects two chambers by adding them in each others adjacency list
     * but blocks the destination chamber with a monster by mapping it to destination
     * @param source
     * @param destination
     * @param monster adds monster to block destination door
     */
    public static void connect(Chamber source, Chamber destination, Monster monster){
        if(source!= destination) {
            source.addEdge(destination);
            destination.addEdge(source);
            source.addMonster(monster, destination);
        }
    }

}
