
/**
 * @author STebib
 * @version 1.0
 * @created 24-f�vr.-2026 09:30:26
 */
public class Personne {

	private String nom;
	private String prenom;
	private double age;

	public Personne(String nom2, String prenom2, int age2) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

	// RECUPERER LES GETTERS

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public double getAge() {
		return age;
	}

	// RECUPERER SETTERS

	public String setnom() {
		return nom;
	}
}
