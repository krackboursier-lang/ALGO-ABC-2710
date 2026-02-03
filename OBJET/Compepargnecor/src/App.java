public class App {
    public static void main(String[] args) {
        Banque b = new Banque();
        b.init();
        System.out.println("Comptes initiaux :");
        b.afficherComptes();

        b.ajouteCompte(1245, "dutronc", 4500, -500);
        System.out.println("\nComptes après ajout :");
        b.afficherComptes();

        Compte c = b.compteSup();
        System.out.println("\nCompte au solde maximum :");
        System.out.println(c);

        Compte cTrouve = b.ajouteCompte(1245);
        if (cTrouve != null) {
            System.out.println("\nCompte trouvé :");
            System.out.println(cTrouve);
        }

        System.out.println("\nTest de transfert 1 :");
        if (b.transferer(1245, 2568, 1000)) {
            System.out.println("Transfert effectué");
        } else {
            System.out.println("Transfert impossible");
        }

        System.out.println("\nTest de transfert 2 :");
        if (b.transferer(11633, 32345, 2000)) {
            System.out.println("Transfert effectué");
        } else {
            System.out.println("Transfert impossible");
        }
    }
}
