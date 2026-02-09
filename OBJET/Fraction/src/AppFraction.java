public class AppFraction {
    public static void main(String[] args) {
        // Tests pour les constructeurs
        Fraction f1 = new Fraction(12, 7);
        Fraction f2 = new Fraction();
        Fraction f3 = new Fraction(9);

        // Tests pour l'affichage
        System.out.print("f1 : ");
        Ecran.affiche(f1); // Affiche 12/7
        System.out.print("f2 : ");
        Ecran.affiche(f2); // Affiche 0/1
        System.out.print("f3 : ");
        Ecran.affiche(f3); // Affiche 9/1

        // Tests pour Oppose et Inverse
        Fraction f4 = new Fraction(4, 7);
        System.out.print("f4 avant oppose : ");
        Ecran.affiche(f4); // Affiche 4/7
        f4.oppose();
        System.out.print("f4 après oppose : ");
        Ecran.affiche(f4); // Affiche -4/7
        f4.inverse();
        System.out.print("f4 après inverse : ");
        Ecran.affiche(f4); // Affiche -7/4

        // Tests pour les opérateurs relationnels
        Fraction f5 = new Fraction(11, 7);
        Fraction f6 = new Fraction(5, 4);
        System.out.println("f5 > f6 : " + f5.superieur(f6)); // true
        System.out.println("f5 < f6 : " + f5.inferieur(f6)); // false

        // Tests pour l'égalité
        Fraction f7 = new Fraction(11, 7);
        Fraction f8 = new Fraction(22, 14);
        System.out.println("f7 == f8 : " + f7.egal(f8)); // true

        // Test pour la réduction et le signe
        Fraction f9 = new Fraction(120, -150);
        System.out.print("f9 : ");
        Ecran.affiche(f9); // Affiche -4/5

        // Test pour le PGCD
        Fraction f10 = new Fraction(-75, 90);
        System.out.println("PGCD de -75 et 90 : " + f10.getPgcd()); // Doit retourner 15

        // Tests pour les opérations arithmétiques
        Fraction f11 = new Fraction(1, 2);
        Fraction f12 = new Fraction(1, 3);
        Fraction somme = f11.somme(f12);
        System.out.print("Somme de f11 et f12 : ");
        Ecran.affiche(somme); // Affiche 5/6

        Fraction difference = f11.difference(f12);
        System.out.print("Différence de f11 et f12 : ");
        Ecran.affiche(difference); // Affiche 1/6

        Fraction produit = f11.produit(f12);
        System.out.print("Produit de f11 et f12 : ");
        Ecran.affiche(produit); // Affiche 1/6

        Fraction quotient = f11.quotient(f12);
        System.out.print("Quotient de f11 et f12 : ");
        Ecran.affiche(quotient); // Affiche 3/2

        Fraction puissance = f11.puissance(2);
        System.out.print("Puissance de f11 au carré : ");
        Ecran.affiche(puissance); // Affiche 1/4
    }
}
