package org.example;

public class Fight extends Action {
    private Character player;
    private Monster monster;
    private Chamber destination;
    private Dungeon d;

    public Fight(Monster monster, Character player, Chamber destination) {
        super("Fight Monster:" + monster.getName());
        this.player = player;
        this.monster = monster;
        destination = destination;
    }
        public void execute () {
            int damageTaken = this.monster.deductHealthPoints(this.player);
            if (damageTaken > 0) {
                this.monster.setHealthPoints(damageTaken);
            } else {
                this.player.setHealthPoints(damageTaken);
            }
            if (monster.getHealthPoints() <= 0) d.getCurrentChamber().removeMonster(destination);
        }

}
