
import java.util.Scanner;

public class JalonBlancexo_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Voulez-vous lancer le compte à rebours ?");
        boolean reponse = scanner.nextBoolean();

        if (reponse) {
            System.out.println("Lancement du compte à rebours …");

            for (int i = 10; i >= 1; i--) {
                System.out.println(i);
            }

            System.out.println("Bonne année 2026 !!!");
        }
    }
}
