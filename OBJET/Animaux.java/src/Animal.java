// Classe de base Animal
class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void faireDuBruit() {
        System.out.println("L'animal fait un bruit générique.");
    }
}