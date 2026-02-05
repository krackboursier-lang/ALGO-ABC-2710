import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Compte {
    private double decouvertAutorise;
    protected String nomPropietaire;
    protected int numero;
    protected double solde;
    private Random aleas = new Random();

    public Compte(String _nom, double _solde, double _decouvertAutorise) {
        LocalDateTime locTimes = LocalDateTime.now();
        this.numero = Math.abs(locTimes.hashCode() + aleas.nextInt(1000));
        this.nomPropietaire = _nom;
        this.solde = _solde;
        this.decouvertAutorise = _decouvertAutorise;
    }

    public Compte() {
        LocalDateTime locTimes = LocalDateTime.now();
        this.numero = Math.abs(locTimes.hashCode());
        this.nomPropietaire = "sans nom";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

    public void saisirCompte() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTREZ LE NOM DU PROPRIÉTAIRE DU COMPTE : ");
        this.nomPropietaire = scanner.nextLine();

        System.out.print("ENTREZ LE SOLDE INITIAL DU COMPTE : ");
        this.solde = scanner.nextDouble();

        System.out.print("ENTREZ LE DÉCOUVERT AUTORISÉ POUR CE COMPTE : ");
        this.decouvertAutorise = scanner.nextDouble();

        LocalDateTime locTimes = LocalDateTime.now();
        this.numero = Math.abs(locTimes.hashCode() + aleas.nextInt(1000));

        scanner.close();
    }

    public void crediter(double _montant) {
        if (_montant > 0) {
            this.solde += _montant;
        }
    }

    public boolean debiter(double _montant) {
        if (_montant > 0 && this.solde - _montant >= this.decouvertAutorise) {
            this.solde -= _montant;
            return true;
        }
        return false;
    }

    public boolean transferer(double _montant, Compte _autreCompte) {
        if (_montant > 0 && this.debiter(_montant)) {
            _autreCompte.crediter(_montant);
            return true;
        }
        return false;
    }

    public boolean superieur(Compte _autreCompte) {
        return this.solde >= _autreCompte.solde;
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
        }
        return false;
    }
 public String toString() {
    
        return "Compte n° \u001B[36m" + this.numero +
                "\u001B[0m \u001B[33m||\u001B[0m  Propriétaire: \u001B[34m" + this.nomPropietaire +
                "\u001B[0m \u001B[33m||\u001B[0m Solde: \u001B[32m" + this.solde + "\u001B[0m Euros" +
                " \u001B[33m||\u001B[0m Découvert autorisé: \u001B[31m" + this.decouvertAutorise + "\u001B[0m Euros";
    }
}
