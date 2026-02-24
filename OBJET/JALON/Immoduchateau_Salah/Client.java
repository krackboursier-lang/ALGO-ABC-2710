
/**
 * @author STebib
 * @version 1.0
 * @created 24-f�vr.-2026 09:30:27
 */
public class Client {

	private String adresseClient;
	protected double numeroClient;
	protected double codePostal;
	private String nomRue;
	protected double numeroRue;
	private String _nomCommune;

	

	/**
	 * 
	 * @param _numeorRue
	 * @param _nomRue
	 * @param _codePostal
	 * @param _nomCommune
	 */
	public Client(double _numeroRue, String _nomRue, double _codePostal, String _nomCommune) {
		this.numeroRue = _numeroRue;
		this.nomRue = _nomRue;
		this.codePostal = _codePostal;
		this._nomCommune = _nomCommune;

	}

	public double getnumeroClient() {
		return numeroClient;
	}

	public String getadresseClient() {
		return adresseClient;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setadresseClient(String newVal) {
		adresseClient = newVal;
	}

}