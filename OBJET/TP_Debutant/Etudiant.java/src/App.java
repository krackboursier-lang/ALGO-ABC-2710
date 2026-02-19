// Classe Main
public class App {
    public static void main(String[] args) {
        // Création d'un tableau de notes
        double[] notes = {12.5, 15.0, 16.5};

        // Création d'un objet Etudiant
        Etudiant etudiant = new Etudiant("Jean Dupont", 20, notes);

        // Affichage des détails de l'étudiant
        etudiant.afficherDetails();
    }
}
