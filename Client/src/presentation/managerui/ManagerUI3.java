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

import listener.managerlistener.ManagerListener30;

import javax.swing.JComboBox;


public class ManagerUI3 extends JPanel {

	private JButton button1;
	private JButton button2;

	ManagerListener30 managerlistener;

	/**
	 * Create the application.
	 */
	public ManagerUI3() {
		managerlistener = new ManagerListener30(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 443);
		
		this.setLayout(null);
		
		JLabel label = new JLabel("是否确认查看统计分析：");
		label.setBounds(38, 10, 150, 18);
		this.add(label);
		
		button1 = new JButton("确认");
		button1.setBounds(200, 5, 80, 28);
		this.add(button1);
		button1.addActionListener(managerlistener);
		
		button2 = new JButton("取消");
		button2.setBounds(300, 5, 80, 28);
		this.add(button2);
		button2.addActionListener(managerlistener);
		
	}

	public JButton getButton1() {
		return button1;
	}

	public void setButton1(JButton button1) {
		this.button1 = button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public void setButton2(JButton button2) {
		this.button2 = button2;
	}
	

}
