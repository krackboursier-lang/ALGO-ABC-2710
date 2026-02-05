import java.util.Scanner;

public class Banque {
    private Compte[] lesComptes;
    private int nbCompte;
    private String nomBanque;

    public Banque(String _nomBanque) {
        this.lesComptes = new Compte[20];
        this.nbCompte = 0;
        this.nomBanque = _nomBanque;
    }

    public void ajouterCompte(Compte _unCompte) {
        if (nbCompte < lesComptes.length) {
            lesComptes[nbCompte++] = _unCompte;
        } else {
            System.out.println("CAPACITÉ MAXIMUM ATTEINTE.");
        }
    }

    public void init() {
        Compte c1 = new Compte("SALAH", 1000.0, -125);
        Compte c2 = new Compte("JIMMY", 2000.0, -100);
        Compte c3 = new Compte("BRADD", 1500.0, -150);
        CompteEpargne c4 = new CompteEpargne("STEVE", 1200, -200, 0.015);
        CompteEpargne c5 = new CompteEpargne("STALO", 5000, -300, 0.015);
        CompteEpargne c6 = new CompteEpargne("KENNY", 2750, -400, 0.015);

        this.ajouterCompte(c1);
        this.ajouterCompte(c2);
        this.ajouterCompte(c3);
        this.ajouterCompte(c4);
        this.ajouterCompte(c5);
        this.ajouterCompte(c6);
    }

    public void afficherComptes() {
        for (int i = 0; i < nbCompte; i++) {
            System.out.println(lesComptes[i]);
        }
    }

    public void ajouterNouveauCompte(String _nom, double _solde, double _decouvertAutorise) {
        Compte unCompte = new Compte(_nom, _solde, _decouvertAutorise);
        this.ajouterCompte(unCompte);
    }

    public Compte rechercherCompteSup() {
        if (nbCompte == 0)
            return null;
        Compte max = lesComptes[0];
        for (int i = 1; i < nbCompte; i++) {
            if (lesComptes[i].getSolde() > max.getSolde()) {
                max = lesComptes[i];
            }
        }
        return max;
    }

    public Compte rendCompte(int _numero) {
        for (int i = 0; i < nbCompte; i++) {
            if (lesComptes[i].getNumero() == _numero) {
                return lesComptes[i];
            }
        }
        return null;
    }

    public boolean transferer(int _numCompteDebit, int _numCompteCredit, double _montant) {
        Compte compteDebit = this.rendCompte(_numCompteDebit);
        Compte compteCredit = this.rendCompte(_numCompteCredit);
        if (compteDebit != null && compteCredit != null) {
            return compteDebit.transferer(_montant, compteCredit);
        }
        return false;
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\n--- MENU DE LA BANQUE " + this.nomBanque + " ---");
            System.out.println("1. AFFICHER TOUS LES COMPTES");
            System.out.println("2. RECHERCHER UN COMPTE PAR NUMÉRO");
            System.out.println("3. EFFECTUER UN TRANSFERT ENTRE COMPTES");
            System.out.println("4. AFFICHER LE COMPTE AVEC LE SOLDE LE PLUS ÉLEVÉ");
            System.out.println("5. QUITTER");
            System.out.print("VOTRE CHOIX : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    afficherComptes();
                    break;
                case 2:
                    System.out.print("ENTRER LE NUMERO DE COMPTE À CHERCHER : ");
                    int numeroRecherche = scanner.nextInt();
                    Compte compteTrouve = rendCompte(numeroRecherche);
                    if (compteTrouve != null) {
                        System.out.println("COMPTE TROUVÉ : " + compteTrouve);
                    } else {
                        System.out.println("COMPTE INTROUVABLE.");
                    }
                    break;
                case 3:
                    System.out.print("ENTREZ LE NUMERO DU COMPTE SOURCE : ");
                    int source = scanner.nextInt();
                    System.out.print("ENTREZ LE NUMERO DU COMPTE DESTINATION : ");
                    int destination = scanner.nextInt();
                    System.out.print("ENTREZ LE MONTANT À TRANSFÉRER : ");
                    double montant = scanner.nextDouble();
                    if (transferer(source, destination, montant)) {
                        System.out.println("TRANSFERT EFFECTUÉ AVEC SUCCÈS.");
                    } else {
                        System.out.println("TRANSFERT IMPOSSIBLE.");
                    }
                    break;
                case 4:
                    Compte compteMax = rechercherCompteSup();

                    if (compteMax != null) {
                        System.out.println("COMPTE AVEC LE SOLDE LE PLUS ÉLEVÉ : " + compteMax);
                    } else {
                        System.out.println("AUCUN COMPTE DISPONIBLE.");
                    }
                    break;
                case 5:
                    System.out.println("AU REVOIR !");
                    break;
                default:
                    System.out.println("CHOIX INVALIDE.");
            }
        } while (choix != 5);
        scanner.close();
    }

    @Override
    public String toString() {
        String resultat = "---------------------------------------------------------------------------------------------------\n";
        resultat += "\t\t\t\tListe des comptes de la banque " + this.nomBanque + " :\n";
        for (int i = 0; i < nbCompte; i++) {
            resultat += lesComptes[i] + "\n";
        }
        resultat += "---------------------------------------------------------------------------------------------------\n";
        return resultat;
    }
}
