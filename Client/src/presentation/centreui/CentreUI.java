/**
 * CentreUI是centre用户中转转入的界面
 */

package presentation.centreui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.centrelistener.CentreListener0;

import javax.swing.JComboBox;

public class CentreUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox<String> comboBox;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	CentreListener0 centreListener;
	@SuppressWarnings("unused")
	private int width;
	@SuppressWarnings("unused")
	private int height;
	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public CentreUI(int i, int j) {

		centreListener = new CentreListener0(this);
		width=i;
		height=j;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBounds(136, 116, 746, 437);

		this.setBackground(new Color(255, 255, 255));

		this.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(120, 29, 464, 204);
		this.add(panel_5);
		panel_5.setLayout(null);

		JLabel label = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u5230\u8FBE\u5355");
		label.setBounds(184, 6, 109, 18);
		panel_5.add(label);

		JLabel lblNewLabel_1 = new JLabel("中转中心编号：");
		lblNewLabel_1.setBounds(17, 39, 100, 18);
		panel_5.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(99, 36, 122, 30);
		panel_5.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("到达日期：");
		lblNewLabel_2.setBounds(253, 42, 100, 18);
		panel_5.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(320, 33, 122, 30);
		panel_5.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("中转编号：");
		lblNewLabel_3.setBounds(17, 93, 100, 18);
		panel_5.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(99, 87, 122, 30);
		panel_5.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("出发地：");
		lblNewLabel_4.setBounds(253, 93, 100, 18);
		panel_5.add(lblNewLabel_4);

		textField_3 = new JTextField();
		textField_3.setBounds(320, 87, 122, 30);
		panel_5.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("状态：");
		lblNewLabel_5.setBounds(17, 155, 100, 18);
		panel_5.add(lblNewLabel_5);

		comboBox = new JComboBox<String>();
		comboBox.addItem("完整");
		comboBox.addItem("损坏");
		comboBox.addItem("丢失");
		comboBox.setSelectedItem(0);
		comboBox.setBounds(99, 150, 122, 28);
		panel_5.add(comboBox);

		btnNewButton_9 = new JButton("\u786E\u8BA4");
		btnNewButton_9.setBounds(89, 340, 90, 30);
		this.add(btnNewButton_9);
		btnNewButton_9.addActionListener(centreListener);

		btnNewButton_10 = new JButton("\u53D6\u6D88");
		btnNewButton_10.setBounds(493, 340, 90, 30);
		this.add(btnNewButton_10);
		btnNewButton_10.addActionListener(centreListener);

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

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

}
