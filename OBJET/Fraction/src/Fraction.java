

public class Fraction {
    private int numerateur;
    private int denominateur;

    // Constructeurs
    public Fraction(int numerateur, int denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur != 0 ? denominateur : 1;
        this.reduire();
    }

    public Fraction(int numerateur) {
        this(numerateur, 1);
    }

    public Fraction() {
        this(0, 1);
    }

    // Accesseurs
    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    // Méthode pour obtenir le PGCD
    int getPgcd() {
        int a = Math.abs(this.numerateur);
        int b = Math.abs(this.denominateur);
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    // Méthode pour réduire la fraction
    private void reduire() {
        int pgcd = this.getPgcd();
        if (pgcd != 0) {
            this.numerateur /= pgcd;
            this.denominateur /= pgcd;
        }
        // Gestion du signe
        if (this.denominateur < 0) {
            this.numerateur *= -1;
            this.denominateur *= -1;
        }
    }

    // Méthode Oppose
    public void oppose() {
        this.numerateur *= -1;
    }

    // Méthode Inverse
    public void inverse() {
        if (this.numerateur != 0) {
            int temp = this.numerateur;
            this.numerateur = this.denominateur;
            this.denominateur = temp;
            this.reduire();
        }
    }

    // Méthode Supérieur
    public boolean superieur(Fraction autre) {
        return (this.numerateur * autre.denominateur) > (autre.numerateur * this.denominateur);
    }

    // Méthode Inférieur
    public boolean inferieur(Fraction autre) {
        return (this.numerateur * autre.denominateur) < (autre.numerateur * this.denominateur);
    }

    // Méthode Égal
    public boolean egal(Fraction autre) {
        this.reduire();
        autre.reduire();
        return (this.numerateur == autre.numerateur) && (this.denominateur == autre.denominateur);
    }

    // Méthode Somme
    public Fraction somme(Fraction autre) {
        int newNumerateur = this.numerateur * autre.denominateur + autre.numerateur * this.denominateur;
        int newDenominateur = this.denominateur * autre.denominateur;
        return new Fraction(newNumerateur, newDenominateur);
    }

    // Méthode Différence
    public Fraction difference(Fraction autre) {
        int newNumerateur = this.numerateur * autre.denominateur - autre.numerateur * this.denominateur;
        int newDenominateur = this.denominateur * autre.denominateur;
        return new Fraction(newNumerateur, newDenominateur);
    }

    // Méthode Produit
    public Fraction produit(Fraction autre) {
        int newNumerateur = this.numerateur * autre.numerateur;
        int newDenominateur = this.denominateur * autre.denominateur;
        return new Fraction(newNumerateur, newDenominateur);
    }

    // Méthode Quotient
    public Fraction quotient(Fraction autre) {
        if (autre.numerateur == 0) {
            throw new IllegalArgumentException("Division par zéro interdite.");
        }
        int newNumerateur = this.numerateur * autre.denominateur;
        int newDenominateur = this.denominateur * autre.numerateur;
        return new Fraction(newNumerateur, newDenominateur);
    }

    // Méthode Puissance
    public Fraction puissance(int exposant) {
        int newNumerateur = (int) Math.pow(this.numerateur, exposant);
        int newDenominateur = (int) Math.pow(this.denominateur, exposant);
        return new Fraction(newNumerateur, newDenominateur);
    }
}
