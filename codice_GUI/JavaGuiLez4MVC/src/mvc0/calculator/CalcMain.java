package mvc0.calculator;

import javax.swing.JDialog;

public class CalcMain {

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
	try {
	    CalcModel model = new CalcModel();
	    CalcView dialog = new CalcView(model);
	    new CalcController(model, dialog);
	    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	    dialog.setVisible(true);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
