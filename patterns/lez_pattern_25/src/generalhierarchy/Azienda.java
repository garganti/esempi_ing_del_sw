package generalhierarchy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

abstract class Reparto {
	public Reparto(String string) {
		nome = string;
	}

	String nome;
}

// questo può avere dei sottoreparti
class RepartoComposto extends Reparto {
	List<Reparto> repartifigli = new ArrayList<>();

	public RepartoComposto(String string) {
		super(string);
	}
}

class RepartoSemplice extends Reparto {
	public RepartoSemplice(String string) {
		super(string);
	}
}

public class Azienda {
	public static void main(String[] args) {
		RepartoComposto fer = new RepartoComposto("ferramenta");
		RepartoSemplice vit = new RepartoSemplice("viti");
		RepartoSemplice bul = new RepartoSemplice("bulloni");
		fer.repartifigli.addAll(Arrays.asList(vit, bul));
	}
}
