package exercices;

import java.util.Scanner;
 
public class exo20_cor { 
 
 
    public static void main(String[] args) {

        final int TOTAL_VOTANTS = 150000;

        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Combien de gens ont voté pour Joseline Inutile ?");
        int votesInutile = scanner.nextInt();
       
        System.out.println("Combien de gens ont voté pour Vincent Escreau ?");
        int votesEscreau = scanner.nextInt();
       
        int totalVotes = votesInutile + votesEscreau;
        int votesBlancs = 0;
       
        if (totalVotes > TOTAL_VOTANTS) {
            System.out.println("Erreur : Le total des votes dépasse le nombre de votants !");
        

        } else if (totalVotes <= TOTAL_VOTANTS) {
            votesBlancs = TOTAL_VOTANTS - totalVotes;
            System.out.println("Vous avez " + votesBlancs + " d'abstentions, ils seront compté nul");
        }
       
        int totalValides = votesInutile + votesEscreau;
        double pourcentageInutile = 0;
        double pourcentageEscreau = 0;
       
        if (totalValides > 0) {
            pourcentageInutile = (double) votesInutile / totalValides * 100;
            pourcentageEscreau = (double) votesEscreau / totalValides * 100;
        }

        System.out.println("\nJoseline Inutile : " + String.format("%.2f", pourcentageInutile) + "%");
        System.out.println("Vincent Escreau : " + String.format("%.2f", pourcentageEscreau) + "%\n");
       
       
        if (pourcentageInutile > 60) {
            System.out.println("Joseline Inutile est la nouvelle maire de Mulhouse");
        } else if (pourcentageEscreau > 60) {
            System.out.println("Vincent Escreau est le nouveau maire de Mulhouse");
        } else {
            System.out.println("Aucun candidat n'a obtenu plus de 60%, un second tour sera nécessaire");
        }
       
        scanner.close();
    }
}


