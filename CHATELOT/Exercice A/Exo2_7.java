
    import java.util.Scanner;

public class Exo2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Entrez une valeur en km (0.01-1 000 000) ou 'q' pour quitter : ");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                System.out.println("Au revoir !");
                break;
            }

            try {
                double km = Double.parseDouble(input);
                if (km >= 0.01 && km <= 1_000_000) {
                    double miles = km / 1.609;
                    System.out.printf("%.2f km = %.2f miles%n", km, miles);
                } else {
                    System.out.println("Valeur hors limites. Réessayez.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Réessayez.");
            }
        }

        scanner.close();
    }


}



