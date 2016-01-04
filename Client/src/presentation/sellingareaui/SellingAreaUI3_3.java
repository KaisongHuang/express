/**
 * SellingAreaUI32是SellingArea用户的车辆信息管理删除界面
 */

package presentation.sellingareaui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;

import listener.sellingarealistener.SellingAreaListener3_3;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;

public class SellingAreaUI3_3 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private MyTextField textField;

	SellingAreaListener3_3 sellingarealistener;

	private MyButton btnNewButton_16;

	private MyButton btnNewButton_15;

	private MyButton button_1;

	private MyButton btnNewButton_14;

	private MyButton btnNewButton_13;

	private MyButton btnNewButton_11;

	private MyButton btnNewButton_10;

	private JLabel lblNewLabel_13;

	private JLabel lblNewLabel_12;

	private JLabel lblNewLabel_11;

	private JLabel lblNewLabel_10;

	private JLabel lblNewLabel_9;

	private JLabel lblNewLabel_8;

	private JLabel lblNewLabel_6;

	private JLabel lblNewLabel_5;

	private JLabel lblNewLabel_4;

	private JLabel lblNewLabel_3;

	private JLabel lblNewLabel_2;

	private JLabel lblNewLabel_1;

	private MyDialog dialog;
	private JLabel lblNewLabel_7;
	private int width;
	private int height;

	/**
	 * Create the application.
	 * 
	 * @param card
	 * @param j
	 * @param i
	 */
	public SellingAreaUI3_3(int i, int j) {
		sellingarealistener = new SellingAreaListener3_3(this);
		width = i;
		height = j;
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

		lblNewLabel_1 = new JLabel("车辆编号：");
		lblNewLabel_1.setBounds(48, 67, 100, 18);
		this.add(lblNewLabel_1);

		dialog=new MyDialog();
		this.add(dialog);
		textField = new MyTextField();
		textField.setBounds(114, 61, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		button_1 = new MyButton("查询");
		button_1.setBounds(248, 61, 100, 30);
		this.add(button_1);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(35, 97, 587, 197);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_2 = new JLabel("车辆编号：");
		lblNewLabel_2.setBounds(16, 16, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(118, 16, 100, 18);
		panel_6.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("车辆号：");
		lblNewLabel_4.setBounds(16, 72, 100, 18);
		panel_6.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(118, 72, 100, 18);
		panel_6.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("购买时间：");
		lblNewLabel_6.setBounds(16, 132, 100, 18);
		panel_6.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(118, 132, 100, 18);
		panel_6.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("发动机号：");
		lblNewLabel_8.setBounds(311, 16, 100, 18);
		panel_6.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(435, 16, 100, 18);
		panel_6.add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("底盘号：");
		lblNewLabel_10.setBounds(311, 72, 100, 18);
		panel_6.add(lblNewLabel_10);

		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(435, 72, 100, 18);
		panel_6.add(lblNewLabel_11);

		lblNewLabel_12 = new JLabel("服役时间：");
		lblNewLabel_12.setBounds(311, 132, 100, 18);
		panel_6.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(435, 132, 100, 18);
		panel_6.add(lblNewLabel_13);

		btnNewButton_15 = new MyButton("\u5220\u9664");
		btnNewButton_15.setBounds(360, 61, 100, 30);
		this.add(btnNewButton_15);

		btnNewButton_16 = new MyButton("清空");
		btnNewButton_16.setBounds(472, 61, 100, 30);
		this.add(btnNewButton_16);

		btnNewButton_15.addActionListener(sellingarealistener);
		btnNewButton_16.addActionListener(sellingarealistener);
		button_1.addActionListener(sellingarealistener);

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

	public MyButton getBtnNewButton_16() {
		return btnNewButton_16;
	}

	public void setBtnNewButton_16(MyButton btnNewButton_16) {
		this.btnNewButton_16 = btnNewButton_16;
	}

	public MyButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	public void setBtnNewButton_15(MyButton btnNewButton_15) {
		this.btnNewButton_15 = btnNewButton_15;
	}

	public MyButton getButton_1() {
		return button_1;
	}

	public void setButton_1(MyButton button_1) {
		this.button_1 = button_1;
	}

	public MyButton getBtnNewButton_14() {
		return btnNewButton_14;
	}

	public void setBtnNewButton_14(MyButton btnNewButton_14) {
		this.btnNewButton_14 = btnNewButton_14;
	}

	public MyButton getBtnNewButton_13() {
		return btnNewButton_13;
	}

	public void setBtnNewButton_13(MyButton btnNewButton_13) {
		this.btnNewButton_13 = btnNewButton_13;
	}

	public MyButton getBtnNewButton_11() {
		return btnNewButton_11;
	}

	public void setBtnNewButton_11(MyButton btnNewButton_11) {
		this.btnNewButton_11 = btnNewButton_11;
	}

	public MyButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public void setBtnNewButton_10(MyButton btnNewButton_10) {
		this.btnNewButton_10 = btnNewButton_10;
	}

	public JLabel getLblNewLabel_13() {
		return lblNewLabel_13;
	}

	public void setLblNewLabel_13(JLabel lblNewLabel_13) {
		this.lblNewLabel_13 = lblNewLabel_13;
	}

	public JLabel getLblNewLabel_12() {
		return lblNewLabel_12;
	}

	public void setLblNewLabel_12(JLabel lblNewLabel_12) {
		this.lblNewLabel_12 = lblNewLabel_12;
	}

	public JLabel getLblNewLabel_11() {
		return lblNewLabel_11;
	}

	public void setLblNewLabel_11(JLabel lblNewLabel_11) {
		this.lblNewLabel_11 = lblNewLabel_11;
	}

	public JLabel getLblNewLabel_10() {
		return lblNewLabel_10;
	}

	public void setLblNewLabel_10(JLabel lblNewLabel_10) {
		this.lblNewLabel_10 = lblNewLabel_10;
	}

	public JLabel getLblNewLabel_9() {
		return lblNewLabel_9;
	}

	public void setLblNewLabel_9(JLabel lblNewLabel_9) {
		this.lblNewLabel_9 = lblNewLabel_9;
	}

	public JLabel getLblNewLabel_8() {
		return lblNewLabel_8;
	}

	public void setLblNewLabel_8(JLabel lblNewLabel_8) {
		this.lblNewLabel_8 = lblNewLabel_8;
	}

	public JLabel getLblNewLabel_6() {
		return lblNewLabel_6;
	}

	public void setLblNewLabel_6(JLabel lblNewLabel_6) {
		this.lblNewLabel_6 = lblNewLabel_6;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
	}

	private void setImage() {
	}
}
