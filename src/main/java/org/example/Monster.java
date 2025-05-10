package org.example;

public abstract class Monster {
        public Monster(){
        }

        public abstract int getCraftScore();
        public abstract int getStrengthScore();
        public abstract int getHealthPoints();
        public abstract int deductHealthPoints(Character player);
        public abstract void setHealthPoints(int damageTaken);
        public abstract String getName();


}
