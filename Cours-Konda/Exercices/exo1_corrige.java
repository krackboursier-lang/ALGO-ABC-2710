package exercices;

import java.util.Scanner; 

public class exo1_corrige {

    public static void main(String[] args) { 

          /***--------  Début du code  -------------------****/
        
          /* Déclaration des variables */
          int a;
          int b;
          int addition;

          Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

          System.out.println("La valeur de a"); // Affiche un message
          a = clavier.nextInt(); // On affecte une valeur Scanner de type entier à A
          System.out.println("La valeur de b");// Affiche un message
          b = clavier.nextInt();// On affecte une valeur Scanner de type entier à B

          addition = a+b; //calcul la somme

          System.out.println("a+b= "+addition); /* Afficher votre instruction , concaténation pour la phrase dynamique */

        clavier.close();

        /***--------  Fin du code  -------------------****/

    }

}
