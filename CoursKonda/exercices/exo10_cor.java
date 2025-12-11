
import java.util.Scanner;

public class exo10_cor {
        

public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    int score = 0;
    String reponse;

    System.out.println("Question 1 : L'informatique a besoin des mathématiques ? (V/F)");
    reponse = clavier.nextLine();
    if(reponse.equalsIgnoreCase("V")){
        score++;
    }

    System.out.println("Question 2 : L'Algèbre de Boole a été inventé par Steve Jobs ? (V/F)");
    reponse = clavier.nextLine();
    if(reponse.equalsIgnoreCase("F")){
        score++;
    }

    System.out.println("Question 3 : En numération, la base de 10 va de 0 à 10 ? (V/F)");
    reponse = clavier.nextLine();
    if(reponse.equalsIgnoreCase("F")){
        score++;
    }

    System.out.println("Question 4 : Une table de vérité retourne l'expression algébrique (V/F)");
    reponse = clavier.nextLine();
    if(reponse.equalsIgnoreCase("V")){
        score++;
    }

    System.out.println("Question 5 : Git permet de stocker à distance son travail (V/F)");
    reponse = clavier.nextLine();
    if(reponse.equalsIgnoreCase("V")){
        score++;
    }

    System.out.println("Résultat du QUIZZ, vous avez " + score + " point(s) / 5");

    clavier.close();
}



}
