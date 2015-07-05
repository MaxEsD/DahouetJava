package dahouet.Model;

public class Commissaire extends Personne {

	String comite;

	// Creation des constructeurs
	public Commissaire(String nom, String mail, String prenom, String comite) {
		super(nom, mail, prenom);
		this.comite = comite;
	}

	// Creation des getter et setter
	public String getComite() {
		return comite;
	}

	public void setComite(String comite) {
		this.comite = comite;
	}

	@Override
	public String toString() {
		return "Commissaire [comite=" + comite + "]";
	}

}
