/**
 * ManagerUI13是manager用户的机构管理的增加界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;

import listener.managerlistener.ManagerListener1_4;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;

public class ManagerUI1_4 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_2;
    private MyDialog dialog;
	private MyButton btnNewButton_15;
	private MyButton btnNewButton_16;

	private ManagerListener1_4 managerlistener;

	/**
	 * Create the application.
	 * 
	 * @param card
	 */
	public ManagerUI1_4() {
		managerlistener = new ManagerListener1_4(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(Color.white);
		this.setBounds(0, 44, 720, 480);

		this.setLayout(null);

		dialog=new MyDialog();
		this.add(dialog);
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(77, 56, 517, 117);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("机构信息");
		lblNewLabel_1.setBounds(216, 6, 100, 18);
		panel_6.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("机构编号：");
		lblNewLabel_2.setBounds(17, 54, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField = new MyTextField();
		textField.setBounds(98, 48, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("机构名称：");
		lblNewLabel_4.setBounds(270, 54, 100, 18);
		panel_6.add(lblNewLabel_4);

		textField_2 = new MyTextField();
		textField_2.setBounds(347, 48, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		btnNewButton_15 = new MyButton("确定");
		btnNewButton_15.setBounds(199, 210, 100, 30);
		this.add(btnNewButton_15);

		btnNewButton_16 = new MyButton("清空");
		btnNewButton_16.setBounds(353, 210, 100, 30);
		this.add(btnNewButton_16);

		btnNewButton_15.addActionListener(managerlistener);
		btnNewButton_15.addMouseListener(managerlistener);
		btnNewButton_16.addActionListener(managerlistener);
		btnNewButton_16.addMouseListener(managerlistener);
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

	public MyTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(MyTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public MyButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	public void setBtnNewButton_15(MyButton btnNewButton_15) {
		this.btnNewButton_15 = btnNewButton_15;
	}

	public MyButton getBtnNewButton_16() {
		return btnNewButton_16;
	}

	public void setBtnNewButton_16(MyButton btnNewButton_16) {
		this.btnNewButton_16 = btnNewButton_16;
	}


}
