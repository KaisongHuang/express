/**
 * SellingAreaUI4是SellingArea用户的司机信息管理查询界面
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

import listener.sellingarealistener.SellingAreaListener4_1;


public class SellingAreaUI4_1 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField;

	SellingAreaListener4_1 sellingarealistener;

	private JButton btnNewButton_15;

	private JButton btnNewButton_16;

	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private int width;
	private int height;
	/**
	 * Create the application.
	 * @param card
	 * @param j
	 * @param i
	 */
	public SellingAreaUI4_1( int i, int j) {
		sellingarealistener = new SellingAreaListener4_1(this);
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
		this.setBounds(136, 114, 746, 439);

		this.setLayout(null);



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

		btnNewButton_16 = new JButton("取消");
		btnNewButton_16.setBounds(450, 50, 100, 30);
		this.add(btnNewButton_16);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(24, 105, 579, 209);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("司机编号：");
		lblNewLabel_2.setBounds(6, 6, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("");
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

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(120, 49,100, 18);
		panel_6.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(120, 102, 100, 18);
		panel_6.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(120, 152, 100, 18);
		panel_6.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("司机姓名：");
		lblNewLabel_10.setBounds(304, 6, 100, 18);
		panel_6.add(lblNewLabel_10);

		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(431, 6, 100, 18);
		panel_6.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("身份证号：");
		lblNewLabel_12.setBounds(304, 49, 100, 18);
		panel_6.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(431, 49, 100, 18);
		panel_6.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("手机号码：");
		lblNewLabel_14.setBounds(304, 102, 100, 18);
		panel_6.add(lblNewLabel_14);

		lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setBounds(431, 102, 100, 18);
		panel_6.add(lblNewLabel_15);

		JLabel lblNewLabel_16 = new JLabel("行驶证期限：");
		lblNewLabel_16.setBounds(304, 152, 100, 18);
		panel_6.add(lblNewLabel_16);

		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(431, 152, 100, 18);
		panel_6.add(lblNewLabel_17);

		btnNewButton_15.addActionListener(sellingarealistener);
		btnNewButton_16.addActionListener(sellingarealistener);

	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
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

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
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
	private void setImage() {
	}

}
