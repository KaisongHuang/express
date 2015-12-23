/**
 * CourierUI是courier用户的订单输入界面
 */

package presentation.courierui;

import javax.swing.JPanel;

import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextField;

import listener.courierlistener.CourierListener0;

import javax.swing.JComboBox;

//订单输入界面
public class CourierUI extends JPanel{


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
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	public JTextField getTextField_15() {
		return textField_15;
	}

	public JTextField getTextField_16() {
		return textField_16;
	}

	public JTextField getTextField_17() {
		return textField_17;
	}

	public JTextField getTextField_18() {
		return textField_18;
	}

	CourierListener0 courierlistener;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	@SuppressWarnings("unused")
	private int width;
	@SuppressWarnings("unused")
	private int height;

	
	/**
	 * Create the application.
	 * @param width
	 * @param width
	 */
	public CourierUI(int width, int height) {
		courierlistener = new CourierListener0(this);
		this.width=width;
		this.height=height;
		initialize();
		//this.setImage();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBackground(Color.white);

		this.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("寄件人信息");
		lblNewLabel_1.setBounds(300, 0, 84, 30);
		this.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("寄件人姓名：");
		lblNewLabel_2.setBounds(10, 25, 84, 30);
		this.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(83, 26, 121, 30);
		this.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("地址：");
		lblNewLabel_3.setBounds(216, 28, 65, 24);
		this.add(lblNewLabel_3);

		textField_1 = new JTextField();
		textField_1.setBounds(253, 25, 65, 30);
		this.add(textField_1);
		textField_1.setColumns(10);

		JLabel label = new JLabel("单位：");
		label.setBounds(9, 63,65, 27);
		this.add(label);

		textField_2 = new JTextField();
		textField_2.setBounds(83, 61, 121, 30);
		this.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("电话：");
		lblNewLabel_4.setBounds(216, 64, 72, 24);
		this.add(lblNewLabel_4);

		textField_3 = new JTextField();
		textField_3.setBounds(253, 62, 122, 29);
		this.add(textField_3);
		textField_3.setColumns(10);

		JLabel label_1 = new JLabel("手机：");
		label_1.setBounds(387, 66, 65, 21);
		this.add(label_1);

		textField_4 = new JTextField();
		textField_4.setBounds(429, 61, 154, 30);
		this.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("收件人信息");
		lblNewLabel_5.setBounds(300, 93, 84, 30);
		this.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("收件人姓名：");
		lblNewLabel_6.setBounds(10, 117, 84, 27);
		this.add(lblNewLabel_6);

		textField_5 = new JTextField();
		textField_5.setBounds(83, 114, 121, 30);
		this.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("地址：");
		lblNewLabel_7.setBounds(216, 117, 65, 27);
		this.add(lblNewLabel_7);

		textField_6 = new JTextField();
		textField_6.setBounds(253, 115, 65, 30);
		this.add(textField_6);
		textField_6.setColumns(10);

		JLabel label_2 = new JLabel("单位：");
		label_2.setBounds(10, 163, 65, 24);
		this.add(label_2);

		textField_7 = new JTextField();
		textField_7.setBounds(83, 160, 122, 30);
		this.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewlabel = new JLabel("电话：");
		lblNewlabel.setBounds(216, 163, 73, 25);
		this.add(lblNewlabel);

		textField_8 = new JTextField();
		textField_8.setBounds(253, 160, 122, 30);
		this.add(textField_8);
		textField_8.setColumns(10);

		JLabel label_3 = new JLabel("手机：");
		label_3.setBounds(387, 164, 72, 22);
		this.add(label_3);

		textField_9 = new JTextField();
		textField_9.setBounds(429, 160, 154, 30);
		this.add(textField_9);
		textField_9.setColumns(10);

		JLabel label_4 = new JLabel("货物信息");
		label_4.setBounds(300, 186, 84, 30);
		this.add(label_4);

		JLabel label_5 = new JLabel("原件数量：");
		label_5.setBounds(10, 226, 72, 24);
		this.add(label_5);

		textField_10 = new JTextField();
		textField_10.setBounds(83, 220, 121, 30);
		this.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("实际重量：");
		lblNewLabel_8.setBounds(216, 226, 72, 24);
		this.add(lblNewLabel_8);

		textField_11 = new JTextField();
		textField_11.setBounds(287, 224, 122, 30);
		this.add(textField_11);
		textField_11.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("体积：");
		lblNewLabel_9.setBounds(461, 228, 65, 21);
		this.add(lblNewLabel_9);

		textField_12 = new JTextField();
		textField_12.setBounds(511, 223, 122, 30);
		this.add(textField_12);
		textField_12.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("内件品名：");
		lblNewLabel_10.setBounds(10, 265, 72, 25);
		this.add(lblNewLabel_10);

		textField_13 = new JTextField();
		textField_13.setBounds(83, 259, 121, 31);
		this.add(textField_13);
		textField_13.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("尺寸：");
		lblNewLabel_11.setBounds(216, 268, 65, 22);
		this.add(lblNewLabel_11);

		textField_14 = new JTextField();
		textField_14.setBounds(287, 263, 122, 30);
		this.add(textField_14);
		textField_14.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("包装：");
		lblNewLabel_12.setBounds(14, 316, 65, 24);
		this.add(lblNewLabel_12);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(81, 312, 123, 28);
		comboBox.addItem("快递袋");
		comboBox.addItem("纸箱");
		comboBox.addItem("木箱");
		comboBox.setSelectedIndex(1);
		this.add(comboBox);

		JLabel label_6 = new JLabel("快递方式：");
		label_6.setBounds(216, 316, 65, 24);
		this.add(label_6);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(287, 311, 122, 29);
		comboBox_1.addItem("经快");
		comboBox_1.addItem("普快");
		comboBox_1.addItem("特快");
		comboBox_1.setSelectedIndex(1);
		this.add(comboBox_1);

		btnNewButton_10 = new JButton("\u4FDD\u5B58");
		btnNewButton_10.setBounds(138, 384, 100, 30);
		this.add(btnNewButton_10);

		btnNewButton_11 = new JButton("\u6E05\u7A7A");
		btnNewButton_11.setBounds(529, 384, 100, 30);
		this.add(btnNewButton_11);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(396, 25, 65, 30);
		add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(520, 25, 154, 30);
		add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(396, 115, 65, 30);
		add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(520, 115, 154, 30);
		add(textField_18);
		
		JLabel label_7 = new JLabel("省（直辖市）");
		label_7.setBounds(320, 32, 84, 16);
		add(label_7);
		
		JLabel label_9 = new JLabel("市（区）");
		label_9.setBounds(461, 32, 52, 16);
		add(label_9);
		
		JLabel label_8 = new JLabel("省（直辖市）");
		label_8.setBounds(320, 122, 83, 16);
		add(label_8);
		
		JLabel label_10 = new JLabel("市（区）");
		label_10.setBounds(461, 122, 52, 16);
		add(label_10);

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

	public JTextField getTextField_9() {
		return textField_9;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public JTextField getTextField_10() {
		return textField_10;
	}

	public void setTextField_10(JTextField textField_10) {
		this.textField_10 = textField_10;
	}

	public JTextField getTextField_11() {
		return textField_11;
	}

	public void setTextField_11(JTextField textField_11) {
		this.textField_11 = textField_11;
	}

	public JTextField getTextField_12() {
		return textField_12;
	}

	public void setTextField_12(JTextField textField_12) {
		this.textField_12 = textField_12;
	}

	public JTextField getTextField_13() {
		return textField_13;
	}

	public void setTextField_13(JTextField textField_13) {
		this.textField_13 = textField_13;
	}

	public JTextField getTextField_14() {
		return textField_14;
	}

	public void setTextField_14(JTextField textField_14) {
		this.textField_14 = textField_14;
	}

	public JComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox<String> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public JButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public void setBtnNewButton_10(JButton btnNewButton_10) {
		this.btnNewButton_10 = btnNewButton_10;
	}

	public JButton getBtnNewButton_11() {
		return btnNewButton_11;
	}

	public void setBtnNewButton_11(JButton btnNewButton_11) {
		this.btnNewButton_11 = btnNewButton_11;
	}

	@SuppressWarnings("unused")
	private void setImage() {
		
	}
}
