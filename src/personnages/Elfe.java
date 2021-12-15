package personnages;

import armes.Epee;

public class Elfe extends Personnage {
	String valeurAcuite;
	
	public Elfe(String nom, String valeurAcuite) {
		super(nom, new Epee());
		this.valeurAcuite = valeurAcuite;
	}

	public String getValeurAcuite() {
		return valeurAcuite;
	}

	public void setValeurAcuite(String valeurAcuite) {
		this.valeurAcuite = valeurAcuite;
	}

}
