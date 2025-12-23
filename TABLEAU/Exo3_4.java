//import java.util.Scanner;
//import java.util.Random;


import java.util.*;
public class Exo3_4  {

public static void trierAvecDetails(int[] tableau) {
    int n = tableau.length;
    
    for (int i = 0; i < n - 1; i++) {
        System.out.println("\nÉtape " + (i + 1) + " :");
        System.out.print("Recherche du minimum dans [");
        for (int k = i; k < n; k++) {
            System.out.print(tableau[k] + (k < n - 1 ? ", " : ""));
        }
        System.out.println("]");
        
        int indiceMin = i;
        for (int j = i + 1; j < n; j++) {
            if (tableau[j] < tableau[indiceMin]) {
                indiceMin = j;
            }
        }
        
        System.out.println("Minimum trouvé : " + tableau[indiceMin] + " à l'indice " + indiceMin);
        
        if (indiceMin != i) {
            System.out.println("Permutation de " + tableau[i] + " et " + tableau[indiceMin]);
            int temp = tableau[i];
            tableau[i] = tableau[indiceMin];
            tableau[indiceMin] = temp;
        }
        
        System.out.print("Tableau actuel : ");
        afficherTableau(tableau);
    }
}

 private static void afficherTableau(int[] tableau) {
    
    throw new UnsupportedOperationException("'afficherTableau'");
 }  


}
