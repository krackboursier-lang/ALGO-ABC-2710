package exercices;

import java.util.Scanner; 

   

public class exo12_cor { 

    public static void main(String[] args) {
          
          double price; 
          int reduction; 
          double pricereduc;


          Scanner clavier = new Scanner(System.in);

          System.out.println("Votre prix ?");

          price = clavier.nextDouble();

          System.out.println("Votre réduction (en pourcentage %)");

          reduction = clavier.nextInt();

          price = Math.round(price*100);  

          price /=100.0;

          System.out.println("Votre prix :"+price+" euros");        

          pricereduc = price * (1-reduction/100.0);

          System.out.println("Votre prix après réduction :"+pricereduc+" euros");    

          System.out.println("Votre prix de "+price+" euros après une réduction de "+reduction+"% vaut "+pricereduc+" euros");         

          clavier.close();





        

    }

}


