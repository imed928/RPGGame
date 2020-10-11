//
// ETNA PROJECT, 22/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class HolyWater implements Tangible {

    private int lifesToAdd = 10;

    public HolyWater(int lifes) {
        this.lifesToAdd = lifes;
    }

    public HolyWater() {
    }

    @Override
    public void action(Player player) {
        player.getHealthBar().addCurrentPoint(this.lifesToAdd);
    }

    public char showAs() {
        return 'H';
    }
}
