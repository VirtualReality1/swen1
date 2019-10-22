import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import gitPrepare.Patient;

class TestPatient {
	private Patient p;

	@Test
	void testAddVorname() {
		p = new Patient("Günter", "Maier");
		Assert.assertEquals("Günter", p.getVorname());
	}

	@Test
	void testAddNachname() {
		p = new Patient("Günter", "Maier");
		Assert.assertEquals("Maier", p.getNachname());
	}

	@Test
	void testAddPatIDCorrect() {
		p = new Patient("Günter", "Maier");
		p.addPatID("as36271382");
		Assert.assertEquals("as36271382", p.getPatID());
	}

	@Test
	void testAddPatIDNoLettersFail() {
		p = new Patient("Günter", "Maier");
		p.addPatID("1136271382");
	Assert.assertEquals(IllegalArgumentException.class,p.getPatID());	
	}
	
	@Test
	void testAddPatIDNoNumbersFail() {
		p = new Patient("Günter", "Maier");
		p.addPatID("zfhslOPehT");
	Assert.assertEquals(IllegalArgumentException.class,p.getPatID());	
	}
	
	@Test
	void testAddGeburtsdatum() {
		p = new Patient("Günter", "Maier");
		p.setGebDatum(new Date());
	Assert.assertEquals(new Date(),p.getGebDatum());	
	}
	
	@Test
	void testAddAddress() {
		p = new Patient("Günter", "Maier");
		p.setAddress("Alfred-Wachtel-Straße 8");
	Assert.assertEquals("Alfred-Wachtel-Straße 8",p.getAdress());	
	}
}
