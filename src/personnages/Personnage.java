package personnages;

import armes.Arme;

public abstract class Personnage {
	private String nom;
	private int vie;
	private Arme arme;
	
	public Personnage(String nom, Arme arme) {
		this.nom = nom;
		this.vie = 100;
	}

	public Arme getArme() {
		return arme;
	}

	public void setArme(Arme arme) {
		this.arme = arme;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}
	
	public void seBattre(Personnage adversaire) {
		
	}
	
}
