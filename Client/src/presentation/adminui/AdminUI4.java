/**
 * AdminUI4是admin用户删除用户的界面
 */

package presentation.adminui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import listener.adminlistener.AdminListener4;


public class AdminUI4 extends JPanel{


	private JTextField textField;

	private JButton btnNewButton_10;
	private JButton btnNewButton_11;

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

		JLabel label = new JLabel("删除账户名:");
		label.setBounds(54, 43, 80, 16);
		this.add(label);

		btnNewButton_10 = new JButton("确认");
		btnNewButton_10.setBounds(135, 90, 61, 29);
		this.add(btnNewButton_10);

		btnNewButton_11 = new JButton("取消");
		btnNewButton_11.setBounds(208, 90, 61, 29);
		this.add(btnNewButton_11);

		textField = new JTextField();
		textField.setBounds(135, 37, 134, 28);
		this.add(textField);
		textField.setColumns(10);

		btnNewButton_10.addActionListener(adminlistener);
		btnNewButton_11.addActionListener(adminlistener);
	}


	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
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

}
