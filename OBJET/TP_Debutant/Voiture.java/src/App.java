// Classe Main pour tester la classe Voiture
public class App {
    public static void main(String[] args) {
        // Création de deux objets Voiture
        Voiture voiture1 = new Voiture("Peugeot", "308", 2020);
        Voiture voiture2 = new Voiture("Renault", "Clio", 2018);

        // Affichage des détails de chaque voiture
        System.out.print("Voiture 1 : ");
        voiture1.afficherDetails();

        System.out.print("Voiture 2 : ");
        voiture2.afficherDetails();
    }
}
