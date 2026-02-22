package org.example;


    /*
        An implementation of Items this being a magicwand increments player craft score
        allowing for modification of the players stats through players setters

     */
//--------------------------------------------------------

public class MagicWand implements Items{
    private int craftScore = 2;
    private Rarity rarity = Rarity.COMMON;
    private String name = rarity.name() + "Magic_Wand";

    /**
     *default constructor
     */
    public MagicWand(){

    }

    /**
     * more specialized constructor that takes rarity object and augments
     * the items score by the rarity
     * @param rarity
     */
    public MagicWand(Rarity rarity){
        this.craftScore += rarity.getItemModifier();
    }

    /**
     * applys the modifier to the player
     * @param player
     */
    public void applyModifier(Character player) {
        player.addCraftScore(this.craftScore);
    }

    /**
     *
     * @return the items name
     */
    public String getName() {
        return name;
    }
}

