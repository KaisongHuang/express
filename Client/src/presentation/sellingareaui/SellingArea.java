package presentation.sellingareaui;
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


public class SellingArea extends JPanel{

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;



	/**
	 * Create the application.
	 */
	public SellingArea() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 114, 711, 439);
		
		this.setLayout(null);
		
		JLabel label = new JLabel("\u88C5\u8F66\u65E5\u671F\uFF1A");
		label.setBounds(69, 35, 65, 18);
		this.add(label);
		
		textField = new JTextField();
		textField.setBounds(149, 29, 122, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u8D27\u8FD0\u7F16\u53F7\uFF1A");
		label_1.setBounds(362, 35, 65, 18);
		this.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(465, 29, 122, 30);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u51FA\u53D1\u5730\uFF1A");
		lblNewLabel_1.setBounds(68, 102, 65, 18);
		this.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(147, 96, 122, 30);
		this.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5230\u8FBE\u5730\uFF1A");
		lblNewLabel_2.setBounds(362, 103, 65, 18);
		this.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(464, 95, 122, 30);
		this.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u76D1\u88C5\u5458\uFF1A");
		lblNewLabel_3.setBounds(67, 175, 55, 18);
		this.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(148, 168, 122, 30);
		this.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u62BC\u8FD0\u5458\uFF1A");
		lblNewLabel_4.setBounds(356, 168, 55, 18);
		this.add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(470, 164, 122, 30);
		this.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6240\u6709\u6258\u8FD0\u5355\u53F7\uFF1A");
		label_2.setBounds(67, 239, 110, 18);
		this.add(label_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(170, 279, 1, 2);
		this.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(159, 240, 132, 128);
		this.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JLabel lblNewLabel_5 = new JLabel("\u8FD0\u8D39\uFF1A");
		lblNewLabel_5.setBounds(359, 240, 55, 18);
		this.add(lblNewLabel_5);
		
		textField_6 = new JTextField();
		textField_6.setBounds(470, 233, 122, 30);
		this.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("\u786E\u8BA4");
		btnNewButton_10.setBounds(87, 380, 90, 30);
		this.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u6E05\u7A7A");
		btnNewButton_11.setBounds(455, 380, 90, 30);
		this.add(btnNewButton_11);
	
	}
}