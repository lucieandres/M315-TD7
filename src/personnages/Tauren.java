package personnages;

import armes.Bouclier;
import armes.Epee;

public class Tauren extends Personnage {
	int musculation;
	
	public Tauren(String nom, int musculation) {
		super(nom, null);
		this.setArme(new Bouclier());
		this.musculation = musculation;
	}

	public int getMusculation() {
		return musculation;
	}

	public void setMusculation(int musculation) {
		this.musculation = musculation;
	}

}
