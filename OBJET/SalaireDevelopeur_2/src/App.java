import java.util.*;
import com.edu.Stat;

public class App {
    // Codes ANSI pour les styles et couleurs
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BOLD = "\u001B[1m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String data = "2100, 2150, 2200, 2250, 2300, 2350, 2400, 2450, 2500, 2550, 2600, 2650, 2700, 2750, 2800, 2900, 2950, 2950, 3000, 3000, 3000, 3000, 3100, 3100, 3150, 3150, 3200, 3200, 3250, 3250, 3300, 3300, 3350, 3350, 3400, 3400, 3450, 3500, 3550, 3600, 3650, 3700, 3750, 3800, 3850, 3900, 3900, 3950, 3950, 4000, 4100, 4150, 4200, 4250, 4300, 4350, 4400, 4450, 4500, 4550, 4600, 4650, 4700, 4750, 4800, 4850, 4900, 4950, 5000, 5050, 5100, 5150, 5200, 5250, 5300, 5350, 5400, 5450, 5500, 5500, 5600, 5700, 5800, 5900, 6000, 6100, 6200, 6300, 6400, 6500, 6700, 6900, 7100, 7400, 7700, 8000, 8300, 8700, 9100, 9500";

        String[] tabData = data.split(",");
        ArrayList<Double> dataSalaire = new ArrayList<>();
        for (String valeur : tabData) {
            dataSalaire.add(Double.parseDouble(valeur.trim()));
        }

        Stat objetStat = new Stat(dataSalaire);

        // Affichage des données brutes
        System.out.print(ANSI_CYAN + ANSI_BOLD + "Données brutes : " + ANSI_RESET);
        for (double element : dataSalaire) {
            System.out.print(element + ", ");
        }
        System.out.println(ANSI_RESET);

        // Moyenne
        System.out.println(ANSI_BLUE + ANSI_BOLD + "\n---------<< Affichage de la moyenne de l'échantillon de salaire des métiers de l'informatique >>---------------" + ANSI_RESET);
        double moyenne = objetStat.calculerMoyenne();
        System.out.println(ANSI_BOLD + "Salaire moyen de l'échantillon : " + ANSI_RESET + ANSI_GREEN + moyenne + " euros" + ANSI_RESET);

        // Écart-type
        System.out.println(ANSI_BLUE + ANSI_BOLD + "\n---------<< Affichage de l'écart type de l'échantillon de salaire des métiers de l'informatique >>---------------" + ANSI_RESET);
        double ecart = objetStat.calculerEcartType();
        System.out.println(ANSI_BOLD + "Écart type (±) : " + ANSI_RESET + ANSI_GREEN + ecart + " euros" + ANSI_RESET);

        // Médiane
        System.out.println(ANSI_BLUE + ANSI_BOLD + "\n---------<< Affichage de la valeur médiane de l'échantillon de salaire des métiers de l'informatique >>---------------" + ANSI_RESET);
        System.out.println(ANSI_BOLD + "Salaire médian : " + ANSI_RESET + ANSI_GREEN + objetStat.calculerMediane() + " euros" + ANSI_RESET);

        // Quartiles
        System.out.println(ANSI_BLUE + ANSI_BOLD + "\n---------<< Affichage des quartiles de l'échantillon >>---------------" + ANSI_RESET);
        double[] quartiles = objetStat.CalculerQuartile();
        System.out.println(ANSI_BOLD + "Q1 (25%) : " + ANSI_RESET + ANSI_GREEN + quartiles[0] + " euros" + ANSI_RESET);
        System.out.println(ANSI_BOLD + "Q2 (50%) : " + ANSI_RESET + ANSI_GREEN + quartiles[1] + " euros" + ANSI_RESET);
        System.out.println(ANSI_BOLD + "Q3 (75%) : " + ANSI_RESET + ANSI_GREEN + quartiles[2] + " euros" + ANSI_RESET);
    }
}
