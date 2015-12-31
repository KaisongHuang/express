/**
 * ManagerUI0是manager用户的用户管理的查询界面
 */

package presentation.managerui;


import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import listener.managerlistener.ManagerListener0_1;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;


public class ManagerUI0_1 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyButton search;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_1;
    private MyDialog dialog;


	ManagerListener0_1 managerlistener;




	/**
	 * Create the application.
	 * @param card
	 */
	public ManagerUI0_1() {
		managerlistener = new ManagerListener0_1(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {


		
		this.setBackground(Color.white);
		this.setBounds(0, 44, 746, 394);

		this.setLayout(null);

		
        dialog=new MyDialog();
        this.add(dialog);
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(74, 128, 566, 212);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_2 = new JLabel("员工信息");
		lblNewLabel_2.setBounds(251, 0, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("员工姓名：");
		lblNewLabel_3.setBounds(12, 37, 100, 18);
		panel_6.add(lblNewLabel_3);

		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(122, 38, 100, 18);
		panel_6.add(lblNewLabel_4);

		lblNewLabel_5 = new JLabel("员工职位：");
		lblNewLabel_5.setBounds(14, 85, 100, 18);
		panel_6.add(lblNewLabel_5);

		lblNewLabel_6 = new JLabel("上层机构：");
		lblNewLabel_6.setBounds(14, 139, 100, 18);
		panel_6.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(120, 87, 100, 18);
		panel_6.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(120, 143, 100, 18);
		panel_6.add(lblNewLabel_8);

		lblNewLabel_9 = new JLabel("员工编号：");
		lblNewLabel_9.setBounds(331, 42, 100, 18);
		panel_6.add(lblNewLabel_9);

		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(448, 44, 100, 18);
		panel_6.add(lblNewLabel_10);

		lblNewLabel_11 = new JLabel("员工年龄：");
		lblNewLabel_11.setBounds(334, 86, 100, 18);
		panel_6.add(lblNewLabel_11);

		lblNewLabel_12 = new JLabel("工作时间：");
		lblNewLabel_12.setBounds(333, 138, 100, 18);
		panel_6.add(lblNewLabel_12);

		lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(449, 89, 100, 18);
		panel_6.add(lblNewLabel_13);

		lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(452, 139, 100, 18);
		panel_6.add(lblNewLabel_14);

		lblNewLabel_1 = new JLabel("员工编号：");
		lblNewLabel_1.setBounds(94, 69, 100, 18);
		this.add(lblNewLabel_1);

		textField = new MyTextField();
		textField.setBounds(170, 63, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		search = new MyButton("查询");
		search.setBounds(304, 64, 120, 30);
		this.add(search);
		search.addActionListener(managerlistener);
		search.addMouseListener(managerlistener);

	}
	public void setText(String s){
		dialog.setText(s);
	}
	public MyTextField getTextField() {
		return textField;
	}

	public void setTextField(MyTextField textField) {
		this.textField = textField;
	}


	public MyButton getSearch() {
		return search;
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

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
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

	public JLabel getLblNewLabel_10() {
		return lblNewLabel_10;
	}

	public void setLblNewLabel_10(JLabel lblNewLabel_10) {
		this.lblNewLabel_10 = lblNewLabel_10;
	}

	public JLabel getLblNewLabel_11() {
		return lblNewLabel_11;
	}

	public void setLblNewLabel_11(JLabel lblNewLabel_11) {
		this.lblNewLabel_11 = lblNewLabel_11;
	}

	public JLabel getLblNewLabel_12() {
		return lblNewLabel_12;
	}

	public void setLblNewLabel_12(JLabel lblNewLabel_12) {
		this.lblNewLabel_12 = lblNewLabel_12;
	}

	public JLabel getLblNewLabel_13() {
		return lblNewLabel_13;
	}

	public void setLblNewLabel_13(JLabel lblNewLabel_13) {
		this.lblNewLabel_13 = lblNewLabel_13;
	}

	public JLabel getLblNewLabel_14() {
		return lblNewLabel_14;
	}

	public void setLblNewLabel_14(JLabel lblNewLabel_14) {
		this.lblNewLabel_14 = lblNewLabel_14;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

}
