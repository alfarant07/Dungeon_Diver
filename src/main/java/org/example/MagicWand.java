package org.example;



public class MagicWand implements Items{
    private int craftScore = 2;
    private Rarity rarity = Rarity.COMMON;
    private String name = rarity.name() + "Magic_Wand";
    public MagicWand(){

    }
    public MagicWand(Rarity rarity){
        this.craftScore += rarity.getItemModifier();
    }

    public void applyModifier(Character player) {
        player.addCraftScore(this.craftScore);
    }

    public String getName() {
        return name;
    }
}

