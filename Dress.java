//
// ETNA PROJECT, 22/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class Dress implements Item {

    private String  name;
    private int     lifePoints;
    private int     defencePoints;

    public Dress() {
        this.name = new String();
    }

    public Dress(int lifePoints, int defencePoints, String name) {
        this.lifePoints = lifePoints;
        this.defencePoints = defencePoints;
        this.name = name;
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

    public int getDefencePoints() {
        return this.defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public void put(Player player) {
        player.getStats().addDefence(this.defencePoints);
        player.getHealthBar().addMaxPoint((this.lifePoints));
    }

    public void remove(Player player) {
        player.getStats().removeDefence(this.defencePoints);
        player.getHealthBar().removeMaxPoint(this.lifePoints);
    }
}
