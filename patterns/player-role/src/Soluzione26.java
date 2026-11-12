class Studente {
	String nome;
	String cognome;
	String matricola;
	LivelloCorso livello;
	private static int numeroMatricole = 0;

	public Studente() {
		matricola = Integer.toString(++numeroMatricole);
		livello = new Triennale();
	}

	public void promuovi() {
		if (livello instanceof Triennale) {
			livello = new Magistrale();
		}
	}
}

abstract class LivelloCorso {
	String[] pianoDegliStudi;
}

class Triennale extends LivelloCorso {
}

class Magistrale extends LivelloCorso {
	boolean tirocinio;
}
