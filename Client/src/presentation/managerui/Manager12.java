package presentation.managerui;
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
import javax.swing.SwingConstants;


public class Manager12 extends JPanel{

	
	private JTextField textField;



	/**
	 * Create the application.
	 */
	public Manager12() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 115, 748, 438);
		
		this.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 748, 50);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("\u67E5\u8BE2");
		btnNewButton_11.setBounds(32, 6, 90, 30);
		panel_5.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("\u66F4\u65B0");
		btnNewButton_12.setBounds(168, 6, 90, 30);
		panel_5.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBackground(new Color(255, 248, 220));
		btnNewButton_13.setBounds(308, 6, 90, 30);
		panel_5.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBounds(453, 6, 90, 30);
		panel_5.add(btnNewButton_14);
		
		JButton button = new JButton("\u65E5\u5FD7\u67E5\u770B");
		button.setBounds(579, 6, 90, 30);
		panel_5.add(button);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(35, 63, 55, 18);
		this.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(147, 57, 122, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(325, 57, 90, 30);
		this.add(btnNewButton_15);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(37, 118, 459, 209);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(199, 6, 55, 18);
		panel_6.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(25, 56, 55, 18);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(25, 135, 55, 18);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(116, 56, 55, 18);
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(116, 135, 55, 18);
		panel_6.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(241, 56, 55, 18);
		panel_6.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setBounds(368, 56, 55, 18);
		panel_6.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(241, 135, 55, 18);
		panel_6.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setBounds(368, 135, 55, 18);
		panel_6.add(lblNewLabel_10);
		
		JButton btnNewButton_16 = new JButton("New button");
		btnNewButton_16.setBounds(56, 377, 90, 30);
		this.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("New button");
		btnNewButton_17.setBounds(489, 377, 90, 30);
		this.add(btnNewButton_17);
		
	}
}
