package armes;

public class Epee extends Arme {

	public Epee() {
		super(25, 5, null);
	}
	
	public Epee(String nom) {
		super(25, 5, nom);
	}
	
	public Epee(int f, int p) {
		super(f, p, null);
	}

	public Epee(int f, int p, String nom) {
		super(f, p, nom);
	}

}
