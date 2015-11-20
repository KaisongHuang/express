package presentation.financeui;

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


public class FinanceUI2 extends JPanel{
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the application.
	 */
	public FinanceUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("付款日期:");
		lblNewLabel_1.setBounds(55, 40, 67, 15);
		this.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("付款金额:");
		lblNewLabel_2.setBounds(55, 90, 67, 15);
		this.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(134, 33, 134, 28);
		this.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 83, 134, 28);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("付款人:");
		lblNewLabel_3.setBounds(55, 140, 61, 16);
		this.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(134, 134, 134, 28);
		this.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("付款账号:");
		lblNewLabel_4.setBounds(55, 190, 61, 16);
		this.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(134, 184, 134, 28);
		this.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("条目:");
		lblNewLabel_5.setBounds(55, 240, 61, 16);
		this.add(lblNewLabel_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(134, 236, 134, 27);
		this.add(comboBox);
		
		JLabel label = new JLabel("备注:");
		label.setBounds(55, 290, 61, 16);
		this.add(label);
		
		textField_4 = new JTextField();
		textField_4.setBounds(134, 284, 134, 28);
		this.add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("确认");
		button.setBounds(134, 347, 67, 29);
		this.add(button);
		
		JButton button_1 = new JButton("返回");
		button_1.setBounds(201, 347, 67, 29);
		this.add(button_1);
		
		JButton button_2 = new JButton("查看成本收益表");
		button_2.setBounds(357, 26, 117, 29);
		this.add(button_2);
	}
}
