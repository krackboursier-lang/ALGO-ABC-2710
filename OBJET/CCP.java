package OBJET;

public class CCP {
	private String nomClient;
	private int numeroCompte;
	private double solde;
	private double decouvertAutorise;

	// Constructeur
	public CCP(String nomClient, int numeroCompte, double solde, double decouvertAutorise) {
		this.nomClient = nomClient;
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.decouvertAutorise = decouvertAutorise;
	}

	// Getters
	public String getNomClient() {
		return nomClient;
	}

	public double getSolde() {
		return solde;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	// Méthode pour créditer le compte
	public void crediter(double montant) {
		if (montant > 0) {
			solde += montant;
		}
	}

	// Méthode pour débiter le compte
	public boolean debiter(double montant) {
		if (montant > 0 && (solde - montant) >= -decouvertAutorise) {
			solde -= montant;
			return true;
		}
		return false;
	}

	public boolean transfert(CCP autreCompte, double montant) {
		if (montant <= 0) {
			return false;
		}
		if (this.debiter(montant)) {
			autreCompte.crediter(montant);
			return true;
		}

		return false;

	}

	public String toString() {
		return "Compte {" +
				"nomClient='" + nomClient + '\'' +
				", numeroCompte=" + numeroCompte +
				", solde=" + solde +
				", decouvertAutorise=" + decouvertAutorise +
				'}';
	}

}
