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


public class CourierUI4 extends JPanel{


	private JTextField textField;


	/**
	 * Create the application.
	 */
	public CourierUI4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 115, 746, 437);
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\u8D27\u8FD0\u72B6\u6001\uFF1A");
		lblNewLabel_1.setBounds(178, 124, 74, 18);
		this.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u8BA2\u5355\u53F7\uFF1A");
		lblNewLabel_2.setBounds(178, 174, 55, 18);
		this.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5386\u53F2\u8F68\u8FF9");
		lblNewLabel_3.setBounds(307, 196, 55, 18);
		this.add(lblNewLabel_3);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(178, 226, 354, 204);
		textArea_1.setBackground(new Color(220, 220, 220));
		this.add(textArea_1);
		
		JButton btnNewButton_10 = new JButton("\u9000\u51FA");
		btnNewButton_10.setBounds(709, 499, 90, 30);
		this.add(btnNewButton_10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(259, 174, 103, 18);
		this.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(259, 124, 103, 18);
		this.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u5FEB\u9012\u7F16\u53F7");
		lblNewLabel_6.setBounds(178, 73, 55, 18);
		this.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(261, 73, 122, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_11 = new JButton("\u67E5\u8BE2");
		btnNewButton_11.setBounds(442, 73, 90, 30);
		this.add(btnNewButton_11);
		
	}
}
