package personnages;

import armes.Dague;

public class Troll extends Personnage {
	String capaciteRegeneration;
	
	public Troll(String nom, String capaciteRegeneration) {
		super(nom, new Dague());
		this.capaciteRegeneration = capaciteRegeneration;
	}

	public String getCapaciteRegeneration() {
		return capaciteRegeneration;
	}

	public void setCapaciteRegeneration(String capaciteRegeneration) {
		this.capaciteRegeneration = capaciteRegeneration;
	}

}
