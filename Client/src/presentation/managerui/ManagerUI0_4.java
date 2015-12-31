/**
 * ManagerUI03是manager用户的人员管理的增加界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import listener.managerlistener.ManagerListener0_4;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;


public class ManagerUI0_4 extends JPanel{


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

	private MyDialog dialog;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	private MyButton add;
	private MyButton clear;

	ManagerListener0_4 managerlistener;


	/**
	 * Create the application.
	 * @param card
	 */
	public ManagerUI0_4() {
		managerlistener = new ManagerListener0_4(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {


		setBackground(Color.white);

		this.setBounds(0, 44, 746, 394);

		this.setLayout(null);

        dialog=new MyDialog();
        this.add(dialog);
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(65, 55, 473, 208);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_1 = new JLabel("员工姓名：");
		lblNewLabel_1.setBounds(6, 18, 100, 18);
		panel_6.add(lblNewLabel_1);

		textField = new MyTextField();
		textField.setBounds(76, 12, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);

		lblNewLabel_2 = new JLabel("员工编号：");
		lblNewLabel_2.setBounds(266, 18, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField_1 = new MyTextField();
		textField_1.setBounds(345, 12, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		lblNewLabel_3 = new JLabel("员工职位：");
		lblNewLabel_3.setBounds(6, 82, 100, 18);
		panel_6.add(lblNewLabel_3);

		textField_2 = new MyTextField();
		textField_2.setBounds(76, 76, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		lblNewLabel_4 = new JLabel("员工年龄：");
		lblNewLabel_4.setBounds(266, 82, 100, 18);
		panel_6.add(lblNewLabel_4);

		textField_3 = new MyTextField();
		textField_3.setBounds(345, 76, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		lblNewLabel_5 = new JLabel("上层机构：");
		lblNewLabel_5.setBounds(6, 141, 100, 18);
		panel_6.add(lblNewLabel_5);

		textField_4 = new MyTextField();
		textField_4.setBounds(76, 135, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		lblNewLabel_6 = new JLabel("工作时间：");
		lblNewLabel_6.setBounds(266, 141, 100, 18);
		panel_6.add(lblNewLabel_6);

		textField_5 = new MyTextField();
		textField_5.setBounds(345, 135, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		add = new MyButton("添加");
		add.setBounds(150, 275, 100, 30);
		this.add(add);
		add.addActionListener(managerlistener);
        add.addMouseListener(managerlistener);
		clear = new MyButton("清空");
		clear.setBounds(323, 275, 100, 30);
		this.add(clear);
		clear.addActionListener(managerlistener);
        clear.addMouseListener(managerlistener);
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

	public void setTextField_1(MyTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public MyTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(MyTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public MyTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(MyTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public MyTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(MyTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public MyTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(MyTextField textField_5) {
		this.textField_5 = textField_5;
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


	public MyButton getAdd() {
		return add;
	}

	

	public MyButton getClear() {
		return clear;
	}

	

}
