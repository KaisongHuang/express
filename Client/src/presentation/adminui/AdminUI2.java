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


public class AdminUI2 extends JPanel{

	private JTextField textField_2;

	/**
	 * Create the application.
	 */
	public AdminUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setBackground(Color.WHITE);
		this.setLayout(null);
		
		JLabel label_2 = new JLabel("账户名:");
		label_2.setBounds(66, 34, 61, 16);
		this.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(139, 28, 134, 28);
		this.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("权限:");
		label_3.setBounds(66, 74, 61, 16);
		this.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(139, 70, 134, 27);
		this.add(comboBox_1);
		
		JButton button = new JButton("确认");
		button.setBounds(139, 119, 61, 29);
		this.add(button);
		
		JButton button_1 = new JButton("返回");
		button_1.setBounds(212, 119, 61, 29);
		this.add(button_1);
	}
}
