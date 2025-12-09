package exercices;
import java.util.Scanner;   
public class exo11_cor {
   
    

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int solde = 3000;
        int retrait;

        System.out.println("Bonjour, combien voulez-vous retirer ?");
        retrait = clavier.nextInt();

        if(retrait > solde){
            System.out.println("Opération refusée, fond insuffisant !");
        }else{
            solde -= retrait;
            System.out.println("Retrait de " + retrait + "€ effectué. Nouveau solde : " + solde + "€");
        }

        clavier.close();
    }
}
 
