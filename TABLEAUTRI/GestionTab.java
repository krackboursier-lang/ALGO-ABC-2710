package TABLEAUTRI;

import java.util.*;

public class GestionTab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Combien de nombre voulez-vous génerer?");

        n = sc.nextInt();
        int[] _tableau = new int[n];
        GestionTab.remplirTableau(_tableau);
        GestionTab.afficherTableau(_tableau);
        System.out.println("Voici le tableau trié ");
        GestionTab.trierTableau(_tableau);
        GestionTab.afficherTableau(_tableau);
        GestionTab.trierTableauBulle(_tableau);
        sc.close();

    }

    public static void trierTableau(int[] _tableau) {
        int encours, pluspetit, temp, j;

        for (encours = 0; encours < _tableau.length - 1; encours++) {
            pluspetit = encours;
            for (j = encours + 1; j < _tableau.length; j++) {
                if (_tableau[j] <= _tableau[pluspetit]) {
                    pluspetit = j;
                }
            }
            temp = _tableau[encours];
            _tableau[encours] = _tableau[pluspetit];
            _tableau[pluspetit] = temp;
        }

    }

    // On dit quele tableau est passé en paramêtre par référence
    public static void remplirTableau(int[] _tableau) {
        Random aleas = new Random();

        for (int i = 0; i < _tableau.length; i++) {

            _tableau[i] = aleas.nextInt(101);

        }

    }

    public static void afficherTableau(int[] _tableau) {
        System.out.print("\n[ ");
        for (int element : _tableau) {
            System.out.print(element + " ");

        }
        System.out.print("]\n");

    }
    public static void afficherTableau(char[] _tableau) {
        System.out.print("\n[ ");
        for (char element : _tableau) {
            System.out.print(element + " ");

        }
        System.out.print("]\n");

    }

    public static void trierTableauBulle(int[] _tableau) {
        int n = _tableau.length;
        int temp;
        boolean permut;

        do {
            permut = false;
            for (int i = 0; i < n - 1; i++) {
                if (_tableau[i] > _tableau[i + 1]) {
                    temp = _tableau[i];
                    _tableau[i] = _tableau[i + 1];
                    _tableau[i + 1] = temp;
                    permut = true;
                }
            }
            n--;
        } while (permut);

        System.out.println("Voici le tableau trié avec la méthode bulle : ");
        afficherTableau(_tableau);
    }

    

}
