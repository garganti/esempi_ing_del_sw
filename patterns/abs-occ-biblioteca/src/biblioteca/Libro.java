package biblioteca;

import java.util.Arrays;
import java.util.List;

public class Libro {

	String titolo;
	List<Autore> autori;

	// uso varargs
	// autori è un array di Autore
	public Libro(String titolo, Autore ... autori) {
		this.titolo = titolo;
		this.autori = Arrays.asList(autori);
	}
	
	
}
