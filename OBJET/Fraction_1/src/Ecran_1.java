public class Ecran_1 {
    public static void affiche(Fraction_1 f) {

        if (f.getDenominateur() == 1) {

            System.out.println("fraction entière:" + f.getNumerateur());
        } else {

            System.out.println("fraction:" + f);
        }

    }

}
