import java.util.Scanner;

public class App {
    // Constante pour la couleur bleue en gras (ANSI escape code)
    public static final String BLUE_BOLD = "\033[1;34m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialisation de la banque
        BanqueList maBanque = new BanqueList("LCL");
        maBanque.init();

        // Affichage des comptes
        System.out.println(BLUE_BOLD +
            "============================================== AFFICHER LES COMPTES ====================================================" +
            RESET);
        maBanque.afficherComptes();

        // Ajout d'un nouveau compte
        maBanque.ajouterNouveauCompte("GLYNN", 4000, -2000);

        // Affichage des comptes après ajout
        System.out.println(BLUE_BOLD +
            "============================================== AFFICHER LES COMPTES (APRÈS AJOUT) ==========================================" +
            RESET);
        maBanque.afficherComptes();

        // Recherche du compte avec le solde maximum
        System.out.println(BLUE_BOLD +
            "============================================== COMPTE AVEC LE SOLDE MAXIMUM ==============================================" +
            RESET);
        System.out.println("Compte avec le solde maximum : " + maBanque.rechercheCompteMax());

        // Recherche d'un compte par numéro
        System.out.println(BLUE_BOLD +
            "============================================== RECHERCHE D'UN COMPTE PAR NUMÉRO ==============================================" +
            RESET);
        System.out.print("Veuillez saisir un numéro de compte : ");
        int numCompte = sc.nextInt();
        int[] position = {0};

        if (maBanque.rechercherCompte(numCompte, position) != null) {
            System.out.println("Le compte recherché : " + maBanque.rechercherCompte(numCompte, position) +
                               "\nSe trouve à la position : " + position[0] + " dans la liste des comptes.");
        } else {
            System.out.println("Le compte est introuvable !");
        }

        // Test de la méthode de virement
        System.out.println(BLUE_BOLD +
            "============================================== TEST DE LA MÉTHODE DE VIREMENT ==============================================" +
            RESET);

        System.out.print("Veuillez saisir le numéro de compte à débiter : ");
        int numCompteDebit = sc.nextInt();

        System.out.print("Veuillez saisir le numéro de compte à créditer : ");
        int numCompteCredit = sc.nextInt();

        System.out.print("Veuillez saisir le montant du virement : ");
        int montant = sc.nextInt();

        if (maBanque.transferer(numCompteDebit, numCompteCredit, montant)) {
            System.out.println("Le virement a été autorisé.");
        } else {
            System.out.println("Virement non autorisé.");
        }

        // Affichage final des comptes
        System.out.println(BLUE_BOLD +
            "============================================== AFFICHER LES COMPTES (APRÈS VIREMENT) ==========================================" +
            RESET);
        maBanque.afficherComptes();

        sc.close();
    }
}
