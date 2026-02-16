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
}

