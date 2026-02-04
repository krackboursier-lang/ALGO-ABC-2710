package OBJET.Livret_A;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LivretA_LEP {
    private double taux;
    private List<Double> soldesQuinzaine;
    private double solde;

    // Constructeur
    public LivretA_LEP(double taux) {
        this.taux = taux;
        this.soldesQuinzaine = new ArrayList<>();
        this.solde = 0.0;
    }

    // Méthode pour créditer le compte
    public void crédit(double montant) {
        if (montant > 0) {
            this.solde += montant;
        } else {
            System.out.println("Salah, le montant à créditer doit être positif !");
        }
    }

    // Méthode pour débiter le compte
    public void débit(double montant) {
        if (montant > 0 && this.solde >= montant) {
            this.solde -= montant;
        } else {
            System.out.println("Salah, montant invalide ou solde insuffisant !");
        }
    }

    // Méthode pour calculer les intérêts
    public void calculerIntérêts() {
        LocalDate aujourdHui = LocalDate.now();
        int annéeEnCours = aujourdHui.getYear();
        LocalDate débutAnnée = LocalDate.of(annéeEnCours, 1, 1);
        LocalDate finAnnée = LocalDate.of(annéeEnCours, 12, 31);

        // Réinitialisation de la liste des soldes
        soldesQuinzaine.clear();

        // Simulation des soldes pour chaque quinzaine
        LocalDate date = débutAnnée;
        while (!date.isAfter(finAnnée)) {
            soldesQuinzaine.add(this.solde);
            date = date.plusDays(15);
        }

        // Calcul des intérêts
        double totalIntérêts = 0;
        for (double soldeQuinzaine : soldesQuinzaine) {
            totalIntérêts += soldeQuinzaine * (taux / 100) / 24;
        }

        // Ajout des intérêts au solde
        crédit(totalIntérêts);
    }

    // Getter pour le solde
    public double getSolde() {
        return solde;
    }

    // Getter et Setter pour le taux
    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
