package dahouet.Model;

public class Newpropriocreate {

	int Num_proprietaire;
	int Num_club;
	String Nom_proprietaire;
	String Coordonnees_proprietaire;
	String Compte_participant;
	public Newpropriocreate(int num_proprietaire, int num_club,
			String nom_proprietaire, String coordonnees_proprietaire,
			String compte_participant) {
		super();
		this.Num_proprietaire = num_proprietaire;
		this.Num_club = num_club;
		this.Nom_proprietaire = nom_proprietaire;
		this.Coordonnees_proprietaire = coordonnees_proprietaire;
		this.Compte_participant = compte_participant;
	}
	public int getNum_proprietaire() {
		return Num_proprietaire;
	}
	public void setNum_proprietaire(int num_proprietaire) {
		Num_proprietaire = num_proprietaire;
	}
	public int getNum_club() {
		return Num_club;
	}
	public void setNum_club(int num_club) {
		Num_club = num_club;
	}
	public String getNom_proprietaire() {
		return Nom_proprietaire;
	}
	public void setNom_proprietaire(String nom_proprietaire) {
		Nom_proprietaire = nom_proprietaire;
	}
	public String getCoordonnees_proprietaire() {
		return Coordonnees_proprietaire;
	}
	public void setCoordonnees_proprietaire(String coordonnees_proprietaire) {
		Coordonnees_proprietaire = coordonnees_proprietaire;
	}
	public String  getCompte_participant() {
		return Compte_participant;
	}
	public void setCompte_participant(String compte_participant) {
		Compte_participant = compte_participant;
	}
	@Override
	public String toString() {
		return "Newpropriocreate [Num_proprietaire=" + Num_proprietaire
				+ ", Num_club=" + Num_club + ", Nom_proprietaire="
				+ Nom_proprietaire + ", Coordonnees_proprietaire="
				+ Coordonnees_proprietaire + ", Compte_participant="
				+ Compte_participant + "]";
	}

	}
	
