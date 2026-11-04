package biblioteca;


public class Biblioteca {
	
	public static void main(String[] args) {
		Autore am = new Autore("Alessandro Manzoni");
		Libro ps = new Libro("Promessi Sposi", am);
		
		Copia ps1 = new Copia(ps, "stanza A -2");
		Copia ps2 = new Copia(ps, "stanza B -5");
		
		//Libro ps2 = new Libro("Promessi Sposi 2", am, am);
		
		
		
	}
}
