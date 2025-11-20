package lez_pattern_25.abs_occ.libro;

import java.util.ArrayList;
import java.util.List;

public class Libro {
	
	public Libro(String string) {
		titolo = string;
	}

	String titolo;
	
	List<Libro> copieInBiblioteca = new ArrayList<>();

	List<Autore> autori = new ArrayList<>();
	
}
