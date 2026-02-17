package Frameworks;

/**
 * @author STebib
 * @version 1.0
 * @created 17-févr.-2026 16:06:35
 */
public class Voiture {

	protected String marque;
	protected String modele;
	protected double poids;
	public Moteur m_Moteur;

	public Voiture(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param _marquevoiture
	 * @param _modelevoiture
	 * @param _poids
	 * @param _marqueMoteur
	 * @param _vitesseMaxMoteur
	 */
	public Voiture(String _marquevoiture, String _modelevoiture, double _poids, String _marqueMoteur, double _vitesseMaxMoteur){

	}

	public int CalculVitesseMax(){
		return 0;
	}

	public String tostring(){
		return "";
	}

	public String getmarque(){
		return marque;
	}

	public String getmodele(){
		return modele;
	}

	public double getpoids(){
		return poids;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setpoids(double newVal){
		poids = newVal;
	}

}