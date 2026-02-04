package OBJET.Ccp;

public class CCPcor_APP {
    // Attributs
    private String nomProprio;
    private double solde;
    private double decouvertAutorise;
    private double tauxInteret; // Convention camelCase

    /**
     * Constructeur avec paramètres
     *
     * @param _nomProprio       Nom du propriétaire du compte
     * @param _solde            Solde initial du compte
     * @param _decouvertAutorise Découvert autorisé
     * @param _taux             Taux d'intérêt annuel (ex: 0.05 pour 5%)
     */
    public CCPcor_APP(String _nomProprio, double _solde, double _decouvertAutorise, double _taux) {
        this.nomProprio = _nomProprio;
        this.solde = _solde;
        this.decouvertAutorise = _decouvertAutorise;
        this.setTauxInteret(_taux); // Utilisation du setter pour vérifier la validité du taux
    }

    // Constructeur par défaut
    public CCPcor_APP() {
        this.nomProprio = "";
        this.solde = 0.0;
        this.decouvertAutorise = 0.0;
        this.tauxInteret = 0.0;
    }

    // Getter pour tauxInteret
    public double getTauxInteret() {
        return tauxInteret;
    }

    // Setter pour tauxInteret avec vérification
    public void setTauxInteret(double _taux) {
        if (_taux < 0) {
            throw new IllegalArgumentException("Le taux d'intérêt ne peut pas être négatif.");
        }
        this.tauxInteret = _taux;
    }

    // Getter pour nomProprio
    public String getNomProprio() {
        return nomProprio;
    }

    // Getter pour solde
    public double getSolde() {
        return solde;
    }

    // Getter pour decouvertAutorise
    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    // Redéfinition de toString()
    @Override
    public String toString() {
        return String.format(
            "Propriétaire: %s, Solde: %.2f, Découvert autorisé: %.2f, Taux d'intérêt: %.2f%%",
            nomProprio, solde, decouvertAutorise, tauxInteret * 100
        );
    }

    /**
     * Calcule les intérêts annuels en fonction des soldes bimensuels
     *
     * @param tab24 Tableau de 24 soldes bimensuels
     * @return Montant total des intérêts annuels
     * @throws IllegalArgumentException Si le tableau n'a pas 24 éléments
     */
    public double calculInteretAnnuel(double[] tab24) {
        if (tab24 == null || tab24.length != 24) {
            throw new IllegalArgumentException("Le tableau doit contenir exactement 24 soldes bimensuels.");
        }

        double sommeInteret = 0.0;
        for (double solde : tab24) {
            sommeInteret += (solde * tauxInteret) / 24.0;
        }
        return sommeInteret;
    }
}
