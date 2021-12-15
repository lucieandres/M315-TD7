package armes;

import java.util.ArrayList;

import personnages.*;

public class ArmeFactory {
	ArrayList<Arme> armes;
	
	public ArmeFactory() {
		armes = new ArrayList<Arme>();
	}
	
	public ArmeFactory(ArrayList<Arme> armes) {
		this.armes = armes;
	}
	
	public Arme fabrique(String type, String nom) {
		Arme a = null;
		switch(type) {
		case "EPEE":
			a = new Epee(nom);
			break;
		case "BOUCLIER":
			a = new Bouclier(nom);
			break;
		case "DAGUE":
			a = new Dague(nom);
			break;
		default:
			a = null;
			break;
		}
		armes.add(a);
		return a;
	}
	
	public Arme getArme(String nom) {
		for(Arme a : armes) {
			if(a.getNom().equals(nom)) {
				return a;
			}
		}
		return null;
	}
}
