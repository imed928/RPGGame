//
// ETNA PROJECT, 23/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class ActionInteraction implements Reaction {

    public ActionInteraction() {

    }

    public void action(Player player) {

    }

    @Override
    public ReactionType getTypeReaction() {
        return ReactionType.Talk;
    }

    @Override
    public String getTextOfReaction() {
        return "Player talks to someone";
    }
}
