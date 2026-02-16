package VOITURE;
public class App {
    public static void main(String[] args) {
        // Création moteur
        Moteur moteur = new Moteur(180,"PEUGEOT");
        // Création voiture avec moteur
        Voiture mavoiture = new voiture ( "206","2.0 HDI",moteur,750 );
        // Affichage information voiture
        //maVoiture.Infos( );
        //System.out.println( );
        // Modification vitesse maximale
        moteur.setVitesseMax( );
        System.out.println( );

    }
}
