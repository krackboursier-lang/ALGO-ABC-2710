package  exercices;
import java .util.Scanner; 

public class exo7_cor { 
    public static void main(String[] args) { 

       String response;


        System.out.println("Do you speak english ?"); 
          
          Scanner clavier = new Scanner(System.in);  

          response = clavier.nextLine(); 

        if(response.equalsIgnoreCase(("y"))){

            System.out.println("Nice to meet you");

        }

        else if(response.equalsIgnoreCase(("n"))){

            System.out.println("So learn english !");

        }

        else{
            
        System.out.println("Erreur : Veuillez répondre par Y (oui) ou N (non)");

        }

        clavier.close();
    }
}   