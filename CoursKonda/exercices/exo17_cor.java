import java.util.Scanner; 

public class exo17_cor { 

    public static void main(String[] args) { 

          int carburant; 
          int distance; 
          double cost; 
          double priceLiterGazole = 1.563;
          double priceLiter95 = 1.702;
          double priceLiter98 = 1.777;
          double consoMoy;
          double priceLiter=0.0;

          Scanner clavier = new Scanner(System.in);
 
          System.out.println("Quel est le type de votre carburant ?"); 

          carburant = clavier.nextInt(); 

          switch(carburant){

            case 0:
            priceLiter = priceLiterGazole;
            consoMoy = 5.5;
            System.out.println("Vous avez choisi Gasoil");
            break;

            case 1:
            priceLiter = priceLiter95;
            consoMoy = 6.5;
            System.out.println("Vous avez choisi sans plomb 95");
            break;

            case 2:
            priceLiter = priceLiter98;
            consoMoy = 6.5;
            System.out.println("Vous avez choisi sans plomb 98");
            break;

            default:
                System.out.println("Carburant inexistant"); 
                return;
              
          }

          System.out.println("Quel est la distance à parcourir (en km) ?"); 

          distance = clavier.nextInt(); 

            cost = ((consoMoy/100.0)*priceLiter)*distance*priceLiter;

            cost = Math.round(cost*100.0);

            cost /= 100;    

            System.out.println("Pour "+distance+" km, vous allez dépenser en moyenne "+cost+" euros"); /* Afficher votre instruction */


    }

}
