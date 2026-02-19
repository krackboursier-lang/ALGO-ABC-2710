class Animal {
    protected String nom;
    protected int age;
    protected String couleur;

    public Animal(String nom, int age, String couleur) {
        this.nom = nom;
        this.age = age;
        this.couleur = couleur;
    }

    public void faireDuBruit() {
        System.out.println(Couleurs.JAUNE + "L'animal fait un bruit générique." + Couleurs.RESET);
    }

    public void afficherInfos() {
        System.out.println(Couleurs.MAGENTA + "Nom: " + Couleurs.GRAS + nom +
                Couleurs.RESET + Couleurs.MAGENTA + ", Âge: " +
                Couleurs.GRAS + age + Couleurs.RESET +
                Couleurs.MAGENTA + ", Couleur: " + Couleurs.GRAS + couleur + Couleurs.RESET);
    }
}

class Chien extends Animal {
    public Chien(String nom, int age, String couleur) {
        super(nom, age, couleur);
    }

    @Override
    public void faireDuBruit() {
        System.out.println(Couleurs.ROUGE + Couleurs.GRAS + "Woof! Woof!" + Couleurs.RESET);
    }
}

class MainExercice3 {
    public static void main(String[] args) {
        System.out.println(Couleurs.CYAN + Couleurs.GRAS + "\n=== EXERCICE 3: Animaux ===" + Couleurs.RESET);
        Chien monChien = new Chien("Rex", 3, "Marron");
        monChien.afficherInfos();
        monChien.faireDuBruit();
    }
}