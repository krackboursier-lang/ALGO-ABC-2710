import java.util.Scanner;  

public class Jalonblancexo_4 {
    public static void main(String[] args) {
        // Création d'un scanner pour lire l'entrée utilisateur
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Demander à l'utilisateur de saisir une valeur entière
        System.out.print("Saisir une valeur entière : ");
        int valeur = scanner.nextInt();

        // Vérifier si la valeur est paire ou impaire
        if (valeur % 2 == 0) {
            System.out.println("La valeur est paire.");
        } else {
            System.out.println("La valeur est impaire.");
        }

        // Fermer le scanner
        scanner.close();
    

    }}

