// Classe CompteBancaire
public class CompteBancaire {
    private String titulaire;
    private double solde;

    // Constructeur
    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    // Méthode pour déposer de l'argent
    public void deposer(double montant) {
        solde += montant;
    }

    // Méthode pour retirer de l'argent
    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }

    // Méthode pour afficher le solde (version corrigée)
    public void afficherSolde() {
        System.out.println(solde);
    }
}
