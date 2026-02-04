public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(String nom, double solde, double decouvertAutorise, double taux) {
        super(nom, solde, decouvertAutorise);
        this.tauxInteret = taux;
    }

    public CompteEpargne(int numero, String nom, double solde, double decouvertAutorise, double taux) {
        super(nom, solde, decouvertAutorise);
        this.tauxInteret = taux;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double nouveauTaux) {
        this.tauxInteret = nouveauTaux;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taux d'intérêt: " + (this.tauxInteret * 100) + "%";
    }
}
