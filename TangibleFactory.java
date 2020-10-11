//
// ETNA PROJECT, 22/10/2018 by [...]
// [...]
// File description:
//      [...]
//

public class TangibleFactory {

    public Tangible getTangible(String tangibleType) {
        if (tangibleType == "Acid")
            return new Acid();
        else if (tangibleType == "Chest")
            return new Chest();
        else if (tangibleType == "Ground")
            return new Ground();
        else if (tangibleType == "HolyWater")
            return new HolyWater();
        else if (tangibleType == "Wall")
            return new Wall();
        return null;
    }
}
