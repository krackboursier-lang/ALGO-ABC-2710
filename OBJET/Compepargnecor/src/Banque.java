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
        lesComptes[nbCompte++] = _unCompte;
    }

    public void init() {
        Compte c1 = new Compte(" SALAH", 1000.0, -500);
        Compte c2 = new Compte(" JIMMY ", 2000.0, -1000);
        Compte c3 = new Compte(" BRAD ", 1500.0, -1500);
        CompteEpargne c4 = new CompteEpargne(" STEVE ", 1200.0, 0, 0.015);
        CompteEpargne c5 = new CompteEpargne(" STALLONE ", 5000, 0, 0.015);
        CompteEpargne c6 = new CompteEpargne(" KENNY ", 2750, 0, 0.015);
        this.ajouterCompte(c1);
        this.ajouterCompte(c2);
        this.ajouterCompte(c3);
        this.ajouterCompte(c4);
        this.ajouterCompte(c5);
        this.ajouterCompte(c6);
    }

    public void afficherComptes() {
        for (int i = 0; i < nbCompte; i++) {
            System.out.println(lesComptes[i].toString());
        }
    }

    public void ajouterNouveauCompte(String _nom, double _solde, double _decouvertAutorise) {
        Compte unCompte = new Compte(_nom, _solde, _decouvertAutorise);
        this.ajouterCompte(unCompte);
    }

    public Compte rechercherCompteSup() {
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
}
