package armes;

import personnages.*;

public class ArmeFactory {
	
	public ArmeFactory() {
	}
	
	public Arme fabrique(String pers) {
		switch(pers) {
		case "Elfe":
			return new Epee();
		case "Orc":
			return new Epee();
		case "Tauren":
			return new Bouclier();
		case "Troll":
			return new Dague();
		default:
			return null;
		}
	}
}
