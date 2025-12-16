package   exoParNiv;
public class exoNivcor1_ {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Bonjour, votre commande est avec viande (true) ou vegetarien (false)");
        boolean viande = scanner.nextBoolean();

        boolean saignant = false;
        if (viande) {
            System.out.println("Votre steak vous le voulez saignant (true) ou à poing (false) ?");
            saignant = scanner.nextBoolean();
        }

        System.out.println("Frites (true) ou riz (false)");
        boolean frites = scanner.nextBoolean();

        System.out.println("Soda (true) ou eau gazeuse (false)");
        boolean soda = scanner.nextBoolean();

        System.out.println("Merci pour votre commande, ça sera près dans 20min,");

        scanner.close();



    }                   
}
