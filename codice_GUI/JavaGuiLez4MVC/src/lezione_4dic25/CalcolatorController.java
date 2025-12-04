package lezione_4dic25;

public class CalcolatorController {

	CalcolatorModel model;
	CalcolatoreView view;
	
	CalcolatorController(){
		// costruisce il modello
		model = new CalcolatorModel();
		// costruisce la view
		view = new CalcolatoreView(model);
		// registro un listener per il bottone reset della view
		view.getBtnReset().addActionListener(x -> {
			System.out.println("RESET");
			// resetta il modello
			model.reset();
			// comunica alla view di aggiornarsi
			view.updateView();
		});
		// moltiplca per
		view.getBtnMult().addActionListener(x->{
			System.out.println("MOLTIPLCIA");
			int val = Integer.parseInt(view.getTextFieldVal());
			model.moltiplicaPer(val);
			view.updateView();
		});
	}
	
	
	
	public static void main(String[] args) {
		CalcolatorController c = new CalcolatorController();
	}
	
}
