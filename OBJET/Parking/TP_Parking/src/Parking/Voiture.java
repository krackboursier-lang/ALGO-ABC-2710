package Parking;

/**
 * @author STebib
 * @version 1.0
 * @created 18-f�vr.-2026 11:41:26
 */
public class Voiture extends Vehicule {

	private int nombreDeportes;

	public Voiture(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param _nomdePorte
	 */
	public Voiture(int _nomdePorte){

	}

	public int getnombreDeportes(){
		return nombreDeportes;
	}

}