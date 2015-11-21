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


public class SellingAreaUI33 extends JPanel{


	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;



	/**
	 * Create the application.
	 */
	public SellingAreaUI33() {
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
		panel_5.setBounds(0, 0, 745, 45);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.setBounds(44, 8, 90, 30);
		panel_5.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("\u66F4\u65B0");
		btnNewButton_11.setBounds(194, 8, 90, 30);
		panel_5.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(348, 8, 90, 30);
		panel_5.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBackground(new Color(255, 248, 220));
		btnNewButton_14.setBounds(525, 8, 90, 30);
		panel_5.add(btnNewButton_14);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(35, 97, 634, 187);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(30, 18, 55, 18);
		panel_6.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(122, 12, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(332, 18, 55, 18);
		panel_6.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(463, 12, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(30, 66, 55, 18);
		panel_6.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(122, 60, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(332, 66, 55, 18);
		panel_6.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(463, 54, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(30, 121, 55, 18);
		panel_6.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(122, 115, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(332, 121, 55, 18);
		panel_6.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(463, 115, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton_15 = new JButton("\u6DFB\u52A0");
		btnNewButton_15.setBounds(107, 377, 90, 30);
		this.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("\u53D6\u6D88");
		btnNewButton_16.setBounds(491, 377, 90, 30);
		this.add(btnNewButton_16);
		
	}
}