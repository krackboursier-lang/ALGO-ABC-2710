package OBJET;

public class CCPAPP {
        public static void main(String[] args) {
                // Création des comptes
                CCP compte1 = new CCP("Salah", 1001, 5000.0, 2000.0);
                CCP compte2 = new CCP("Jimmy", 1002, 30000.0, 1500.0);

                // Affichage des noms des clients
                System.out.println("Client 1 : " + compte1.getNomClient());
                System.out.println("Client 2 : " + compte2.getNomClient());

                // Créditer le compte de Salah
                // compte1.crediter(200.0);
                // System.out.printf("Nouveau solde de %s après crédit : %.2f%n",
                // compte1.getNomClient(), compte1.getSolde());

                // // Débiter le compte de Jimmy
                // boolean debitResult = compte2.debiter(1400.0);
                // if (debitResult) {
                // System.out.printf("Débit réussi pour %s. Nouveau solde : %.2f%n",
                // compte2.getNomClient(), compte2.getSolde());
                // } else {
                // System.out.printf("Débit échoué pour %s : découvert autorisé dépassé.%n",
                // compte2.getNomClient());
                // }

                compte1.transfert(compte2, 2000.00);
                compte1.transfert(compte2, 1000.0);
                System.out.printf("Après transfert, solde de %s : %.2f%n", compte1.getNomClient(), compte1.getSolde());
                System.out.println("Après transfert, solde de " + compte2.getNomClient() + " : " + compte2.getSolde());

                // System.out.printf("Après transfert, solde de %s : %.2f%n",
                // compte1.getNomClient(), compte1.getSolde());
                System.out.println(compte1.toString());
                System.out.println(compte2);

                System.out.println("Après transfert, solde de " + compte2.getNomClient() + " : " + compte2.getSolde());

                compte2.transfert(compte1, 3000.00);

                System.out.printf("Après transfert, solde de %s : %.2f%n",
                                compte1.getNomClient(), compte2.getSolde());

                System.out.println("Après transfert, solde de " + compte2.getNomClient() + " : " + compte2.getSolde());

        }

}
