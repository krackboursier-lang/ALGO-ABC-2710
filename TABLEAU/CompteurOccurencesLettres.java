
import java.util.*;

public class CompteurOccurencesLettres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Demander à l'utilisateur de saisir un texte
        System.out.println("Veuillez entrer un texte d'au moins 120 caractères :");
        String texte = scanner.nextLine();

        // Vérifier si le texte a au moins 120 caractères
        while (texte.length() < 120) {
            System.out.println("Le texte doit contenir au moins 120 caractères. Veuillez réessayer :");
            texte = scanner.nextLine();
        }
        // Convertir le texte en minuscules pour ignorer la casse
        texte = texte.toLowerCase();

        // Créer une map pour stocker le nombre d'occurrences de chaque lettre
        Map<Character, Integer> occurrences = new HashMap<>();

        // Initialiser la map avec toutes les lettres de l'alphabet
        for (char lettre = 'a'; lettre <= 'z'; lettre++) {
            occurrences.put(lettre, 0);
        }
        // Compter les occurrences de chaque lettre dans le texte
        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);
            if (c >= 'a' && c <= 'z') { // Vérifier si le caractère est une lettre
                occurrences.put(c, occurrences.get(c) + 1);
            }
        }

        // Afficher le nombre d'occurrences de chaque lettre
        System.out.println("\nNombre d'occurrences de chaque lettre dans le texte :");
        for (char lettre = 'a'; lettre <= 'z'; lettre++) {
            System.out.println(lettre + " : " + occurrences.get(lettre));
        }

        scanner.close();
    }
}