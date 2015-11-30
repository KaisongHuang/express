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

import listener.managerlistener.ManagerListener13;

import javax.swing.JComboBox;


public class ManagerUI13 extends JPanel{


	private JTextField textField;
	private JTextField textField_2;
	
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton button;

	ManagerListener13 managerlistener;

	

	/**
	 * Create the application.
	 */
	public ManagerUI13() {
		managerlistener = new ManagerListener13(this);
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
		
		btnNewButton_11 = new JButton("\u67E5\u8BE2");
		btnNewButton_11.setBounds(32, 6, 90, 30);
		panel_5.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("\u66F4\u65B0");
		btnNewButton_12.setBounds(168, 6, 90, 30);
		panel_5.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(308, 6, 90, 30);
		panel_5.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBackground(new Color(255, 248, 220));
		btnNewButton_14.setBounds(453, 6, 90, 30);
		panel_5.add(btnNewButton_14);
		
		button = new JButton("\u65E5\u5FD7\u67E5\u770B");
		button.setBounds(573, 6, 90, 30);
		panel_5.add(button);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(42, 85, 517, 117);
		this.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("机构信息");
		lblNewLabel_1.setBounds(216, 6, 100, 18);
		panel_6.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("机构编号：");
		lblNewLabel_2.setBounds(17, 54, 100, 18);
		panel_6.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(98, 48, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("机构名称：");
		lblNewLabel_4.setBounds(270, 54, 100, 18);
		panel_6.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(347, 48, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_15 = new JButton("确定");
		btnNewButton_15.setBounds(42, 277, 100, 30);
		this.add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("取消");
		btnNewButton_16.setBounds(459, 277, 100, 30);
		this.add(btnNewButton_16);
		
		btnNewButton_11.addActionListener(managerlistener);
		btnNewButton_12.addActionListener(managerlistener);
		btnNewButton_13.addActionListener(managerlistener);
		btnNewButton_14.addActionListener(managerlistener);
		btnNewButton_15.addActionListener(managerlistener);
		btnNewButton_16.addActionListener(managerlistener);
		button.addActionListener(managerlistener);
	
	}


	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
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

	public JButton getBtnNewButton_12() {
		return btnNewButton_12;
	}

	public void setBtnNewButton_12(JButton btnNewButton_12) {
		this.btnNewButton_12 = btnNewButton_12;
	}

	public JButton getBtnNewButton_13() {
		return btnNewButton_13;
	}

	public void setBtnNewButton_13(JButton btnNewButton_13) {
		this.btnNewButton_13 = btnNewButton_13;
	}

	public JButton getBtnNewButton_14() {
		return btnNewButton_14;
	}

	public void setBtnNewButton_14(JButton btnNewButton_14) {
		this.btnNewButton_14 = btnNewButton_14;
	}

	public JButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	public void setBtnNewButton_15(JButton btnNewButton_15) {
		this.btnNewButton_15 = btnNewButton_15;
	}

	public JButton getBtnNewButton_16() {
		return btnNewButton_16;
	}

	public void setBtnNewButton_16(JButton btnNewButton_16) {
		this.btnNewButton_16 = btnNewButton_16;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
	
	
}
