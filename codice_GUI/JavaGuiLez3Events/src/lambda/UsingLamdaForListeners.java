package lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class UsingLamdaForListeners {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Example");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("Click Me!");

        // Event Listener using lambda expression
        button.addActionListener(e -> System.out.println("Button Clicked!"));
        button.addActionListener(new ActionListener() {	    
	    @Override
	    public void actionPerformed(ActionEvent e) {
		System.out.println("Button Clicked!");
	    }
	});

        frame.add(button);
        frame.pack();
        frame.setVisible(true);
    }

}
