package personnages;

public abstract class Personnage {
	private String nom;
	private int vie;
	
	public Personnage(String nom) {
		this.nom = nom;
		this.vie = 100;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}
	
	
}
