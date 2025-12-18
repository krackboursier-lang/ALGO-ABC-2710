
    import java.util.Scanner;

public class Exo2_6 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier N : ");
        int N = scanner.nextInt();

        boolean estPremier = true;

        if (N <= 1) {
            estPremier = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    estPremier = false;
                    break;
                }
            }
        }

        if (estPremier) {
            System.out.println(N + " est un nombre premier.");
        } else {
            System.out.println(N + " n'est pas un nombre premier.");
        }
    }
}


