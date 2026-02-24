
/**
 * @author STebib
 * @version 1.0
 * @created 24-f�vr.-2026 09:30:30
 */
public class Intervenant {

	private double salaireIntervenant;
	private double autreRevenus;
	private Object numeroClient;
	private double age;
	private double revenus;

	public Intervenant(double _numeroClient, double _age, double _revenus) {
		this.numeroClient = _numeroClient;
		this.age = _age;
		this.revenus = _revenus;
	}

	public String toString() {
		return "";
	}

	public int calculCharge() {

		int calculcharge = (int) (this.revenus * 0.24 + this.autreRevenus * 0.15);
		return calculcharge;
	}

	/**
	 * 
	 * 
	 * @param _numeroClient
	 * @param _age
	 * @param _revenus
	 */

}
