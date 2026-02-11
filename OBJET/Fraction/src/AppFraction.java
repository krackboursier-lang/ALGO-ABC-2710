public class AppFraction {
    public static void main(String[] args) {
        // Définition des couleurs
        String reset = "\u001B[0m";
        String jaune = "\u001B[33m";
        String bleu = "\u001B[44m";
        String vert = "\u001B[32m";
        String rouge = "\u001B[31m";
        String cyan = "\u001B[36m";
        String gras = "\u001B[1m";

        // Titre principal
        Ecran.afficheMessage(gras + jaune + "=== TESTS DE LA CLASSE FRACTION ==================================" + reset, jaune);

        // Tests pour les constructeurs
        Ecran.afficheMessage(
                "\n" + gras + bleu + "========================TEST DES CONSTRUCTEURS=================================================" + reset,
                bleu);
        Fraction f1 = new Fraction(12, 7);
        Fraction f2 = new Fraction();
        Fraction f3 = new Fraction(9);

        System.out.print(jaune + "F1 : " + reset);
        Ecran.affiche(f1); // Affiche 12/7 en cyan
        System.out.print(jaune + "F2 : " + reset);
        Ecran.affiche(f2); // Affiche 0/1 en cyan
        System.out.print(jaune + "F3 : " + reset);
        Ecran.affiche(f3); // Affiche 9/1 en cyan

        // Tests pour Opposé et Inverse
        Ecran.afficheMessage(
                "\n" + gras + bleu + "========================TESTS POUR OPPOSÉ ET INVERSE=============================================" + reset, bleu);
        Fraction f4 = new Fraction(4, 7);
        System.out.print(jaune + "F4 AVANT OPPOSÉ : " + reset);
        Ecran.affiche(f4); // Affiche 4/7 en cyan
        f4.oppose();
        System.out.print(jaune + "F4 APRES OPPOSÉ : " + reset);
        Ecran.affiche(f4); // Affiche -4/7 en cyan
        f4.inverse();
        System.out.print(jaune + "F4 APRES INVERSE : " + reset);
        Ecran.affiche(f4); // Affiche -7/4 en cyan

        // Tests pour les opérateurs relationnels
        Ecran.afficheMessage("\n" + gras + bleu
                + "========================TESTS POUR LES OPÉRATEURS RELATIONNELS==============================================" + reset, bleu);
        Fraction f5 = new Fraction(11, 7);
        Fraction f6 = new Fraction(5, 4);
        System.out.println(jaune + "F5 > F6 : " + reset + (f5.superieur(f6) ? vert + "VRAI" : rouge + "FAUX") + reset);
        System.out.println(jaune + "F5 < F6 : " + reset + (f5.inferieur(f6) ? vert + "VRAI" : rouge + "FAUX") + reset);

        // Tests pour l'égalité
        Ecran.afficheMessage("\n" + gras + bleu + "========================TESTS POUR L'ÉGALITÉ=======================================" + reset,
                bleu);
        Fraction f7 = new Fraction(11, 7);
        Fraction f8 = new Fraction(22, 14);
        System.out.println(jaune + "F7 == F8 : " + reset + (f7.egal(f8) ? vert + "VRAI" : rouge + "FAUX") + reset);

        // Test pour la réduction et le signe
        Ecran.afficheMessage("\n" + gras + bleu
                + "========================TEST POUR LA RÉDUCTION ET LE SIGNE==============================================" + reset, bleu);
        Fraction f9 = new Fraction(120, -150);
        System.out.print(jaune + "F9 : " + reset);
        Ecran.affiche(f9); // Affiche -4/5 en cyan

        // Test pour le PGCD
        Ecran.afficheMessage("\n" + gras + bleu + "=========================TEST POUR LE PGCD==============================================" + reset,
                bleu);
        Fraction f10 = new Fraction(-75, 90);
      //  System.out.println(jaune + "PGCD de -75 et 90 : " + bleu + f10.getPgcd() + reset);

        // Tests pour les opérations arithmétiques
        Ecran.afficheMessage("\n" + gras + bleu
                + "========================TESTS POUR LES OPÉRATIONS ARITHMÉTIQUES==============================================" + reset, bleu);
        Fraction f11 = new Fraction(1, 2);
        Fraction f12 = new Fraction(1, 3);
        Fraction somme = f11.somme(f12);
        System.out.print(jaune + "---------------------SOMME DE F11 et F12 : " + reset);
        Ecran.affiche(somme); // Affiche 5/6 en cyan

        Fraction difference = f11.difference(f12);
        System.out.print(jaune + "---------------------DIFFÉRENCE DE F11 et F12 : " + reset);
        Ecran.affiche(difference); // Affiche 1/6 en cyan

        Fraction produit = f11.produit(f12);
        System.out.print(jaune + "---------------------PRODUIT DE F11 et F12 : " + reset);
        Ecran.affiche(produit); // Affiche 1/6 en cyan

        Fraction quotient = f11.quotient(f12);
        System.out.print(jaune + "---------------------QUOTIENT DE F11 et F12 : " + reset);
        Ecran.affiche(quotient); // Affiche 3/2 en cyan

        Fraction puissance = f11.puissance(2);
        System.out.print(jaune + "---------------------PUISSANCE DE F11 au carré : " + reset);
        Ecran.affiche(puissance); // Affiche 1/4 en cyan
    }
}
