import java.util.*;

    import java.util.Scanner;

public class Exo1_2{
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire l'entrée utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir le rayon
        System.out.print("Veuillez entrer le rayon R de la sphère : ");
        double rayon = scanner.nextDouble();

        // Calculer l'aire de la sphère : 4 * π * R²
        double aire = 4 * Math.PI * Math.pow(rayon, 2);

        // Calculer le volume de la sphère : (4/3) * π * R³
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(rayon, 3);

        // Afficher les résultats avec 2 décimales
        System.out.printf("L'aire de la sphère est : %.2f%n", aire);
        System.out.printf("Le volume de la sphère est : %.2f%n", volume);

        // Fermer le scanner
        scanner.close();
    }
}
