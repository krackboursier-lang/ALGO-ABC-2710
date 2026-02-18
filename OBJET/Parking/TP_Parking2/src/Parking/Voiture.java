package Parking;

/**
 * @author STebib
 * @version 1.0
 * @created 18-f�vr.-2026 11:41:26
 */
public class Voiture extends Vehicule {

	protected int nombreDeportes;

	public Voiture() {

	}

	/**
	 * 
	 * @param _nomdePorte
	 */
	public Voiture(String _plaqueImmatriclation, String _marque, int _nomdePorte) {
		super(_plaqueImmatriclation, _marque);
		this.nombreDeportes = _nomdePorte;
	}

	public int getnombreDeportes() {
		return nombreDeportes;
	}
public String toString() {
    return Couleurs.ROUGE + super.toString() + " NOMBRE DE PORTES " + this.nombreDeportes + Couleurs.RESET;
}

}
