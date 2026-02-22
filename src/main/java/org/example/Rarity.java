package org.example;
//------------------------------------------------------

    /*
        Rarity enum did this for fun inspired from DND mainly wanted to increment
        item stats using enums to avoid primitive obsession

     */
//--------------------------------------------------------
public enum Rarity {
        COMMON(0),
        UNCOMMON(1),
        RARE(2),
        EPIC(3),
        LEGENDARY(4);
        private final int itemModifier;

    /**
     * augments itemScore based on the rarity of the item
     * @param itemScore
     */
        private Rarity(int itemScore) {
            this.itemModifier = itemScore;
        }
        public int getItemModifier(){
            return itemModifier;
    }
}
