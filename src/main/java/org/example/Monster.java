package org.example;
//------------------------------------------------------
// Assignment_2 (2)
// Written by: (Anthony Alfaro 2148110)
// For SES350 Section (602) – Spring 2025
    /*
        Abstract class monster to allow for subclasses to implement their own functions
        and gives us abstraction

     */
//--------------------------------------------------------
public abstract class Monster {
        /**
         * default constructinr
         */
        public Monster(){
        }

        /**
         * getters for private attribute variables
         * @return the respective variables
         */
        public abstract int getCraftScore();
        public abstract int getStrengthScore();
        public abstract int getHealthPoints();

        /**
         * necessary for fight logic
         * @param player object is taken and clashes with monster
         * @returns an int
         */
        public abstract int deductHealthPoints(Character player);

        /**
         * sets the monster hp to the amount of damage taken
         * @param damageTaken difference of deduct healthpoints
         */
        public abstract void setHealthPoints(int damageTaken);

        /**
         * @return monsters name
         */
        public abstract String getName();


}
