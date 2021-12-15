package personnages;

import armes.Dague;

public class Troll extends Personnage {
	String capaciteRegeneration;
	static Dague dague;
	
	public Troll(String nom, String capaciteRegeneration) {
		super(nom, dague);
		this.capaciteRegeneration = capaciteRegeneration;
	}

	public String getCapaciteRegeneration() {
		return capaciteRegeneration;
	}

	public void setCapaciteRegeneration(String capaciteRegeneration) {
		this.capaciteRegeneration = capaciteRegeneration;
	}

}
