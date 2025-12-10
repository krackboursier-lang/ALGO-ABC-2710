
    import java.util.Scanner; 

public class exo19_cor { 


    public static void main(String[] args) {

          

          int sec; 
          String digith="";
          String digitm="";
          String digits="";

          Scanner clavier = new Scanner(System.in);  

          System.out.println(" Le nombre de seconde :");
             sec = clavier.nextInt();

             int h = sec/3600;
             int m = (sec % 3600)/60;
             int s = (sec % 60);

             if(h<10){

                digith="0";

             }

             if(m<10){

                digitm="0";

             }

             if(s<10){

                digits="0";

             }


          System.out.println(digith+h+" heure(s) "+digitm+m+" minute(s) "+digits+s+" seconde(s)");

          clavier.close();
        

    }

}
