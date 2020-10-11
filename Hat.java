//
// ETNA PROJECT, 22/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class Hat implements Item {

    private String  name;
    private int     defencePoints;

    public Hat() {
        this.name = new String();
    }

    public Hat(int defencePoints,String name) {
        this.name = name;
        this.defencePoints = defencePoints;
    }

    public String getName() {
        return this.name;
    }

    public int getDefencePoints() {
        return this.defencePoints;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public void put(Player player) {
        player.getStats().addDefence(this.defencePoints);
    }

    public void remove(Player player) {
        player.getStats().removeDefence(this.defencePoints);
    }
}
