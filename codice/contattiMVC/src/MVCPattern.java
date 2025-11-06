import contatti.controller.ContattiController;
import contatti.model.Contatti;
import contatti.view.ContattiView;

class MVCPattern {
	public static void main(String[] args) {
		
		// prendo il modello
		Contatti model = Contatti.retriveStudentFromDatabase();
		// costruisco la view
		ContattiView view = new ContattiView();
		// li collego con il controller
		ContattiController controller = new ContattiController(model, view);
		// l'utente inserisce un contatto
		controller.addContatto("AAAA", "BBBB");
	}
}
