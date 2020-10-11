//
// ETNA PROJECT, 20/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class Position {

    private int x;
    private int y;
    private String currentMap;

    public Position(int x, int y, String map) {
        this.x = x;
        this.y = y;
        this.currentMap = map;
    }

    public String getCurrentMap() {
        return this.currentMap;
    }

    public void setCurrentMap(String str) {
        this.currentMap = str;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }
}
