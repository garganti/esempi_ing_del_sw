package lezione_4dic25;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;

public class CalcolatoreView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldVal;

	private CalcolatorModel model;
	private JButton btnReset;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcolatoreView frame = new CalcolatoreView(new CalcolatorModel());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalcolatoreView(CalcolatorModel model2) {
		this.model = model2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		list = new JList();
		contentPane.add(list);
		
		btnMult = new JButton("moltiplica");
		contentPane.add(btnMult);
		
		textFieldVal = new JTextField();
		contentPane.add(textFieldVal);
		textFieldVal.setColumns(10);
	
		btnReset = new JButton("Reset");
		contentPane.add(btnReset);

		lblValue = new JLabel(model.getValore());
		contentPane.add(lblValue);

		setVisible(true);
	}
	JLabel lblValue;
	private JButton btnMult;
	private JList list;
	
	// agbgiorna la vista del modello
	void updateView() {
		lblValue.setText("VALORE = " + model.getValore());
	}
	

	public JButton getBtnReset() {
		return btnReset;
	}
	public JButton getBtnMult() {
		return btnMult;
	}
	public String getTextFieldVal() {
		return textFieldVal.getText();
	}
}
