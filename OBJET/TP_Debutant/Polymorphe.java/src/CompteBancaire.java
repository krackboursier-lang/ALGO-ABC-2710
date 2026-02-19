class CompteBancaire {
    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void retirer(double montant) throws Exception {
        if (montant > solde) {
            throw new Exception(Couleurs.ROUGE + "Solde insuffisant! Votre solde est de " +
                    Couleurs.GRAS + solde + "EURO" + Couleurs.RESET);
        }
        solde -= montant;
        System.out.println(Couleurs.VERT + "Retrait de " + Couleurs.GRAS + montant +
                "EURO" + Couleurs.RESET + Couleurs.VERT + " effectué. Nouveau solde: " +
                Couleurs.GRAS + solde + "EURO" + Couleurs.RESET);
    }

    public double getSolde() {
        return solde;
    }
}

class MainExercice6 {
    public static void main(String[] args) {
        System.out.println(Couleurs.CYAN + Couleurs.GRAS
                + "\n<<<<<<<<<<<<<<<< EXERCICE 6: COMPTE BANCAIRE >>>>>>>>>>>>>>>" + Couleurs.RESET);
        CompteBancaire compte = new CompteBancaire(1000);
        System.out
                .println(Couleurs.BLEU + "Solde initial: " + Couleurs.GRAS + compte.getSolde() + "EURO"
                        + Couleurs.RESET);

        try {
            System.out.println(Couleurs.JAUNE + "\nTentative de retrait de 1500 EURO " + Couleurs.RESET);
            compte.retirer(1500);
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            System.out.println(Couleurs.JAUNE + "\nTentative de retrait de 500 EURO " + Couleurs.RESET);
            compte.retirer(500);
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
