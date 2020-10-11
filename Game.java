//
// ETNA PROJECT, 25/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public abstract class Game {

    public String name;
    public Key keyCondition;
    private Key keyReward;

    public Game(String name, Key keyCondition, Key keyReward) {
        this.name = name;
        this.keyCondition = keyCondition;
        this.keyReward = keyReward;
    }

    public Key getKeyCondition() {
        return this.keyCondition;
    }

    public Key getKeyReward() {
        return this.keyReward;
    }

    public Key reward() {
        return this.keyReward;
    }

    public abstract String getName();
    public abstract boolean play(Key k, String input);
    public abstract boolean canPlay(Key k);
}
