import voiture.Moteur;
import voiture.Voiture;

public class App {
    public static void main(String[] args) throws Exception {
      Moteur hdiMoteur = new Moteur(200, "RENAULT");
       Voiture renaulVoiture = new Voiture("Renault", "Megane", hdiMoteur, 750);
       System.out.println(renaulVoiture);

double resultat=renaulVoiture.VitesseMaxVoiture();
System.out.println("vitesse max est : "+ resultat+" km/h");


}

}