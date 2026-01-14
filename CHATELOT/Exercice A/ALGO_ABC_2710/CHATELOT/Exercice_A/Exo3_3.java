package ALGO_ABC_2710.CHATELOT.Exercice_A;
public class Exo3_3 {

    // Méthode pour rechercher un nombre dans un tableau trié
    public static int rechercher(int[] tableau, int cible) {
        int debut = 0;
        int fin = tableau.length - 1;

        while (debut <= fin) {
            int milieu = debut + (fin - debut) / 2; // Évite l'overflow

            if (tableau[milieu] == cible) {
                return milieu; // Retourne l'indice si trouvé
            } else if (tableau[milieu] < cible) {
                debut = milieu + 1; // Recherche dans la moitié droite
            } else {
                fin = milieu - 1; // Recherche dans la moitié gauche
            }
        }
        return -1; // Retourne -1 si non trouvé
    }

    // Méthode principale pour tester
    public static void main(String[] args) {
        int[] tableau = {5, 12, 18, 25, 30, 42, 55, 60, 78, 81};
        int[] tests = {42, 99, 5, 18, 100};

        for (int n : tests) {
            int indice = rechercher(tableau, n);
            System.out.println("Recherche " + n + ": " +
                (indice != -1 ? "indice " + indice : "404 Not found"));
        }
    }
}
