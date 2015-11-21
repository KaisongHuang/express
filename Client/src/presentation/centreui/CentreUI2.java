package presentation.centreui;
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


public class CentreUI2 extends JPanel{


	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;



	/**
	 * Create the application.
	 */
	public CentreUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	

		
	
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 116, 746, 437);
		
		this.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 746, 47);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_9 = new JButton("\u98DE\u673A");
		btnNewButton_9.setBounds(68, 6, 90, 30);
		panel_5.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("\u706B\u8F66");
		btnNewButton_10.setBackground(new Color(255, 248, 220));
		btnNewButton_10.setBounds(221, 6, 90, 30);
		panel_5.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u6C7D\u8F66");
		btnNewButton_11.setBounds(374, 6, 90, 30);
		panel_5.add(btnNewButton_11);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(75, 59, 476, 282);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(202, 6, 55, 18);
		panel_6.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(19, 44, 55, 18);
		panel_6.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(102, 38, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 90, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(102, 140, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(102, 194, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(348, 38, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(19, 96, 55, 18);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(19, 146, 55, 18);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(19, 200, 55, 18);
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(277, 44, 55, 18);
		panel_6.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(277, 96, 55, 18);
		panel_6.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(277, 146, 55, 18);
		panel_6.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(277, 200, 55, 18);
		panel_6.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(348, 90, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(348, 140, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(348, 194, 122, 30);
		panel_6.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(19, 243, 55, 18);
		panel_6.add(lblNewLabel_10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(102, 243, 122, 30);
		panel_6.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_12 = new JButton("\u786E\u8BA4");
		btnNewButton_12.setBounds(83, 379, 90, 30);
	    this.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\u53D6\u6D88");
		btnNewButton_13.setBounds(401, 379, 90, 30);
		this.add(btnNewButton_13);
	
	}
}