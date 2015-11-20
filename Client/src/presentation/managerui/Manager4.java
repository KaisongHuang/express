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


public class Manager4 extends JPanel{

	

	

	/**
	 * Create the application.
	 */
	public Manager4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
	
		this.setBackground(new Color(255, 255, 255));
		this.setBounds(137, 115, 745, 440);
		
		this.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(192, 192, 192));
		panel_5.setBounds(0, 0, 743, 49);
		this.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_12 = new JButton("\u5236\u5B9A\u85AA\u6C34\u7B56\u7565");
		btnNewButton_12.setBackground(new Color(255, 248, 220));
		btnNewButton_12.setBounds(25, 11, 105, 30);
		panel_5.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\u5236\u5B9A\u8DDD\u79BB\u4EF7\u683C");
		btnNewButton_13.setBounds(182, 9, 101, 30);
		panel_5.add(btnNewButton_13);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(48, 84, 55, 18);
		this.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(129, 79, 63, 28);
		this.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(48, 152, 55, 18);
		this.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(129, 147, 63, 28);
		this.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(48, 222, 55, 18);
		this.add(lblNewLabel_3);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(129, 217, 63, 28);
		this.add(comboBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(312, 84, 55, 18);
		this.add(lblNewLabel_4);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(402, 79, 63, 28);
		this.add(comboBox_3);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(312, 152, 55, 18);
		this.add(lblNewLabel_5);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(402, 147, 63, 28);
		this.add(comboBox_4);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(312, 222, 55, 18);
		this.add(lblNewLabel_6);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(402, 217, 63, 28);
		this.add(comboBox_5);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(48, 287, 55, 18);
		this.add(lblNewLabel_7);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(129, 282, 63, 28);
		this.add(comboBox_6);
		
		JButton btnNewButton_14 = new JButton("New button");
		btnNewButton_14.setBounds(99, 383, 90, 30);
		this.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("New button");
		btnNewButton_15.setBounds(515, 383, 90, 30);
		this.add(btnNewButton_15);
		
	}
}
