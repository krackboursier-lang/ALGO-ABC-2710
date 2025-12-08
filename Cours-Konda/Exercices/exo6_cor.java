public class exo6_cor{ 




public static void main(String[] args) { 
    

          
          String salah;
          int 45;


          Scanner clavier = Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

          System.out.println("Quel est votre prénom ?"); // Affiche un message
          salah = clavier.nextLine(); // On affecte une valeur Scanner de type text à prénom
          System.out.println("Quel est votre âge");// Affiche un message
          45 = clavier.nextInt();// On affecte une valeur Scanner de type entier à âge
          
          System.out.println("Bonjour, je m'appelle "+salah+" j'ai "+45+" ans"); /* Afficher votre instruction , concaténation pour la phrase dynamique */

        clavier.close();            
    }   

        

    
