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

import listener.managerlistener.ManagerListener14;

import javax.swing.JComboBox;


public class ManagerUI14 extends JPanel{


	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton button_1;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton button;
	
	private JTextArea textArea;
	
	ManagerListener14 managerlistener;

	
	/**
	 * Create the application.
	 */
	public ManagerUI14() {
		managerlistener = new ManagerListener14(this);
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
		
		button = new JButton("\u65E5\u5FD7\u67E5\u770B");
		button.setBackground(new Color(255, 248, 220));
		button.setBounds(580, 6, 90, 30);
		panel_5.add(button);
		
		button_1 = new JButton("\u6DFB\u52A0");
		button_1.setBounds(439, 5, 90, 30);
		panel_5.add(button_1);
		
		btnNewButton_15 = new JButton("确定");
		btnNewButton_15.setBounds(42, 374, 100, 30);
		this.add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("清空");
		btnNewButton_16.setBounds(493, 374, 100, 30);
		this.add(btnNewButton_16);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 78, 536, 281);
		this.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnNewButton_11.addActionListener(managerlistener);
		btnNewButton_12.addActionListener(managerlistener);
		btnNewButton_13.addActionListener(managerlistener);
		button_1.addActionListener(managerlistener);
		btnNewButton_15.addActionListener(managerlistener);
		btnNewButton_16.addActionListener(managerlistener);
		button.addActionListener(managerlistener);
		
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

	public JButton getButton_1() {
		return button_1;
	}

	public void setButton_1(JButton button_1) {
		this.button_1 = button_1;
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

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
	
	
}
