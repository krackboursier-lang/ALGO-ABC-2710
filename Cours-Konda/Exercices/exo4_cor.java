import java.util.Scanner;   



     int a;

          Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

          System.out.println("La valeur de a"); // Affiche un message
          a = clavier.nextInt(); // 

        if (a%2==0){

            System.out.println(a+" est divisible par 2");
        }else{

            System.out.println(a+" n'est pas divisible par 2");
        }


        clavier.close();

        /***--------  Fin du code  -------------------****/

    }