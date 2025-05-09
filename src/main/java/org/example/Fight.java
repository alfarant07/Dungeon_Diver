package org.example;

public class Fight extends Action {
    private Character player;
    private Monster monster;
    public Fight(Monster monster){
        super("Fight Monster:" + monster.getName());
    }
    public void fight(){
        int damageTaken = monster.deductHealthPoints(player);
        if(damageTaken>0){
            monster.setHealthPoints(damageTaken);
        }else{
            player.setHealthPoints(damageTaken);
        }

    }
    public void execute(){
        fight();
    }
}
