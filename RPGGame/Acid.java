//
// ETNA PROJECT, 22/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class Acid implements Tangible {

    private int damagePoint = 10;

    public Acid(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    public Acid() {
    }

    @Override
    public void action(Player player) {
        player.getHealthBar().removeCurrentPoint(this.damagePoint);
    }

    public char showAs() {
        return 'A';
    }
}
