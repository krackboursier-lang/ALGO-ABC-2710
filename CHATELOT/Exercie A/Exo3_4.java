import java.util.Scanner;

public class Exo3_4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Phrase terminée par un point : ");
        String p = s.nextLine().trim();
        
        if (p.equals(".") || p.isEmpty()) {
            System.out.println("LA CHAINE EST VIDE");
            return;
        }
        
        System.out.print("Lettre à chercher : ");
        char l = s.next().charAt(0);
        long c = p.substring(0, p.length()-1).chars().filter(ch -> ch == l).count();
        System.out.println("Occurrences : " + c);
    }
}
