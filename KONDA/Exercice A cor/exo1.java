import java.util.Scanner; // Importation correcte de la bibliothèque Scanner

// Nom de la classe : doit correspondre au nom du fichier (ex: Exo1.java)
public class exo1 {

    public static void main(String[] args) {

        // Déclaration des variables
        int a;
        int b;
        int addition;

        // Création d'une instance de Scanner pour lire les entrées utilisateur
        Scanner clavier = new Scanner(System.in);

        // Demande à l'utilisateur de saisir la valeur de 'a'
        System.out.print("Entrez la valeur de a : ");
        a = clavier.nextInt();

        // Demande à l'utilisateur de saisir la valeur de 'b'
        System.out.print("Entrez la valeur de b : ");
        b = clavier.nextInt();

        // Calcul de la somme
        addition = a + b;

        // Affichage du résultat
        System.out.println("a + b = " + addition);

        // Fermeture du Scanner pour libérer les ressources
        clavier.close();
    }
}
