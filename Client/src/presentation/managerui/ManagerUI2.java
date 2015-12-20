/**
 * ManagerUI2是manager用户的单据审批界面
 */

package presentation.managerui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import listener.managerlistener.ManagerListener20;

import javax.swing.JComboBox;

public class ManagerUI2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JComboBox<String> comboBox;
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel7;
	private JPanel panel8;
	private JPanel panel9;
	private JPanel panel10;
	private JPanel panel11;

	private CardLayout card;
	ManagerListener20 managerlistener;

	/**
	 * Create the application.
	 */
	public ManagerUI2() {
		managerlistener = new ManagerListener20(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(Color.white);

		this.setBounds(136, 115, 746, 443);
		this.setBackground(Color.WHITE);
		this.setLayout(null);

		comboBox = new JComboBox<String>();
		comboBox.addItem("无");
		comboBox.addItem("支出");
		comboBox.addItem("收款单");
		comboBox.addItem("派件单");
		comboBox.addItem("中转单");
		comboBox.addItem("入库单");
		comboBox.addItem("出库单");
		comboBox.addItem("营业厅装车单");
		comboBox.addItem("营业厅到达单");
		comboBox.addItem("中转中心到达单");
		comboBox.addItem("中转中心装车单");
		
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

		JLabel label = new JLabel("数据类型：");
		label.setBounds(38, 10, 100, 18);
		this.add(label);

		panel1 = new JPanel();

		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		panel7 = new JPanel();
		panel8 = new JPanel();
		panel9 = new JPanel();
		panel10 = new JPanel();
		panel11 = new JPanel();

		card = new CardLayout();
		panel = new JPanel();
		panel.setBounds(0, 40, 746, 403);
		panel.setLayout(card);
		panel.add(panel1, "0");
		panel.add(panel2, "1");
		panel.add(panel3, "2");
		panel.add(panel4, "3");
		panel.add(panel5, "4");
		panel.add(panel6, "5");
		panel.add(panel7, "6");
		panel.add(panel8, "7");
		panel.add(panel9, "8");
		panel.add(panel10, "9");
		panel.add(panel11, "10");
		add(panel);

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

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}
}