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


public class ManagerUI01 extends JPanel{


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
	public ManagerUI01() {
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
		btnNewButton_12.setBackground(new Color(255, 248, 220));
		btnNewButton_12.setBounds(158, 6, 90, 30);
		panel_5.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(290, 6, 90, 30);
		panel_5.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBounds(453, 6, 90, 30);
		panel_5.add(btnNewButton_14);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(23, 70, 55, 18);
		this.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(118, 65, 122, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(290, 66, 90, 30);
		this.add(btnNewButton_15);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(28, 123, 488, 209);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(217, 3, 55, 18);
		panel_6.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(3, 38, 55, 18);
		panel_6.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 34, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(3, 90, 55, 18);
		panel_6.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(86, 86, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(3, 149, 55, 18);
		panel_6.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(85, 142, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(288, 40, 55, 18);
		panel_6.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(354, 32, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(289, 94, 55, 18);
		panel_6.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.setBounds(356, 92, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(290, 150, 55, 18);
		panel_6.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(354, 143, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBounds(92, 378, 90, 30);
		this.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBounds(425, 386, 90, 30);
		this.add(btnNewButton_17);
		
	}
}
