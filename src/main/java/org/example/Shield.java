package org.example;

public class Shield implements Items {
    private int armorModifier=1;
    private Rarity rarity = Rarity.COMMON;
    public Shield(){

    }
    public Shield(Rarity rarity){
        armorModifier += rarity.getItemModifier();
    }

    @Override
    public int getValue() {
        return armorModifier;
    }
}
