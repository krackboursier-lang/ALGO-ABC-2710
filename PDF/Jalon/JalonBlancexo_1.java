import java.util.Scanner;

public class JalonBlancexo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Votre valeur de a :");
        double a = scanner.nextDouble();

        System.out.println("\nVotre valeur de b :");
        double b = scanner.nextDouble();

        System.out.println("\nAprès comparaison : ");

        if (a > b) {
            System.out.println("a est supérieur à b");
        } else if (a < b) {
            System.out.println("a est inférieur à b");
        } else {
            System.out.println("a et b sont égaux");
        }

        scanner.close();
    }
}