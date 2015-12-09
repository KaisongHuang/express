/**
 * ManagerUI03是manager用户的人员管理的增加界面
 */

package presentation.managerui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.managerlistener.ManagerListener03;


public class ManagerUI03 extends JPanel{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;

	ManagerListener03 managerlistener;


	/**
	 * Create the application.
	 * @param card
	 */
	public ManagerUI03(CardLayout card) {
		managerlistener = new ManagerListener03(this,card);
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
		btnNewButton_11.setBounds(32, 6, 100, 30);
		panel_5.add(btnNewButton_11);
		btnNewButton_11.addActionListener(managerlistener);

		btnNewButton_12 = new JButton("\u66F4\u65B0");
		btnNewButton_12.setBounds(169, 6, 100, 30);
		panel_5.add(btnNewButton_12);
		btnNewButton_12.addActionListener(managerlistener);

		btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(304, 6, 100, 30);
		panel_5.add(btnNewButton_13);
		btnNewButton_13.addActionListener(managerlistener);

		btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBackground(new Color(255, 248, 220));
		btnNewButton_14.setBounds(453, 6, 100, 30);
		panel_5.add(btnNewButton_14);
		btnNewButton_14.addActionListener(managerlistener);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(44, 92, 473, 208);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_1 = new JLabel("员工姓名：");
		lblNewLabel_1.setBounds(6, 18, 100, 18);
		panel_6.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(76, 12, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);

		lblNewLabel_2 = new JLabel("员工编号：");
		lblNewLabel_2.setBounds(266, 18, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(345, 12, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		lblNewLabel_3 = new JLabel("员工职位：");
		lblNewLabel_3.setBounds(6, 82, 100, 18);
		panel_6.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(76, 76, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		lblNewLabel_4 = new JLabel("员工年龄：");
		lblNewLabel_4.setBounds(266, 82, 100, 18);
		panel_6.add(lblNewLabel_4);

		textField_3 = new JTextField();
		textField_3.setBounds(345, 76, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		lblNewLabel_5 = new JLabel("上层机构：");
		lblNewLabel_5.setBounds(6, 141, 100, 18);
		panel_6.add(lblNewLabel_5);

		textField_4 = new JTextField();
		textField_4.setBounds(76, 135, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		lblNewLabel_6 = new JLabel("工作时间：");
		lblNewLabel_6.setBounds(266, 141, 100, 18);
		panel_6.add(lblNewLabel_6);

		textField_5 = new JTextField();
		textField_5.setBounds(345, 135, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		btnNewButton_15 = new JButton("添加");
		btnNewButton_15.setBounds(92, 377, 100, 30);
		this.add(btnNewButton_15);
		btnNewButton_15.addActionListener(managerlistener);

		btnNewButton_16 = new JButton("取消");
		btnNewButton_16.setBounds(480, 377, 100, 30);
		this.add(btnNewButton_16);
		btnNewButton_16.addActionListener(managerlistener);

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

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
	}

	public JLabel getLblNewLabel_6() {
		return lblNewLabel_6;
	}

	public void setLblNewLabel_6(JLabel lblNewLabel_6) {
		this.lblNewLabel_6 = lblNewLabel_6;
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

}
