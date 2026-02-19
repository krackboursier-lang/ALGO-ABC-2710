// Classe Voiture
public class Voiture {
    private String marque;
    private String modele;
    private int annee;

    // Constructeur pour initialiser les attributs
    public Voiture(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    // Méthode pour afficher les détails de la voiture
    public void afficherDetails() {
        System.out.println("Voiture : " + marque + " " + modele + ", Année : " + annee);
    }
}
