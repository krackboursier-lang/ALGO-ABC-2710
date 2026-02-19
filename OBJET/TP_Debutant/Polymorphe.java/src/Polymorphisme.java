import java.util.ArrayList;

class MainExercice5 {
    public static void main(String[] args) {
        System.out.println(Couleurs.CYAN + Couleurs.GRAS + "\n<<<<<<<<<<<<< EXERCICE 5: Polymorphisme >>>>>>>>>>>>>>"
                + Couleurs.RESET);

        ArrayList<Animal> animaux = new ArrayList<>();
        animaux.add(new Chien("Rex", 3, "Marron"));
        animaux.add(new Chien("Max", 5, "Noir"));
        animaux.add(new Chien("Bella", 2, "Blanc"));

        for (Animal animal : animaux) {
            animal.afficherInfos();
            animal.faireDuBruit();
            System.out.println(); // Saut de ligne
        }
    }
}
