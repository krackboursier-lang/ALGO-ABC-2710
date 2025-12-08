package exercices;

public class exo9_cor {
    public static void main(String[] args) {
        
        int number; // Déclaration d'une variable de type entier

        System .out .println("Please enter a number :"); // Affichage du message pour demander un nombre

        java.util.Scanner clavier = new java.util.Scanner(System.in); // Déclaration du scanner

        number = clavier.nextInt(); // Lecture de l'entier tapé au clavier

        if (number % 2 == 0) { // Condition pour vérifier si le nombre est pair

            System.out.println("The number " + number + " is even."); // Affichage si le nombre est pair

        } else {

            System.out.println("The number " + number + " is odd."); // Affichage si le nombre est impair

        }

        clavier.close(); // Fermeture du scanner
    }
}
