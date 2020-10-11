//
// ETNA PROJECT, 22/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class HealthBar extends Bar {
    private boolean dead;
    public HealthBar(String name, int currentPoint, int maxPoint)
    {
        super(name, currentPoint, maxPoint);
        this.dead = false;
    }

    @Override
    public void addCurrentPoint(int point) {
        if (dead)
            return;
        currentPoint += point;
        if (currentPoint > maxPoint)
            currentPoint = maxPoint;
    }

    public void removeCurrentPoint(int point) {
        // if (this.dead)
        //     return;
        currentPoint -= point;
        if (currentPoint < 0) {
            currentPoint = 0;
            this.dead = true;
        }
    }

    @Override
    public void addMaxPoint(int point) {
        if (dead) return;
        maxPoint += point;
    }

    @Override
    public void removeMaxPoint(int point) {
        if (dead) return;
        maxPoint -= point;
    }
}
