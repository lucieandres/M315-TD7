package personnages;

import armes.Epee;

public class Elfe extends Personnage {
	String valeurAcuite;
	static Epee epee;
	
	public Elfe(String nom, String valeurAcuite) {
		super(nom, epee);
		this.valeurAcuite = valeurAcuite;
	}

	public String getValeurAcuite() {
		return valeurAcuite;
	}

	public void setValeurAcuite(String valeurAcuite) {
		this.valeurAcuite = valeurAcuite;
	}

}
