package org.example;



public class MagicWand implements Items{
    private int craftScore = 2;
    private Rarity rarity = Rarity.COMMON;
    public MagicWand(){

    }
    public MagicWand(Rarity rarity){
        this.craftScore += rarity.getItemModifier();
    }

    @Override
    public int applyModifier() {
        return craftScore;
    }
}

