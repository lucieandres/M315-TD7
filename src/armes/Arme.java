package armes;

public abstract class Arme {
	private int force;
	private int protection;
	
	public Arme(int f, int p) {
		setForce(f);
		setProtection(p);
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
