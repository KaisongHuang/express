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


public class SellingAreaUI43 extends JPanel{

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;


	

	/**
	 * Create the application.
	 */
	public SellingAreaUI43() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 114, 746, 439);

		this.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 745, 45);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.setBounds(64, 6, 90, 30);
		panel_5.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u66F4\u65B0");
		btnNewButton_11.setBounds(223, 6, 90, 30);
		panel_5.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(371, 6, 90, 30);
		panel_5.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBackground(new Color(255, 248, 220));
		btnNewButton_14.setBounds(540, 6, 90, 30);
		panel_5.add(btnNewButton_14);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(12, 89, 610, 243);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(19, 6, 55, 18);
		panel_6.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(109, 0, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(19, 56, 55, 18);
		panel_6.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 50, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(19, 109, 55, 18);
		panel_6.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(109, 103, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(19, 162, 55, 18);
		panel_6.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(109, 156, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(328, 6, 55, 18);
		panel_6.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(418, 0, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(328, 56, 55, 18);
		panel_6.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(418, 50, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(328, 109, 55, 18);
		panel_6.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(418, 103, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(328, 162, 55, 18);
		panel_6.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(418, 156, 122, 30);
		panel_6.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_15 = new JButton("\u6DFB\u52A0");
		btnNewButton_15.setBounds(82, 381, 90, 30);
		this.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("\u53D6\u6D88");
		btnNewButton_16.setBounds(434, 381, 90, 30);
		this.add(btnNewButton_16);
	
	}
}