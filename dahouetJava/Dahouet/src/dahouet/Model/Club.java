package dahouet.Model;

public class Club {
	
	private int id;
	private String nomClub;
	public Club(int id, String nomClub) {
		super();
		this.id = id;
		this.nomClub = nomClub;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomClub() {
		return nomClub;
	}
	public void setNomClub(String nomClub) {
		this.nomClub = nomClub;
	}
	@Override
	public String toString() {
		return  id + " : " + nomClub;
	}
	
	

}
