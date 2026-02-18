package Parking;

/**
 * @author STebib
 * @version 1.0
 * @created 18-f�vr.-2026 11:41:27
 */
public class Moto extends Vehicule {

	protected int cylindree;

	public Moto() {

	}

	/**
	 * 
	 * @param _cylindree
	 */
	public Moto(String _plaqueImmatriclation, String _marque, int _cylindree) {
		super(_plaqueImmatriclation, _marque);
		this.cylindree = _cylindree;

	}

	public int getcylindree() {
		return cylindree;
	}

	public String toString() {
		return Couleurs.BLANC + super.toString() + " VOLUME CYLINDRE " + this.cylindree + Couleurs.RESET;
	}

}
