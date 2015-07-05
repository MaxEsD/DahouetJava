package dahouet.Model;

public class Proprietaire {

	private int id;
	private int numClub;
	private String nomProprio;
	private String coord;
	public Proprietaire(int id, int numClub, String nomProprio, String coord) {
		super();
		this.id = id;
		this.numClub = numClub;
		this.nomProprio = nomProprio;
		this.coord = coord;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumClub() {
		return numClub;
	}
	public void setNumClub(int numClub) {
		this.numClub = numClub;
	}
	public String getNomProprio() {
		return nomProprio;
	}
	public void setNomProprio(String nomProprio) {
		this.nomProprio = nomProprio;
	}
	public String getCoord() {
		return coord;
	}
	public void setCoord(String coord) {
		this.coord = coord;
	}
	@Override
	public String toString() {
		return  id + " : "+ nomProprio ;
	}
	
	
	
	
}
