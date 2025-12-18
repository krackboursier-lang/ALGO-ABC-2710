import java.util.Arrays;

public class Exo3_3 {
    
    public static int rechercher(int[] t, int cible) {
        int d = 0, f = t.length - 1;
        while (d <= f) {
            int m = d + (f - d) / 2;
            if (t[m] == cible) return m;
            if (t[m] < cible) d = m + 1;
            else f = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] tab = {5, 12, 18, 25, 30, 42, 55, 60, 78, 81};
        int[] tests = {42, 99};
        
        for (int n : tests) {
            int idx = rechercher(tab, n);
            System.out.println("Recherche " + n + ": " + 
                (idx != -1 ? "indice " + idx : "404 Not found"));
        }
    }
}