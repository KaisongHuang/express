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


public class ManagerUI41 extends JPanel{


	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_1;


	/**
	 * Create the application.
	 */
	public ManagerUI41() {
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
		panel_6.setBounds(0, 106, 743, 282);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(425, 10, 55, 18);
		panel_6.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(388, 40, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(388, 69, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(388, 102, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(388, 134, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(388, 167, 122, 30);
		panel_6.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_14 = new JButton("\u4E0A\u4E00\u9875");
		btnNewButton_14.setBounds(193, 231, 90, 30);
		panel_6.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("\u4E0B\u4E00\u9875");
		btnNewButton_15.setBounds(365, 231, 90, 30);
		panel_6.add(btnNewButton_15);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(51, 46, 55, 18);
		panel_6.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(183, 46, 55, 18);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(51, 108, 55, 18);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(51, 140, 55, 18);
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(51, 173, 55, 18);
		panel_6.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(51, 75, 55, 18);
		panel_6.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(183, 75, 55, 18);
		panel_6.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(183, 108, 55, 18);
		panel_6.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(183, 140, 55, 18);
		panel_6.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(183, 173, 55, 18);
		panel_6.add(lblNewLabel_11);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBounds(122, 390, 90, 30);
		this.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBounds(495, 390, 90, 30);
		this.add(btnNewButton_17);
		
		JLabel label = new JLabel("\u4EF7\u683C\uFF08\u6BCF\u5343\u516C\u91CC\uFF09");
		label.setBounds(0, 81, 108, 18);
		add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(103, 75, 122, 30);
		add(textField_1);
		textField_1.setColumns(10);
		
	}
}
