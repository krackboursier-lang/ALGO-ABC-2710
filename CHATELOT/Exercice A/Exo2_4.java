import java.util.Scanner;


public class Exo2_4 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int annee;
        
        System.out.println("--- Vérification d'Année Bissextile ---");
        System.out.print("Veuillez saisir une année : ");
        annee = scanner.nextInt();
        
        boolean estDivisiblePar400 = (annee % 400 == 0);
        
        boolean estDivisiblePar4etNonPar100 = (annee % 4 == 0) && (annee % 100 != 0);
        
        boolean estBissextile = estDivisiblePar400 || estDivisiblePar4etNonPar100;
        
     
        System.out.print("L'année " + annee + " est : ");
        
        if (estBissextile) {
            System.out.println("Bissextile");
        } else {
            System.out.println("Non bissextile");
        }
        
        scanner.close();
    }
}

