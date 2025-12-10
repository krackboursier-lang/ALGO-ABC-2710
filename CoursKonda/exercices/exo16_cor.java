
    import java.util.Scanner; 

    
public class exo16_cor {



    public static void main(String[] args) { 

         

          int age; 
          int nbsit; 
          double price; 
          double finalPrice; 
          String choice; 

          Scanner clavier = new Scanner(System.in); 
                                                                    
        System.out.println("Le passager veut-il une classe business (oui/non) ?");
        choice = clavier.nextLine();                                                          

        System.out.println("Quel est l'âge de votre passager ?");
        age = clavier.nextInt(); 

          System.out.println("Le prix du vol :");
          price = clavier.nextDouble(); 

          System.out.println("Nombre de places disponibles :");
          nbsit = clavier.nextInt(); 

        

        if(age<18){

            price *= 0.8;
        }

        if(age>60){

            price *= 0.6;   

        }

        

        if(nbsit>60){

            price *= 0.8;   

        }

        if(nbsit<20){

            price *= 1.2;   

        }

        

        if(choice.equalsIgnoreCase("oui")){

            price *= 1.2; 

        }

        finalPrice = Math.round(price * 100);

        finalPrice /= 100;

          System.out.println("Le prix du vol est de "+finalPrice+" euros"); 

        clavier.close();


    }

}


