package exercices;  
import java.util.Scanner; 

  
public class exo5_cor { 


    public static void main(String[] args) { 

          


          
          double a;
          double b;
          double c;
          double equation;

          Scanner clavier = new Scanner(System.in); 

          System.out.println("La valeur de a"); 
          a = clavier.nextDouble(); 
          System.out.println("La valeur de b");
          b = clavier.nextDouble();
          System.out.println("La valeur de c");
          c = clavier.nextDouble();


          equation = a*b/c;

          System.out.println("a x b / c= "+equation); 


          if(equation<10){ 
          System.out.println("Le résultat est inférieur à 10"); 
  
        }else if(equation==10){ 
          System.out.println("Le résultat est égale à 10"); 
        }     
        
        else{
  
          System.out.println("Le résultat est supérieur à 10"); 
  
        }
  



        clavier.close();

        

    }

}


