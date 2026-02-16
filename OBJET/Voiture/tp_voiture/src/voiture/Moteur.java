package voiture;

/**
 * @author STebib
 * @version 1.0
 * @created 11-f�vr.-2026 14:27:19
 */
public class Moteur {

	private String marque;
	private int vitesseMax;
	public Voiture m_Voiture;

	public Moteur(int vitesseMax, String marque) {
		this.vitesseMax = vitesseMax;
		this.marque = marque;

	}

	public int getvitesseMax() {
		return vitesseMax;
	}

	public String getmarque() {
		return marque;
	}

	/**
	 * 
	 * @param vitesse
	 * @param marque
	 */

	// getters
	public void getmarque(String newVal) {
		this.marque = newVal;
	}

	public int getVitesseMax() {
		return vitesseMax;
	}

}
