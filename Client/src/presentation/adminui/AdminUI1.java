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


public class AdminUI1 extends JPanel{

	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the application.
	 */
	public AdminUI1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setVerifyInputWhenFocusTarget(false);
		this.setBounds(136, 115, 746, 438);
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		JLabel label = new JLabel("账户名:");
		label.setBounds(51, 41, 61, 16);
		this.add(label);
		
		textField = new JTextField();
		textField.setBounds(124, 35, 134, 28);
		this.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("密码：");
		label_1.setBounds(51, 93, 61, 16);
		this.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(124, 87, 134, 28);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("确定");
		btnNewButton_10.setBounds(73, 195, 61, 29);
		this.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("返回");
		btnNewButton_11.setBounds(146, 195, 61, 29);
		this.add(btnNewButton_11);
		
		JLabel lblNewLabel_1 = new JLabel("权限:");
		lblNewLabel_1.setBounds(51, 142, 61, 16);
		this.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(124, 138, 134, 27);
		this.add(comboBox);
	}
}
