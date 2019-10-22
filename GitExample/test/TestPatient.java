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
		p = new Patient("G�nter", "Maier");
		Assert.assertEquals("G�nter", p.getVorname());
	}

	@Test
	void testAddNachname() {
		p = new Patient("G�nter", "Maier");
		Assert.assertEquals("Maier", p.getNachname());
	}

	@Test
	void testAddPatIDCorrect() {
		p = new Patient("G�nter", "Maier");
		p.addPatID("as36271382");
		Assert.assertEquals("as36271382", p.getPatID());
	}

	@Test
	void testAddPatIDNoLettersFail() {
		p = new Patient("G�nter", "Maier");
		p.addPatID("1136271382");
	Assert.assertEquals(IllegalArgumentException.class,p.getPatID());	
	}
	
	@Test
	void testAddPatIDNoNumbersFail() {
		p = new Patient("G�nter", "Maier");
		p.addPatID("zfhslOPehT");
	Assert.assertEquals(IllegalArgumentException.class,p.getPatID());	
	}
	
	@Test
	void testAddGeburtsdatum() {
		p = new Patient("G�nter", "Maier");
		p.setGebDatum(new Date());
	Assert.assertEquals(new Date(),p.getGebDatum());	
	}
	
	@Test
	void testAddAddress() {
		p = new Patient("G�nter", "Maier");
		p.setAddress("Alfred-Wachtel-Stra�e 8");
	Assert.assertEquals("Alfred-Wachtel-Stra�e 8",p.getAdress());	
	}
}
