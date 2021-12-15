package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import armes.Bouclier;
import armes.Dague;
import armes.Epee;
import personnages.Elfe;
import personnages.Orc;
import personnages.Tauren;
import personnages.Troll;


class TestsPersonnages {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		
		// test de Elfe
		
		Elfe elfe = new Elfe("Julie", "10");
		assertEquals(elfe.getNom(), "Julie");
		elfe.setNom("Caroline");
		assertEquals(elfe.getNom(), "Caroline");
		assertEquals(elfe.getValeurAcuite(), "10");
		elfe.setValeurAcuite("20");
		assertEquals(elfe.getValeurAcuite(), "20");
		assertEquals(elfe.getVie(), 100);
		elfe.setVie(50);
		assertEquals(elfe.getVie(), 50);
		System.out.println(elfe.getArme());
		assertTrue(elfe.getArme() instanceof Epee);
		Epee epee = new Epee();
		elfe.setArme(epee);
		assertTrue(elfe.getArme() instanceof Epee);
		
		// test de Orc
		
		Orc orc = new Orc("Julie", 10);
		assertEquals(orc.getNom(), "Julie");
		orc.setNom("Caroline");
		assertEquals(orc.getNom(), "Caroline");
		assertEquals(orc.getQuotienFureur(), 10);
		orc.setQuotienFureur(20);
		assertEquals(orc.getQuotienFureur(), 20);
		assertEquals(orc.getVie(), 100);
		orc.setVie(50);
		assertEquals(orc.getVie(), 50);
		assertTrue(orc.getArme() instanceof Epee);
		orc.setArme(epee);
		assertTrue(orc.getArme() instanceof Epee);		
		
		// test de Tauren
		
		Tauren tauren = new Tauren("Julie", 10);
		assertEquals(tauren.getNom(), "Julie");
		tauren.setNom("Caroline");
		assertEquals(tauren.getNom(), "Caroline");
		assertEquals(tauren.getMusculation(), 10);
		tauren.setMusculation(20);
		assertEquals(tauren.getMusculation(), 20);
		assertEquals(tauren.getVie(), 100);
		tauren.setVie(50);
		assertEquals(tauren.getVie(), 50);	
		assertTrue(tauren.getArme() instanceof Bouclier);
		Bouclier bouclier = new Bouclier();
		tauren.setArme(bouclier);
		assertTrue(tauren.getArme() instanceof Bouclier);	
		
		// test de Tauren
		
		Troll troll = new Troll("Julie", "10");
		assertEquals(troll.getNom(), "Julie");
		troll.setNom("Caroline");
		assertEquals(troll.getNom(), "Caroline");
		assertEquals(troll.getCapaciteRegeneration(), "10");
		troll.setCapaciteRegeneration("20");
		assertEquals(troll.getCapaciteRegeneration(), "20");
		assertEquals(troll.getVie(), 100);
		troll.setVie(50);
		assertEquals(troll.getVie(), 50);
		assertTrue(troll.getArme() instanceof Dague);
		Dague dague = new Dague();
		troll.setArme(dague);
		assertTrue(troll.getArme() instanceof Dague);			
		
		//test de comportement
		
		Tauren diablon = new Tauren("Diablon", 15);
		Orc azag = new Orc("Azag", 5);
		assertEquals(diablon.getVie(), 100);
		assertEquals(azag.getVie(), 100);
		diablon.seBattre(azag);
		assertEquals(diablon.getVie(), 100);
		assertEquals(azag.getVie(), 100);
		azag.seBattre(diablon);
		assertEquals(diablon.getVie(), 95);
		assertEquals(azag.getVie(), 100);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
