class Voiture {
    private String marque;
    private String modele;
    private int annee;

    public Voiture(String marque, String modele, int annee) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
    }

    public void afficherDetails() {
        System.out.println(Couleurs.VERT + "Voiture: " + Couleurs.GRAS + marque +
                Couleurs.RESET + " " + Couleurs.VERT + modele +
                Couleurs.RESET + " (" + Couleurs.GRAS + annee + Couleurs.RESET + ")");
    }
}

class MainExercice2 {
    public static void main(String[] args) {
        System.out.println(
                Couleurs.CYAN + Couleurs.GRAS + "\n<<<<<<<<<<<<< EXERCICE 2: Voitures >>>>>>>>>>>>>>" + Couleurs.RESET);
        Voiture v1 = new Voiture("Toyota", "Corolla", 2020);
        Voiture v2 = new Voiture("Renault", "Clio", 2018);
        v1.afficherDetails();
        v2.afficherDetails();
    }
}
