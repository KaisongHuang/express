/**
 * ManagerUI01是manager用户的人员管理的更新界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import listener.managerlistener.ManagerListener0_2;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;


public class ManagerUI0_2 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;
	private MyTextField textField_2;
	private MyTextField textField_3;
	private MyTextField textField_4;
	private MyTextField textField_5;
	private MyTextField textField_6;

	private MyDialog dialog;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	private MyButton search;
	private MyButton confirm;
	private MyButton cancle;

	ManagerListener0_2 managerlistener;

	/**
	 * Create the application.
	 * @param card
	 */
	public ManagerUI0_2() {
		managerlistener = new ManagerListener0_2(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {


		this.setBackground(Color.white);
		this.setBounds(0, 44, 720, 480);

		this.setLayout(null);



		lblNewLabel_1 = new JLabel("员工编号：");
		lblNewLabel_1.setBounds(66, 51, 100, 18);
		this.add(lblNewLabel_1);
 
		dialog=new MyDialog();
		this.add(dialog);
		textField = new MyTextField();
		textField.setBounds(178, 45, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		search = new MyButton("查询");
		search.setBounds(312, 45, 100, 30);
		this.add(search);
		search.addActionListener(managerlistener);
        search.addMouseListener(managerlistener);
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(66, 114, 488, 209);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_2 = new JLabel("员工信息");
		lblNewLabel_2.setBounds(217, 3, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("员工姓名：");
		lblNewLabel_3.setBounds(3, 38,100, 18);
		panel_6.add(lblNewLabel_3);

		textField_1 = new MyTextField();
		textField_1.setBounds(83, 34, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		lblNewLabel_4 = new JLabel("员工职位：");
		lblNewLabel_4.setBounds(3, 90, 100, 18);
		panel_6.add(lblNewLabel_4);

		textField_2 = new MyTextField();
		textField_2.setBounds(86, 86, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		lblNewLabel_5 = new JLabel("上层机构：");
		lblNewLabel_5.setBounds(3, 149,100, 18);
		panel_6.add(lblNewLabel_5);

		textField_3 = new MyTextField();
		textField_3.setBounds(85, 142, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		lblNewLabel_6 = new JLabel("员工编号：");
		lblNewLabel_6.setBounds(288, 40, 100, 18);
		panel_6.add(lblNewLabel_6);

		textField_4 = new MyTextField();
		textField_4.setBounds(354, 32, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		lblNewLabel_7 = new JLabel("员工年龄：");
		lblNewLabel_7.setBounds(289, 94, 100, 18);
		panel_6.add(lblNewLabel_7);

		textField_5 = new MyTextField();
		textField_5.setBounds(356, 92, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		lblNewLabel_8 = new JLabel("工作时间：");
		lblNewLabel_8.setBounds(290, 150, 100, 18);
		panel_6.add(lblNewLabel_8);

		textField_6 = new MyTextField();
		textField_6.setBounds(354, 143, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);

		confirm = new MyButton("确定");
		confirm.setBounds(178, 335, 100, 30);
		this.add(confirm);
		confirm.addActionListener(managerlistener);
		confirm.addMouseListener(managerlistener);


		cancle = new MyButton("清空");
		cancle.setBounds(289, 335, 100, 30);
		this.add(cancle);
		cancle.addActionListener(managerlistener);
        cancle.addMouseListener(managerlistener);
	}

	public void setText(String s){
		dialog.setText(s);
	}
	public void setErrorText(String s){
		dialog.setErrorText(s);
	}
	public MyTextField getTextField() {
		return textField;
	}

	public void setTextField(MyTextField textField) {
		this.textField = textField;
	}

	public MyTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(String string) {
		this.textField_1.setText(string);
	}

	public MyTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(String string) {
		this.textField_2.setText(string);
	}

	public MyTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(String string) {
		this.textField_3.setText(string);
	}

	public MyTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(String string) {
		this.textField_4.setText(string);
	}

	public MyTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(String string) {
		this.textField_5.setText(string);
	}

	public MyTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(String string) {
		this.textField_6.setText(string);
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


	public MyButton getSearch() {
		return search;
	}

	public MyButton getConfirm() {
		return confirm;
	}



	public MyButton getCancle() {
		return cancle;
	}


}
