import java.time.LocalDateTime;
import java.util.Random;

public class Compte {
    private double decouvertAutorise;
    protected String nomPropietaire;
    protected int numero;
    protected double solde;
    Random aleas = new Random();

    public Compte(String _nomProprio, double _solde, double _decouvertAutorise) {
        int nbTest = aleas.nextInt(1, 1001);
        LocalDateTime locTimes = LocalDateTime.now();
        this.numero = Math.abs(locTimes.hashCode() + nbTest);
        this.nomPropietaire = _nomProprio;
        this.solde = _solde;
        this.decouvertAutorise = _decouvertAutorise;
    }

    public Compte() {
        LocalDateTime locTimes = LocalDateTime.now();
        this.numero = locTimes.hashCode();
        this.nomPropietaire = "sans nom";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

    public void crediter(double _montant) {
        this.solde += _montant;
    }

    public boolean debiter(double _montant) {
        if (this.solde - _montant >= this.decouvertAutorise) {
            this.solde -= _montant;
            return true;
        }
        return false;
    }

    public boolean transferer(double _montant, Compte _autreCompte) {
        if (this.debiter(_montant)) {
            _autreCompte.crediter(_montant);
            return true;
        }
        return false;
    }

    public boolean superieur(Compte _autreCompte) {
        return this.solde >= _autreCompte.solde;
    }

    @Override
    public String toString() {
        return "Compte n°" + this.numero +
                " Propriétaire: " + this.nomPropietaire +
                " Solde: " + this.solde + " Euros" +
                " Découvert autorisé: " + this.decouvertAutorise + " Euros";
    }

    // Accesseurs
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public String getNomPropietaire() {
        return nomPropietaire;
    }

    public int getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    // Modificateurs
    public void setDecouvertAutorise(double newVal) {
        decouvertAutorise = newVal;
    }

    public void setSolde(double newVal) {
        solde = newVal;
    }

    public boolean setNomProprietaire(String _nouvNom) {
        if (this.nomPropietaire.equals("sans nom")) {
            this.nomPropietaire = _nouvNom;
            return true;
        } else {
            return false;
        }
    }
}
