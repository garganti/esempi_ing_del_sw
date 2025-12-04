package mvc0.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController {

    CalcModel model;
    CalcView view;

    public CalcController(CalcModel m, CalcView v) {
	// prede i refs
	model = m;
	view = v;
	registerController();
    }

    private void registerController() {
	// si registra al bottone reset
	view.addActionListenerReset(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent arg0) {
		model.clear();
		view.updateView();
	    }
	});
	view.addActionListenerMultiply(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent e) {
		try {
		    double d = Double.parseDouble(view.input.getText());
		    model.multiply(d);
		    view.updateView();
		} catch (Exception ex) {
		}
	    }
	});
    }

}
