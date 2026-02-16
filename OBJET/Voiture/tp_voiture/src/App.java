import voiture.Moteur;
import voiture.Voiture;
import voiture.Voituredecourse;

public class App {
  public static void main(String[] args) throws Exception {
    Moteur hdiMoteur = new Moteur(200, "RENAULT");
    Voiture renaulVoiture = new Voiture("========================RENAULT", "MEGANE", hdiMoteur, 750);
    System.out.println(renaulVoiture);

    double resultat = renaulVoiture.VitesseMaxVoiture();
    System.out.println(
        "==========================VITESSE MAX : " + resultat + "KM/H=========================================");

    Moteur moteurRenault = new Moteur(317, "RENAULT");
    Voituredecourse renaultF1 = new Voituredecourse("RENAULT F1", 750, moteurRenault);
    System.out.println(renaultF1);
 double resultatF1 = renaultF1.VitesseMaxVoiture();
     System.out.println("==========================VITESSE MAX : " + resultatF1 + "KM/H=========================================");

 
  }

}
