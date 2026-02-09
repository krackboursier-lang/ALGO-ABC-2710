public class AppFraction {
    public static void main(String[] args) {
        // Tests pour les constructeurs
        Fraction f1 = new Fraction(12, 7);
        Fraction f2 = new Fraction();
        Fraction f3 = new Fraction(9);

        // Tests pour l'affichage
        System.out.print("----------F1 : ");
        Ecran.affiche(f1); // Affiche 12/7
        System.out.print("----------F2 : ");
        Ecran.affiche(f2); // Affiche 0/1
        System.out.print("----------F3 : ");
        Ecran.affiche(f3); // Affiche 9/1

        // Tests pour Opposé et Inverse
        Fraction f4 = new Fraction(4, 7);
        System.out.print("----------F4 AVANT OPPOSE : ");
        Ecran.affiche(f4); // Affiche 4/7
        f4.oppose();
        System.out.print("----------F4 APRES OPPOSÉ : ");
        Ecran.affiche(f4); // Affiche -4/7
        f4.inverse();
        System.out.print("----------F4 APRES INVERSE : ");
        Ecran.affiche(f4); // Affiche -7/4

        // Tests pour les opérateurs relationnels
        Fraction f5 = new Fraction(11, 7);
        Fraction f6 = new Fraction(5, 4);
        System.out.println("----------F5 > F6 : " + f5.superieur(f6)); // true
        System.out.println("----------F5 < F6 : " + f5.inferieur(f6)); // false

        // Tests pour l'égalité
        Fraction f7 = new Fraction(11, 7);
        Fraction f8 = new Fraction(22, 14);
        System.out.println("----------F7 == F8 : " + f7.egal(f8)); // true

        // Test pour la réduction et le signe
        Fraction f9 = new Fraction(120, -150);
        System.out.print("----------F9 : ");
        Ecran.affiche(f9); // Affiche -4/5

        // Test pour le PGCD
        Fraction f10 = new Fraction(-75, 90);
        System.out.println("----------PGCD de -75 et 90 : " + f10.getPgcd()); // Doit retourner 15

        // Tests pour les opérations arithmétiques
        Fraction f11 = new Fraction(1, 2);
        Fraction f12 = new Fraction(1, 3);
        Fraction somme = f11.somme(f12);
        System.out.print("----------SOMME DE F11 et F12 : ");
        Ecran.affiche(somme); // Affiche 5/6

        Fraction difference = f11.difference(f12);
        System.out.print("----------DIFFÉRENCE de F11 et F12 : ");
        Ecran.affiche(difference); // Affiche 1/6

        Fraction produit = f11.produit(f12);
        System.out.print("----------PRODUIT DE F11 et F12 : ");
        Ecran.affiche(produit); // Affiche 1/6

        Fraction quotient = f11.quotient(f12);
        System.out.print("----------QUOTIENT de F11 et F12 : ");
        Ecran.affiche(quotient); // Affiche 3/2

        Fraction puissance = f11.puissance(2);
        System.out.print("----------PUISSANCE DE F11 au CARRE : ");
        Ecran.affiche(puissance); // Affiche 1/4
    }
}
