package exercices;
import java.util.Scanner;
import java.io.PrintStream;
public class exo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintStream print = System.out;

        print.println("Entrez le premier entier (a) : ");
        int a = scanner.nextInt();

        print.println("Entrez le deuxième entier (b) : ");
        int b = scanner.nextInt();

        int resultat = a - b;
        print.println("resultat = a - b");
        print.println("resultat = " + resultat);

        if (resultat < 0) {
            print.println("resutat est inférieur à 0");
        } else {
            print.println("resutat n'est pas inférieur à 0");
        }

        scanner.close();
    }
}