import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;

        System.out.println(
                Couleurs.GRAS + Couleurs.CYAN + "\n<<<<<<<<<<<< MENU PRINCIPAL >>>>>>>>>>>>>>" + Couleurs.RESET);

        do {
            System.out.println(Couleurs.MAGENTA + "\n1. Création de Classes et d'Objets (Personne)" + Couleurs.RESET);
            System.out.println(Couleurs.MAGENTA + "2. Constructeurs et Méthodes (Voiture)" + Couleurs.RESET);
            System.out.println(Couleurs.MAGENTA + "3. Héritage avec Couleur (Animal/Chien)" + Couleurs.RESET);
            System.out.println(Couleurs.MAGENTA + "4. Classes Abstraites (Forme/Carré)" + Couleurs.RESET);
            System.out.println(Couleurs.MAGENTA + "5. Polymorphisme et Collections" + Couleurs.RESET);
            System.out.println(Couleurs.MAGENTA + "6. Gestion des Exceptions" + Couleurs.RESET);
            System.out.println(Couleurs.MAGENTA + "0. Quitter" + Couleurs.RESET);
            System.out.print(Couleurs.JAUNE + "\nVotre choix: " + Couleurs.RESET);

            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    new MainExercice1().main(null);
                    break;
                case 2:
                    new MainExercice2().main(null);
                    break;
                case 3:
                    new MainExercice3().main(null);
                    break;
                case 4:
                    new MainExercice4().main(null);
                    break;
                case 5:
                    new MainExercice5().main(null);
                    break;
                case 6:
                    new MainExercice6().main(null);
                    break;
                case 0:
                    System.out.println(Couleurs.VERT + "\nAu revoir!" + Couleurs.RESET);
                    break;
                default:
                    System.out.println(Couleurs.ROUGE + "Choix invalide." + Couleurs.RESET);
            }
        } while (choix != 0);

        scanner.close();
    }
}