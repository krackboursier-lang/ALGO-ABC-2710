import java.util.Random;
import java.util.Scanner;

public class Jeufourchette {
    public static void main(String[] args) throws Exception {
        Random alea = new Random();
        Scanner sc = new Scanner(System.in);
        int choixU, choixO;
        int max = 100;
        int min = 0;
        int compteur = 0;
        boolean trouve = false;
        choixO = alea.nextInt(101);

        do {
            System.out.printf("Veuillez choisir un nombre entre %d et %d \n", min, max);
            choixU = sc.nextInt();
            compteur++;
            if (choixU >= min && choixU <= max) {

                if (choixU > choixO) {
                    max = choixU;
                    System.out.println(" votre nonmbre et surpérieur au nonmbre recherché !");
                } else if (choixU < choixO) {

                    min = choixU;
                    System.out.println(" votre nonmbre et inférieur au nonmbre recherché !");
                } else {

                    trouve = true;

                }
            } else {

                System.out.println(" votre nonmbre n'est pas dans la fourchette de recherche vous perdez un essai!");
            }

        } while (!trouve);
        System.out.println(
                "Bravo vous  avez  trouvé le nombre choix ordinateur " + choixU + " en " + compteur + " essais !");

    }

}
