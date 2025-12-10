
    import java.util.Scanner;
    
public class exo14_cor { 


    public static void main(String[] args) { 

         

          boolean a; 

          boolean b; 

          boolean c; 

          boolean result;


          Scanner clavier = new Scanner(System.in);  
          
          System.out.println("a est TRUE ou FALSE"); 

          a = clavier.nextBoolean(); 

          System.out.println("b est TRUE ou FALSE"); 

          b = clavier.nextBoolean(); 

          System.out.println("c est TRUE ou FALSE"); 

          c = clavier.nextBoolean(); 

          result = a || b && !c;

          System.out.println("Résultat :" + result); 



        

    }

}

