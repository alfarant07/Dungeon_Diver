package org.example;

public class Sword implements Items{
    private int attackDamage=2;
    private Rarity rarity = Rarity.COMMON;
    private String name = rarity.name() + "Sword";
    public Sword(){
    }
    public Sword(Rarity rarity){
        this.attackDamage = attackDamage+rarity.getItemModifier();
    }

    public void applyModifier(Character player) {
        player.addStrengthScore(this.attackDamage);
    }


    public String getName() {
        return name;
    }
}
