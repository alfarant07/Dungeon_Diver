package org.example;

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
