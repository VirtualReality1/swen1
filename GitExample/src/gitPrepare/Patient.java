package gitPrepare;

public class Patient {
 private String PatID; // soll 10 Zeichen enthalten ersten zwei Ziffern sind Buchstaben
 private String PaFirstName;
 private String paLastName;
 
public String addPatID(String PatID) {
	this.PatID = PatID;
	if (PatID.length()!=10) {
		throw new IllegalArgumentException("PatientenID muss die Länge 10 haben!");
	}
	System.out.println(PatID);
	return PatID;
	
	
}
 
}
