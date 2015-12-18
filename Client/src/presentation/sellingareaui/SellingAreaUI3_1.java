/**
 * SellingAreaUI3是SellingArea用户的车辆信息管理查询界面
 */

package presentation.sellingareaui;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.JTextField;

import listener.sellingarealistener.SellingAreaListener3_1;


public class SellingAreaUI3_1 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField;

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;

	private JButton button_1;
	private JButton button_2;

	private JPanel panel_6;
	SellingAreaListener3_1 sellingarealistener;

	private int width;
	private int height;
	
	/**
	 * Create the application.
	 * @param card
	 * @param j
	 * @param i
	 */
	public SellingAreaUI3_1(int i, int j) {
		sellingarealistener = new SellingAreaListener3_1(this);
		width=i;
		height=j;
		initialize();
		setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {



		this.setBackground(new Color(158,211,238));
		this.setBounds(0, 0, 745, 394);
		this.setLayout(null);

		
		lblNewLabel_1 = new JLabel("车辆编号：");
		lblNewLabel_1.setBounds(44, 62, 100, 18);
		this.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(154, 56, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		button_1 = new JButton("查询");
		button_1.setBounds(360, 56,100, 30);
		this.add(button_1);

		button_2 = new JButton("清空");
		button_2.setBounds(470, 56,100, 30);
		this.add(button_2);

		panel_6 = new JPanel();
		panel_6.setBounds(34, 115, 641, 199);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_2 = new JLabel("车辆编号：");
		lblNewLabel_2.setBounds(34, 23, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(152, 23, 100, 18);
		panel_6.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("发动机编号：");
		lblNewLabel_4.setBounds(323, 23, 100, 18);
		panel_6.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(466, 23, 100, 18);
		panel_6.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("车辆号：");
		lblNewLabel_6.setBounds(34, 74, 100, 18);
		panel_6.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(152, 74, 100, 18);
		panel_6.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("购买时间：");
		lblNewLabel_8.setBounds(34, 130, 100, 18);
		panel_6.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(152, 130, 100, 18);
		panel_6.add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("底盘号：");
		lblNewLabel_10.setBounds(323, 74, 100, 18);
		panel_6.add(lblNewLabel_10);

		lblNewLabel_11 = new JLabel("服役时间：");
		lblNewLabel_11.setBounds(323, 130, 100, 18);
		panel_6.add(lblNewLabel_11);

		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(466, 74, 100, 18);
		panel_6.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(466, 130, 100, 18);
		panel_6.add(lblNewLabel_13);

		button_1.addActionListener(sellingarealistener);
		button_2.addActionListener(sellingarealistener);
	}


	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
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

	public JLabel getLblNewLabel_9() {
		return lblNewLabel_9;
	}

	public void setLblNewLabel_9(JLabel lblNewLabel_9) {
		this.lblNewLabel_9 = lblNewLabel_9;
	}

	public JLabel getLblNewLabel_10() {
		return lblNewLabel_10;
	}

	public void setLblNewLabel_10(JLabel lblNewLabel_10) {
		this.lblNewLabel_10 = lblNewLabel_10;
	}

	public JLabel getLblNewLabel_11() {
		return lblNewLabel_11;
	}

	public void setLblNewLabel_11(JLabel lblNewLabel_11) {
		this.lblNewLabel_11 = lblNewLabel_11;
	}

	public JLabel getLblNewLabel_12() {
		return lblNewLabel_12;
	}

	public void setLblNewLabel_12(JLabel lblNewLabel_12) {
		this.lblNewLabel_12 = lblNewLabel_12;
	}

	public JLabel getLblNewLabel_13() {
		return lblNewLabel_13;
	}

	public void setLblNewLabel_13(JLabel lblNewLabel_13) {
		this.lblNewLabel_13 = lblNewLabel_13;
	}

	public JButton getButton_1() {
		return button_1;
	}

	public void setButton_1(JButton button_1) {
		this.button_1 = button_1;
	}

	public JButton getButton_2() {
		return button_2;
	}

	public void setButton_2(JButton button_2) {
		this.button_2 = button_2;
	}
}