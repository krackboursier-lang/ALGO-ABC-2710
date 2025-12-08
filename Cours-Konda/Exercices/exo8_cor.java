package exercices;  
public class exo8_cor {
    public static void main(String[] args) {
        
        int nombre; // Déclaration d'une variable de type entier

        System .out .println("Veuillez entrer un nombre :"); // Affichage du message pour demander un nombre

        java.util.Scanner clavier = new java.util.Scanner(System.in); // Déclaration du scanner

        nombre = clavier.nextInt(); // Lecture de l'entier tapé au clavier

        if (nombre % 2 == 0) { // Condition pour vérifier si le nombre est pair

            System.out.println("Le nombre " + nombre + " est pair."); // Affichage si le nombre est pair

        } else {

            System.out.println("Le nombre " + nombre + " est impair."); // Affichage si le nombre est impair

        }

        clavier.close(); // Fermeture du scanner
    }
}   