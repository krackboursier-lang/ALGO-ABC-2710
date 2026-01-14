import java.util.Scanner;

public class Exo2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre (a) : ");
        double a = scanner.nextDouble();
        System.out.print("Entrez le deuxième nombre (b) : ");
        double b = scanner.nextDouble();
        System.out.print("Entrez le troisième nombre (c) : ");
        double c = scanner.nextDouble();

        double min, milieu, max;

        min = Math.min(a, Math.min(b, c));

        max = Math.max(a, Math.max(b, c));

        milieu = a + b + c - min - max;

        System.out.println("Les nombres dans l'ordre croissant sont : " + min + ", " + milieu + ", " + max);
    }
}
