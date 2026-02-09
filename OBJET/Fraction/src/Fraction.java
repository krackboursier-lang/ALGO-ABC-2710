public class Fraction {
    private int numerateur;
    private int denominateur;

    // Constructeur par défaut
    public Fraction() {
        this.numerateur = 0;
        this.denominateur = 1;
    }

    // Constructeur avec un seul paramètre (numérateur)
    public Fraction(int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    // Constructeur avec numérateur et dénominateur
    public Fraction(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("---------------LE DENOMINATEUR NE PEUT PAS ÊTRE ZÉRO.");
        }
        this.numerateur = numerateur;
        this.denominateur = denominateur;
        this.simplifier();
    }

    // Getters
    public int getNumerateur() {
        return this.numerateur;
    }

    public int getDenominateur() {
        return this.denominateur;
    }

    // Méthode pour calculer le PGCD
    private int pgcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int getPgcd() {
        return this.pgcd(this.numerateur, this.denominateur);
    }

    // Méthode pour simplifier la fraction
    private void simplifier() {
        int pgcd = this.pgcd(this.numerateur, this.denominateur);
        this.numerateur /= pgcd;
        this.denominateur /= pgcd;

        // Gestion du signe
        if (this.denominateur < 0) {
            this.numerateur *= -1;
            this.denominateur *= -1;
        }
    }

    // Méthode pour obtenir l'opposé de la fraction
    public void oppose() {
        this.numerateur *= -1;
    }

    // Méthode pour obtenir l'inverse de la fraction
    public void inverse() {
        if (this.numerateur == 0) {
            throw new IllegalStateException("IMPOSSIBLE D'INVERSER UNE FRACTION DONC LE NUMÉRATEUR EST ZÉRO.");
        }
        int temp = this.numerateur;
        this.numerateur = this.denominateur;
        this.denominateur = temp;
    }

    // Méthode pour vérifier si la fraction est supérieure à une autre
    public boolean superieur(Fraction autre) {
        return (this.numerateur * autre.denominateur) > (autre.numerateur * this.denominateur);
    }

    // Méthode pour vérifier si la fraction est inférieure à une autre
    public boolean inferieur(Fraction autre) {
        return (this.numerateur * autre.denominateur) < (autre.numerateur * this.denominateur);
    }

    // Méthode pour vérifier si deux fractions sont égales
    public boolean egal(Fraction autre) {
        return (this.numerateur * autre.denominateur) == (autre.numerateur * this.denominateur);
    }

    // Méthode pour additionner deux fractions
    public Fraction somme(Fraction autre) {
        int nouveauNumerateur = this.numerateur * autre.denominateur + autre.numerateur * this.denominateur;
        int nouveauDenominateur = this.denominateur * autre.denominateur;
        return new Fraction(nouveauNumerateur, nouveauDenominateur);
    }

    // Méthode pour soustraire deux fractions
    public Fraction difference(Fraction autre) {
        int nouveauNumerateur = this.numerateur * autre.denominateur - autre.numerateur * this.denominateur;
        int nouveauDenominateur = this.denominateur * autre.denominateur;
        return new Fraction(nouveauNumerateur, nouveauDenominateur);
    }

    // Méthode pour multiplier deux fractions
    public Fraction produit(Fraction autre) {
        int nouveauNumerateur = this.numerateur * autre.numerateur;
        int nouveauDenominateur = this.denominateur * autre.denominateur;
        return new Fraction(nouveauNumerateur, nouveauDenominateur);
    }

    // Méthode pour diviser deux fractions
    public Fraction quotient(Fraction autre) {
        if (autre.numerateur == 0) {
            throw new IllegalArgumentException("---------------IMPOSSIBLE DE DIVISER PAR ZÉRO.");
        }
        int nouveauNumerateur = this.numerateur * autre.denominateur;
        int nouveauDenominateur = this.denominateur * autre.numerateur;
        return new Fraction(nouveauNumerateur, nouveauDenominateur);
    }

    // Méthode pour élever la fraction à une puissance
    public Fraction puissance(int exposant) {
        if (exposant < 0) {
            this.inverse();
            exposant *= -1;
        }
        int nouveauNumerateur = (int) Math.pow(this.numerateur, exposant);
        int nouveauDenominateur = (int) Math.pow(this.denominateur, exposant);
        return new Fraction(nouveauNumerateur, nouveauDenominateur);
    }
}
