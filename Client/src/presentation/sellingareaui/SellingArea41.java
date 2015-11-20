package presentation.sellingareaui;
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


public class SellingArea41 extends JPanel{

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	

	/**
	 * Create the application.
	 */
	public SellingArea41() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 114, 746, 439);
		
		this.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 746, 45);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.setBounds(64, 6, 90, 30);
		panel_5.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u66F4\u65B0");
		btnNewButton_11.setBackground(new Color(255, 248, 220));
		btnNewButton_11.setBounds(223, 6, 90, 30);
		panel_5.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(371, 6, 90, 30);
		panel_5.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBounds(540, 6, 90, 30);
		panel_5.add(btnNewButton_14);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(27, 57, 55, 18);
		this.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(126, 51, 122, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(315, 51, 90, 30);
		this.add(btnNewButton_15);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(27, 95, 548, 226);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(16, 6, 55, 18);
		panel_6.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 0, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(16, 57, 55, 18);
		panel_6.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 51, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(16, 113, 55, 18);
		panel_6.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(104, 107, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(16, 164, 55, 18);
		panel_6.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 158, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(291, 6, 55, 18);
		panel_6.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(386, 0, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(291, 57, 55, 18);
		panel_6.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(386, 51, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(291, 113, 55, 18);
		panel_6.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(386, 107, 122, 30);
		panel_6.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(291, 164, 55, 18);
		panel_6.add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(386, 158, 122, 30);
		panel_6.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_16 = new JButton("\u66F4\u65B0");
		btnNewButton_16.setBounds(83, 382, 90, 30);
		this.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("\u53D6\u6D88");
		btnNewButton_17.setBounds(431, 382, 90, 30);
		this.add(btnNewButton_17);
		
	}
}