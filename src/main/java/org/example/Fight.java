package org.example;

public class Fight {
    public void fight(Character player, Monster monster){
        int damageTaken = monster.deductHealthPoints(player);
        if(damageTaken>0){
            monster.setHealthPoints(damageTaken);
        }else{
            player.setHealthPoints(damageTaken);
        }

    }
}
