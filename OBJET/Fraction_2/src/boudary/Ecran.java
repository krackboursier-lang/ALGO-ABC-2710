package boudary;

import models.Fraction_2;
import java.util.LinkedList;

public class Ecran {
    // Codes couleurs
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";

    // Affiche une fraction
    public static void afficherFraction(Fraction_2 _uneFraction) {
        if (_uneFraction.getDenominateur() == 1) {
            System.out.println(_uneFraction.getNumerateur());
            System.out.println("(Fraction entière)");
        } else {
            System.out.println("Fraction: " + _uneFraction);
        }
    }

    // Affiche une liste de fractions avec des couleurs
    public static void afficherListeFractions(LinkedList<Fraction_2> listeFractions) {
        int compteur = 1;
        for (Fraction_2 uneFraction : listeFractions) {
            String couleur;
            switch (compteur) {
                case 1:
                    couleur = ANSI_RED;
                    break;
                case 2:
                    couleur = ANSI_GREEN;
                    break;
                case 3:
                    couleur = ANSI_YELLOW;
                    break;
                case 4:
                    couleur = ANSI_BLUE;
                    break;
                default:
                    couleur = ANSI_RESET;
            }
            System.out.println(couleur + "Fraction numéro " + compteur + " : " +  ANSI_RESET);
                afficherFraction(uneFraction);
            compteur++;
        }
    }
}
