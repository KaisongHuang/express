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

import listener.courierlistener.CourierListener2;

import javax.swing.JComboBox;


public class CourierUI2 extends JPanel{

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	CourierListener2 courierlistener;
	private JButton btnNewButton_11;
	private JButton btnNewButton_10;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public CourierUI2() {
		courierlistener = new CourierListener2(this);
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
		label.setBounds(116, 43, 100, 18);
		this.add(label);
		
		textField = new JTextField();
		textField.setBounds(231, 34, 122, 30);
		this.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("\u6536\u4EF6\u4EBA\uFF1A");
		label_1.setBounds(118, 109, 100, 18);
		this.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(236, 105, 122, 30);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6536\u4EF6\u65E5\u671F\uFF1A");
		label_2.setBounds(115, 187, 100, 18);
		this.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(240, 182, 122, 30);
		this.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_10 = new JButton("\u786E\u8BA4");
		btnNewButton_10.setBounds(74, 347, 100, 30);
		this.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("\u6E05\u7A7A");
		btnNewButton_11.setBounds(454, 348, 100, 30);
		this.add(btnNewButton_11);
		
		btnNewButton_10.addActionListener(courierlistener);
		btnNewButton_11.addActionListener(courierlistener);
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JButton getBtnNewButton_11() {
		return btnNewButton_11;
	}

	public void setBtnNewButton_11(JButton btnNewButton_11) {
		this.btnNewButton_11 = btnNewButton_11;
	}

	public JButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public void setBtnNewButton_10(JButton btnNewButton_10) {
		this.btnNewButton_10 = btnNewButton_10;
	}
	
	
}
