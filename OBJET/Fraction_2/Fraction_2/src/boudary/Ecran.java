package boudary;

import models.Fraction_2;
import java.util.LinkedList;

public class Ecran {

    // Affiche une fraction
    public static void afficherFraction(Fraction_2 _uneFraction) {
        if (_uneFraction.getDenominateur() == 1) {
            System.out.println(_uneFraction.getNumerateur());
            System.out.println("(Fraction entière)");
        } else {
            System.out.println("Fraction: " + _uneFraction);
        }
    }

    // Affiche une liste de fractions
    public static void afficherListeFractions(LinkedList<Fraction_2> listeFractions) {
        int compteur = 1;
        for (Fraction_2 uneFraction : listeFractions) {
            System.out.println("Fraction numéro " + compteur + " : " + uneFraction);
            compteur++;
        }
    }
}
