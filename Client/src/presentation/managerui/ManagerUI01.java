/**
 * ManagerUI01是manager用户的人员管理的更新界面
 */

package presentation.managerui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.managerlistener.ManagerListener01;


public class ManagerUI01 extends JPanel{


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
	private JTextField textField_6;

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;

	ManagerListener01 managerlistener;

	/**
	 * Create the application.
	 * @param card
	 */
	public ManagerUI01(CardLayout card) {
		managerlistener = new ManagerListener01(this,card);
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
		btnNewButton_12.setBackground(new Color(255, 248, 220));
		btnNewButton_12.setBounds(158, 6, 100, 30);
		panel_5.add(btnNewButton_12);
		btnNewButton_12.addActionListener(managerlistener);

		btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(290, 6,100, 30);
		panel_5.add(btnNewButton_13);
		btnNewButton_13.addActionListener(managerlistener);

		btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBounds(453, 6, 100, 30);
		panel_5.add(btnNewButton_14);
		btnNewButton_14.addActionListener(managerlistener);

		lblNewLabel_1 = new JLabel("员工编号：");
		lblNewLabel_1.setBounds(23, 70, 100, 18);
		this.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(118, 65, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		btnNewButton_15 = new JButton("查询");
		btnNewButton_15.setBounds(290, 66, 100, 30);
		this.add(btnNewButton_15);
		btnNewButton_15.addActionListener(managerlistener);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(28, 123, 488, 209);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_2 = new JLabel("员工信息");
		lblNewLabel_2.setBounds(217, 3, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("员工姓名：");
		lblNewLabel_3.setBounds(3, 38,100, 18);
		panel_6.add(lblNewLabel_3);

		textField_1 = new JTextField();
		textField_1.setBounds(83, 34, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		lblNewLabel_4 = new JLabel("员工职位：");
		lblNewLabel_4.setBounds(3, 90, 100, 18);
		panel_6.add(lblNewLabel_4);

		textField_2 = new JTextField();
		textField_2.setBounds(86, 86, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		lblNewLabel_5 = new JLabel("上层机构：");
		lblNewLabel_5.setBounds(3, 149,100, 18);
		panel_6.add(lblNewLabel_5);

		textField_3 = new JTextField();
		textField_3.setBounds(85, 142, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		lblNewLabel_6 = new JLabel("员工编号：");
		lblNewLabel_6.setBounds(288, 40, 100, 18);
		panel_6.add(lblNewLabel_6);

		textField_4 = new JTextField();
		textField_4.setBounds(354, 32, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		lblNewLabel_7 = new JLabel("员工年龄：");
		lblNewLabel_7.setBounds(289, 94, 100, 18);
		panel_6.add(lblNewLabel_7);

		textField_5 = new JTextField();
		textField_5.setBounds(356, 92, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		lblNewLabel_8 = new JLabel("工作时间：");
		lblNewLabel_8.setBounds(290, 150, 100, 18);
		panel_6.add(lblNewLabel_8);

		textField_6 = new JTextField();
		textField_6.setBounds(354, 143, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);

		btnNewButton_16 = new JButton("确定");
		btnNewButton_16.setBounds(92, 378, 100, 30);
		this.add(btnNewButton_16);
		btnNewButton_16.addActionListener(managerlistener);

		btnNewButton_17 = new JButton("取消");
		btnNewButton_17.setBounds(425, 386, 100, 30);
		this.add(btnNewButton_17);
		btnNewButton_17.addActionListener(managerlistener);

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

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
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

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
	}

	public JLabel getLblNewLabel_8() {
		return lblNewLabel_8;
	}

	public void setLblNewLabel_8(JLabel lblNewLabel_8) {
		this.lblNewLabel_8 = lblNewLabel_8;
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

	public JButton getBtnNewButton_17() {
		return btnNewButton_17;
	}

	public void setBtnNewButton_17(JButton btnNewButton_17) {
		this.btnNewButton_17 = btnNewButton_17;
	}

}
