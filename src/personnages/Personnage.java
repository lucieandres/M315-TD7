package personnages;

import java.util.ArrayList;

import armes.Arme;

public abstract class Personnage {
	private String nom;
	private int vie;
	private Arme main;
	private ArrayList<Arme> sac;
	
	public Personnage(String nom, Arme arme) {
		this.nom = nom;
		this.vie = 100;
	}

	public Arme getArme() {
		return main;
	}

	public void setArme(Arme arme) {
		this.main = arme;
	}
	
	public ArrayList<Arme> getSac() {
		return sac;
	}

	public void setSac(ArrayList<Arme> sac) {
		this.sac = sac;
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
		int coef = this.getArme().getForce()-adversaire.getArme().getProtection();
		if(coef>=0)
			adversaire.setVie(adversaire.getVie()-coef);
	}
	
}
