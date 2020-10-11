//
// ETNA PROJECT, 19/10/2018 by [...]
// [...]
// File description:
//      [...]
//

import java.lang.*;
import java.util.*;

public class World {

    private Cell[][] world;
    private List<Area> area = new ArrayList<Area>();

    public World(Area area) {
        this.area.add(area);
    }

    public World(Cell[][] world) {
        this.world = world;
    }

    public World(List<Area> areas) {
        this.area.addAll(areas);
    }

    public void addArea(Area area) {
        this.area.add(area);
    }

    public void registerTangibleAt(int row, int column, Tangible tangible) {
        this.world[row][column].addTangible(tangible);
    }

    public void registerCellAt(int row, int column,Cell cell) {
        if (this.world[row][column] == null)
            this.world[row][column] = cell;
    }

    public void print() {
        for (int i = 0; i < this.area.size(); i++){
            this.area.get(i).print();
            System.out.println();
        }
    }

    public Area getAreaByName(String name)  {
        for (Area var:this.area) {
            if (var.getName().equals(name))
                return var;
        }
        return null;
    }
}
