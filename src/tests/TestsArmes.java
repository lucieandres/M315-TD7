package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import armes.Bouclier;
import armes.Dague;
import armes.Epee;

class TestsArmes {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		//tests Bouclier
		
		Bouclier bouclier1 = new Bouclier();
		assertEquals(bouclier1.getForce(), 5);
		bouclier1.setForce(0);
		assertEquals(bouclier1.getForce(), 0);
		assertEquals(bouclier1.getProtection(), 20);
		bouclier1.setProtection(0);
		assertEquals(bouclier1.getProtection(), 0);
		assertEquals(bouclier1.getNom(), null);
		bouclier1.setNom("captain");
		assertEquals(bouclier1.getNom(), "captain");
		
		Bouclier bouclier2 = new Bouclier("captain");
		assertEquals(bouclier2.getForce(), 5);
		assertEquals(bouclier2.getProtection(), 20);
		assertEquals(bouclier2.getNom(), "captain");
		
		Bouclier bouclier3 = new Bouclier(10, 25);
		assertEquals(bouclier3.getForce(), 10);
		assertEquals(bouclier3.getProtection(), 25);
		assertEquals(bouclier3.getNom(), null);
		
		Bouclier bouclier4 = new Bouclier(10, 25, "captain");
		assertEquals(bouclier4.getForce(), 10);
		assertEquals(bouclier4.getProtection(), 25);
		assertEquals(bouclier4.getNom(), "captain");
		
		
		//tests Dague
		
		Dague dague1 = new Dague();
		assertEquals(dague1.getForce(), 20);
		dague1.setForce(0);
		assertEquals(dague1.getForce(), 0);
		assertEquals(dague1.getProtection(), 10);
		dague1.setProtection(0);
		assertEquals(dague1.getProtection(), 0);
		assertEquals(dague1.getNom(), null);
		dague1.setNom("captain");
		assertEquals(dague1.getNom(), "captain");
		
		Dague dague2 = new Dague("captain");
		assertEquals(dague2.getForce(), 20);
		assertEquals(dague2.getProtection(), 10);
		assertEquals(dague2.getNom(), "captain");
		
		Dague dague3 = new Dague(10, 25);
		assertEquals(dague3.getForce(), 10);
		assertEquals(dague3.getProtection(), 25);
		assertEquals(dague3.getNom(), null);
		
		Dague dague4 = new Dague(10, 25, "captain");
		assertEquals(dague4.getForce(), 10);
		assertEquals(dague4.getProtection(), 25);
		assertEquals(dague4.getNom(), "captain");
		

		//tests Epee
		
		Epee epee1 = new Epee();
		assertEquals(epee1.getForce(), 25);
		epee1.setForce(0);
		assertEquals(epee1.getForce(), 0);
		assertEquals(epee1.getProtection(), 5);
		epee1.setProtection(0);
		assertEquals(epee1.getProtection(), 0);
		assertEquals(epee1.getNom(), null);
		epee1.setNom("captain");
		assertEquals(epee1.getNom(), "captain");
		
		Epee epee2 = new Epee("captain");
		assertEquals(epee2.getForce(), 25);
		assertEquals(epee2.getProtection(), 5);
		assertEquals(epee2.getNom(), "captain");
		
		Epee epee3 = new Epee(10, 25);
		assertEquals(epee3.getForce(), 10);
		assertEquals(epee3.getProtection(), 25);
		assertEquals(epee3.getNom(), null);
		
		Epee epee4 = new Epee(10, 25, "captain");
		assertEquals(epee4.getForce(), 10);
		assertEquals(epee4.getProtection(), 25);
		assertEquals(epee4.getNom(), "captain");
		
		
	}

}
