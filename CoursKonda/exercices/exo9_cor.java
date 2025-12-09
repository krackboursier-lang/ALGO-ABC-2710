package exercices; 
import java.util.Scanner; 

public class exo9_cor { 


    public static void main(String[] args) { 

       

        String firstname,lastname,email,password,confirmpassword,login; 
        Scanner clavier = new Scanner(System.in); 
        System.out.println("Votre prénom ?"); 
    
        firstname = clavier.nextLine(); 

        System.out.println("Votre nom ?"); 

        lastname = clavier.nextLine();  
        System.out.println("Votre email ?"); 

        email = clavier.nextLine();  
        System.out.println("Votre mot de passe ?"); 

        password = clavier.nextLine(); 

        System.out.println("Confirmez votre mot de passe ?"); 
        confirmpassword = clavier.nextLine(); 
        if(!password.equals(confirmpassword)){ 
            System.out.println("inscription annulée "); 

        }else{

            System.out.println("Merci "+firstname+" "+lastname+", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : "+email); /* Afficher votre instruction */
            System.out.println("Pour vous connecter, renseignez votre email ?"); 
            login = clavier.nextLine();
            System.out.println("Renseignez votre mot de passe ?"); 
            confirmpassword = clavier.nextLine();

            

            if(confirmpassword.equals(password) && login.equals(email)){

                System.out.println("Connexion acceptée"); 

            }else{

                System.out.println("Connexion refusée"); 

            }
        }


        clavier.close();

      

  }

}