package exercices;

import java.util.Scanner; 
public class exo8_cor { 

    public static void main(String[] args){ 

        String firstname,lastname,email,password,confirmpassword; 
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
}
        else {


           

            System.out.println("Merci "+firstname+" "+lastname+", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : "+email); 

            clavier.close();}
    }
}

        

        
         


