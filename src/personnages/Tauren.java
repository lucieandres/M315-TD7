package personnages;

import armes.Bouclier;

public class Tauren extends Personnage {
	int musculation;
	static Bouclier bouclier;
	
	public Tauren(String nom, int musculation) {
		super(nom, bouclier);
		this.musculation = musculation;
	}

	public int getMusculation() {
		return musculation;
	}

	public void setMusculation(int musculation) {
		this.musculation = musculation;
	}

}
