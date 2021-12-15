package armes;

public abstract class Arme {
	private String nom;
	private int force;
	private int protection;
	
	public Arme(int f, int p, String nom) {
		this.force = f;
		this.protection = p;
		this.nom = nom;
	}

	public int getProtection() {
		return protection;
	}

	public void setProtection(int protection) {
		this.protection = protection;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}
}
