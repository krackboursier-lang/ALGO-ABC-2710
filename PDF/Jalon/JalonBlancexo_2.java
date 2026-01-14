
import java.util.Scanner;

public class JalonBlancexo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bouteille = 100; // Contenu initial en centilitres

        while (bouteille > 0) {
            System.out.print("Vous avez " + bouteille +
                    "cl dans votre bouteille, combien de centilitre vous voulez boire ? :\n");
            int boire = scanner.nextInt();

            if (boire > bouteille) {
                System.out.println("Vous ne pouvez pas boire plus que ce qu'il reste !");
                continue;
            }

            bouteille -= boire;

            if (bouteille == 0) {
                System.out.println("Vous avez bu " + boire +
                        "cl. Votre bouteille est vide.");
            } else {
                System.out.println("Vous avez bu " + boire +
                        "cl. Il reste encore " + bouteille +
                        "cl dans votre bouteille.");
            }
        }

        scanner.close();
    }
}
