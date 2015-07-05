package dahouet.Model;


public class Proprietaire_test extends Personne {

	private String telephone;
	private String adresse;

	// Creation des constructeur
	public Proprietaire_test(String nom, String mail, String prenom,
			String telephone, String adresse) {
		super(nom, mail, prenom);
		this.telephone = telephone;
		this.adresse = adresse;
	}

	// Creation des getter et setter
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Proprietaire [telephone=" + telephone + ", adresse=" + adresse
				+ "]";
	}

	
	 }
	
	
