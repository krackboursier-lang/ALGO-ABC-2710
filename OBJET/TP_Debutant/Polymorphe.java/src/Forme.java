abstract class Forme {
    public abstract double calculerAire();
}

class Carre extends Forme {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }

    @Override
    public double calculerAire() {
        return cote * cote;
    }
}

class MainExercice4 {
    public static void main(String[] args) {
        System.out.println(
                Couleurs.CYAN + Couleurs.GRAS + "\n<<<<<<<<<<<< EXERCICE 4: Formes >>>>>>>>>>>>" + Couleurs.RESET);
        Carre monCarre = new Carre(4);
        System.out
                .println(Couleurs.BLEU + "Aire du carré: " + Couleurs.GRAS + monCarre.calculerAire() + Couleurs.RESET);
    }
}
