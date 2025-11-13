package lez_pattern_25.abs_occ_libro;

import java.util.Arrays;

public class Biblioteca {

	public static void main(String[] args) {
		
		Autore manzoni = new Autore("MANZONI");
		Autore carducci = new Autore("Carduccci");
		
		Libro libro = new Libro("Peosie Promesse");
		libro.autori.addAll(Arrays.asList(manzoni,carducci));
		
		CopiaLibro c1 = new CopiaLibro("StANZA B34");
		CopiaLibro c2 = new CopiaLibro("StANZA B35");
		
		libro.copieInBiblioteca.addAll(null);

	
	}
	
}
