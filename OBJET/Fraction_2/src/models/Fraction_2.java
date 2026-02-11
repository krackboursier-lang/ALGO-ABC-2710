package models;

public class Fraction_2 {
    private int numerateur;
    private int denominateur;

    // Constructeurs
    public Fraction_2() {
        this.numerateur = 0;
        this.denominateur = 1;
    }

    public Fraction_2(int numerateur) {
        this.numerateur = numerateur;
        this.denominateur = 1;
    }

    public Fraction_2(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        this.numerateur = numerateur;
        this.denominateur = denominateur;
        this.reduire();
    }

    // Getters
    public int getNumerateur() {
        return this.numerateur;
    }

    public int getDenominateur() {
        return this.denominateur;
    }

    // Calcule le PGCD
    private int getPGCD() {
        int a = Math.abs(this.numerateur);
        int b = Math.abs(this.denominateur);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Simplifie la fraction
    private void reduire() {
        int pgcd = this.getPGCD();
        this.numerateur /= pgcd;
        this.denominateur /= pgcd;
        if (this.denominateur < 0) {
            this.numerateur *= -1;
            this.denominateur *= -1;
        }
    }

    // Méthodes publiques
    public Fraction_2 inverser() {
        if (this.numerateur == 0) {
            throw new IllegalArgumentException("Impossible d'inverser une fraction avec un numérateur nul.");
        }
        return new Fraction_2(this.denominateur, this.numerateur);
    }

    public void opposer() {
        this.numerateur *= -1;
    }

    public Fraction_2 oppose() {
        return new Fraction_2(-this.numerateur, this.denominateur);
    }

    // Additionne deux fractions
    public Fraction_2 sommeFractions(Fraction_2 autreFraction) {
        int num = this.numerateur * autreFraction.denominateur + autreFraction.numerateur * this.denominateur;
        int den = this.denominateur * autreFraction.denominateur;
        return new Fraction_2(num, den);
    }

    // Multiplie deux fractions
    public Fraction_2 produitFractions(Fraction_2 autreFraction) {
        int num = this.numerateur * autreFraction.numerateur;
        int den = this.denominateur * autreFraction.denominateur;
        return new Fraction_2(num, den);
    }

    // Divise deux fractions
    public Fraction_2 diviserFraction(Fraction_2 autreFraction) {
        Fraction_2 inverse = autreFraction.inverser();
        return this.produitFractions(inverse);
    }

    // Élève la fraction à une puissance donnée
    public Fraction_2 puissanceFraction(int exposant) {
        int num = (int) Math.pow(this.numerateur, exposant);
        int den = (int) Math.pow(this.denominateur, exposant);
        return new Fraction_2(num, den);
    }

    @Override
    public String toString() {
        return this.numerateur + "/" + this.denominateur;
    }
}
