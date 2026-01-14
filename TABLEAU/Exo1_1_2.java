
import java.util.Scanner;

public class Exo1_1_2 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        char reponse;

        System.out.println("Programme de calcul de la moyenne de 2 nombres.");

        do {
            System.out.print("Veuillez saisir 2 nombres séparés par un espace : ");

            // Lecture des deux entiers
            int nb1 = lecteur.nextInt();
            int nb2 = lecteur.nextInt();

            // Calcul de la moyenne (division par 2.0 pour garder les décimales)
            double moyenne = (nb1 + nb2) / 2.0;

            System.out.println("La moyenne de " + nb1 + " et " + nb2 + " est : " + moyenne);

            // Demander si l'utilisateur veut recommencer
            System.out.print("Souhaitez-vous faire un autre calcul ? (O/N) ");
            reponse = lecteur.next().toUpperCase().charAt(0);

        } while (reponse == 'O'); // Le programme boucle si l'utilisateur tape 'O' ou 'o'

        // Fin du programme
        System.out.println("Appuyez sur Entrée pour quitter.");
        lecteur.nextLine(); // Consomme le reste de la ligne
        lecteur.nextLine(); // Attend l'appui sur une touche

        lecteur.close();
    }
}
