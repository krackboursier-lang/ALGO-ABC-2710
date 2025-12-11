package   exercices;


import java.util.Scanner;

public class exo6_cor {
     public static void main(String[] args)  { 
          
          String prenom;
          int age;


          Scanner clavier = new Scanner(System.in); 

          System.out.println("Quel est votre prénom ?"); 
          prenom = clavier.next(); 
          System.out.println("Quel est votre âge"); 
          age = clavier.nextInt();
          
          System.out.println("Bonjour, je m'appelle "+prenom+" j'ai "+age+" ans"); 

        clavier.close();

        

    }

}
