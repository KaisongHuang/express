package presentation.courierui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class CourierMenu extends JPanel{


	/**
	 * Create the application.
	 */
	public CourierMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

        this.setBounds(136, 58, 746, 58);
	
        this.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("\u8BA2\u5355\u8F93\u5165");
		btnNewButton_7.setBackground(new Color(255, 248, 220));
		btnNewButton_7.setBounds(0, 0, 137, 55);
		this.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("\u6536\u4EF6\u4FE1\u606F\u8F93\u5165");
		btnNewButton_8.setBounds(137, 0, 137, 55);
		this.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("\u7269\u6D41\u4FE1\u606F\u67E5\u8BE2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(271, 0, 130, 55);
		this.add(btnNewButton_9);
		
	}

}
