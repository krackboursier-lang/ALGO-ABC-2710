import java.util.LinkedList;

import models.Fraction_2;

public class Ecran {
    public static final String CYAN = null;
    public static final String GREEN = null;
    public static final String YELLOW = null;
    public static final String RED = null;

    // Méthode pour afficher une fraction en cyan
    public static void affiche(Fraction f) {
        String reset = "\u001B[0m";
        String cyan = "\u001B[36m";

        if (f.getDenominateur()==1) {
             System.out.println(cyan + f.getNumerateur() +  reset);
        }
        System.out.println(cyan + f.getNumerateur() + "/" + f.getDenominateur() + reset);
    }

    // Méthode pour afficher un message avec une couleur spécifique
    public static void afficheMessage(String message, String couleur) {
        String reset = "\u001B[0m";
        System.out.println(couleur + message + reset);
    }

    public static void afficherListeFractions(LinkedList<Fraction_2> maLinkedList) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afficherListeFractions'");
    }
}
