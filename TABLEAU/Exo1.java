
//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

public class Exo1 {

    public static void main(String[] args) throws Exception {

        int nbcase = 10;
        int saisieU;
        int[] monTab = new int[nbcase];

        Random monAlea = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < monTab.length; i++) {
            monTab[i] = monAlea.nextInt(101);
        }

        Arrays.sort(monTab);

        System.out.print("[");
        for (int el : monTab) {

            System.out.print(el + " ");

        }

        System.out.println("]");
        System.out.println("Veuillez saisir un nombre entre 0 et 100 :");
        saisieU = sc.nextInt();

        boolean trouve = false;
        int position = 0;
        for (int i = 0; i < monTab.length; i++) {
            if (monTab[i] == saisieU) {

                trouve = true;
                position = i;
                break;
            }
            // On pourrait aussi faire un while pour eviter le "break"...
        }

        if (!trouve) {
            System.out.println(" Le nombre saisie n'est pas dans la tableau !");
        } else {

            System.out.println("Le nombre se trouve dans le tableau à la position :" + (position + 1));
        }

        sc.close();
    }

}
