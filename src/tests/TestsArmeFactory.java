package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import armes.Arme;
import armes.ArmeFactory;

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
//		assertEquals(af.);
		
	}

}
