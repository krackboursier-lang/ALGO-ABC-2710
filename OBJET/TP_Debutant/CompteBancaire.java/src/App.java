// Classe App
public class App {
    public static void main(String[] args) {
        // Création d'un objet CompteBancaire
        CompteBancaire compte = new CompteBancaire("Jean Dupont", 0.0);

        // Dépôt de 1000 euros
        compte.deposer(1000.0);
        System.out.print("Solde après dépôt : ");
        compte.afficherSolde();

        // Retrait de 500 euros
        compte.retirer(500.0);
        System.out.print("Solde après retrait : ");
        compte.afficherSolde();
    }
}
