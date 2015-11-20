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


public class Centre extends JPanel{

	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;



	/**
	 * Create the application.
	 */
	public Centre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
		
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 116, 712, 437);
		
		this.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(120, 29, 464, 204);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u5230\u8FBE\u5355");
		label.setBounds(184, 6, 109, 18);
		panel_5.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(17, 39, 55, 18);
		panel_5.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(99, 36, 122, 30);
		panel_5.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(253, 42, 55, 18);
		panel_5.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(320, 33, 122, 30);
		panel_5.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(17, 93, 55, 18);
		panel_5.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 87, 122, 30);
		panel_5.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(253, 93, 55, 18);
		panel_5.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(320, 87, 122, 30);
		panel_5.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(17, 155, 55, 18);
		panel_5.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(99, 150, 122, 28);
		panel_5.add(comboBox);
		
		JButton btnNewButton_9 = new JButton("\u786E\u8BA4");
		btnNewButton_9.setBounds(89, 340, 90, 30);
		this.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("\u53D6\u6D88");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(493, 340, 90, 30);
		this.add(btnNewButton_10);
		
	
	}
}
