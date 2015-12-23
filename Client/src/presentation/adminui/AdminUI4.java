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
import presentation.MySwing.Button;


public class AdminUI4 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JTextField textField;

	private Button confirm;
	private Button cancle;

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
/**--------------------------------------Navigation Code--------------------------------------------**/
//		JPanel panel_3 = new JPanel();
//		panel_3.setBounds(136, 58, 746, 58);
//		panel_3.setLayout(null);
//
//		JButton btnNewButton_7 = new JButton("新增账户");
//		btnNewButton_7.setBackground(UIManager.getColor("Button.background"));
//		btnNewButton_7.setBounds(0, 0, 137, 55);
//		panel_3.add(btnNewButton_7);
//
//		JButton btnNewButton_8 = new JButton("权限管理");
//		btnNewButton_8.setBounds(137, 0, 137, 55);
//		panel_3.add(btnNewButton_8);
//
//		JButton btnNewButton_9 = new JButton("修改密码");
//		btnNewButton_9.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnNewButton_9.setBounds(271, 0, 130, 55);
//		panel_3.add(btnNewButton_9);
//
//		JButton btnNewButton_12 = new JButton("删除账户");
//		btnNewButton_12.setBackground(new Color(255, 248, 220));
//		btnNewButton_12.setBounds(400, 0, 137, 55);
//		panel_3.add(btnNewButton_12);
/**--------------------------------------Navigation Code--------------------------------------------**/
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		this.setBackground(Color.white);
		JLabel label = new JLabel("删除账户名:");
		label.setBounds(54, 43, 80, 16);
		this.add(label);

		confirm = new Button("确认");
		confirm.setBounds(135, 90, 61, 29);
		this.add(confirm);

		cancle = new Button("取消");
		cancle.setBounds(208, 90, 61, 29);
		this.add(cancle);

		textField = new JTextField();
		textField.setBounds(135, 37, 134, 28);
		this.add(textField);
		textField.setColumns(10);

		confirm.addActionListener(adminlistener);
		cancle.addActionListener(adminlistener);
	}


	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public Button getConfirm() {
		return confirm;
	}

	

	public Button getCancle() {
		return cancle;
	}

	
	private void setImage() {

	}

}
