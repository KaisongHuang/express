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


public class Manager41 extends JPanel{


	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;


	/**
	 * Create the application.
	 */
	public Manager41() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(137, 115, 745, 440);
		
		this.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(192, 192, 192));
		panel_5.setBounds(0, 0, 743, 49);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_12 = new JButton("\u5236\u5B9A\u85AA\u6C34\u7B56\u7565");
		btnNewButton_12.setBounds(25, 11, 105, 30);
		panel_5.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\u5236\u5B9A\u8DDD\u79BB\u4EF7\u683C");
		btnNewButton_13.setBackground(new Color(255, 248, 220));
		btnNewButton_13.setBounds(175, 8, 103, 30);
		panel_5.add(btnNewButton_13);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 84, 743, 282);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(35, 41, 91, 28);
		panel_6.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(167, 41, 85, 28);
		panel_6.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(346, 10, 55, 18);
		panel_6.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(313, 40, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(521, 10, 55, 18);
		panel_6.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(485, 40, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(35, 70, 91, 28);
		panel_6.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(167, 70, 85, 28);
		panel_6.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(35, 103, 91, 28);
		panel_6.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(167, 103, 85, 28);
		panel_6.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(35, 135, 91, 28);
		panel_6.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(167, 135, 85, 28);
		panel_6.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(35, 168, 91, 28);
		panel_6.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(167, 168, 85, 28);
		panel_6.add(comboBox_9);
		
		textField_2 = new JTextField();
		textField_2.setBounds(313, 69, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(485, 69, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(313, 102, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(485, 102, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(313, 134, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(485, 134, 122, 30);
		panel_6.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(313, 167, 122, 30);
		panel_6.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(485, 167, 122, 30);
		panel_6.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_14 = new JButton("\u4E0A\u4E00\u9875");
		btnNewButton_14.setBounds(193, 231, 90, 30);
		panel_6.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("\u4E0B\u4E00\u9875");
		btnNewButton_15.setBounds(365, 231, 90, 30);
		panel_6.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBounds(122, 390, 90, 30);
		this.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBounds(495, 390, 90, 30);
		this.add(btnNewButton_17);
		
	}
}
