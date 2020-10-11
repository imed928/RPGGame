//
// ETNA PROJECT, 22/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class Boots implements Item {
    private String  name;
    private int     lifePoints;
    private int     attackPoints;

    public Boots() {
        this.name = new String();
    }

    public Boots(int lifePoints, int attackPoints,String name) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return this.name;
    }

    public int getLifePoints() {
        return this.lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public void put(Player player) {
        player.getHealthBar().addMaxPoint(this.lifePoints);
        player.getStats().addAttack(this.attackPoints);
    }

    public void remove(Player player) {
        player.getHealthBar().removeMaxPoint(this.lifePoints);
        player.getStats().removeAttack(this.attackPoints);
    }
}
