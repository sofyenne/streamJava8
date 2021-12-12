
public class Ordinateur {

	private String marque ; 
	private String memoire ; 
	private String processeur ; 
	private boolean protable ;
	private boolean bureautique  ;
	public Ordinateur(String marque, String memoire, String processeur, boolean protable, boolean bureautique) {
		super();
		this.marque = marque;
		this.memoire = memoire;
		this.processeur = processeur;
		this.protable = protable;
		this.bureautique = bureautique;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getMemoire() {
		return memoire;
	}
	public void setMemoire(String memoire) {
		this.memoire = memoire;
	}
	public String getProcesseur() {
		return processeur;
	}
	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}
	public boolean isProtable() {
		return protable;
	}
	public void setProtable(boolean protable) {
		this.protable = protable;
	}
	public boolean isBureautique() {
		return bureautique;
	}
	public void setBureautique(boolean bureautique) {
		this.bureautique = bureautique;
	}  
	
	
}
