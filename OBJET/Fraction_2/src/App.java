import java.util.LinkedList;
import boudary.Ecran; 
import models.Fraction_2;

public class App {
    public static void main(String[] args) {
        // Crée des fractions
        Fraction_2 f = new Fraction_2();
        Fraction_2 f1 = new Fraction_2(9);
        Fraction_2 f2 = new Fraction_2(12, 7);
        Fraction_2 f3 = new Fraction_2(120, 150);

        // Crée une liste de fractions
        LinkedList<Fraction_2> maLinkedList = new LinkedList<>();
        maLinkedList.add(f);
        maLinkedList.add(f1);
        maLinkedList.add(f2);
        maLinkedList.add(f3);

        // Affiche la liste de fractions
        Ecran.afficherListeFractions(maLinkedList);
    }
}
