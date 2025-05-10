package org.example;
//------------------------------------------------------
// Assignment_2 (2)
// Written by: (Anthony Alfaro 2148110)
// For SES350 Section (602) – Spring 2025
    /*
        Items interface to abstract items and rely on the abstraction
        not the implementation

     */
//--------------------------------------------------------
public interface Items {
    /**
     * applys item modifier to the player
     * @param player takes player object to apply modifier too
     */
    public void applyModifier(Character player);

    /**
     *
     * @return item name
     */
    public static String getName(){
        return "";
    }
}
