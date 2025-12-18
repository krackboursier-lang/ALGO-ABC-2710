import java.util.Scanner;

public class Exo2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre âge (en années) : ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Vous n'êtes pas encore né.");
        } else if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }
    }
}
