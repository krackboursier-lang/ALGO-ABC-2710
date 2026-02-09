import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numCompte;

        BanqueList maBanque = new BanqueList(" LCL");
        maBanque.init();
        maBanque.afficherComptes();
        System.out.println(
                "------------------------------------------------------- AFFICHER UN COMPTE-------------------------------------------------");

        maBanque.ajouterNouveauCompte("GLYNN", 4000, -2000);

        maBanque.afficherComptes();

        System.out.println(
                "------------------------------------------ AFFICHER LES COMPTES DE SOLDE MAXIMUM-------------------------------------------");

        System.out.println(" COMPTE SOLDE MAX :" + maBanque.rechercheCompteMax());

        System.out.println(
                "-------------------------------------------RECHERCHE D UN COMTPE PAR NUMERO------------------------------------------------");
        int[] montab = { 0 };

        System.out.println(
                " ---------------------------------------VEUILLEZ RECHERCHER UN NUMERO DE COMPTE--------------------------------------------");
        numCompte = sc.nextInt();
        if (maBanque.rechercherCompte(numCompte, montab) != null) {
            System.out.println("LE COMPTE RECGERCHRE PAR NUMERO: " + maBanque.rechercherCompte(numCompte, montab)
                    + " \n A LA POISTION: " + montab[0] + " DANS LA LISTE DES COMPTES");

        } else {

            System.out.println(" LE COMPTE EST INEXISTANT !");
        }

        System.out.println("---------- TEST METHODE TRANSFERER-------------------");
        System.out.println("VEUILLEZ RECHERER SAISIR UN NUMERO DE COMPTE À DÉBITER");
        int numComptedebit = sc.nextInt();
        System.out.println("VEUILLEZ RECHERE SAISIR UN NUMERO DE COMPTE À CRÉDITER");
        int numComptecredit = sc.nextInt();

        System.out.println("VEUILLEZ RECHERCHEZ SAISIR LE MONTANT DU VIREMENT :");
        int montant = sc.nextInt();

        if (maBanque.transferer(numComptedebit, numComptecredit, montant) == true) {
            System.out.println("LE VIREMENT A ETE AUTORISÉ ");
        } else {
            System.out.println(" VIREMENT NON AUTORISÉ");
        }

        System.out.println(
                "------------------------------------- AFFICHER LES COMPTES DE LA BANQUE ---------------------------------------------------");
        maBanque.afficherComptes();

        sc.close();

    }
}
