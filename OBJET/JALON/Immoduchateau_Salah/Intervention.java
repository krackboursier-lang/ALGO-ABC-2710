
/**
 * @author STebib
 * @version 1.0
 * @created 24-f�vr.-2026 09:30:32
 */
public class Intervention extends Client {

	public Intervention(double _numeroRue, String _nomRue, double _codePostal, String _nomCommune) {
		super(_numeroRue, _nomRue, _codePostal, _nomCommune);

	}

	private double Date;
	private double heureIntervention;
	private int lieuIntervention;
	private int descriptionIntervention;
	private String nomRue;
	private double _numeroRue;
	private String _nomRue;
	private double _codePostal;
	private Object _nomCommune;
	private Object nomCommune;
	private String adresseClient;

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param _numeorRue
	 * @param _nomRue
	 * @param _codePostal
	 * @param _nomCommune{
	 * 
	 */

	{
		this.numeroRue = _numeroRue;
		this.nomRue = _nomRue;
		this.codePostal = _codePostal;
		this.nomCommune = _nomCommune;

	}

	public double getnumeroClient() {
		return numeroClientClient();
	}

	private double numeroClientClient() {
		return numeroClient;

	}

	public String getadresseClient() {
		String adresseClient = null;
		return adresseClient;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setadresseClient(String newVal) {
		this.adresseClient = newVal;
	}

}