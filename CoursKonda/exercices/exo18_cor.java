import java.util.Scanner; 

public class exo18_cor { 

    public static void main(String[] args) { 

          boolean isCDI;
          double salary; 
          double amount;
          double contribution; 
          double estate; 
          boolean condition1; 
          boolean condition2; 
          boolean condition3; 

          Scanner clavier = new Scanner(System.in); 
       
          System.out.println("Quel est le montant de votre prêt ?");
          amount = clavier.nextDouble(); 

          System.out.println("Quel est le montant de votre salaire (par mois) ?"); 
          salary = clavier.nextDouble(); 

          System.out.println("Êtes vous en cdi ?");
          isCDI = clavier.nextBoolean(); 

          System.out.println("Combien avez-vous d'apport ?"); 
          contribution = clavier.nextDouble(); 

          System.out.println("Si vous êtes déjà propriétaire d'un bien veuillez me donner sa valeur, sinon mettez 0"); 
          estate = clavier.nextDouble(); 

          condition1= isCDI && (salary>=3000);

        condition2 = contribution >= (amount*0.25);          
            System.out.println("Apport minimum : "+amount*0.25+" euros"); 
            System.out.println("Votre apport : "+contribution+" euros"); 

         condition3 = estate >= (amount*0.75); 
         System.out.println("75% du prêt : "+amount*0.75+" euros"); 
         System.out.println("Votre bien : "+estate+" euros"); 

         if(((condition1 && condition2) == true) || ((condition2 && condition3)==true)){

          System.out.println("Vous êtes éligible pour obtenir ce prêt de "+amount+" euros"); 

         }else{
              
          System.out.println("Vous n'êtes pas éligible pour obtenir ce prêt de "+amount+" euros"); 

         }

         clavier.close();

        
    }

}
