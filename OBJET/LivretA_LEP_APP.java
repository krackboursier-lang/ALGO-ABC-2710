package OBJET;

public class LivretA_LEP_APP {

    public static void main(String[] args) {
        // Création d'un Livret A avec un taux de 1.5%
        LivretA_LEP livretA = new LivretA_LEP(1.5);
        livretA.crédit(78000.0);
        livretA.calculerIntérêts();
        System.out.println(
                "Solde après intérêts pour le Livret A : " + String.format("%.2f", livretA.getSolde()) + " Euros ");

        // Création d'un LEP avec un taux de 2.5%
        LivretA_LEP livretLep = new LivretA_LEP(2.5);
        livretLep.crédit(12000.0);
        livretLep.calculerIntérêts();
        System.out.println(
                "Solde après intérêts pour le LEP : " + String.format("%.2f", livretLep.getSolde()) + " Euros ");

    }
}