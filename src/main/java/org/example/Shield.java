package org.example;
//------------------------------------------------------

    /*
        A subclass of items which increments our players HP since never implemented AC
        the default constructor sets the item to common and should rarity be passed
        increase this items stat and applys it to our player object

     */
//--------------------------------------------------------
public class Shield implements Items {
    private int armorModifier=1;
    private Rarity rarity = Rarity.COMMON;
    private String name = rarity.name() + "Shield";

    /**
     * default constructor for shield
     */
    public Shield(){

    }

    /**
     * specialized constructor that takes rarity object
     * @param rarity
     */
    public Shield(Rarity rarity){
        armorModifier += rarity.getItemModifier();
    }

    @Override
    /**
     *Applys the shields modifier to player
     */
    public void applyModifier(Character player) {
        player.setHealthPoints(this.armorModifier);
    }

    /**
     *
     * @return the items name
     */
    public String getName() {
        return name;
    }
}
