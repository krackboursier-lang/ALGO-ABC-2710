package KONDA.Intro;

import java.util.Scanner;

public class exoNivcor1_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour, votre commande est avec viande (true) ou vegetarien (false)");
        boolean viande = scanner.nextBoolean();

        if (viande) {
            System.out.println("Votre steak vous le voulez saignant (true) ou à point (false) ?");
            boolean cuisson = scanner.nextBoolean();
        }

        System.out.println("Frites (true) ou riz (false)");
        boolean frites = scanner.nextBoolean();

        System.out.println("Soda (true) ou eau gazeuse (false)");
        boolean soda = scanner.nextBoolean();

        System.out.println("Merci pour votre commande, ça sera prêt dans 20 min.");

        scanner.close();
    }
}
