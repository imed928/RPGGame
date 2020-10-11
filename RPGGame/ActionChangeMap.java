//
// ETNA PROJECT, 22/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class ActionChangeMap implements Reaction {

    public ActionChangeMap() {
        
    }

    public void action(Player player) {
        int i = 0;
        i++;
    }

    @Override
    public ReactionType getTypeReaction() {
        return ReactionType.ChangeMap;
    }

    @Override
    public String getTextOfReaction() {
        return "Player changes map";
    }
} 
