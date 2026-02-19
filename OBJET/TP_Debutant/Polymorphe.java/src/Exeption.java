class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void retirer(double montant) throws Exception {
        if (montant > solde) {
            throw new Exception("Solde insuffisant !");
        }
        solde -= montant;
        System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + solde);
    }
}

public class Exeption {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire(1000);
        try {
            compte.retirer(1500);
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
