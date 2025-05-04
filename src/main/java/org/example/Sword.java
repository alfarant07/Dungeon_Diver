package org.example;
enum Rarity{
    COMMON(0),
    UNCOMMON(1),
    RARE(2),
    EPIC(3),
    LEGENDARY(4);
    private final int attackModifier;
    private Rarity(int attackScore){
        this.attackModifier =attackScore;
    }

}
public class Sword implements Items{
    private int attackDamage;
    private Rarity NULL;

}
