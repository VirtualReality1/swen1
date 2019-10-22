package gitPrepare;

import java.util.regex.*;

import org.omg.Messaging.SyncScopeHelper;

public class Patient {
	private String PatID; // soll 10 Zeichen enthalten ersten zwei Ziffern sind Buchstaben
	private String PaFirstName;
	private String paLastName;
	private boolean checkID;

	public Patient(String PaFirstName, String PaLastName) {
		this.PaFirstName = PaFirstName;
		this.paLastName = PaLastName;
		
	}

	//Methode �berpr�ft, ob eingegebene Patientenidentifikationsnummer dem Muster Buchstabe,Buchstabe,Ziffer 1-8 entspricht, wenn ja liefert sie checkID= true zur�ck und f�gt Nummer hinzu.
	public boolean addPatID(String patID) {
		checkID = false;
		if(Pattern.matches("[a-zA-Z]{2}[0-9]{8}", patID)) {
			checkID = true;
			this.PatID = patID;
		} else {
			throw new IllegalArgumentException("Patientenidentifikationsnummer muss aus 2 Buchstaben am Anfang gefolgt von 8 Zahlen bestehen.");
		}
		return checkID;
	}

}
