package personnages;

import armes.ArmeFactory;

public class Orc extends Personnage{
	int quotienFureur;

	public Orc(String nom, int quotienFureur) {
		super(nom, new ArmeFactory().fabrique("EPEE", null));
		this.quotienFureur = quotienFureur;
	}

	public int getQuotienFureur() {
		return quotienFureur;
	}

	public void setQuotienFureur(int quotienFureur) {
		this.quotienFureur = quotienFureur;
	}

}
