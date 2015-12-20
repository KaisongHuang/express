/**
 * SellingAreaUI41是SellingArea用户的司机信息管理更新界面
 */

package presentation.sellingareaui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JTextField;

import listener.sellingarealistener.SellingAreaListener4_2;


public class SellingAreaUI4_2 extends JPanel{

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
	private JTextField textField_7;
	private JTextField textField_8;

	SellingAreaListener4_2 sellingarealistener;
	private JButton btnNewButton_17;
	private JButton btnNewButton_16;
	private JButton btnNewButton_15;
	private int width;
	private int height;
	/**
	 * Create the application.
	 * @param card
	 * @param j
	 * @param i
	 */
	public SellingAreaUI4_2(int i, int j) {
		sellingarealistener = new SellingAreaListener4_2(this);
		width=i;
		height=j;
		initialize();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(Color.white);
		this.setBounds(136, 114, 746, 439);

		this.setLayout(null);


		JLabel lblNewLabel_1 = new JLabel("司机编号：");
		lblNewLabel_1.setBounds(24, 56, 100, 18);
		this.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(142, 50, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		btnNewButton_15 = new JButton("查询");
		btnNewButton_15.setBounds(343, 50, 100, 30);
		this.add(btnNewButton_15);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(24, 105, 579, 209);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("司机编号：");
		lblNewLabel_2.setBounds(6, 6, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField_1 = new JTextField("");
		textField_1.setBounds(120, 6, 100, 30);
		panel_6.add(textField_1);

		JLabel lblNewLabel_4 = new JLabel("出生日期：");
		lblNewLabel_4.setBounds(6, 49, 100, 18);
		panel_6.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("性别：");
		lblNewLabel_5.setBounds(6, 102, 100, 18);
		panel_6.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("车辆单位：");
		lblNewLabel_6.setBounds(6, 152, 100, 18);
		panel_6.add(lblNewLabel_6);

		textField_2 = new JTextField("");
		textField_2.setBounds(120, 49,100, 30);
		panel_6.add(textField_2);

		textField_3 = new JTextField("");
		textField_3.setBounds(120, 102, 100, 30);
		panel_6.add(textField_3);

		textField_4 = new JTextField("");
		textField_4.setBounds(120, 152, 100, 30);
		panel_6.add(textField_4);

		JLabel lblNewLabel_10 = new JLabel("司机姓名：");
		lblNewLabel_10.setBounds(304, 6, 100, 18);
		panel_6.add(lblNewLabel_10);

		textField_5 = new JTextField("");
		textField_5.setBounds(431, 6, 100, 30);
		panel_6.add(textField_5);

		JLabel lblNewLabel_12 = new JLabel("身份证号：");
		lblNewLabel_12.setBounds(304, 49, 100, 18);
		panel_6.add(lblNewLabel_12);

		textField_6 = new JTextField("");
		textField_6.setBounds(431, 49, 100, 30);
		panel_6.add(textField_6);

		JLabel lblNewLabel_14 = new JLabel("手机号码：");
		lblNewLabel_14.setBounds(304, 102, 100, 18);
		panel_6.add(lblNewLabel_14);

		textField_7 = new JTextField("");
		textField_7.setBounds(431, 102, 100, 30);
		panel_6.add(textField_7);

		JLabel lblNewLabel_16 = new JLabel("行驶证期限：");
		lblNewLabel_16.setBounds(304, 152, 100, 18);
		panel_6.add(lblNewLabel_16);

		textField_8 = new JTextField("");
		textField_8.setBounds(431, 152, 100, 30);
		panel_6.add(textField_8);

		btnNewButton_16 = new JButton("\u66F4\u65B0");
		btnNewButton_16.setBounds(83, 382, 90, 30);
		this.add(btnNewButton_16);

		btnNewButton_17 = new JButton("\u53D6\u6D88");
		btnNewButton_17.setBounds(431, 382, 90, 30);
		this.add(btnNewButton_17);

		btnNewButton_15.addActionListener(sellingarealistener);
		btnNewButton_16.addActionListener(sellingarealistener);
		btnNewButton_17.addActionListener(sellingarealistener);


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

	public JTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public JButton getBtnNewButton_17() {
		return btnNewButton_17;
	}

	public void setBtnNewButton_17(JButton btnNewButton_17) {
		this.btnNewButton_17 = btnNewButton_17;
	}

	public JButton getBtnNewButton_16() {
		return btnNewButton_16;
	}

	public void setBtnNewButton_16(JButton btnNewButton_16) {
		this.btnNewButton_16 = btnNewButton_16;
	}

	public JButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	public void setBtnNewButton_15(JButton btnNewButton_15) {
		this.btnNewButton_15 = btnNewButton_15;
	}


}