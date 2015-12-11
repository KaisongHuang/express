/**
 * SellingAreaUI1是SellingArea用户的接受与派件界面
 */

package presentation.sellingareaui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.sellingarealistener.SellingAreaListener10;

import javax.swing.JComboBox;


public class SellingAreaUI1 extends JPanel{


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
	private JComboBox<String> comboBox;

	private JButton btnNewButton_10;
	private JButton btnNewButton_11;

	SellingAreaListener10 sellingarealistener;

	@SuppressWarnings("unused")
	private int width;
	@SuppressWarnings("unused")
	private int height;

	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public SellingAreaUI1(int i, int j) {
		sellingarealistener = new SellingAreaListener10(this);
		width=i;
		height=j;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {



		 this.setBackground(new Color(158,211,240));
		this.setBounds(136, 114, 711, 439);

		this.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(6, 6, 699, 153);
		panel_5.setBackground(new Color(233, 150, 122));
		this.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("接收单");
		lblNewLabel_1.setBounds(308, 0, 100, 18);
		panel_5.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("订单条形码：");
		lblNewLabel_2.setBounds(6, 45, 100, 18);
		panel_5.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("到达日期：");
		lblNewLabel_3.setBounds(6, 98, 100, 18);
		panel_5.add(lblNewLabel_3);

		textField = new JTextField("0");
		textField.setBounds(98, 39, 122, 30);
		panel_5.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField("1");
		textField_1.setBounds(98, 92, 122, 30);
		panel_5.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("出发地：");
		lblNewLabel_4.setBounds(344, 45, 100, 18);
		panel_5.add(lblNewLabel_4);

		textField_2 = new JTextField("2");
		textField_2.setBounds(467, 39, 122, 30);
		panel_5.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("到达状态：");
		lblNewLabel_5.setBounds(344, 98, 100, 18);
		panel_5.add(lblNewLabel_5);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(467, 93, 122, 28);
		comboBox.addItem("完整");
		comboBox.addItem("损坏");
		comboBox.addItem("丢失");
		comboBox.setSelectedIndex(0);
		panel_5.add(comboBox);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(6, 184, 699, 153);
		panel_6.setBackground(new Color(176, 224, 230));
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("派件单");
		lblNewLabel_6.setBounds(306, 6, 100, 18);
		panel_6.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("订单编号：");
		lblNewLabel_7.setBounds(6, 43, 100, 18);
		panel_6.add(lblNewLabel_7);

		textField_3 = new JTextField("3");
		textField_3.setBounds(119, 37, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("派件员：");
		lblNewLabel_8.setBounds(344, 43, 100, 18);
		panel_6.add(lblNewLabel_8);

		textField_4 = new JTextField("4");
		textField_4.setBounds(476, 37, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("到达日期：");
		lblNewLabel_9.setBounds(6, 101, 100, 18);
		panel_6.add(lblNewLabel_9);

		textField_5 = new JTextField("5");
		textField_5.setBounds(119, 95, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		btnNewButton_10 = new JButton("\u786E\u8BA4");
		btnNewButton_10.setBounds(82, 381, 90, 30);
		this.add(btnNewButton_10);

		btnNewButton_11 = new JButton("\u6E05\u7A7A");
		btnNewButton_11.setBounds(492, 381, 90, 30);
		this.add(btnNewButton_11);

		btnNewButton_10.addActionListener(sellingarealistener);
		btnNewButton_11.addActionListener(sellingarealistener);

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

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
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

}
