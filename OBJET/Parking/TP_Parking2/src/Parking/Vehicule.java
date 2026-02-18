package Parking;

/**
 * @author STebib
 * @version 1.0
 * @created 18-f�vr.-2026 11:41:22
 */
public class Vehicule {

	protected String plaqueImmatriculation;
	protected String marque;

	public Vehicule() {

	}

	/**
	 * 
	 * @param _plaqueImmatriclation
	 * @param _marque
	 */
	public Vehicule(String _plaqueImmatriclation, String _marque) {
		this.plaqueImmatriculation = _plaqueImmatriclation;
		this.marque = _marque;
	}

	public String getplaqueImmatriculation() {
		return plaqueImmatriculation;
	}

	public String getmarque() {
		return marque;
	
	}
public String toString(){
	return "PLAQUE IMMATRICULATION : "+ this.plaqueImmatriculation+" MARQUE "+this.marque;
}

}