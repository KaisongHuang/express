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


public class SellingAreaUI1 extends JPanel{

	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;



	/**
	 * Create the application.
	 */
	public SellingAreaUI1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 114, 711, 439);
	
		this.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(6, 6, 699, 153);
		panel_5.setBackground(new Color(233, 150, 122));
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(308, 0, 55, 18);
		panel_5.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(6, 45, 55, 18);
		panel_5.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(6, 98, 55, 18);
		panel_5.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(98, 39, 122, 30);
		panel_5.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 92, 122, 30);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(344, 45, 55, 18);
		panel_5.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(467, 39, 122, 30);
		panel_5.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(344, 98, 55, 18);
		panel_5.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(467, 93, 122, 28);
		panel_5.add(comboBox);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(6, 184, 699, 153);
		panel_6.setBackground(new Color(176, 224, 230));
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(306, 6, 55, 18);
		panel_6.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(6, 43, 55, 18);
		panel_6.add(lblNewLabel_7);
		
		textField_3 = new JTextField();
		textField_3.setBounds(119, 37, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(316, 43, 55, 18);
		panel_6.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBounds(476, 37, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(6, 101, 55, 18);
		panel_6.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.setBounds(119, 95, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("\u786E\u8BA4");
		btnNewButton_10.setBounds(82, 381, 90, 30);
		this.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u6E05\u7A7A");
		btnNewButton_11.setBounds(492, 381, 90, 30);
		this.add(btnNewButton_11);
		
	}
}
