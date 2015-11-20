package presentation.managerui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ManagerMenu extends JPanel{




	/**
	 * Create the application.
	 */
	public ManagerMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(136, 58, 746, 58);
	
		panel_3.setLayout(null);
		
		JButton btnNewButton_8 = new JButton("\u673A\u6784\u7BA1\u7406");
		btnNewButton_8.setBounds(137, 0, 137, 55);
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_7 = new JButton("\u4EBA\u5458\u7BA1\u7406");
		btnNewButton_7.setBackground(new Color(255, 248, 220));
		btnNewButton_7.setBounds(0, 0, 137, 55);
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_9 = new JButton("\u5BA1\u6279\u5355\u636E");
		btnNewButton_9.setBounds(272, 0, 137, 55);
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("\u67E5\u770B\u7EDF\u8BA1\u5206\u6790");
		btnNewButton_10.setBounds(409, 0, 137, 55);
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_16 = new JButton("\u5236\u5B9A");
		btnNewButton_16.setBounds(546, 0, 137, 55);
		panel_3.add(btnNewButton_16);
		
	}
}
