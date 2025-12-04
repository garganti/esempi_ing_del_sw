package mvc0.calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalcView extends JDialog {

    private CalcModel model;

    private final JPanel contentPanel = new JPanel();
    private JButton btnReset;
    private JButton btnMultiply;
    JTextField input;
    private JLabel lblValue;

    /**
     * Create the dialog.
     */
    public CalcView(CalcModel model) {
	this.model = model;
	setBounds(100, 100, 543, 145);
	getContentPane().setLayout(new BorderLayout());
	contentPanel.setLayout(new FlowLayout());
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	getContentPane().add(contentPanel, BorderLayout.CENTER);
	{
	    btnMultiply = new JButton("multiply");
	    contentPanel.add(btnMultiply);
	}
	{
	    input = new JTextField();
	    contentPanel.add(input);
	    input.setColumns(10);
	}
	{
	    btnReset = new JButton("Reset");
	    contentPanel.add(btnReset);
	}
	{
	    JLabel lblValue = new JLabel("Value");
	    contentPanel.add(lblValue);
	}
	{
	    lblValue = new JLabel();
	    contentPanel.add(lblValue);
	}
	{
	    JPanel buttonPane = new JPanel();
	    buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
	    getContentPane().add(buttonPane, BorderLayout.SOUTH);
	    {
		JButton okButton = new JButton("OK");
		okButton.setActionCommand("OK");
		buttonPane.add(okButton);
		getRootPane().setDefaultButton(okButton);
	    }
	    {
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setActionCommand("Cancel");
		buttonPane.add(cancelButton);
	    }
	}
	updateView();
    }

    public void updateView() {
	// query del modello, pull
	double value = model.getValue();
	lblValue.setText(Double.toString(value));
    }

    void addActionListenerReset(ActionListener al) {
	btnReset.addActionListener(al);
    }

    void addActionListenerMultiply(ActionListener al) {
	btnMultiply.addActionListener(al);
    }
    
}
