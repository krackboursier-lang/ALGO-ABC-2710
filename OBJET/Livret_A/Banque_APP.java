package OBJET.Livret_A;

class Compte {
    private String nomProprio;
    private double solde;
    private double decouvertAutorise;

    public Compte(String nomProprio, double solde, double decouvertAutorise) {
        this.nomProprio = nomProprio;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

    public void afficher() {
        System.out.println("Nom: " + nomProprio + ", Solde: " + solde + ", Découvert autorisé: " + decouvertAutorise);
    }

    public void crediter(double montant) {
        solde += montant;
    }

    public boolean debiter(double montant) {
        if (solde - montant >= decouvertAutorise) {
            solde -= montant;
            return true;
        }
        return false;
    }

    public boolean transferer(double montant, Compte autreCompte) {
        if (this.debiter(montant)) {
            autreCompte.crediter(montant);
            return true;
        }
        return false;
    }

    public boolean superieur(Compte autreCompte) {
        return this.solde > autreCompte.solde;
    }

    @Override
    public String toString() {
        return "Nom: " + nomProprio + ", Solde: " + solde + ", Découvert autorisé: " + decouvertAutorise;
    }
}

public class Banque_APP extends Compte {
    private double tauxInteret;

    public Banque_APP(String nomProprio, double solde, double decouvertAutorise, double tauxInteret) {
        super(nomProprio, solde, decouvertAutorise);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taux d'intérêt: " + (this.tauxInteret * 100) + "%";
    }

    public double calculInteretAnnuel(double[] tab24) {
        double sommeInteret = 0;
        for (double solde : tab24) {
            sommeInteret += (solde * tauxInteret) / 24.0;
        }
        return sommeInteret;
    }
}
