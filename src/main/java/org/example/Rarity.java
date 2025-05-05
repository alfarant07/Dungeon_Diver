package org.example;

public enum Rarity {
        COMMON(0),
        UNCOMMON(1),
        RARE(2),
        EPIC(3),
        LEGENDARY(4);
        private final int itemModifier;

        private Rarity(int itemScore) {
            this.itemModifier = itemScore;
        }
        public int getItemModifier(){
            return itemModifier;
    }
}
