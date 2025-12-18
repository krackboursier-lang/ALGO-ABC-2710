import java.util.Scanner;

public class Exo2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();
        System.out.println("Les diviseurs de " + nombre + " (autres que 1 et lui-même) sont :");
        for (int i = 2; i < nombre; i++) {
            if (nombre % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
