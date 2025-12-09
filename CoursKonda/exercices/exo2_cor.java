package exercices;
import java.util.Scanner;
public class exo2_cor {
    public static void main(String[] args) {

int a;
        int b;
        int soustraction;

        Scanner clavier = new Scanner(System.in); 
        System.out.println("La valeur de a"); 
        a = clavier.nextInt(); 
        System.out.println("La valeur de b");
        b = clavier.nextInt();

        soustraction = a - b; 

        System.out.println("a-b= " + soustraction); 

        if (soustraction < 10) { 
            System.out.println("Le résultat est inférieur à 10"); 

        } else if (soustraction == 10) { 
            System.out.println("Le résultat est égale à 10"); 

        } else {

            System.out.println("Le résultat est supérieur à 10"); 

        }

        clavier.close();




        
    }
    
}
