package presentation.managerui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;


public class ManagerUI2 extends JPanel{




	/**
	 * Create the application.
	 */
	public ManagerUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		this.setBounds(136, 115, 746, 443);
	
		this.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(105, 5, 95, 28);
		this.add(comboBox);
		
		JLabel label = new JLabel("\u6570\u636E\u7C7B\u578B");
		label.setBounds(38, 10, 55, 18);
		this.add(label);
		
	}
}