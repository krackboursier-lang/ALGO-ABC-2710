import java.util.Scanner; 

public class exo15_cor { 


    public static void main(String[] args) { 

         

          double amountStart; 
          String currencyStart; 
          String currencyEnd; 
          double amountEnd; 

          Scanner clavier = new Scanner(System.in); 

         System.out.println("Quel est votre monnaie ?");
         currencyStart = clavier.nextLine().toUpperCase(); 

         System.out.println("Vous voulez la convertir en quelle devise ?");
         currencyEnd = clavier.nextLine().toUpperCase(); 

         System.out.println("Quel est votre montant ?");
         amountStart = clavier.nextDouble(); 



         if(!(currencyStart.equals(currencyEnd)) 
         && 
         (
            
         currencyStart.equals("EUR") || 
         currencyStart.equals("USD") ||
         currencyStart.equals("GBP") 

         ) 
         &&
         (
            
         currencyEnd.equals("EUR") || 
         currencyEnd.equals("USD") ||
         currencyEnd.equals("GBP") 
         
         ) 
         
         )
         
         {

            switch(currencyStart) {

                case "EUR":

                        switch(currencyEnd) {

                            case "USD":
                            amountEnd = amountStart * 1.1092;
                            amountEnd = Math.round(amountEnd*100);
                            amountEnd /=100;
                            System.out.println("Résultat:"+amountEnd);
                            break;

                            
                            case "GBP":
                            amountEnd = amountStart * 0.8419;
                            amountEnd = Math.round(amountEnd*100);
                            amountEnd /=100;
                            System.out.println("Résultat:"+amountEnd);
                            break;

                        }

                  break;

                  case "USD":

                  switch(currencyEnd) {

                      case "EUR":
                      amountEnd = amountStart * 0.9018;
                      amountEnd = Math.round(amountEnd*100);
                      amountEnd /=100;
                      System.out.println("Résultat:"+amountEnd);
                      break;

                      
                      case "GBP":
                      amountEnd = amountStart * 0.7593;
                      amountEnd = Math.round(amountEnd*100);
                      amountEnd /=100;
                      System.out.println("Résultat:"+amountEnd);
                      break;

                  }

            break;     
            
                    case "GBP":

                    switch(currencyEnd) {

                        case "EUR":
                        amountEnd = amountStart * 1.1877;
                        amountEnd = Math.round(amountEnd*100);
                        amountEnd /=100;
                        System.out.println("Résultat:"+amountEnd);
                        break;

                        
                        case "USD":
                        amountEnd = amountStart * 0.9018;
                        amountEnd = Math.round(amountEnd*100);
                        amountEnd /=100;
                        System.out.println("Résultat:"+amountEnd);
                        break;

                    }

            break;      

                default:
                System.out.println("Erreur lors de la conversion");
              }
              

         }else{

            System.out.println("Les devise sont identiques ou inconnus"); 
            
          }


          clavier.close();


        

    }

}