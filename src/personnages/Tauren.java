package personnages;

public class Tauren extends Personnage {

	int musculation;
	
	public Tauren(String nom, int musculation) {
		super(nom);
		this.musculation = musculation;
	}

	public int getMusculation() {
		return musculation;
	}

	public void setMusculation(int musculation) {
		this.musculation = musculation;
	}

}
