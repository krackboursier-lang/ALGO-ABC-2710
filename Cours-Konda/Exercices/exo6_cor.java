importjava.util.Scanner; 

exo6_cor{ /* ATTENTION LA CLASSE DOIT AVOIR LE MÊME NOM QUE LE FICHIER ! */


    public static void main(String[] args) { /* Toujours le mettre pour tester votre code */

          /***--------  Début du code  -------------------****/

          /* Déclaration des variables */
          String prenom;
          int age;


          Scanner clavier = new Scanner(System.in); // Déclaration du scanner Instance de l'Objet Scanner 

          System.out.println("Quel est votre prénom ?"); // Affiche un message
          prenom = clavier.nextLine(); // On affecte une valeur Scanner de type text à prénom
          System.out.println("Quel est votre âge");// Affiche un message
          age = clavier.nextInt();// On affecte une valeur Scanner de type entier à âge
          
          System.out.println("Bonjour, je m'appelle "+prenom+" j'ai "+age+" ans"); /* Afficher votre instruction , concaténation pour la phrase dynamique */

        clavier.close();

        /***--------  Fin du code  -------------------****/

    }

}