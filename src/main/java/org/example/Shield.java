package org.example;

public class Shield implements Items {
    private int armorModifier=1;
    private Rarity rarity = Rarity.COMMON;
    private String name = rarity.name() + "Shield";
    public Shield(){

    }
    public Shield(Rarity rarity){
        armorModifier += rarity.getItemModifier();
    }

    @Override
    public void applyModifier(Character player) {
        player.setHealthPoints(this.armorModifier);
    }


    public String getName() {
        return name;
    }
}
