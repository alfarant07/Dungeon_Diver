package org.example;

public class Sword implements Items{
    private int attackDamage=2;
    private Rarity rarity = Rarity.COMMON;
    public Sword(){
    }
    public Sword(Rarity rarity){
        this.attackDamage = attackDamage+rarity.getItemModifier();
    }

    @Override
    public int getValue() {
        return this.attackDamage;
    }
}
