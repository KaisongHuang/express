/**
 * CourierUI是courier用户的订单输入界面
 */

package presentation.courierui;

import javax.swing.JPanel;

import javax.swing.JLabel;

import java.awt.Color;
import listener.courierlistener.CourierListener0;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyComboBox;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;

//订单输入界面
public class CourierUI extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;
	private MyTextField textField_2;
	private MyTextField textField_3;
	private MyTextField textField_4;
	private MyTextField textField_5;
	private MyTextField textField_6;
	private MyTextField textField_7;
	private MyTextField textField_8;
	private MyTextField textField_9;
	private MyTextField textField_10;
	private MyTextField textField_11;
	private MyTextField textField_12;
	private MyTextField textField_13;
	private MyTextField textField_14;
	private MyTextField textField_15;
	private MyTextField textField_16;
	private MyTextField textField_17;
	private MyTextField textField_18;
	private MyDialog dialog;
	private JLabel Money;
	private JLabel Time;

	CourierListener0 courierlistener;
	private MyComboBox<String> comboBox_1;
	private MyComboBox<String> comboBox;
	private MyButton confirm;
	private MyButton cancle;
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

		dialog=new MyDialog();
		this.add(dialog);
		textField = new MyTextField();
		textField.setBounds(83, 26, 121, 30);
		this.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("地址：");
		lblNewLabel_3.setBounds(216, 28, 65, 24);
		this.add(lblNewLabel_3);

		textField_1 = new MyTextField();
		textField_1.setBounds(253, 25, 65, 30);
		this.add(textField_1);
		textField_1.setColumns(10);

		JLabel label = new JLabel("单位：");
		label.setBounds(9, 63,65, 27);
		this.add(label);

		textField_2 = new MyTextField();
		textField_2.setBounds(83, 61, 121, 30);
		this.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("电话：");
		lblNewLabel_4.setBounds(216, 64, 72, 24);
		this.add(lblNewLabel_4);

		textField_3 = new MyTextField();
		textField_3.setBounds(253, 62, 122, 29);
		this.add(textField_3);
		textField_3.setColumns(10);

		JLabel label_1 = new JLabel("手机：");
		label_1.setBounds(387, 66, 65, 21);
		this.add(label_1);

		textField_4 = new MyTextField();
		textField_4.setBounds(429, 61, 154, 30);
		this.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("收件人信息");
		lblNewLabel_5.setBounds(300, 88, 84, 30);
		this.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("收件人姓名：");
		lblNewLabel_6.setBounds(10, 117, 84, 27);
		this.add(lblNewLabel_6);

		textField_5 = new MyTextField();
		textField_5.setBounds(83, 114, 121, 30);
		this.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("地址：");
		lblNewLabel_7.setBounds(216, 117, 65, 27);
		this.add(lblNewLabel_7);

		textField_6 = new MyTextField();
		textField_6.setBounds(253, 115, 65, 30);
		this.add(textField_6);
		textField_6.setColumns(10);

		JLabel label_2 = new JLabel("单位：");
		label_2.setBounds(10, 163, 65, 24);
		this.add(label_2);

		textField_7 = new MyTextField();
		textField_7.setBounds(83, 160, 122, 30);
		this.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewlabel = new JLabel("电话：");
		lblNewlabel.setBounds(216, 163, 73, 25);
		this.add(lblNewlabel);

		textField_8 = new MyTextField();
		textField_8.setBounds(253, 160, 122, 30);
		this.add(textField_8);
		textField_8.setColumns(10);

		JLabel label_3 = new JLabel("手机：");
		label_3.setBounds(387, 164, 72, 22);
		this.add(label_3);

		textField_9 = new MyTextField();
		textField_9.setBounds(429, 160, 154, 30);
		this.add(textField_9);
		textField_9.setColumns(10);

		JLabel label_4 = new JLabel("货物信息");
		label_4.setBounds(300, 193, 84, 30);
		this.add(label_4);

		JLabel label_5 = new JLabel("原件数量：");
		label_5.setBounds(10, 226, 72, 24);
		this.add(label_5);

		textField_10 = new MyTextField();
		textField_10.setBounds(83, 220, 121, 30);
		this.add(textField_10);
		textField_10.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("实际重量：");
		lblNewLabel_8.setBounds(216, 226, 72, 24);
		this.add(lblNewLabel_8);

		textField_11 = new MyTextField();
		textField_11.setBounds(287, 224, 122, 30);
		this.add(textField_11);
		textField_11.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("体积：");
		lblNewLabel_9.setBounds(461, 228, 65, 21);
		this.add(lblNewLabel_9);

		textField_12 = new MyTextField();
		textField_12.setBounds(511, 223, 122, 30);
		this.add(textField_12);
		textField_12.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("内件品名：");
		lblNewLabel_10.setBounds(10, 265, 72, 25);
		this.add(lblNewLabel_10);

		textField_13 = new MyTextField();
		textField_13.setBounds(83, 259, 121, 31);
		this.add(textField_13);
		textField_13.setColumns(10);

		JLabel lblNewLabel_11 = new JLabel("尺寸：");
		lblNewLabel_11.setBounds(216, 268, 65, 22);
		this.add(lblNewLabel_11);

		textField_14 = new MyTextField();
		textField_14.setBounds(287, 263, 122, 30);
		this.add(textField_14);
		textField_14.setColumns(10);

		JLabel lblNewLabel_12 = new JLabel("包装：");
		lblNewLabel_12.setBounds(14, 316, 65, 24);
		this.add(lblNewLabel_12);

		comboBox = new MyComboBox<String>();
		comboBox.setBounds(81, 312, 123, 28);
		comboBox.addItem("快递袋");
		comboBox.addItem("纸箱");
		comboBox.addItem("木箱");
		comboBox.setSelectedIndex(1);
		this.add(comboBox);

		JLabel label_6 = new JLabel("快递方式：");
		label_6.setBounds(216, 316, 65, 24);
		this.add(label_6);

		comboBox_1 = new MyComboBox<String>();
		comboBox_1.setBounds(287, 311, 122, 29);
		comboBox_1.addItem("经快");
		comboBox_1.addItem("普快");
		comboBox_1.addItem("特快");
		comboBox_1.setSelectedIndex(1);
		this.add(comboBox_1);

		confirm = new MyButton("确认");
		confirm.setBounds(138, 384, 100, 30);
		this.add(confirm);

		cancle = new MyButton("清空");
		cancle.setBounds(529, 384, 100, 30);
		this.add(cancle);

		textField_15 = new MyTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(396, 25, 65, 30);
		add(textField_15);

		textField_16 = new MyTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(520, 25, 154, 30);
		add(textField_16);

		textField_17 = new MyTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(396, 115, 65, 30);
		add(textField_17);

		textField_18 = new MyTextField();
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

		JLabel label_11 = new JLabel("时间：");
		label_11.setBounds(461, 270, 65, 21);
		add(label_11);

		JLabel label_12 = new JLabel("价格：");
		label_12.setBounds(461, 318, 65, 21);
		add(label_12);

		Time = new JLabel("");
		Time.setBounds(511, 270, 65, 21);
		add(Time);

		Money = new JLabel("");
		Money.setBounds(511, 318, 65, 21);
		add(Money);

		cancle.addActionListener(courierlistener);
		cancle.addMouseListener(courierlistener);
		confirm.addActionListener(courierlistener);
		confirm.addMouseListener(courierlistener);

	}
	public void setText(String s){
		dialog.setText(s);
	}
	public MyTextField getTextField() {
		return textField;
	}

	public void setTextField(MyTextField textField) {
		this.textField = textField;
	}

	public MyTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(MyTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public MyTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(MyTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public MyTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(MyTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public MyTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(MyTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public MyTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(MyTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public MyTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(MyTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public MyTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(MyTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public MyTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(MyTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public MyTextField getTextField_9() {
		return textField_9;
	}

	public void setTextField_9(MyTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public MyTextField getTextField_10() {
		return textField_10;
	}

	public void setTextField_10(MyTextField textField_10) {
		this.textField_10 = textField_10;
	}

	public MyTextField getTextField_11() {
		return textField_11;
	}
	public MyTextField getTextField_15() {
		return textField_15;
	}

	public MyTextField getTextField_16() {
		return textField_16;
	}

	public MyTextField getTextField_17() {
		return textField_17;
	}

	public MyTextField getTextField_18() {
		return textField_18;
	}
	public void setTextField_11(MyTextField textField_11) {
		this.textField_11 = textField_11;
	}

	public MyTextField getTextField_12() {
		return textField_12;
	}

	public void setTextField_12(MyTextField textField_12) {
		this.textField_12 = textField_12;
	}

	public MyTextField getTextField_13() {
		return textField_13;
	}

	public void setTextField_13(MyTextField textField_13) {
		this.textField_13 = textField_13;
	}

	public MyTextField getTextField_14() {
		return textField_14;
	}

	public void setTextField_14(MyTextField textField_14) {
		this.textField_14 = textField_14;
	}

	public MyComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(MyComboBox<String> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public MyComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(MyComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public MyButton getConfirm() {
		return confirm;
	}




	public JLabel getMoney() {
		return Money;
	}

	public void setMoney(String money) {
		Money.setText(money);
	}

	public JLabel getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time.setText(time);
	}

	public MyButton getCancle() {
		return cancle;
	}

	@SuppressWarnings("unused")
	private void setImage() {

	}
}
