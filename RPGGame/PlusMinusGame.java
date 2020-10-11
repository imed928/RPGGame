//
// ETNA PROJECT, 25/10/2018 by [...]
// [...]
// File description:
//      [...]
//

import java.util.*;

public class PlusMinusGame extends Game implements Tangible {
    private int findValue;
    private GameRunner ok = new GameRunner();

    public PlusMinusGame(String name, Key keyCondition, Key keyReward, int findValue) {
        super(name, keyCondition, keyReward);
        this.findValue = findValue;
    }

    public static boolean banggg() {
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

    public char showAs() {
        return 'I';
    }

    public void action(Player player) {
        banggg();
    }

    public boolean canPlay(Key k) {
        if (this.keyCondition == k)
            return true;
        return false;
    }

    public String getName() {
        return "plusminus";
    }

    public boolean play(Key k, String input) {
        if (this.keyCondition == k) {
            System.out.println("Welcome to the " + this.name + " game!");
            Scanner ims = new Scanner(input);
            int a = 0;
            for (int i = 0; ims.hasNextInt() && a < 10; i++) {
                int ok = 0;
                ok = ims.nextInt();
                if (this.findValue < ok)
                    System.out.println("Minus");
                else if (this.findValue > ok)
                    System.out.println("Plus");
                else if (ok == this.findValue) {
                    System.out.println("Win");
                    return true;
                }
                a++;
            }
            if (a >= 10) {
                System.out.println("Lose");
                return false;
            }
            return true;
        }
        else {
            System.out.println("Key required");
            return false;
        }
    }
}
