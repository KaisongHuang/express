/**
 * AdminUI3是admin用户修改密码的界面
 */

package presentation.adminui;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JTextField;
import listener.adminlistener.AdminListener3;


public class AdminUI3 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	private JButton btnNewButton_10;
	private JButton btnNewButton_11;

	AdminListener3 adminlistener;
	private int width;
	private int height;
	private JLabel label1;
	
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
		this.setLayout(null);
		 this.setBackground(new Color(158,211,240));
		JLabel label = new JLabel("账户名:");
		label.setBounds(53, 35, 61, 16);
		this.add(label);

		JLabel label_1 = new JLabel("新密码:");
		label_1.setBounds(53, 63, 61, 16);
		this.add(label_1);

		JLabel label_2 = new JLabel("确认新密码:");
		label_2.setBounds(53, 91, 80, 16);
		this.add(label_2);

		textField = new JTextField();
		textField.setBounds(139, 85, 134, 28);
		this.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(139, 57, 134, 28);
		this.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(139, 29, 134, 28);
		this.add(textField_2);
		textField_2.setColumns(10);

		btnNewButton_10 = new JButton("确认");
		btnNewButton_10.setBounds(139, 125, 61, 29);
		this.add(btnNewButton_10);

		btnNewButton_11 = new JButton("取消");
		btnNewButton_11.setBounds(212, 125, 61, 29);
		this.add(btnNewButton_11);

		btnNewButton_10.addActionListener(adminlistener);
		btnNewButton_11.addActionListener(adminlistener);

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

	public JButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public void setBtnNewButton_10(JButton btnNewButton_10) {
		this.btnNewButton_10 = btnNewButton_10;
	}

	public JButton getBtnNewButton_11() {
		return btnNewButton_11;
	}

	public void setBtnNewButton_11(JButton btnNewButton_11) {
		this.btnNewButton_11 = btnNewButton_11;
	}

	private void setImage() {
		label1 = new JLabel();
		label1.setBounds(0, 0, width,height);
		ImageIcon icon1 = new ImageIcon(this.getClass().getResource("/蓝色背景.png"));
		icon1.setImage(icon1.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

		label1.setIcon(icon1);
		this.add(label1);
	}
}
