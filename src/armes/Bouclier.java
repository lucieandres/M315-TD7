package armes;

public class Bouclier extends Arme {

	public Bouclier() {
		super(5, 20, null);
	}

	public Bouclier(String nom) {
		super(5, 20, nom);
	}
	
	public Bouclier(int f, int p) {
		super(f, p, null);
	}
	
	public Bouclier(int f, int p, String nom) {
		super(f, p, nom);
	}

}
