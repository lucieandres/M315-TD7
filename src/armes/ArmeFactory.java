package armes;

import personnages.*;

public class ArmeFactory {
	
	public ArmeFactory() {
	}
	
	public Arme fabrique(String type, String nom) {
		switch(type) {
		case "EPEE":
			return new Epee(nom);
		case "BOUCLIER":
			return new Bouclier(nom);
		case "DAGUE":
			return new Dague(nom);
		default:
			return null;
		}
	}
}
