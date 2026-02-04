package OBJET.Compepargnecor.src;

class Banque {
    private Compte[] lesComptes;
    private int nbComptes;

    public Banque() {
        lesComptes = new Compte[20];
        nbComptes = 0;
    }

    public void init() {
        Compte c1 = new Compte("MATT", 1000, -500);
        Compte c2 = new Compte("STEVE", 2000, -1000);
        Compte c3 = new Compte("SALAH", 1500, -1500);
        Compte c4 = new Compte("JIMMY", 1200, -500);
        Compte c5 = new Compte("BRAD", -200, -500);
        Compte c6 = new Compte("STALONE", 750, -2000);
        this.ajouteCompte(c1);
        this.ajouteCompte(c2);
        this.ajouteCompte(c3);
        this.ajouteCompte(c4);
        this.ajouteCompte(c5);
        this.ajouteCompte(c6);
    }

    private void ajouteCompte(Compte unCompte) {
        lesComptes[nbComptes++] = unCompte;
    }

    public void afficherComptes() {
        for (int i = 0; i < nbComptes; i++) {
            System.out.println(lesComptes[i]);
        }
    }

    public void ajouteCompte(int n, String nom, double solde, double dec) {
        Compte c = new Compte(nom, solde, dec);
        this.ajouteCompte(c);
    }

    public Compte compteSup() {
        if (nbComptes == 0)
            return null;
        Compte max = lesComptes[0];
        for (int i = 1; i < nbComptes; i++) {
            if (lesComptes[i].superieur(max)) {
                max = lesComptes[i];
            }
        }
        return max;
    }

    public boolean transferer(int i, int j, int k) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("TRANSFERER");
    }

    public Compte ajouteCompte(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("AJOUTER COMPTE PAR NUMERO");
    }
}