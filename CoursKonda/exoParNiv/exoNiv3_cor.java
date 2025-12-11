 package   exoParNiv;
 import java.util.Scanner;   

public class exoNiv3_cor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double solde = 2000.0;
        final double decouvertMax = 500.0;

        boolean continuer = true;

        System.out.println("Bienvenu sur votre compte bancaire, que puis-je faire pour vous :");

        while (continuer) {
            System.out.println("(0)Quitter");
            System.out.println("(1)Retirer de l'argent");
            System.out.println("(2)Consulter votre solde");
            System.out.println("(3)Déposer de l'argent");

            int choix = scanner.nextInt();

            switch (choix) {
                case 0:
                    continuer = false;
                    System.out.println("Merci de votre visite, au revoir :) !");
                    break;
                case 1:
                    System.out.println("Combien voulez-vous retirer ?:");
                    double montantRetrait = scanner.nextDouble();
                    if (montantRetrait % 10 == 0 && (solde - montantRetrait >= -decouvertMax)) {
                        solde -= montantRetrait;
                        System.out.printf("Opération acceptée : %.2f€ ont été retiré,%n", montantRetrait);
                    } else {
                        System.out.println("Désolé, retrait impossible.");
                    }
                    break;
                case 2:
                    System.out.printf("Vous avez actuellement %.2f€ sur votre solde%n", solde);
                    break;
                case 3:
                    System.out.println("Combien voulez-vous déposer ?:");
                    double montantDepot = scanner.nextDouble();
                    if (montantDepot >= 5 && montantDepot % 5 == 0) {
                        solde += montantDepot;
                        System.out.printf("Opération acceptée : %.2f€ ont été déposé,%n", montantDepot);
                    } else {
                        System.out.println("Désolé vous ne pouvez déposer que des billets");
                    }
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }

        scanner.close();
    }


}
      


