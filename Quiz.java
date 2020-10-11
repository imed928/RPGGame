//
// ETNA PROJECT, 25/10/2018 by [...]
// [...]
// File description:
//      [...]
//

import java.util.*;

public class Quiz extends Game implements Tangible {

    private List<Question> list;
    private GameRunner ok = new GameRunner();

    public Quiz(String name, Key keyCondition, Key keyReward, List listQuestion) {
        super(name, keyCondition, keyReward);
        this.list = listQuestion;
    }

    public char showAs() {
        return 'Q';
    }

    public void action(Player player) {
        kwizz();
    }

    public boolean canPlay(Key k) {
        return true;
    }

    public String getName() {
        return "quiz";
    }

    public static boolean kwizz() {
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
        System.out.println("Et voici les réponses possibles :\n réponse 1 :\"" + rep1 + "\"réponse 2 :\"" + rep2 + "\"réponse 3 :\"" + rep3 + "\"réponse 4 :\"" + rep4 + "\"");
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

    public boolean play(Key k, String input) {
        int i = 0;
        int a = 0;

        if (this.keyCondition == k) {
             System.out.println("Welcome to the quiz");
             String[] ok = input.split(" ");
             for (Question var:this.list) {
                 System.out.println(var.getQuestion());
                 System.out.println(var.getResponse1());
                 System.out.println(var.getResponse2());
                 System.out.println(var.getResponse3());
                 System.out.println(var.getResponse4());
                 System.out.println(var.getAnswer());
                 if (a == this.list.size())
                     break;
                 if (ok[a].equals(var.getAnswer()) && ok[a].equals(var.getResponse1())) {
                     System.out.println("Correct");
                     i++;
                     a++;
                 }
                 else if (ok[a].equals(var.getAnswer()) && ok[a].equals(var.getResponse2())) {
                     System.out.println("Correct");
                     i++;
                     a++;
                 }
                 else if (ok[a].equals(var.getAnswer()) && ok[a].equals(var.getResponse3())) {
                     System.out.println("Correct");
                     i++;
                     a++;
                 }
                 else if (ok[a].equals(var.getAnswer()) && ok[a].equals(var.getResponse4())) {
                     System.out.println("Correct");
                     i++;
                     a++;
                 }
                 else {
                     System.out.println("Wrong");
                     return false;
                 }
             }
             if (i == this.list.size()) {
                 System.out.println("Win");
                 return true;
             }
             else
                 return false;
        }
        else {
            System.out.println("Key required");
            return false;
        }
    }
}
