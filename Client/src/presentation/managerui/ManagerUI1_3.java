/**
 * ManagerUI12是manager用户的机构管理的删除界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import listener.managerlistener.ManagerListener1_3;

public class ManagerUI1_3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField;

	private JButton btnNewButton_15;
	public JButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	private JButton btnNewButton_16;
	private JButton btnNewButton_17;

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	ManagerListener1_3 managerlistener;

	public ManagerUI1_3() {
		managerlistener = new ManagerListener1_3(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(new Color(158, 211, 238));
		this.setBounds(0, 44, 746, 394);

		this.setLayout(null);

		lblNewLabel_1 = new JLabel("机构编号：");
		lblNewLabel_1.setBounds(104, 63, 100, 18);
		this.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(191, 57, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		btnNewButton_15 = new JButton("查询");
		btnNewButton_15.setBounds(325, 57, 100, 30);
		this.add(btnNewButton_15);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(104, 112, 477, 113);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_2 = new JLabel("机构信息");
		lblNewLabel_2.setBounds(199, 6, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("机构编号：");
		lblNewLabel_3.setBounds(25, 56, 100, 18);
		panel_6.add(lblNewLabel_3);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(116, 56, 100, 18);
		panel_6.add(lblNewLabel_5);

		lblNewLabel_7 = new JLabel("机构编号：");
		lblNewLabel_7.setBounds(241, 56, 100, 18);
		panel_6.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(368, 56, 100, 18);
		panel_6.add(lblNewLabel_8);

		btnNewButton_16 = new JButton("删除");
		btnNewButton_16.setBounds(213, 262, 100, 30);
		this.add(btnNewButton_16);

		btnNewButton_17 = new JButton("取消");
		btnNewButton_17.setBounds(325, 262, 100, 30);
		this.add(btnNewButton_17);

		btnNewButton_15.addActionListener(managerlistener);
		btnNewButton_16.addActionListener(managerlistener);
		btnNewButton_17.addActionListener(managerlistener);

	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
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

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
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

}
