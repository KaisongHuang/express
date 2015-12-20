/**
 * CentreUI1是centre用户的中转转出航运界面
 */

package presentation.centreui;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextField;

import listener.centrelistener.CentreListener1;


public class CentreUI1 extends JPanel{

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
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;

	CentreListener1 centrelistener;
	private int width;
	private int height;

	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public CentreUI1(int i, int j) {

		centrelistener = new CentreListener1(this);
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

		this.setBounds(136, 116, 746, 437);
		this.setBackground(Color.white);
		this.setLayout(null);
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(75, 59, 476, 282);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("中转转出");
		lblNewLabel_1.setBounds(202, 6, 100, 18);
		panel_6.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("装车日期：");
		lblNewLabel_2.setBounds(19, 44, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(102, 38, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(102, 90, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(102, 140, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(102, 194, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(348, 38, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("中转中心编号：");
		lblNewLabel_3.setBounds(19, 96, 100, 18);
		panel_6.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("航班号：");
		lblNewLabel_4.setBounds(19, 146, 100, 18);
		panel_6.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("货柜号：");
		lblNewLabel_5.setBounds(19, 200, 100, 18);
		panel_6.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("出发地：");
		lblNewLabel_6.setBounds(277, 44, 100, 18);
		panel_6.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("目的地：");
		lblNewLabel_7.setBounds(277, 96, 100, 18);
		panel_6.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("监装员：");
		lblNewLabel_8.setBounds(277, 146, 100, 18);
		panel_6.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("押运员：");
		lblNewLabel_9.setBounds(277, 200, 100, 18);
		panel_6.add(lblNewLabel_9);

		textField_5 = new JTextField();
		textField_5.setBounds(348, 90, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(348, 140, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(348, 194, 122, 30);
		panel_6.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_10 = new JLabel("费用：");
		lblNewLabel_10.setBounds(19, 243, 100, 18);
		panel_6.add(lblNewLabel_10);

		textField_8 = new JTextField();
		textField_8.setBounds(102, 243, 122, 30);
		panel_6.add(textField_8);
		textField_8.setColumns(10);

		btnNewButton_12 = new JButton("\u786E\u8BA4");
		btnNewButton_12.setBounds(83, 379, 90, 30);
		this.add(btnNewButton_12);
		btnNewButton_12.addActionListener(centrelistener);

		btnNewButton_13 = new JButton("\u53D6\u6D88");
		btnNewButton_13.setBounds(401, 379, 90, 30);
		this.add(btnNewButton_13);
		btnNewButton_13.addActionListener(centrelistener);
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

	public JButton getBtnNewButton_9() {
		return btnNewButton_9;
	}

	public void setBtnNewButton_9(JButton btnNewButton_9) {
		this.btnNewButton_9 = btnNewButton_9;
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

	public JButton getBtnNewButton_12() {
		return btnNewButton_12;
	}

	public void setBtnNewButton_12(JButton btnNewButton_12) {
		this.btnNewButton_12 = btnNewButton_12;
	}

	public JButton getBtnNewButton_13() {
		return btnNewButton_13;
	}

	public void setBtnNewButton_13(JButton btnNewButton_13) {
		this.btnNewButton_13 = btnNewButton_13;
	}

	private void setImage() {

	}

}
