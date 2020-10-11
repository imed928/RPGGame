//
// ETNA PROJECT, 19/10/2018 by [...]
// [...]
// File description:
//      [...]
//

import java.lang.*;
import java.util.*;

public class Area {

    private Cell[][] area;
    private String name;

    public Area(int width, int height, String name) {
        this.area = new Cell[height][width];
        this.name = name;
    }

    public Area(Cell[][] area, String name) {
        this.area = area;
        this.name = name;
    }

    public Cell[][] getArea() {
        return this.area;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void registerTangibleAt(int row, int column, Tangible tangible) {
        this.area[row][column].addTangible(tangible);
    }

    public void registerCellAt(int row, int column,Cell cell) {
        this.area[row][column] = cell;
    }

    public void print() {
        System.out.println(this.name);
        for(int i = 0; i < this.area.length; i++){
            for(int j = 0; j < this.area[i].length; j++){
                System.out.print(this.area[j][i].showAs());
            }
            System.out.println();
        }
    }
}
