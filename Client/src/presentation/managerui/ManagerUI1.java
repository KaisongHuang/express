/**
 * ManagerUI1是manager用户的机构管理的查询界面
 */

package presentation.managerui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.managerlistener.ManagerListener10;


public class ManagerUI1 extends JPanel{


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
	private JButton button;
	private JButton button_1;

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_10;

	ManagerListener10 managerlistener;

	/**
	 * Create the application.
	 * @param card
	 */
	public ManagerUI1(CardLayout card) {
		managerlistener = new ManagerListener10(this,card);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {



		 this.setBackground(new Color(158,211,240));
		this.setBounds(136, 115, 748, 438);

		this.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 748, 50);
		this.add(panel_5);
		panel_5.setLayout(null);

		btnNewButton_11 = new JButton("\u67E5\u8BE2");
		btnNewButton_11.setBackground(new Color(255, 248, 220));
		btnNewButton_11.setBounds(32, 6, 90, 30);
		panel_5.add(btnNewButton_11);
		btnNewButton_11.addActionListener(managerlistener);

		btnNewButton_12 = new JButton("\u66F4\u65B0");
		btnNewButton_12.setBounds(168, 6, 90, 30);
		panel_5.add(btnNewButton_12);
		btnNewButton_12.addActionListener(managerlistener);

		btnNewButton_13 = new JButton("\u5220\u9664");
		btnNewButton_13.setBounds(308, 6, 90, 30);
		panel_5.add(btnNewButton_13);
		btnNewButton_13.addActionListener(managerlistener);

		btnNewButton_14 = new JButton("\u6DFB\u52A0");
		btnNewButton_14.setBounds(453, 6, 90, 30);
		panel_5.add(btnNewButton_14);
		btnNewButton_14.addActionListener(managerlistener);

		button = new JButton("\u65E5\u5FD7\u67E5\u770B");
		button.setBounds(587, 6, 90, 30);
		panel_5.add(button);
		button.addActionListener(managerlistener);

		lblNewLabel_1 = new JLabel("机构编号：");
		lblNewLabel_1.setBounds(10, 63, 100, 18);
		this.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(117, 57, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		btnNewButton_15 = new JButton("查询");
		btnNewButton_15.setBounds(312, 57, 100, 30);
		this.add(btnNewButton_15);
		btnNewButton_15.addActionListener(managerlistener);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 122, 481, 84);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_2 = new JLabel("机构编号：");
		lblNewLabel_2.setBounds(6, 35, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_4 = new JLabel("111");
		lblNewLabel_4.setBounds(103, 35, 100, 18);
		panel_6.add(lblNewLabel_4);

		lblNewLabel_6 = new JLabel("机构名称：");
		lblNewLabel_6.setBounds(244, 35, 100, 18);
		panel_6.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(357, 35, 100, 18);
		panel_6.add(lblNewLabel_7);

		lblNewLabel_10 = new JLabel("机构信息");
		lblNewLabel_10.setBounds(186, 6, 100, 18);
		panel_6.add(lblNewLabel_10);

		button_1 = new JButton("取消");
		button_1.setBounds(452, 57, 100, 30);
		add(button_1);
		button_1.addActionListener(managerlistener);

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


	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public JLabel getLblNewLabel_6() {
		return lblNewLabel_6;
	}

	public void setLblNewLabel_6(JLabel lblNewLabel_6) {
		this.lblNewLabel_6 = lblNewLabel_6;
	}

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
	}


	public JLabel getLblNewLabel_10() {
		return lblNewLabel_10;
	}

	public void setLblNewLabel_10(JLabel lblNewLabel_10) {
		this.lblNewLabel_10 = lblNewLabel_10;
	}

	public JButton getButton_1() {
		return button_1;
	}

}
