/**
 * SellingAreaUI31是SellingArea用户的车辆信息管理更新界面
 */

package presentation.sellingareaui;

import java.awt.CardLayout;

import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import javax.swing.JTextField;
import listener.sellingarealistener.SellingAreaListener31;
import javax.swing.JButton;


public class SellingAreaUI31 extends JPanel{


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

	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;

	SellingAreaListener31 sellingarealistener;
	private int width;
	private int height;
    private JLabel label1;
	/**
	 * Create the application.
	 * @param card
	 * @param j
	 * @param i
	 */
	public SellingAreaUI31(CardLayout card, int i, int j) {
		sellingarealistener = new SellingAreaListener31(this,card);
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

		 this.setBackground(new Color(158,211,240));
		this.setBounds(136, 114, 746, 439);

		this.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 744, 44);
		this.add(panel_5);
		panel_5.setLayout(null);

		 btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.setBounds(44, 8, 90, 30);
		panel_5.add(btnNewButton_10);

		 btnNewButton_11 = new JButton("\u66F4\u65B0");
		btnNewButton_11.setBackground(new Color(255, 248, 220));
		btnNewButton_11.setBounds(194, 8, 90, 30);
		panel_5.add(btnNewButton_11);

		 btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(348, 8, 90, 30);
		panel_5.add(btnNewButton_13);

		 btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBounds(525, 8, 90, 30);
		panel_5.add(btnNewButton_14);

		lblNewLabel_1 = new JLabel("车辆编号：");
		lblNewLabel_1.setBounds(52, 57, 100, 18);
		this.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(157, 51, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		 btnNewButton_15 = new JButton("查询");
		btnNewButton_15.setBounds(352, 51, 100, 30);
		this.add(btnNewButton_15);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(42, 98, 623, 220);
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

		textField_1 = new JTextField("1");
		textField_1.setBounds(106, 11, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField("2");
		textField_2.setBounds(106, 77, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField("3");
		textField_3.setBounds(106, 138, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		lblNewLabel_5 = new JLabel("发动机编号：");
		lblNewLabel_5.setBounds(324, 17, 100, 18);
		panel_6.add(lblNewLabel_5);

		textField_4 = new JTextField("4");
		textField_4.setBounds(440, 11, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		lblNewLabel_6 = new JLabel("底盘号：");
		lblNewLabel_6.setBounds(324, 83, 100, 18);
		panel_6.add(lblNewLabel_6);

		textField_5 = new JTextField("5");
		textField_5.setBounds(440, 77, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		lblNewLabel_7 = new JLabel("服役时间：");
		lblNewLabel_7.setBounds(324, 144, 100, 18);
		panel_6.add(lblNewLabel_7);

		textField_6 = new JTextField("6");
		textField_6.setBounds(440, 138, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);

		 btnNewButton_16 = new JButton("\u786E\u8BA4");
		btnNewButton_16.setBounds(148, 376, 100, 30);
		this.add(btnNewButton_16);

		 btnNewButton_17 = new JButton("\u53D6\u6D88");
		btnNewButton_17.setBounds(526, 376, 100, 30);
		this.add(btnNewButton_17);

		btnNewButton_10.addActionListener(sellingarealistener);
		btnNewButton_11.addActionListener(sellingarealistener);
		btnNewButton_13.addActionListener(sellingarealistener);
		btnNewButton_14.addActionListener(sellingarealistener);
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

	private void setImage() {
		label1 = new JLabel();
		label1.setBounds(0, 0, width,height);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/蓝色背景.png"));
		icon1.setImage(icon1.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

		label1.setIcon(icon1);
		this.add(label1);
	}
}
