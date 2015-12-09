/**
 * SellingAreaUI33是SellingArea用户的车辆信息管理增加界面
 */

package presentation.sellingareaui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.JTextField;

import listener.sellingarealistener.SellingAreaListener33;


public class SellingAreaUI33 extends JPanel{


	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	SellingAreaListener33 sellingarealistener;
	private JButton btnNewButton_16;
	private JButton btnNewButton_15;
	private JButton btnNewButton_14;
	private JButton btnNewButton_13;
	private JButton btnNewButton_11;
	private JButton btnNewButton_10;
	private int width;
	private int height;

	/**
	 * Create the application.
	 * @param card
	 * @param j
	 * @param i
	 */
	public SellingAreaUI33(CardLayout card, int i, int j) {
		sellingarealistener = new SellingAreaListener33(this,card);
		width=i;
		height=j;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(new Color(255, 255, 255));
		this.setBounds(136, 114, 746, 439);

		this.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 745, 45);
		this.add(panel_5);
		panel_5.setLayout(null);

		btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.setBounds(44, 8, 90, 30);
		panel_5.add(btnNewButton_10);

		btnNewButton_11 = new JButton("\u66F4\u65B0");
		btnNewButton_11.setBounds(194, 8, 90, 30);
		panel_5.add(btnNewButton_11);

		btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(348, 8, 90, 30);
		panel_5.add(btnNewButton_13);

		btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBackground(new Color(255, 248, 220));
		btnNewButton_14.setBounds(525, 8, 90, 30);
		panel_5.add(btnNewButton_14);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(35, 97, 634, 187);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("车辆编号：");
		lblNewLabel_1.setBounds(30, 18, 100, 18);
		panel_6.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(122, 12, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("发动机号：");
		lblNewLabel_2.setBounds(332, 18, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(463, 12, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("车辆号：");
		lblNewLabel_3.setBounds(30, 66, 100, 18);
		panel_6.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(122, 60, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("底盘号：");
		lblNewLabel_4.setBounds(332, 66, 100, 18);
		panel_6.add(lblNewLabel_4);

		textField_3 = new JTextField();
		textField_3.setBounds(463, 54, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("购买时间：");
		lblNewLabel_5.setBounds(30, 121, 100, 18);
		panel_6.add(lblNewLabel_5);

		textField_4 = new JTextField();
		textField_4.setBounds(122, 115, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("服役时间：");
		lblNewLabel_6.setBounds(332, 121, 100, 18);
		panel_6.add(lblNewLabel_6);

		textField_5 = new JTextField();
		textField_5.setBounds(463, 115, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		btnNewButton_15 = new JButton("\u6DFB\u52A0");
		btnNewButton_15.setBounds(107, 377, 100, 30);
		this.add(btnNewButton_15);

		btnNewButton_16 = new JButton("\u53D6\u6D88");
		btnNewButton_16.setBounds(491, 377, 100, 30);
		this.add(btnNewButton_16);

		btnNewButton_10.addActionListener(sellingarealistener);
		btnNewButton_11.addActionListener(sellingarealistener);
		btnNewButton_13.addActionListener(sellingarealistener);
		btnNewButton_14.addActionListener(sellingarealistener);
		btnNewButton_15.addActionListener(sellingarealistener);
		btnNewButton_16.addActionListener(sellingarealistener);

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

	public JButton getBtnNewButton_14() {
		return btnNewButton_14;
	}

	public void setBtnNewButton_14(JButton btnNewButton_14) {
		this.btnNewButton_14 = btnNewButton_14;
	}

	public JButton getBtnNewButton_13() {
		return btnNewButton_13;
	}

	public void setBtnNewButton_13(JButton btnNewButton_13) {
		this.btnNewButton_13 = btnNewButton_13;
	}

	public JButton getBtnNewButton_11() {
		return btnNewButton_11;
	}

	public void setBtnNewButton_11(JButton btnNewButton_11) {
		this.btnNewButton_11 = btnNewButton_11;
	}

	public JButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public void setBtnNewButton_10(JButton btnNewButton_10) {
		this.btnNewButton_10 = btnNewButton_10;
	}


}