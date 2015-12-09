/**
 * SellingAreaUI43是SellingArea用户的司机信息管理增加界面
 */

package presentation.sellingareaui;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import javax.swing.JTextField;

import listener.sellingarealistener.SellingAreaListener43;


public class SellingAreaUI43 extends JPanel{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	private JButton btnNewButton_17;
	private JButton btnNewButton_16;
	private JButton btnNewButton_14;
	private JButton btnNewButton_13;
	private JButton btnNewButton_11;
	private JButton btnNewButton_10;


	SellingAreaListener43 sellingarealistener;
	@SuppressWarnings("unused")
	private int width;
	@SuppressWarnings("unused")
	private int height;

	/**
	 * Create the application.
	 * @param card
	 * @param j
	 * @param i
	 */
	public SellingAreaUI43(CardLayout card, int i, int j) {
		sellingarealistener = new SellingAreaListener43(this,card);
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
		panel_5.setBounds(0, 0, 746, 45);
		this.add(panel_5);
		panel_5.setLayout(null);

		btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.setBounds(64, 6, 90, 30);
		panel_5.add(btnNewButton_10);

		btnNewButton_11 = new JButton("\u66F4\u65B0");
		btnNewButton_11.setBackground(new Color(255, 248, 220));
		btnNewButton_11.setBounds(223, 6, 90, 30);
		panel_5.add(btnNewButton_11);

		btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(371, 6, 90, 30);
		panel_5.add(btnNewButton_13);

		btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBounds(540, 6, 90, 30);
		panel_5.add(btnNewButton_14);


		JPanel panel_6 = new JPanel();
		panel_6.setBounds(24, 105, 579, 209);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("司机编号：");
		lblNewLabel_2.setBounds(6, 6, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField_1 = new JTextField("3");
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

		textField_2 = new JTextField("7New label");
		textField_2.setBounds(120, 49,100, 30);
		panel_6.add(textField_2);

		textField_3 = new JTextField("8New label");
		textField_3.setBounds(120, 102, 100, 30);
		panel_6.add(textField_3);

		textField_4 = new JTextField("9New label");
		textField_4.setBounds(120, 152, 100, 30);
		panel_6.add(textField_4);

		JLabel lblNewLabel_10 = new JLabel("司机姓名：");
		lblNewLabel_10.setBounds(304, 6, 100, 18);
		panel_6.add(lblNewLabel_10);

		textField_5 = new JTextField("11New label");
		textField_5.setBounds(431, 6, 100, 30);
		panel_6.add(textField_5);

		JLabel lblNewLabel_12 = new JLabel("身份证号：");
		lblNewLabel_12.setBounds(304, 49, 100, 18);
		panel_6.add(lblNewLabel_12);

		textField_6 = new JTextField("13New label");
		textField_6.setBounds(431, 49, 100, 30);
		panel_6.add(textField_6);

		JLabel lblNewLabel_14 = new JLabel("手机号码：");
		lblNewLabel_14.setBounds(304, 102, 100, 18);
		panel_6.add(lblNewLabel_14);

		textField_7 = new JTextField("15New label");
		textField_7.setBounds(431, 102, 100, 30);
		panel_6.add(textField_7);

		JLabel lblNewLabel_16 = new JLabel("行驶证期限：");
		lblNewLabel_16.setBounds(304, 152, 100, 18);
		panel_6.add(lblNewLabel_16);

		textField_8 = new JTextField("17New label");
		textField_8.setBounds(431, 152, 100, 30);
		panel_6.add(textField_8);

		btnNewButton_16 = new JButton("添加");
		btnNewButton_16.setBounds(83, 382, 90, 30);
		this.add(btnNewButton_16);

		btnNewButton_17 = new JButton("\u53D6\u6D88");
		btnNewButton_17.setBounds(431, 382, 90, 30);
		this.add(btnNewButton_17);

		btnNewButton_10.addActionListener(sellingarealistener);
		btnNewButton_11.addActionListener(sellingarealistener);
		btnNewButton_13.addActionListener(sellingarealistener);
		btnNewButton_14.addActionListener(sellingarealistener);
		btnNewButton_16.addActionListener(sellingarealistener);
		btnNewButton_17.addActionListener(sellingarealistener);

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