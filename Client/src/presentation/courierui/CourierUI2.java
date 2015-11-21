package presentation.courierui;
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


public class CourierUI2 extends JPanel{

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public CourierUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 118, 748, 436);
	
		this.setLayout(null);
		
		JLabel label = new JLabel("\u6536\u4EF6\u7F16\u53F7\uFF1A");
		label.setBounds(116, 43, 67, 18);
		this.add(label);
		
		textField = new JTextField();
		textField.setBounds(231, 34, 122, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u6536\u4EF6\u4EBA\uFF1A");
		label_1.setBounds(118, 109, 55, 18);
		this.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 105, 122, 30);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6536\u4EF6\u65E5\u671F\uFF1A");
		label_2.setBounds(115, 187, 65, 18);
		this.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(240, 182, 122, 30);
		this.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("\u786E\u8BA4");
		btnNewButton_10.setBounds(74, 347, 90, 30);
		this.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u6E05\u7A7A");
		btnNewButton_11.setBounds(454, 348, 90, 30);
		this.add(btnNewButton_11);
		
	}
}
