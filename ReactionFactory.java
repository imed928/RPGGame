//
// ETNA PROJECT, 22/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class ReactionFactory {

    public Reaction getReaction(ReactionType reactionType) {
        
        if (reactionType == ReactionType.ChangeMap)
            return new ActionChangeMap();
        if (reactionType == ReactionType.Damage)
            return new ActionDamage();
        if (reactionType == ReactionType.Heal)
            return new ActionHeal();
        return null;
    }
}
