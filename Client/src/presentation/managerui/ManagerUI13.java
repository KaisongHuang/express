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


public class ManagerUI13 extends JPanel{


	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;



	/**
	 * Create the application.
	 */
	public ManagerUI13() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 115, 748, 438);
		
		this.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 748, 50);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("\u67E5\u8BE2");
		btnNewButton_11.setBounds(32, 6, 90, 30);
		panel_5.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("\u66F4\u65B0");
		btnNewButton_12.setBounds(168, 6, 90, 30);
		panel_5.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(308, 6, 90, 30);
		panel_5.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBackground(new Color(255, 248, 220));
		btnNewButton_14.setBounds(453, 6, 90, 30);
		panel_5.add(btnNewButton_14);
		
		JButton button = new JButton("\u65E5\u5FD7\u67E5\u770B");
		button.setBounds(573, 6, 90, 30);
		panel_5.add(button);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(42, 85, 488, 213);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(216, 6, 55, 18);
		panel_6.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(17, 54, 55, 18);
		panel_6.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(98, 48, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(17, 127, 55, 18);
		panel_6.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 121, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(270, 54, 55, 18);
		panel_6.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(347, 48, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(270, 127, 55, 18);
		panel_6.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(347, 121, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(42, 374, 90, 30);
		this.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBounds(493, 374, 90, 30);
		this.add(btnNewButton_16);
	
	}
}
