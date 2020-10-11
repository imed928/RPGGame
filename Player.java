//
// ETNA PROJECT, 20/10/2018 by [...]
// [...]
// File description:
//      [...]
//

import java.util.*;

public class Player implements Tangible{

    private char symbol;
    private Position position;
    private String name;
    private int point;
    private HealthBar healthBar;
    private Stats stats;
    private List<Item> bag;
    private Hat hat;
    private Dress dress;
    private Boots boots;

    public Player(String name, int point, Stats stats, HealthBar healthBar, List<Item> listItem, char symbol, Position position) {
        this.symbol = symbol;
        this.position = position;
        this.name = name;
        this.point = point;
        this.stats = stats;
        this.healthBar = healthBar;
        this.bag = listItem;
    }

    public void action(Player player) {

    }

    public void movePlayer(World world, Direction direction) {
        System.out.print("ENTER A DIRECTION ('s' FOR SOUTH, 'n' FOR NORTH, 'e' FOR EAST, 'w' FOR WEST) : ");
        Scanner scanner = new Scanner(System.in);
        String tokens[] = scanner.nextLine().split(" ");
        Area var = world.getAreaByName(this.position.getCurrentMap());
        Cell[][] tab = var.getArea();
        for (int ko = 0; ko < 100; ko++)
        if (tokens[0].equals("exit")) {
            System.out.println("À BIENTÔT!!");
            System.exit(0);
        }
        if (this.position.getY() - 1 >= 0 && tokens[0].equals("n")) {
            tab[this.position.getX()][this.position.getY() - 1].addTangible(this);
            tab[this.position.getX()][this.position.getY()].removeTangible(this);
            this.position.setY(this.position.getY() - 1);
            System.out.println("Player moved to the NORTH!");
        }
        else if (this.position.getY() + 1 < tab[this.position.getX()].length && tokens[0].equals("s")) {
            tab[this.position.getX()][this.position.getY() + 1].addTangible(this);
            tab[this.position.getX()][this.position.getY()].removeTangible(this);
            this.position.setY(this.position.getY() + 1);
            System.out.println("Player moved to the SOUTH!");
        }
        else if (this.position.getX() - 1 >= 0 && tokens[0].equals("w")) {
            tab[this.position.getX() - 1][this.position.getY()].addTangible(this);
            tab[this.position.getX()][this.position.getY()].removeTangible(this);
            this.position.setX(this.position.getX() - 1);
            System.out.println("Player moved to the WEST!");
        }
        else if (this.position.getX() + 1 < tab[this.position.getX()].length && tokens[0].equals("e")) {
            tab[this.position.getX() + 1][this.position.getY()].addTangible(this);
            tab[this.position.getX()][this.position.getY()].removeTangible(this);
            this.position.setX(this.position.getX() + 1);
            System.out.println("Player moved to the EAST!");
        }
        else
            System.out.println("Player didn't move!");

        for (int i = 0; i < tab[this.position.getX()][this.position.getY()].getListTangible().size(); i++) {
            if (tab[this.position.getX()][this.position.getY()].getListTangible().get(i) instanceof Acid)               tab[this.position.getX()][this.position.getY()].getListTangible().get(i).action(this);
            else if (tab[this.position.getX()][this.position.getY()].getListTangible().get(i) instanceof HolyWater)     tab[this.position.getX()][this.position.getY()].getListTangible().get(i).action(this);
            else if (tab[this.position.getX()][this.position.getY()].getListTangible().get(i) instanceof Quiz) {
                tab[this.position.getX()][this.position.getY()].getListTangible().get(i).action(this);
                System.out.println("PLEASE PRESS ENTER TO CONTINUE THE GAME");
                Scanner bang = new Scanner(System.in);
                String tokeno[] = bang.nextLine().split(" ");
            }
            else if (tab[this.position.getX()][this.position.getY()].getListTangible().get(i) instanceof PlusMinusGame) {
                tab[this.position.getX()][this.position.getY()].getListTangible().get(i).action(this);
                System.out.println("PLEASE PRESS ENTER TO CONTINUE THE GAME");
                Scanner bang = new Scanner(System.in);
                String tokeno[] = bang.nextLine().split(" ");
            }
        }
        for (int i = 0; i < tab[this.position.getX()][this.position.getY()].getListReaction().size(); i++)          tab[this.position.getX()][this.position.getY()].getListReaction().get(i).action(this);
    }

