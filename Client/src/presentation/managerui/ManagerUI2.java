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

import listener.managerlistener.ManagerListener20;

import javax.swing.JComboBox;


public class ManagerUI2 extends JPanel{


	JFrame frame;
	private JComboBox comboBox;
	private JButton button1;
	private JButton button2;

	ManagerListener20 managerlistener;

	/**
	 * Create the application.
	 */
	public ManagerUI2(JFrame frame) {
		this.frame=frame;
		managerlistener = new ManagerListener20(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		this.setBounds(136, 115, 746, 443);
	
		this.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.addItem("无");
		comboBox.addItem("装车单");
		comboBox.addItem("快递费用");
		comboBox.addItem("到达单");
		comboBox.addItem("派件单");
		comboBox.addItem("中转中心到达单");
		comboBox.addItem("中转单");
		comboBox.addItem("中转中心装车单");
		comboBox.addItem("入库单");
		comboBox.addItem("出库单");
		comboBox.addItem("支出");
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(105, 5, 150, 28);
		this.add(comboBox);
		
		button1 = new JButton("确认");
		button1.setBounds(270, 5, 80, 28);
		this.add(button1);
		button1.addActionListener(managerlistener);
		
		button2 = new JButton("取消");
		button2.setBounds(360, 5, 80, 28);
		this.add(button2);
		button2.addActionListener(managerlistener);
		
		JLabel label = new JLabel("\u6570\u636E\u7C7B\u578B：");
		label.setBounds(38, 10, 100, 18);
		this.add(label);
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
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

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}
	

}