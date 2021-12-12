package PredicateExemple;

public class Voiture {
	
	private String marque ;
	private String matricule  ; 
	private int numport ;
	public Voiture(String marque, String matricule, int numport) {
		super();
		this.marque = marque;
		this.matricule = matricule;
		this.numport = numport;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getNumport() {
		return numport;
	}
	public void setNumport(int numport) {
		this.numport = numport;
	} 
	

}
