/**
 * SellingAreaUI42是SellingArea用户的司机信息管理删除界面
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

import listener.sellingarealistener.SellingAreaListener42;


public class SellingAreaUI42 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField;

	SellingAreaListener42 sellingarealistener;

	private JLabel lblNewLabel_17;

	private JLabel lblNewLabel_15;

	private JLabel lblNewLabel_13;

	private JLabel lblNewLabel_11;

	private JLabel lblNewLabel_9;

	private JLabel lblNewLabel_7;

	private JLabel lblNewLabel_8;

	private JLabel lblNewLabel_3;

	private JButton btnNewButton_17;

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
	public SellingAreaUI42(CardLayout card, int i, int j) {
		sellingarealistener = new SellingAreaListener42(this,card);
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
		this.setBackground(new Color(158,211,238));
		this.setBounds(136, 114, 746, 439);

		this.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 747, 45);
		this.add(panel_5);
		panel_5.setLayout(null);

		btnNewButton_10 = new JButton("\u67E5\u8BE2");
		btnNewButton_10.setBackground(new Color(255, 248, 220));
		btnNewButton_10.setBounds(64, 6, 90, 30);
		panel_5.add(btnNewButton_10);

		btnNewButton_11 = new JButton("\u66F4\u65B0");
		btnNewButton_11.setBounds(223, 6, 90, 30);
		panel_5.add(btnNewButton_11);

		btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(371, 6, 90, 30);
		panel_5.add(btnNewButton_13);

		btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBounds(540, 6, 90, 30);
		panel_5.add(btnNewButton_14);


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

		lblNewLabel_3 = new JLabel("3");
		lblNewLabel_3.setBounds(120, 6, 100, 18);
		panel_6.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("出生日期：");
		lblNewLabel_4.setBounds(6, 49, 100, 18);
		panel_6.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("性别：");
		lblNewLabel_5.setBounds(6, 102, 100, 18);
		panel_6.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("车辆单位：");
		lblNewLabel_6.setBounds(6, 152, 100, 18);
		panel_6.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("7New label");
		lblNewLabel_7.setBounds(120, 49,100, 18);
		panel_6.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("8New label");
		lblNewLabel_8.setBounds(120, 102, 100, 18);
		panel_6.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("9New label");
		lblNewLabel_9.setBounds(120, 152, 100, 18);
		panel_6.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("司机姓名：");
		lblNewLabel_10.setBounds(304, 6, 100, 18);
		panel_6.add(lblNewLabel_10);

		lblNewLabel_11 = new JLabel("11New label");
		lblNewLabel_11.setBounds(431, 6, 100, 18);
		panel_6.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("身份证号：");
		lblNewLabel_12.setBounds(304, 49, 100, 18);
		panel_6.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("13New label");
		lblNewLabel_13.setBounds(431, 49, 100, 18);
		panel_6.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("手机号码：");
		lblNewLabel_14.setBounds(304, 102, 100, 18);
		panel_6.add(lblNewLabel_14);

		lblNewLabel_15 = new JLabel("15New label");
		lblNewLabel_15.setBounds(431, 102, 100, 18);
		panel_6.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("行驶证期限：");
		lblNewLabel_16.setBounds(304, 152, 100, 18);
		panel_6.add(lblNewLabel_16);

		lblNewLabel_17 = new JLabel("17New label");
		lblNewLabel_17.setBounds(431, 152, 100, 18);
		panel_6.add(lblNewLabel_17);

		btnNewButton_16 = new JButton("\u5220\u9664");
		btnNewButton_16.setBounds(94, 385, 90, 30);
		this.add(btnNewButton_16);

		btnNewButton_17 = new JButton("\u53D6\u6D88");
		btnNewButton_17.setBounds(490, 385, 90, 30);
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

	public JLabel getLblNewLabel_17() {
		return lblNewLabel_17;
	}

	public void setLblNewLabel_17(JLabel lblNewLabel_17) {
		this.lblNewLabel_17 = lblNewLabel_17;
	}

	public JLabel getLblNewLabel_15() {
		return lblNewLabel_15;
	}

	public void setLblNewLabel_15(JLabel lblNewLabel_15) {
		this.lblNewLabel_15 = lblNewLabel_15;
	}

	public JLabel getLblNewLabel_13() {
		return lblNewLabel_13;
	}

	public void setLblNewLabel_13(JLabel lblNewLabel_13) {
		this.lblNewLabel_13 = lblNewLabel_13;
	}

	public JLabel getLblNewLabel_11() {
		return lblNewLabel_11;
	}

	public void setLblNewLabel_11(JLabel lblNewLabel_11) {
		this.lblNewLabel_11 = lblNewLabel_11;
	}

	public JLabel getLblNewLabel_9() {
		return lblNewLabel_9;
	}

	public void setLblNewLabel_9(JLabel lblNewLabel_9) {
		this.lblNewLabel_9 = lblNewLabel_9;
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

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
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

	private void setImage() {
	}
}