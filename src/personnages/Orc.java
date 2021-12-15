package personnages;

import armes.Epee;

public class Orc extends Personnage{
	int quotienFureur;

	public Orc(String nom, int quotienFureur) {
		super(nom, null);
		this.setArme(new Epee());
		this.quotienFureur = quotienFureur;
	}

	public int getQuotienFureur() {
		return quotienFureur;
	}

	public void setQuotienFureur(int quotienFureur) {
		this.quotienFureur = quotienFureur;
	}

}
