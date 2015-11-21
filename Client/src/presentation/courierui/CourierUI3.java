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


public class CourierUI3 extends JPanel{


	private JTextField textField;



	/**
	 * Create the application.
	 */
	public CourierUI3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 115, 746, 437);
		
		this.setLayout(null);
		
		JLabel label = new JLabel("\u5FEB\u9012\u5355\u53F7\uFF1A");
		label.setBounds(106, 95, 60, 18);
		this.add(label);
		
		textField = new JTextField();
		textField.setBounds(178, 89, 214, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_10.setBounds(425, 89, 90, 30);
		this.add(btnNewButton_10);
		
	}
}
