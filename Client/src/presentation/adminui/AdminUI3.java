/**
 * AdminUI3是admin用户修改密码的界面
 */

package presentation.adminui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;

import listener.adminlistener.AdminListener3;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;


public class AdminUI3 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;
	private MyTextField textField_2;

	private MyButton confirm;
	private MyButton cancle;
    private MyDialog dialog;
	AdminListener3 adminlistener;
	private int width;
	private int height;
	
	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public AdminUI3(int i, int j) {
		adminlistener = new AdminListener3(this);
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

		this.setBounds(136, 115, 746, 438);
		this.setBackground(Color.white);
		this.setLayout(null);
	
		JLabel label = new JLabel("账户名:");
		label.setBounds(53, 35, 61, 16);
		this.add(label);

		dialog=new MyDialog();
		this.add(dialog);
		JLabel label_1 = new JLabel("新密码:");
		label_1.setBounds(53, 63, 61, 16);
		this.add(label_1);

		JLabel label_2 = new JLabel("确认新密码:");
		label_2.setBounds(53, 91, 80, 16);
		this.add(label_2);

		textField = new MyTextField();
		textField.setBounds(139, 85, 134, 28);
		this.add(textField);
		textField.setColumns(10);

		textField_1 = new MyTextField();
		textField_1.setBounds(139, 57, 134, 28);
		this.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new MyTextField();
		textField_2.setBounds(139, 29, 134, 28);
		this.add(textField_2);
		textField_2.setColumns(10);

		confirm = new MyButton("确认");
		confirm.setBounds(139, 125, 61, 29);
		this.add(confirm);

		cancle = new MyButton("清空");
		cancle.setBounds(212, 125, 61, 29);
		this.add(cancle);

		confirm.addActionListener(adminlistener);
		confirm.addMouseListener(adminlistener);
		cancle.addMouseListener(adminlistener);
		cancle.addActionListener(adminlistener);

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

	public MyButton getConfirm() {
		return confirm;
	}



	public MyButton getCancle() {
		return cancle;
	}

	private void setImage() {
		
	}
}
