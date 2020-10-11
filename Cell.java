//
// ETNA PROJECT, 20/10/2018 by [...]
// [...]
// File description:
//      [...]
//

import java.util.*;

public class Cell {

    private List<Tangible> tangible;
    private List<Reaction> reaction;

    public Cell(Tangible tangible) {
        this.tangible = new ArrayList<Tangible>();
        this.tangible.add(tangible);
        this.reaction = new ArrayList<Reaction>();
    }

    public Cell(List<Tangible> listTangible) {
        this.tangible = listTangible;
    }

    public List<Tangible> getListTangible() {
        return this.tangible;
    }

    public List<Reaction> getListReaction() {
        return this.reaction;
    }

    public void addReaction(Reaction reaction) {
        this.reaction.add(reaction);
    }

    public boolean isEmptyTangible() {
        for (Tangible var:this.tangible) {
            if (var != null)
                return true;
        }
        return false;
    }

    public boolean isEmptyReaction() {
        for (Reaction var:this.reaction) {
            if (var != null)
                return true;
        }
        return false;
    }

    public void addTangible(Tangible tangible) {
        this.tangible.add(tangible);
    }

    public void removeTangible(Tangible tangible) {
        this.tangible.remove(tangible);
    }

    public boolean isEmpty() {
        for (Tangible var:this.tangible) {
            if (var != null)
                return true;
        }
        return false;
    }

    public char showAs() {
        Tangible stock;
        for (Tangible var:this.tangible)
            continue ;
        return this.tangible.get(this.tangible.size() - 1).showAs();
    }
}
