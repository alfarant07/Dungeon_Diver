package org.example;

public class Fight extends Action {
    private Character player;
    private Monster monster;
    public Fight(Monster monster, Character player){
        super("Fight Monster:" + monster.getName());
        this.player = player;
        this.monster=monster;
    }
    public void execute(){
        int damageTaken = this.monster.deductHealthPoints(this.player);
        if(damageTaken>0){
            this.monster.setHealthPoints(damageTaken);
        }else{
            this.player.setHealthPoints(damageTaken);
        }

    }
}
