package presentation.centreui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CentreMenuUI extends JPanel{



	/**
	 * Create the application.
	 */
	public CentreMenuUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		this.setBounds(136, 58, 746, 58);
		
		this.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("\u88C5\u8FD0\u7BA1\u7406");
		btnNewButton_8.setBounds(137, 0, 137, 55);
		this.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("\u63A5\u53D7\u5355");
		btnNewButton_7.setBackground(new Color(255, 248, 220));
		btnNewButton_7.setBounds(0, 0, 137, 55);
		this.add(btnNewButton_7);
		
	}
}