    public char getSymbol() {
        return this.symbol;
    }

    public char showAs() {
        return this.symbol;
    }

    public void attack(Player player){
        if (this.stats.getAttack() > player.getStats().getDefence()) {
            int i = stats.getAttack() - player.getStats().getDefence();
            if (i < 0) {
                i = 0;
            }
            player.getHealthBar().removeCurrentPoint(i);
        }
    }

    public void removeHat() {
        this.bag.add(this.hat);
        this.hat = null;
    }

    public void putHat(Hat hat) {
        removeHat();
        this.hat = hat;
        this.hat.put(this);
    }

    public void takeDamage(int damagePoint) {
        this.healthBar.removeCurrentPoint(damagePoint);
    }

    public void removeDress() {
        this.bag.add(this.dress);
        this.dress = null;
    }

    public void putDress(Dress dress) {
        removeDress();
        this.dress = dress;
        this.dress.put(this);
    }

    public void removeBoots() {
        this.bag.add(this.boots);
        this.boots = null;
    }

    public void putBoots(Boots boots) {
        removeBoots();
        this.boots = boots;
        this.boots.put(this);
    }

    public boolean emptylisteuh(List<Item> listeuh) {
        for (Item var:listeuh) {
            if(var != null)
                return false;
        }
        return true;
    }

    public void printBag() {
        int a = 0;
        if (emptylisteuh(this.bag) == true)
            System.out.println("Bag Empty");
        else {
            int i = 0;
            for (Item var:this.bag) {
                if (var == null) {
                    a++;
                }
                else {
                    i++;
                    System.out.println(i + " -> " + var.getName());
                }
            }
        }
    }

    public HealthBar getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(HealthBar healthBar) {
        this.healthBar = healthBar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    public void resetScore() {
        this.point = 0;
    }

    public void addScore(int point) {
        this.point += point;
    }

    public void removeScore(int point) {
        this.point -= point;
    }

    public String toString() {
        return "Name : " + name + ", Point : " + point;
    }

    public Stats getStats() {
        return stats;
    }

//     public static void main(String[] args) {
// 	Cell[][] cells = new Cell[16][16];

// 	int chestPos = 5;
// 	int hollywater = 7;
// 	int acide = 15;

// 	int counter = 0;
// 	for (int i = 0; i < 16; i++) {
// 		for (int j = 0; j < 16; j++) {
// 			if (counter == chestPos) {
// 				cells[i][j] = new Cell(new Chest());
// 			} else if (counter == hollywater) {
// 				cells[i][j] = new Cell(new HolyWater());
// 			} else if (counter == acide) {
// 				cells[i][j] = new Cell(new Acid());
// 			} else {
// 				cells[i][j] = new Cell(new Ground());
// 			}
// 			counter++;
// 		}
// 	}

// 	Area areaOne = new Area(cells, "Area One");
// 	Area areaTwo = new Area(cells, "Area Two");
// 	List<Area> areas = new ArrayList();

// 	areas.add(areaOne);
// 	areas.add(areaTwo);

// 	World world = new World(areas);
// 	world.print();

// 	Stats stats = new Stats(100, 100);
// 	HealthBar healthBar = new HealthBar("HealthBar", 100, 200);
// 	List<Item> bag = new ArrayList<>();
// 	Player player = new Player("PlayerOne", 100, stats, healthBar, bag, 'J', new Position(0, 0, "Area One"));

// 	world.getAreaByName("Area One").getArea()[0][0].addTangible(player);

// 	// Adding the reaction
// 	world.getAreaByName("Area Two").getArea()[1][0].addReaction(new ActionDamage(10));

//     for (int i = 0; i < 40; i++) {
// 	world.print();
// 	player.movePlayer(world, Direction.EAST);
// 	// After walking on Reaction cell
// 	System.out.println(player.getHealthBar().getCurrentPoint());
// 	// world.print();
//     }
// }
}
