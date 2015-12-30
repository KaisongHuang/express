/**
 * SellingAreaUI43是SellingArea用户的司机信息管理增加界面
 */

package presentation.sellingareaui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;


import listener.sellingarealistener.SellingAreaListener4_4;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;


public class SellingAreaUI4_4 extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField_1;
	private MyTextField textField_2;
	private MyTextField textField_3;
	private MyTextField textField_4;
	private MyTextField textField_5;
	private MyTextField textField_6;
	private MyTextField textField_7;
	private MyTextField textField_8;
    private MyDialog dialog;
	private MyButton btnNewButton_17;
	private MyButton btnNewButton_16;


	SellingAreaListener4_4 sellingarealistener;
	private int width;
	private int height;

	/**
	 * Create the application.
	 * @param card
	 * @param j
	 * @param i
	 */
	public SellingAreaUI4_4(int i, int j) {
		sellingarealistener = new SellingAreaListener4_4(this);
		width=i;
		height=j;
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(Color.white);
		this.setBounds(136, 114, 746, 439);

		this.setLayout(null);

		dialog=new MyDialog();
		this.add(dialog);
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(24, 105, 579, 209);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("司机编号：");
		lblNewLabel_2.setBounds(6, 6, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField_1 = new MyTextField();
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

		textField_2 = new MyTextField();
		textField_2.setBounds(120, 49,100, 30);
		panel_6.add(textField_2);

		textField_3 = new MyTextField();
		textField_3.setBounds(120, 102, 100, 30);
		panel_6.add(textField_3);

		textField_4 = new MyTextField();
		textField_4.setBounds(120, 152, 100, 30);
		panel_6.add(textField_4);

		JLabel lblNewLabel_10 = new JLabel("司机姓名：");
		lblNewLabel_10.setBounds(304, 6, 100, 18);
		panel_6.add(lblNewLabel_10);

		textField_5 = new MyTextField();
		textField_5.setBounds(431, 6, 100, 30);
		panel_6.add(textField_5);

		JLabel lblNewLabel_12 = new JLabel("身份证号：");
		lblNewLabel_12.setBounds(304, 49, 100, 18);
		panel_6.add(lblNewLabel_12);

		textField_6 = new MyTextField();
		textField_6.setBounds(431, 49, 100, 30);
		panel_6.add(textField_6);

		JLabel lblNewLabel_14 = new JLabel("手机号码：");
		lblNewLabel_14.setBounds(304, 102, 100, 18);
		panel_6.add(lblNewLabel_14);

		textField_7 = new MyTextField();
		textField_7.setBounds(431, 102, 100, 30);
		panel_6.add(textField_7);

		JLabel lblNewLabel_16 = new JLabel("行驶证期限：");
		lblNewLabel_16.setBounds(304, 152, 100, 18);
		panel_6.add(lblNewLabel_16);

		textField_8 = new MyTextField();
		textField_8.setBounds(431, 152, 100, 30);
		panel_6.add(textField_8);

		btnNewButton_16 = new MyButton("添加");
		btnNewButton_16.setBounds(30, 56, 90, 30);
		this.add(btnNewButton_16);

		btnNewButton_17 = new MyButton("清空");
		btnNewButton_17.setBounds(132, 56, 90, 30);
		this.add(btnNewButton_17);

		btnNewButton_16.addActionListener(sellingarealistener);
		btnNewButton_17.addActionListener(sellingarealistener);

	}
	public void setText(String s){
		dialog.setText(s);;
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

	public MyButton getBtnNewButton_17() {
		return btnNewButton_17;
	}

	public void setBtnNewButton_17(MyButton btnNewButton_17) {
		this.btnNewButton_17 = btnNewButton_17;
	}

	public MyButton getBtnNewButton_16() {
		return btnNewButton_16;
	}

	public void setBtnNewButton_16(MyButton btnNewButton_16) {
		this.btnNewButton_16 = btnNewButton_16;
	}
}