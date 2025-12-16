import java.util.Scanner;  

public class Jalonblancexo_4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Saisir une valeur entière : ");
        int valeur = scanner.nextInt();

        if (valeur % 2 == 0) {
            System.out.println("La valeur est paire.");
        } else {
            System.out.println("La valeur est impaire.");
        }
        scanner.close();
    

    }
}

