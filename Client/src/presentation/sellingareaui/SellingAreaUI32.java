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


public class SellingAreaUI32 extends JPanel{


	private JTextField textField;


	/**
	 * Create the application.
	 */
	public SellingAreaUI32() {
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
		panel_5.setBounds(0, 0, 747, 44);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.setBounds(44, 8, 90, 30);
		panel_5.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u66F4\u65B0");
		btnNewButton_11.setBounds(194, 8, 90, 30);
		panel_5.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBackground(new Color(255, 248, 220));
		btnNewButton_13.setBounds(348, 8, 90, 30);
		panel_5.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBounds(525, 8, 90, 30);
		panel_5.add(btnNewButton_14);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(51, 73, 55, 18);
		this.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(158, 67, 122, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(348, 67, 90, 30);
		this.add(button_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(51, 121, 587, 197);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(16, 16, 55, 18);
		panel_6.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(118, 16, 55, 18);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(16, 72, 55, 18);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(118, 72, 55, 18);
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(16, 132, 55, 18);
		panel_6.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(118, 132, 55, 18);
		panel_6.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(311, 16, 55, 18);
		panel_6.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(435, 16, 55, 18);
		panel_6.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(311, 72, 55, 18);
		panel_6.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(435, 72, 55, 18);
		panel_6.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(311, 132, 55, 18);
		panel_6.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setBounds(435, 132, 55, 18);
		panel_6.add(lblNewLabel_13);
		
		JButton btnNewButton_15 = new JButton("\u5220\u9664");
		btnNewButton_15.setBounds(106, 386, 90, 30);
		this.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("\u53D6\u6D88");
		btnNewButton_16.setBounds(474, 386, 90, 30);
		this.add(btnNewButton_16);
		
	}
}
