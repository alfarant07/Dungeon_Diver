package org.example;
//------------------------------------------------------
// Assignment_2 (2)
// Written by: (Anthony Alfaro 2148110)
// For SES350 Section (602) – Spring 2025
    /*
        A implementation of items this implementation of Item increases
        our players attack damage and this is computed off of its rarity
     */
//--------------------------------------------------------
public class Sword implements Items{
    private int attackDamage=2;
    private Rarity rarity = Rarity.COMMON;
    private String name = rarity.name() + "Sword";

    /**
     *default constructor for sword
     */
    public Sword(){
    }

    /**
     * increments sword damage based on rarity level pased
     * @param rarity object used to improve an objects modifer if rare
     */
    public Sword(Rarity rarity){
        this.attackDamage = attackDamage+rarity.getItemModifier();
    }

    /**
     * applys this item modifier to the player when equipped
     * @param player object gets modifer applied
     */
    public void applyModifier(Character player) {
        player.addStrengthScore(this.attackDamage);
    }

    /**
     *
     * @return sword name
     */
    public String getName() {
        return name;
    }
}
