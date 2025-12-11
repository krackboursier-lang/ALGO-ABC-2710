package   JalonBlancexo_1; 
  import java.util.Scanner;

public class JalonBlancexo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Votre valeur de a : ");
        int a = scanner.nextInt();

        System.out.print("Votre valeur de b : ");
        int b = scanner.nextInt();

        System.out.print("Après comparaison : ");
        if (a == b) {
            System.out.println("a et b sont égaux");
        } else if (a > b) {
            System.out.println("a est supérieur à b");
        } else {
            System.out.println("a est inférieur à b");
        }
    }
}



