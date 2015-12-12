/**
 * ManagerUI12是manager用户的机构管理的删除界面
 */

package presentation.managerui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import listener.managerlistener.ManagerListener12;


public class ManagerUI12 extends JPanel{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField;

	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton button;

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	ManagerListener12 managerlistener;



	public ManagerUI12(CardLayout card) {
		managerlistener = new ManagerListener12(this,card);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(new Color(158, 211, 238));
		this.setBounds(136, 115, 748, 438);

		this.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 748, 50);
		this.add(panel_5);
		panel_5.setLayout(null);

		btnNewButton_11 = new JButton("\u67E5\u8BE2");
		btnNewButton_11.setBounds(32, 6, 90, 30);
		panel_5.add(btnNewButton_11);

		btnNewButton_12 = new JButton("\u66F4\u65B0");
		btnNewButton_12.setBounds(168, 6, 90, 30);
		panel_5.add(btnNewButton_12);

		btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBackground(new Color(255, 248, 220));
		btnNewButton_13.setBounds(308, 6, 90, 30);
		panel_5.add(btnNewButton_13);

		btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBounds(453, 6, 90, 30);
		panel_5.add(btnNewButton_14);

		button = new JButton("\u65E5\u5FD7\u67E5\u770B");
		button.setBounds(579, 6, 90, 30);
		panel_5.add(button);

		lblNewLabel_1 = new JLabel("机构编号：");
		lblNewLabel_1.setBounds(35, 63, 100, 18);
		this.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(147, 57, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		btnNewButton_15 = new JButton("查询");
		btnNewButton_15.setBounds(325, 57, 100, 30);
		this.add(btnNewButton_15);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(37, 118, 477, 113);
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
		btnNewButton_16.setBounds(35, 284, 100, 30);
		this.add(btnNewButton_16);

		btnNewButton_17 = new JButton("取消");
		btnNewButton_17.setBounds(414, 284, 100, 30);
		this.add(btnNewButton_17);

		btnNewButton_11.addActionListener(managerlistener);
		btnNewButton_12.addActionListener(managerlistener);
		btnNewButton_13.addActionListener(managerlistener);
		btnNewButton_14.addActionListener(managerlistener);
		btnNewButton_15.addActionListener(managerlistener);
		btnNewButton_16.addActionListener(managerlistener);
		btnNewButton_17.addActionListener(managerlistener);
		button.addActionListener(managerlistener);

	}


	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
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

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
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
