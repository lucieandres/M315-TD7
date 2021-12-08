package personnages;

public class Troll extends Personnage {

	String capacitéRégénération;
	
	public Troll(String nom, String capacitéRégénération) {
		super(nom);
		this.capacitéRégénération = capacitéRégénération;
	}

	public String getCapacitéRégénération() {
		return capacitéRégénération;
	}

	public void setCapacitéRégénération(String capacitéRégénération) {
		this.capacitéRégénération = capacitéRégénération;
	}

}
