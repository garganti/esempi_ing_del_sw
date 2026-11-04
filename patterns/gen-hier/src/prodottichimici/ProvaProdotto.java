package prodottichimici;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class ProdottoChimico {
	String nome;

	ProdottoChimico(String n) {
		nome = n;
	}

	abstract double costo();
}

abstract class ComponenteBase extends ProdottoChimico {
	ComponenteBase(String n) {
		super(n);
	}
}

class Acqua extends ComponenteBase {
	Acqua() {
		super("ACQUA");
	}

	double costo() {
		return 1;
	};
}

class Solvente extends ComponenteBase {

	Solvente() {
		super("SOLVENTE");
	}

	double costo() {
		return 10;
	};
}

class Composto extends ProdottoChimico {
	List<ProdottoChimico> componenti;

	Composto(String n, final List<ProdottoChimico> lpc) {
		super(n);
		componenti = new ArrayList<ProdottoChimico>(lpc);
	}

	double costo() {
		double somma = 0;
		for (ProdottoChimico pc : componenti) {
			somma += pc.costo();
		}
		return somma;
	};

}

public class ProvaProdotto {
	public static void main(String[] args) {
		// ProdottoChimico pd = new ProdottoChimico("ddd");
		Composto compB = new Composto("compB", Arrays.asList(new Acqua(), new Solvente()));
		Composto compA = new Composto("compA", Arrays.asList(compB, new Acqua()));
		Composto myComp = new Composto("myComp", Arrays.asList(compA, compB));

		// mi aspatto che sia
		//
		System.out.println(myComp.costo());

	}

}
