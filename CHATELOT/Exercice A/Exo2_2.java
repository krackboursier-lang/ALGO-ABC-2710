
    import java.util.Scanner;

public class Exo2_2 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lire les deux nombres
        System.out.print("Entrez le premier nombre (a) : ");
        int a = scanner.nextInt();
        System.out.print("Entrez le deuxième nombre (b) : ");
        int b = scanner.nextInt();

        // Afficher dans l'ordre croissant
        if (a < b) {
            System.out.println("Les nombres dans l'ordre croissant : " + a + ", " + b);
        } else {
            System.out.println("Les nombres dans l'ordre croissant : " + b + ", " + a);
        }
    }
}
