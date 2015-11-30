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

import listener.courierlistener.CourierListener4;

import javax.swing.JComboBox;


public class CourierUI4 extends JPanel{


	private JTextField textField;
	

	private JTextArea textArea_1;


	CourierListener4 courierlistener;

	private JLabel lblNewLabel_4;
	
	private JLabel lblNewLabel_5;

	private JButton btnNewButton_11;


	private JButton btnNewButton_10;
	private int width;
	private int height;
	/**
	 * Create the application.
	 * @param j 
	 * @param i 
	 */
	public CourierUI4(int i, int j) {
		courierlistener = new CourierListener4(this);
		width=i;
		height=j;
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
		lblNewLabel_1.setBounds(178, 124,100, 18);
		this.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u8BA2\u5355\u53F7\uFF1A");
		lblNewLabel_2.setBounds(178, 174, 100, 18);
		this.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u5386\u53F2\u8F68\u8FF9");
		lblNewLabel_3.setBounds(307, 196, 100, 18);
		this.add(lblNewLabel_3);
		
		textArea_1 = new JTextArea();
		textArea_1.setBounds(178, 226, 354, 204);
		textArea_1.setBackground(new Color(220, 220, 220));
		this.add(textArea_1);
		
		btnNewButton_10 = new JButton("清空");
		btnNewButton_10.setBounds(542, 73, 100, 30);
		this.add(btnNewButton_10);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(259, 174, 100, 18);
		this.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(259, 124, 100, 18);
		this.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u5FEB\u9012\u7F16\u53F7");
		lblNewLabel_6.setBounds(178, 73, 100, 18);
		this.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(261, 73, 122, 30);
		this.add(textField);
		textField.setColumns(10);
		
		btnNewButton_11 = new JButton("查询");
		btnNewButton_11.setBounds(442, 73, 100, 30);
		this.add(btnNewButton_11);
		
		btnNewButton_10.addActionListener(courierlistener);
		btnNewButton_11.addActionListener(courierlistener);
		
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JButton getBtnNewButton_11() {
		return btnNewButton_11;
	}

	public JButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
	}

	public void setTextArea_1(JTextArea textArea_1) {
		this.textArea_1 = textArea_1;
	}

	public JTextArea getTextArea_1() {
		return textArea_1;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}
	
	
}
