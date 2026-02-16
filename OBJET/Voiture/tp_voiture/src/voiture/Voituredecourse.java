package voiture;

public class Voituredecourse extends Voiture {
    public Voituredecourse() {
        this.marque = "";
        this.poids = 0;
    }

    public Voituredecourse(String marque, int poids, Moteur vitesse) {
        this.marque = marque;
        this.poids = poids;
        this.le_moteur = vitesse;
    }

    @Override
    public String toString() {

        return "Voiture [marque=" + marque + ", poids=" + poids + ", vitesseMax="
                + le_moteur.getVitesseMax() + " KM/H ] ";
    }

    public double VitesseMaxVoiture() {
        double vitesseMax = this.le_moteur.getvitesseMax() - (this.poids * 0.05);
        return vitesseMax;

    }

}
