package presentation.adminui;

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
import javax.swing.UIManager;


public class AdminUI3 extends JPanel{

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the application.
	 */
	public AdminUI3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JLabel label = new JLabel("账户名:");
		label.setBounds(53, 35, 61, 16);
		this.add(label);
		
		JLabel label_1 = new JLabel("新密码:");
		label_1.setBounds(53, 63, 61, 16);
		this.add(label_1);
		
		JLabel label_2 = new JLabel("确认新密码:");
		label_2.setBounds(53, 91, 74, 16);
		this.add(label_2);
		
		textField = new JTextField();
		textField.setBounds(139, 85, 134, 28);
		this.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(139, 57, 134, 28);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 29, 134, 28);
		this.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("确认");
		btnNewButton_10.setBounds(139, 125, 61, 29);
		this.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("返回");
		btnNewButton_11.setBounds(212, 125, 61, 29);
		this.add(btnNewButton_11);
	}
}
