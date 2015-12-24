/**
 * AdminUI4是admin用户删除用户的界面
 */

package presentation.adminui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextField;
import listener.adminlistener.AdminListener4;
import presentation.MySwing.MyButton;


public class AdminUI4 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField;

	private MyButton confirm;
	private MyButton cancle;

	AdminListener4 adminlistener;
	private int width;
	private int height;
	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public AdminUI4(int i, int j) {
		adminlistener = new AdminListener4(this);
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
		this.setLayout(null);
		this.setBackground(Color.white);
		JLabel label = new JLabel("删除账户名:");
		label.setBounds(54, 43, 80, 16);
		this.add(label);

		confirm = new MyButton("确认");
		confirm.setBounds(135, 90, 61, 29);
		this.add(confirm);

		cancle = new MyButton("清空");
		cancle.setBounds(208, 90, 61, 29);
		this.add(cancle);

		textField = new JTextField();
		textField.setBounds(135, 37, 134, 28);
		this.add(textField);
		textField.setColumns(10);

		confirm.addActionListener(adminlistener);
		confirm.addMouseListener(adminlistener);
		cancle.addActionListener(adminlistener);
		cancle.addMouseListener(adminlistener);
	}


	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
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
