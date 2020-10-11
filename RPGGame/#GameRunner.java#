//
// ETNA PROJECT, 25/10/2018 by [...]
// [...]
// File description:
//      [...]
//

import java.util.*;

public class GameRunner {

    private String input;
    private Key keyToPlay;

    public GameRunner(Key key,String input) {
        this.keyToPlay = key;
        this.input = input;
    }

    public GameRunner() {
        this.input = new String();
    }

    public static boolean plusoumoins() {
        System.out.println("Bonjour et bienvenue dans le PLUS MINUS GAME");
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un chiffre entre 1 et 100:");
        int goodnb = sc.nextInt();
        for (int blabla = 0; blabla < 60; blabla++)
            System.out.println();
        for (int a = 10; a >= 0; a--) {
            System.out.println("Veuillez saisir un nombre entre 1 et 100");
            int rep = sc.nextInt();
            if (rep > goodnb)
                System.out.println("Minus");
            else if (rep < goodnb)
                System.out.println("Plus");
            else if (rep == goodnb) {
                System.out.println("Win");
                return true;
            }
            System.out.println("Il vous reste "+a+" chances !");
        }
        System.out.println("Vous avez perdu");
        return false;
    }

    public static boolean kwiz() {
        int a = 0;

        System.out.println("Bonjour et bienvenue dans le QUIZ by imed");
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir une question :");
        String question = sc.nextLine();
        System.out.println("Vous avez saisi votre question, maintenant veuillez saisir la réponse 1:");
        String rep1 = sc.nextLine();
        System.out.println("Veuillez saisir une deuxieme réponse :");
        String rep2 = sc.nextLine();
        System.out.println("Veuillez saisir une troisième réponse :");
        String rep3 = sc.nextLine();
        System.out.println("Veuillez saisir une quatrième réponse :");
        String rep4 = sc.nextLine();
        System.out.println("Bien, maintenant Veuillez saisir la bonne réponse à ces 4 questions :");
        String bonnerep = sc.nextLine();
        for (int blabla = 0; blabla < 60; blabla++)
            System.out.println();
        String[] tab = new String[4];
        tab[0] = rep1;
        tab[1] = rep2;
        tab[2] = rep3;
        tab[3] = rep4;
        System.out.println("Tres bien, voici la question :\"" + question);
        System.out.println("Et voici les réponses possibles :\n réponse 1 :\"" + rep1 + "\"réponse 2 :\\" + rep2 + "\"réponse 3 :\"" + rep3 + "\"réponse 4 :\"" + rep4 + "\"");
        System.out.println("Veuillez saisir une réponse parmis les 4 possibles :" );
        for (int i = 10; i >= 0; i--) {
            System.out.println("Raté ! Vous avez encore " + i + " chances !");
            System.out.println("Et voici les réponses possibles :\n réponse 1 :\"" + rep1 + "\"réponse 2 :\"" + rep2 + "\"réponse 3 :\"" + rep3 + "\"réponse 4 :\"" + rep4 + "\"");
            String str = sc.nextLine();
            if (str.equals(rep1) && str.equals(bonnerep)) {
                System.out.println("Tres bien");
                System.exit(0);
            }
            if (str.equals(rep2) && str.equals(bonnerep)) {
                System.out.println("Tres bien");
                System.exit(0);
            }
            if (str.equals(rep3) && str.equals(bonnerep)) {
                System.out.println("Tres bien");
                System.exit(0);
            }
            if (str.equals(rep4) && str.equals(bonnerep)) {
                System.out.println("Tres bien");
                System.exit(0);
            }
        }
        System.out.println("Mission échoué");
        return true;
    }
    public String getInput() {
        return this.input;
    }

    public boolean playGame(Game game) {
        if (game.getName() == "quiz")
            return game.play(this.keyToPlay, this.input);
        if (game.getName() == "plusminus")
            return game.play(this.keyToPlay, this.input);
        return false;
    }

    public static void main(String[] args) {
        System.out.println("\n1 - QUIZ\t2 - PLUS OU MINUS\t3 - THE LEGEND OF ZELDA OCARINA OF 92\n");
        System.out.println("VOICI LES JEUX DISPONIBLES, VEUILLEZ TAPER LE NUMERO DU JEU\n");
        System.out.print("OUTPUT : ");
        Scanner scanner = new Scanner(System.in);
        String tokens[] = scanner.nextLine().split(" ");
        Key k1 = new Key("key1");
        Key k2 = new Key("key2");
        List listQuestion = new ArrayList<>();
        listQuestion.add(new Question("1+1", "1", "2", "3", "4", "2"));
        listQuestion.add(new Question("2+2", "1", "2", "3", "4", "4"));        Key k = new Key("key1");
        Game g = new PlusMinusGame("PlusMinusGame", null, k, 59);
        Game g1 = new PlusMinusGame("PlusMinusGame", k, k, 59);
        if (tokens[0].equals("1")) {
            kwiz();
        }
        else if (tokens[0].equals("2")) {
            // Key k = new Key("key1");
            // Game g = new PlusMinusGame("PlusMinusGame", null, k, 59);
            // Game g1 = new PlusMinusGame("PlusMinusGame", k, k, 59);
            // boolean one = g.play(null, "1 2 3 100 59");
            // boolean two = g1.play(null, "1 2 3 100 10 40 30 60 50 40");
            // boolean three = g1.play(k, "1 2 3 100 10 40 30 60 50 40");
            // System.out.println(one);
            // System.out.println(two);
            // System.out.println(three);
            plusoumoins();
        }
        else if (tokens[0].equals("3")) {
            Cell[][] cells = new Cell[16][16];
            int chestPos = 5;
            int hollywater = 7;
            int acide = 15;
            int counter = 0;
            for (int i = 0; i < 16; i++) {
                for (int j = 0; j < 16; j++) {
                    if (counter == chestPos) {
                        cells[i][j] = new Cell(new Chest());
                    } else if (counter == hollywater) {
                        cells[i][j] = new Cell(new HolyWater());
                    } else if (counter == acide) {
                        cells[i][j] = new Cell(new Acid());
                    } else {
                        cells[i][j] = new Cell(new Ground());
                    }
                    counter++;
                }
            }
            cells[4][6] = new Cell(new Quiz("Question", k1, k2, listQuestion));
            cells[0][6] = new Cell(new PlusMinusGame("PlusMinusGame", null, k, 59));
            cells[1][0] = new Cell(new PlusMinusGame("PlusMinusGame", k, k, 59));
            Area areaOne = new Area(cells, "Area One");
            Area areaTwo = new Area(cells, "Area Two");
            List<Area> areas = new ArrayList();
            areas.add(areaOne);
            areas.add(areaTwo);
            World world = new World(areas);
            // world.print();
            Stats stats = new Stats(100, 100);
            HealthBar healthBar = new HealthBar("HealthBar", 100, 200);
            List<Item> bag = new ArrayList<>();
            Player player = new Player("PlayerOne", 100, stats, healthBar, bag, 'J', new Position(0, 0, "Area One"));
            world.getAreaByName("Area One").getArea()[0][0].addTangible(player);
            world.getAreaByName("Area Two").getArea()[1][0].addReaction(new ActionDamage(10));
            for (int i = 0; i < 40; i++) {
                world.print();
                player.movePlayer(world, Direction.EAST);
                System.out.println(player.getHealthBar().getCurrentPoint());
            }
        }
        else if (tokens[0].equals("exit"))
            System.out.println();
        else {
            System.out.println("JEU NON TROUVER\n");
            main(args);
        }
    }
}
