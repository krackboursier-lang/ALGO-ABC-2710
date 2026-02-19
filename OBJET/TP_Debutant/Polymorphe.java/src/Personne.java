class Personne {
    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void sePresenter() {
        System.out.println(Couleurs.BLEU + "Je m'appelle " + Couleurs.GRAS + nom +
                Couleurs.RESET + Couleurs.BLEU + " et j'ai " +
                Couleurs.GRAS + age + " ans" + Couleurs.RESET);
    }
}

class MainExercice1 {
    public static void main(String[] args) {
        System.out.println(Couleurs.CYAN + Couleurs.GRAS + "\n<<<<<<<<<<<< EXERCICE 1: Personnes >>>>>>>>>>>>>>>"
                + Couleurs.RESET);
        Personne p1 = new Personne("Alice", 25);
        Personne p2 = new Personne("Bob", 30);
        p1.sePresenter();
        p2.sePresenter();
    }
}