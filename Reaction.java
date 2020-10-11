//
// ETNA PROJECT, 22/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public interface Reaction {
    ReactionType getTypeReaction();
    String getTextOfReaction();
    void action(Player player);
}
