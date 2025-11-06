package contatti.controller;

import java.util.List;
import java.util.stream.Collectors;

import contatti.model.Contatti;
import contatti.model.Contatti.Contatto;
import contatti.view.ContattiView;

public class ContattiController {
	private Contatti model;
	private ContattiView view;

	public ContattiController(Contatti model, ContattiView view) {
		this.model = model;
		this.view = view;
		// mostro una prima versione del modello
		updateView();
		
	}	
	public void addContatto(String n, String c) {
		model.add(new Contatto(n, c));	
		// mostro versione aggiornata del modello
		updateView();
	}
	
	// quando cambia il modello il controller dovrà avvisare la view
	private void updateView() {
		List<String> contattiStringhe = model.stream().map(Object::toString)
                .collect(Collectors.toList());
		view.printContatti(contattiStringhe);
	}


	
}

