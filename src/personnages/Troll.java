package personnages;

import armes.Dague;
import armes.Epee;

public class Troll extends Personnage {
	String capaciteRegeneration;
	
	public Troll(String nom, String capaciteRegeneration) {
		super(nom, null);
		this.setArme(new Dague());
		this.capaciteRegeneration = capaciteRegeneration;
	}

	public String getCapaciteRegeneration() {
		return capaciteRegeneration;
	}

	public void setCapaciteRegeneration(String capaciteRegeneration) {
		this.capaciteRegeneration = capaciteRegeneration;
	}

}
