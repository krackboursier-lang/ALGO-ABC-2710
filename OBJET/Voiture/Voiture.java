package VOITURE;

/**
 * @author STebib
 * @version 1.0
 * @created 11-f�vr.-2026 14:13:55
 */
public class Voiture {

	protected String marque;
	protected String modele;
	protected double poids;
	protected Moteur le_moteur;

	public Voiture(String marque, String modele, Moteur le_moteur, double poids) {
		this.marque = marque;
		this.modele = modele;
		this.le_moteur = le_moteur;
		this.poids = poids;
	}

	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", poids=" + poids + ", moteur="
				+ le_moteur.getMarque() + "] ";
	}

	// getters
	public String getmarque() {
		return marque;
	}

	public String getmodele() {
		return modele;
	}

	public double getpoids() {
		return poids;
	}

	public double VitesseMaxVoiture() {
		Voiture vitesseMax = this.Moteur.getVitesseMax() - (this.poids*0.03);
		return le_moteur.getVitesseMax();
	}

	/**
	 * 
	 * @param newVal
	 */// setters
	public void setmarque(String marque) {
		marque = marque;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setmodele(String modele) {
		modele = modele;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setpoids(double poids) {
		poids = poids;
	}

	public String toString1() {
		return "Voiture [marque=" + marque + ", modele=" + modele + ", poids=" + poids + ", moteur="
				+ le_moteur.getMarque() + "] ";
	}

	public String Infos() {
		return this.toString();
		return infos;
	}

	/**
	 * 
	 * @param _marque
	 * @param _model
	 * @param _moteur
	 * @param _poids
	 */
	public Voiture(String _marque, int _model, Moteur _moteur, int _poids) {
	}

}
