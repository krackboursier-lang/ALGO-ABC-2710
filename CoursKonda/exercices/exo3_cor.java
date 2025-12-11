

import java.util.Scanner; 

public class exo3_cor { 

    public static void main(String[] args) { 
    
          int a;
          int b;
          int addition;

          Scanner clavier = new Scanner(System.in); 

          System.out.println("La valeur de a"); 
          a = clavier.nextInt(); 
          System.out.println("La valeur de b");
          b = clavier.nextInt();

          addition = a+b; 

          System.out.println("a+b= "+addition);  

        if(addition%2==0){ 
        
        

            System.out.println(addition+" est pair");
        }else{

            System.out.println(addition+" est impair");
        }


        clavier.close();

        

    }

}

