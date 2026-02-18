package Parking;

/**
 * @author STebib
 * @version 1.0
 * @created 18-févr.-2026 11:41:22
 */
public class Vehicule {

	protected String plaqueImmatriculation;
	protected String marque;

	public Vehicule(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param _plaqueImmatriclation
	 * @param _marque
	 */
	public Vehicule(String _plaqueImmatriclation, String _marque){

	}

	public String getplaqueImmatriculation(){
		return plaqueImmatriculation;
	}

	public String getmarque(){
		return marque;
	}

}