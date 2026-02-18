import Parking.Moto;
import Parking.Parking;
import Parking.Voiture;

public class App {
    public static void main(String[] args) throws Exception {
        Parking parking = new Parking();
        Voiture rouge = new Voiture("3586", "CITROEN", 5);
        Voiture noire = new Voiture("6523", "PEUGEOT", 5);
        Moto blanche = new Moto("8745", "DUCATI", 250);

        parking.ajouterVehicule(rouge);
        parking.ajouterVehicule(blanche);
        parking.ajouterVehicule(noire);

        parking.afficherVehicule();
    }
}
