package contatti.view;

import java.util.List;

// questa è la view, come si vede non contiene nessun riferimento 
// ne al modello, ne al controller
public class ContattiView {

	// stampa i contatti come lista di stringhe
	public void printContatti(List<String> listaDeiContatti) {
		System.out.println("**Contatti in rubrica**");
		if (listaDeiContatti.isEmpty()) System.out.println("[VUOTO]");
		for (String c: listaDeiContatti)
			System.out.println(c);		
	}
}
