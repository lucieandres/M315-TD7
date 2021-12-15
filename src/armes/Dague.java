package armes;

public class Dague extends Arme {


	public Dague() {
		super(20, 10, null);
	}
	
	public Dague(String nom) {
		super(20, 10, nom);
	}
	
	public Dague(int f, int p, String nom) {
		super(f, p, nom);
	}
	
	public Dague(int f, int p) {
		super(f, p, null);
	}

}
