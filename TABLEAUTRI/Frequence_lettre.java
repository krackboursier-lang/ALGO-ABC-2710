package TABLEAUTRI;
import java.util.*;

public class Frequence_lettre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alphabet = new char[26];
        int[] tabfrequence = new int[26];
        String phrase = "Ses nombreuses pattes, lamentablement grêles par comparaison avec la corpulence qu'il avait par ailleurs,; grouillaient désespérément sous ses yeux.";

       do {
           System.out.println("Veuillez saisir une Phrase d'au moins 120 caractères !");
           phrase = sc.nextLine();

       } while (phrase.length() < 120);

        phrase=phrase.toLowerCase();
   phrase= phrase.replace('à', 'a');
   phrase= phrase.replace('é', 'e');
   phrase= phrase.replace('ê', 'e');
   phrase= phrase.replace('è', 'e');
   phrase= phrase.replace('ù', 'u');
   phrase= phrase.replace('ç', 'a');
   phrase= phrase.replace('î', 'i');
   phrase= phrase.replace('â', 'a');
   phrase= phrase.replace('ë', 'e');
   phrase= phrase.replace('ô', 'o');

  char lettre='a';
    for (int i = 0; i < alphabet.length; i++) {
            
            alphabet[i]= lettre;
            lettre++;
          }
          GestionTab.afficherTableau(alphabet);  
            
          for (int i = 0; i < tabfrequence.length; i++) {
            
            tabfrequence[i]=0;
          }
        GestionTab.afficherTableau(tabfrequence);

    }

}