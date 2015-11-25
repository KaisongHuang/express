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

import listener.managerlistener.ManagerListener40;

import javax.swing.JComboBox;


public class ManagerUI4 extends JPanel{

	
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;

	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	
	ManagerListener40 managerlistener;

	/**
	 * Create the application.
	 */
	public ManagerUI4() {
		managerlistener = new ManagerListener40(this);
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
		
		btnNewButton_12 = new JButton("\u5236\u5B9A\u85AA\u6C34\u7B56\u7565");
		btnNewButton_12.setBackground(new Color(255, 248, 220));
		btnNewButton_12.setBounds(25, 11, 150, 30);
		panel_5.add(btnNewButton_12);
		btnNewButton_12.addActionListener(managerlistener);
		
		btnNewButton_13 = new JButton("\u5236\u5B9A\u8DDD\u79BB\u4EF7\u683C");
		btnNewButton_13.setBounds(182, 11, 150, 30);
		panel_5.add(btnNewButton_13);
		btnNewButton_13.addActionListener(managerlistener);
		
		JLabel lblNewLabel_1 = new JLabel("总经理：");
		lblNewLabel_1.setBounds(48, 84, 100, 18);
		this.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		comboBox.setBounds(129, 79, 100, 28);
		this.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("仓库管理员：");
		lblNewLabel_2.setBounds(48, 152, 100, 18);
		this.add(lblNewLabel_2);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(129, 147, 100, 28);
		this.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("营业厅业务员");
		lblNewLabel_3.setBounds(48, 222, 100, 18);
		this.add(lblNewLabel_3);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(129, 217, 100, 28);
		this.add(comboBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("财务人员：");
		lblNewLabel_4.setBounds(312, 84, 100, 18);
		this.add(lblNewLabel_4);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setBounds(402, 79, 100, 28);
		this.add(comboBox_3);
		
		JLabel lblNewLabel_5 = new JLabel("中转中心业务员");
		lblNewLabel_5.setBounds(312, 152, 110, 18);
		this.add(lblNewLabel_5);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setBounds(402, 147, 100, 28);
		this.add(comboBox_4);
		
		JLabel lblNewLabel_6 = new JLabel("快递员：");
		lblNewLabel_6.setBounds(312, 222, 100, 18);
		this.add(lblNewLabel_6);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setBounds(402, 217, 100, 28);
		this.add(comboBox_5);
		
		JLabel lblNewLabel_7 = new JLabel("管理员：");
		lblNewLabel_7.setBounds(48, 287, 100, 18);
		this.add(lblNewLabel_7);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setBounds(129, 282, 100, 28);
		this.add(comboBox_6);
		
		btnNewButton_14 = new JButton("确定");
		btnNewButton_14.setBounds(99, 383, 100, 30);
		this.add(btnNewButton_14);
		btnNewButton_14.addActionListener(managerlistener);
		
		btnNewButton_15 = new JButton("取消");
		btnNewButton_15.setBounds(515, 383, 100, 30);
		this.add(btnNewButton_15);
		btnNewButton_15.addActionListener(managerlistener);
		
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

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	public JComboBox getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public JComboBox getComboBox_2() {
		return comboBox_2;
	}

	public void setComboBox_2(JComboBox comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

	public JComboBox getComboBox_3() {
		return comboBox_3;
	}

	public void setComboBox_3(JComboBox comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}

	public JComboBox getComboBox_4() {
		return comboBox_4;
	}

	public void setComboBox_4(JComboBox comboBox_4) {
		this.comboBox_4 = comboBox_4;
	}

	public JComboBox getComboBox_5() {
		return comboBox_5;
	}

	public void setComboBox_5(JComboBox comboBox_5) {
		this.comboBox_5 = comboBox_5;
	}

	public JComboBox getComboBox_6() {
		return comboBox_6;
	}

	public void setComboBox_6(JComboBox comboBox_6) {
		this.comboBox_6 = comboBox_6;
	}
	
	
}
