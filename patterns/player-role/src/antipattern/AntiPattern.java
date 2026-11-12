package antipattern;

public class AntiPattern {

}

abstract class Studente{
	String nome;
	String matricola;
}

class StuenteTriennale extends Studente{
	
	StuenteMagistrale promuovi() {
		StuenteMagistrale result = new StuenteMagistrale();
		result.nome = new String(nome);
		result.matricola = new String(matricola);
		return result;
	}
}

class StuenteMagistrale extends Studente{}
