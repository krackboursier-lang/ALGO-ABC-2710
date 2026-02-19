// Classe Chien qui hérite de Animal
class Chien extends Animal {
    public Chien(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Woof! Woof!");
    }
}
