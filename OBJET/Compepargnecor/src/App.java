import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Banque mesComptes = new Banque(" CREDIT MARSEILLAIS");
        mesComptes.init();

        Scanner clavier = new Scanner(System.in);

        Compte monCompte = new Compte(" DOLPH LUNGREN ", 5000, -200);
        Compte monCompte1 = new Compte(" VAN DAMME", 50000, -500);
        mesComptes.ajouterCompte(monCompte);
        mesComptes.ajouterCompte(monCompte1);

        mesComptes.ajouterNouveauCompte(" CLOONEY", 26000, -300);
        System.out.println("COMPTES DANS LA BANQUE :");
        mesComptes.afficherComptes();

        Compte soldeEleve = mesComptes.rechercherCompteSup();
        System.out.println("COMPTE AVEC LE SOLDE LE PLUS ÉLEVÉ:");
        System.out.println(soldeEleve);

        System.out.println("ENTREZ LE NUMÉRO DE COMPTE À RECHERCHER:");
        int numRech = clavier.nextInt();
        System.out.println(mesComptes.rendCompte(numRech));

        System.out.println("INDIQUER LE COMPTE SOURCE À DÉBITER POUR TRANSFERT:");
        int source = clavier.nextInt();
        System.out.println("INDIQUER LE COMPTE DESTINATAIRE POUR TRANSFERT:");
        int destination = clavier.nextInt();
        System.out.println("INDIQUER LE MONTANT DU TRANSFERT EN EUROS:");
        double montantTransf = clavier.nextDouble();
        mesComptes.transferer(source, destination, montantTransf);

        System.out.println("ÉTAT DES COMPTES APRES TRANSFERT:");
        System.out.println(mesComptes.rendCompte(source) + "\n" + mesComptes.rendCompte(destination));

        clavier.close();
    }
}
