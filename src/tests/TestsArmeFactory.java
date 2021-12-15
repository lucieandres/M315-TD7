package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import armes.Arme;
import armes.ArmeFactory;
import personnages.Elfe;

class TestsArmeFactory {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		
		ArmeFactory af = new ArmeFactory();
		Arme epee = af.fabrique("EPEE", "escalibur");
		Arme bouclier = af.fabrique("BOUCLIER", "captain");
		Arme dagues = af.fabrique("DAGUE", "de la hellerie");
		assertEquals(af.getArme("escalibur"), epee);
		assertEquals(af.getArme("escal"), null);
		
		ArrayList<Arme> sac = new ArrayList<Arme>();
		sac = af.getArmes();
		af.setArmes(sac);
		
		ArmeFactory afbis = new ArmeFactory(sac);
		
		Elfe elfe = new Elfe("Julie", "10");
		elfe.setSac(sac);
		assertEquals(elfe.getSac(), sac);

		
	}

}
