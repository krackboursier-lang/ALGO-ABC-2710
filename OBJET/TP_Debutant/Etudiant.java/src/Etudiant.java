
// Classe Etudiant
public class Etudiant {
    private String nom;
    private int age;
    private double[] notes;

    // Constructeur
    public Etudiant(String nom, int age, double[] notes) {
        this.nom = nom;
        this.age = age;
        this.notes = notes;
    }

    // Méthode pour calculer la moyenne des notes
    public double calculerMoyenne() {
        double somme = 0.0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }

    // Méthode pour afficher les détails de l'étudiant
    public void afficherDetails() {
        System.out.printf("Nom : %s, Âge : %d ans, Moyenne : %.2f%n", nom, age, calculerMoyenne());
    }
}
