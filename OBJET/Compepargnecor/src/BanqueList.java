
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BanqueList {

    private String nomBanque;

    // collection d'objet (tableau dynamique);

    // "linkedList" meilleure pour l'accès en écriture sur un gros volume d'objet.
    // inserez des données en milieu de liste. Accepte les cases null et les
    // doublons
    // List lesComptes2= new LinkedList();

    // ArrayList meilleure pour l'accès en lecture d'un grand nombre d'objet
    // .get(int index)
    ArrayList lesComptes = new ArrayList();
    // Constructeurs

    public BanqueList(String _nomBanque) {

        this.nomBanque = _nomBanque;
    }

    public void init() {
        Compte c1 = new Compte("SALAH", 1000.0, -500);
        Compte c2 = new Compte("JIMMY", 2000.0, -1000);
        Compte c3 = new Compte("BRADD", 1500.0, -1500);
        CompteEpargne c4 = new CompteEpargne("STEVE", 1200.0, 0, 0.015);
        CompteEpargne c5 = new CompteEpargne("STALO", 5000, 0, 0.015);
        CompteEpargne c6 = new CompteEpargne("KENNY", 2750, 0, 0.015);
        lesComptes.add(c1);
        lesComptes.add(c2);
        lesComptes.add(c3);
        lesComptes.add(c4);
        lesComptes.add(c5);
        lesComptes.add(c6);

    }

    public void afficherComptes() {
        for (int i = 0; i < lesComptes.size(); i++) {

            System.out.println(lesComptes.get(i));
        }

    }

    public void ajouterNouveauCompte(String _nomCompte, double _solde, double _da) {
        Compte unCompte = new Compte(_nomCompte, _solde, _da);
        this.lesComptes.add(unCompte);
    }

    public Compte rechercheCompteMax() {

        // lesComptes.sort(null);
        Compte compteMax = (Compte) lesComptes.get(0);

        for (int i = 1; i < lesComptes.size(); i++) {
            if ((compteMax).getSolde() < ((Compte) lesComptes.get(i)).getSolde()) {

                compteMax = (Compte) lesComptes.get(i);

            }

        }
        return compteMax;

    }

    public Compte rechercherCompte(int _numero, int _tabPosition[]) {

        for (Object object : lesComptes) {

            if (_numero == ((Compte) object).getNumero()) {

                _tabPosition[0] = lesComptes.indexOf(object) + 1;

                return (Compte) object;
            }
        }
        return null;
    }

    public Compte rechercherCompte(int _numero) {

        for (Object object : lesComptes) {

            if (_numero == ((Compte) object).getNumero()) {

                return (Compte) object;
            }
        }
        return null;
    }

    public boolean transferer(int _numCompteDebit, int _numCompteCredit, double _montant) {
        Compte Comptedebiteur = this.rechercherCompte(_numCompteDebit);
        Compte CompteCrediteur = this.rechercherCompte(_numCompteCredit);
        if (Comptedebiteur != null && CompteCrediteur != null) {

            return Comptedebiteur.transferer(_montant, CompteCrediteur);
        } else {

            return false;
        }

    }

}
