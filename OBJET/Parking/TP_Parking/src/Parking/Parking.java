package Parking;

import java.util.ArrayList;

/**
 * @author STebib
 * @version 1.0
 */
public class Parking {
    private ArrayList<Vehicule> liste;

    public Parking() {
        this.liste = new ArrayList<>(); // Initialisation correcte
    }

    /**
     * Ajoute un véhicule à la liste du parking.
     * @param vehicule Le véhicule à ajouter.
     */
    public void ajouterVehicule(Vehicule vehicule) {
        if (vehicule != null) {
            this.liste.add(vehicule);
        } else {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<IMPOSSIBLE D'AJOUTER UN VEHICULE. " );
        }
    }

    /**
     * Affiche tous les véhicules présents dans le parking.
     */
    public void afficherVehicule() {
        if (this.liste.isEmpty()) {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<AUCUN VEHICULE DANS LE PARKING. ");
        } else {
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<LISTE DES VEHICULES DANS LE PARKING :>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" );
            for (Vehicule v : this.liste) {
                System.out.println(v);
            }
        }
    }
}
