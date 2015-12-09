/**
 * AdminUI1是admin用户增加账户的界面
 */

package presentation.adminui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import listener.adminlistener.AdminListener1;


public class AdminUI1 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	private JButton btnNewButton_10;
	private JButton btnNewButton_11;

	private JComboBox<String> comboBox;

	AdminListener1 adminlistener;
	@SuppressWarnings("unused")
	private int width;
	@SuppressWarnings("unused")
	private int height;

	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public AdminUI1(int i, int j) {
		width=i;
		height=j;
		adminlistener = new AdminListener1(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBounds(0,0,480,320);
		this.setLayout(null);

		JLabel label_3 = new JLabel("姓名：");
		label_3.setBounds(51, 41, 61, 16);
		this.add(label_3);

		textField_3 = new JTextField();
		textField_3.setBounds(124, 41, 134, 28);
		this.add(textField_3);

		JLabel label = new JLabel("账户名：");
		label.setBounds(51, 93, 61, 16);
		this.add(label);

		textField = new JTextField();
		textField.setBounds(124, 93, 134, 28);
		this.add(textField);
		textField.setColumns(10);

		JLabel label_1 = new JLabel("密码：");
		label_1.setBounds(51, 142, 61, 16);
		this.add(label_1);

		textField_1 = new JTextField();
		textField_1.setBounds(124, 142, 134, 28);
		this.add(textField_1);
		textField_1.setColumns(10);

		btnNewButton_10 = new JButton("确定");
		btnNewButton_10.setBounds(73, 250, 61, 29);
		this.add(btnNewButton_10);

		btnNewButton_11 = new JButton("取消");
		btnNewButton_11.setBounds(146, 250, 61, 29);
		this.add(btnNewButton_11);

		JLabel lblNewLabel_1 = new JLabel("权限：");
		lblNewLabel_1.setBounds(51, 195, 61, 16);
		this.add(lblNewLabel_1);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(124, 195, 134, 27);
	    comboBox.addItem("无");
	    comboBox.addItem("总经理");
	    comboBox.addItem("财务人员");
	    comboBox.addItem("中转中心业务员");
	    comboBox.addItem("仓库管理人员");
	    comboBox.addItem("营业厅业务员");
	    comboBox.addItem("快递员");
	    comboBox.setSelectedIndex(0);
		this.add(comboBox);

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

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}


}
