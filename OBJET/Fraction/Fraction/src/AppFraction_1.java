public class AppFraction_1 {
    public static void main(String[] args) {
        // Tests des constructeurs
        Fraction_1 f1 = new Fraction_1(12, 7);
        Fraction_1 f2 = new Fraction_1();
        Fraction_1 f3 = new Fraction_1(9);

        // Tests d'affichage
        System.out.print("F1: ");
        Ecran_1.affiche(f1); // 12/7
        System.out.print("F2: ");
        Ecran_1.affiche(f2); // 0/1
        System.out.print("F3: ");
        Ecran_1.affiche(f3); // 9/1

        // Tests des méthodes unaires
        f1.oppose();
        System.out.print("F1 après oppose(): ");
        Ecran_1.affiche(f1); // -12/7
        f1.inverse();
        System.out.print("F1 après inverse(): ");
        Ecran_1.affiche(f1); // -7/12

        // Tests des opérateurs relationnels
        Fraction_1 f4 = new Fraction_1(11, 7);
        Fraction_1 f5 = new Fraction_1(5, 4);
        System.out.println("f4 > f5: " + f4.superieur(f5)); // true
        System.out.println("f4 < f5: " + f4.inferieur(f5)); // false

        Fraction_1 f6 = new Fraction_1(11, 7);
        Fraction_1 f7 = new Fraction_1(22, 14);
        System.out.println("f6 == f7: " + f6.egal(f7)); // true

        // Test du PGCD
        Fraction_1 f8 = new Fraction_1(-75, 90);
        System.out.print("f8: ");
        Ecran_1.affiche(f8); // -5/6

        // Test de la réduction
        Fraction_1 f9 = new Fraction_1(120, -150);
        System.out.print("f9: ");
        Ecran_1.affiche(f9); // -4/5

        // Tests des opérations binaires
        Fraction_1 f10 = new Fraction_1(1, 2);
        Fraction_1 f11 = new Fraction_1(1, 3);
        System.out.print("f10 + f11: ");
        Ecran_1.affiche(f10.somme(f11)); // 5/6
        System.out.print("f10 - f11: ");
        Ecran_1.affiche(f10.difference(f11)); // 1/6
        System.out.print("f10 * f11: ");
        Ecran_1.affiche(f10.produit(f11)); // 1/6
        System.out.print("f10 / f11: ");
        Ecran_1.affiche(f10.quotient(f11)); // 3/2
        System.out.print("f10^2: ");
        Ecran_1.affiche(f10.puissance(2)); // 1/4
    }
}
