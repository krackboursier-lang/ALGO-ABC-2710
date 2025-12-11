package   exoParNiv;
import java.util.*;

public class exoNivcor2_ {          
    public static void main(String[] args) {                                                                          
        Scanner scanner = new Scanner(System.in);                                                                    

        List<String> articles = new ArrayList<>();                                                                  
        List<Double> couts = new ArrayList<>();                                                                     

        boolean continuer = true;                                                                                    

        while (continuer) {                                                                                          

            System.out.println("Bonjour, que voulez vous acheter ? :");                                             
            String article = scanner.nextLine();                                                                    

            System.out.println("Combien, ça côute ?:");                                                             
            double cout = scanner.nextDouble();                                                                     

            articles.add(article);                                                                                    
            couts.add(cout);                                                                                        

            System.out.println("Voulez-vous acheter autre choses (true/false)?");                                   
            continuer = scanner.nextBoolean();                                                                       
            scanner.nextLine(); // Consommer la nouvelle ligne                                                      
        }                                                                                                            

        System.out.println("\nRécapitulatif de vos courses :\n");                                                   
        double total = 0;                                                                                           
        for (int i = 0; i < articles.size(); i++) {                                                                 
            System.out.printf("-%s , %.2f euros%n", articles.get(i), couts.get(i));                                 
            total += couts.get(i);                                                                                  
        }                                                                                                            

        System.out.printf("%nTotal de vos courses : %.2f€%n", total);                                               

        scanner.close();



    }                                                                                                               
}

