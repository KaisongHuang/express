/**
 * SellingAreaUI31是SellingArea用户的车辆信息管理更新界面
 */

package presentation.sellingareaui;

import java.awt.Color;
import javax.swing.*;
import listener.sellingarealistener.SellingAreaListener3_2;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;



public class SellingAreaUI3_2 extends JPanel{


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

	private MyDialog dialog;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;

	private MyButton btnNewButton_10;
	private MyButton btnNewButton_11;
	private MyButton btnNewButton_13;
	private MyButton btnNewButton_14;
	private MyButton btnNewButton_15;
	private MyButton btnNewButton_16;
	private MyButton btnNewButton_17;

	SellingAreaListener3_2 sellingarealistener;
	private int width;
	private int height;
	/**
	 * Create the application.
	 * @param card
	 * @param j
	 * @param i
	 */
	
	public SellingAreaUI3_2(int i, int j) {
		sellingarealistener = new SellingAreaListener3_2(this);
		width=i;
		height=j;
		initialize();
		this.setImage();
		this.setVisible(true);	
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(Color.white);
		this.setBounds(136, 114, 720,480);
		this.setLayout(null);

		dialog=new MyDialog();
		this.add(dialog);
		lblNewLabel_1 = new JLabel("车辆编号：");
		lblNewLabel_1.setBounds(51, 57, 100, 18);
		this.add(lblNewLabel_1);

		textField = new MyTextField();
		textField.setBounds(138, 51, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		 btnNewButton_15 = new MyButton("查询");
		btnNewButton_15.setBounds(272, 51, 100, 30);
		this.add(btnNewButton_15);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(35, 97, 623, 220);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_2 = new JLabel("车辆编号：");
		lblNewLabel_2.setBounds(18, 17, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("车辆号：");
		lblNewLabel_3.setBounds(18, 83, 100, 18);
		panel_6.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("购买时间：");
		lblNewLabel_4.setBounds(18, 144, 100, 18);
		panel_6.add(lblNewLabel_4);

		textField_1 = new MyTextField();
		textField_1.setBounds(106, 11, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new MyTextField();
		textField_2.setBounds(106, 77, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new MyTextField();
		textField_3.setBounds(106, 138, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		lblNewLabel_5 = new JLabel("发动机编号：");
		lblNewLabel_5.setBounds(324, 17, 100, 18);
		panel_6.add(lblNewLabel_5);

		textField_4 = new MyTextField();
		textField_4.setBounds(440, 11, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		lblNewLabel_6 = new JLabel("底盘号：");
		lblNewLabel_6.setBounds(324, 83, 100, 18);
		panel_6.add(lblNewLabel_6);

		textField_5 = new MyTextField();
		textField_5.setBounds(440, 77, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		lblNewLabel_7 = new JLabel("服役时间：");
		lblNewLabel_7.setBounds(324, 144, 100, 18);
		panel_6.add(lblNewLabel_7);

		textField_6 = new MyTextField();
		textField_6.setBounds(440, 138, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);

		 btnNewButton_16 = new MyButton("\u786E\u8BA4");
		btnNewButton_16.setBounds(384, 51, 100, 30);
		this.add(btnNewButton_16);

		 btnNewButton_17 = new MyButton("清空");
		btnNewButton_17.setBounds(496, 51, 100, 30);
		this.add(btnNewButton_17);

		btnNewButton_15.addActionListener(sellingarealistener);
		btnNewButton_16.addActionListener(sellingarealistener);
		btnNewButton_17.addActionListener(sellingarealistener);

	}

	public void setText(String s){
		dialog.setText(s);;
	}
	public void setErrorText(String s){
		dialog.setErrorText(s);;
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

	public MyButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public void setBtnNewButton_10(MyButton btnNewButton_10) {
		this.btnNewButton_10 = btnNewButton_10;
	}

	public MyButton getBtnNewButton_11() {
		return btnNewButton_11;
	}

	public void setBtnNewButton_11(MyButton btnNewButton_11) {
		this.btnNewButton_11 = btnNewButton_11;
	}

	public MyButton getBtnNewButton_13() {
		return btnNewButton_13;
	}

	public void setBtnNewButton_13(MyButton btnNewButton_13) {
		this.btnNewButton_13 = btnNewButton_13;
	}

	public MyButton getBtnNewButton_14() {
		return btnNewButton_14;
	}

	public void setBtnNewButton_14(MyButton btnNewButton_14) {
		this.btnNewButton_14 = btnNewButton_14;
	}

	public MyButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	public void setBtnNewButton_15(MyButton btnNewButton_15) {
		this.btnNewButton_15 = btnNewButton_15;
	}

	public MyButton getBtnNewButton_16() {
		return btnNewButton_16;
	}

	public void setBtnNewButton_16(MyButton btnNewButton_16) {
		this.btnNewButton_16 = btnNewButton_16;
	}

	public MyButton getBtnNewButton_17() {
		return btnNewButton_17;
	}

	public void setBtnNewButton_17(MyButton btnNewButton_17) {
		this.btnNewButton_17 = btnNewButton_17;
	}

	private void setImage() {
	}
}
