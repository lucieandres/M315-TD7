package personnages;

import armes.Epee;

public class Orc extends Personnage{
	int quotienFureur;
	static Epee epee;

	public Orc(String nom, int quotienFureur) {
		super(nom, epee);
		this.quotienFureur = quotienFureur;
	}

	public int getQuotienFureur() {
		return quotienFureur;
	}

	public void setQuotienFureur(int quotienFureur) {
		this.quotienFureur = quotienFureur;
	}

}
