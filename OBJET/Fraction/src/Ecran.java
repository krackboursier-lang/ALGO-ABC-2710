public class Ecran {
    // Méthode pour afficher une fraction en cyan
    public static void affiche(Fraction f) {
        String reset = "\u001B[0m";
        String cyan = "\u001B[36m";
        System.out.println(cyan + f.getNumerateur() + "/" + f.getDenominateur() + reset);
    }

    // Méthode pour afficher un message avec une couleur spécifique
    public static void afficheMessage(String message, String couleur) {
        String reset = "\u001B[0m";
        System.out.println(couleur + message + reset);
    }
}
