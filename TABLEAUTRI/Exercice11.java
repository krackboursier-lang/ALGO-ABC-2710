package TABLEAUTRI;

public class Exercice11 {
    public static void main(String[] args)   {
        int[] tableau = {34, 12, 5, 67, 23, 89, 1, 45};
        System.out.println("Tableau avant le tri:");
        GestionTab.afficherTableau(tableau);
        GestionTab.trierTableau(tableau);
        System.out.println("Tableau après le tri:");
        GestionTab.afficherTableau(tableau);
    }
}
