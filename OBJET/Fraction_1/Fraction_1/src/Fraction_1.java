public class Fraction_1 {
    private int numerateur;
    private int denominateur;

    // Constructeurs
    public Fraction_1(int numerateur, int denominateur) {
        if (denominateur == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être nul.");
        }
        this.numerateur = numerateur;
        this.denominateur = denominateur;
        this.reduire();
    }

    public Fraction_1(int numerateur) {
        this(numerateur, 1);
    }

    public Fraction_1() {
        this(0, 1);
    }

    // Accesseurs
    public int getNumerateur() {
        return numerateur;
    }

    public int getDenominateur() {
        return denominateur;
    }

    // Méthode privée pour calculer le PGCD
    private int getPgcd() {
        int a = Math.abs(this.numerateur);
        int b = Math.abs(this.denominateur);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Méthode privée pour réduire la fraction
    private void reduire() {
        int pgcd = this.getPgcd();
        this.numerateur /= pgcd;
        this.denominateur /= pgcd;
        // Gestion du signe
        if (this.denominateur < 0) {
            this.numerateur *= -1;
            this.denominateur *= -1;
        }
    }

    // Méthodes unaires
    public void oppose() {
        this.numerateur *= -1;
    }

    public void inverse() {
        if (this.numerateur == 0) {
            throw new IllegalStateException("Impossible d'inverser une fraction dont le numérateur est nul.");
        }
        int temp = this.numerateur;
        this.numerateur = this.denominateur;
        this.denominateur = temp;
        this.reduire();
    }

    // Opérateurs relationnels
    public boolean superieur(Fraction_1 autre) {
        return (this.numerateur * autre.denominateur) > (autre.numerateur * this.denominateur);
    }

    public boolean inferieur(Fraction_1 autre) {
        return (this.numerateur * autre.denominateur) < (autre.numerateur * this.denominateur);
    }

    public boolean egal(Fraction_1 autre) {
        return (this.numerateur * autre.denominateur) == (autre.numerateur * this.denominateur);
    }

    // Opérations binaires
    public Fraction_1 somme(Fraction_1 autre) {
        int num = this.numerateur * autre.denominateur + autre.numerateur * this.denominateur;
        int den = this.denominateur * autre.denominateur;
        return new Fraction_1(num, den);
    }

    public Fraction_1 difference(Fraction_1 autre) {
        int num = this.numerateur * autre.denominateur - autre.numerateur * this.denominateur;
        int den = this.denominateur * autre.denominateur;
        return new Fraction_1(num, den);
    }

    public Fraction_1 produit(Fraction_1 autre) {
        int num = this.numerateur * autre.numerateur;
        int den = this.denominateur * autre.denominateur;
        return new Fraction_1(num, den);
    }

    public Fraction_1 quotient(Fraction_1 autre) {
        if (autre.numerateur == 0) {
            throw new IllegalArgumentException("Impossible de diviser par une fraction dont le numérateur est nul.");
        }
        int num = this.numerateur * autre.denominateur;
        int den = this.denominateur * autre.numerateur;
        return new Fraction_1(num, den);
    }

    public Fraction_1 puissance(int exposant) {
        if (exposant < 0) {
            Fraction_1 inverse = new Fraction_1(this.denominateur, this.numerateur);
            return inverse.puissance(-exposant);
        }
        int num = (int) Math.pow(this.numerateur, exposant);
        int den = (int) Math.pow(this.denominateur, exposant);
        return new Fraction_1(num, den);
    }
}
