/**
 * AdminUI2是admin用户修改账户权限的界面
 */

package presentation.adminui;

import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import listener.adminlistener.AdminListener2;


public class AdminUI2 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JLabel label1;
	private JTextField textField_2;

	private JComboBox<String> comboBox_1;

	private JButton button;
	private JButton button_1;
	private JButton button_2;

	AdminListener2 adminlistener;
	private int width;
	private int height;
	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public AdminUI2(int i, int j) {
		adminlistener = new AdminListener2(this);
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
		 this.setBackground(new Color(158,211,240));
		JLabel label_2 = new JLabel("账户名:");
		label_2.setBounds(66, 34, 61, 16);
		this.add(label_2);

		textField_2 = new JTextField();
		textField_2.setBounds(139, 28, 134, 28);
		this.add(textField_2);
		textField_2.setColumns(10);

		button_2 = new JButton("查询");
		button_2.setBounds(300, 28, 61, 29);
		this.add(button_2);

		JLabel label_4 = new JLabel("姓名：");
		label_4.setBounds(66, 74, 61, 16);
		this.add(label_4);

		textField = new JTextField();
		textField.setBounds(139, 75, 134, 28);
		this.add(textField);

		JLabel label_1 = new JLabel("密码：");
		label_1.setBounds(66, 125, 61, 16);
		this.add(label_1);

		label1 = new JLabel();
		label1.setBounds(139, 126, 134, 28);
		this.add(label1);

		JLabel label_3 = new JLabel("权限:");
		label_3.setBounds(66, 176, 61, 16);
		this.add(label_3);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(139, 177, 134, 27);
		comboBox_1.addItem("无");
	    comboBox_1.addItem("总经理");
	    comboBox_1.addItem("财务人员");
	    comboBox_1.addItem("中转中心业务员");
	    comboBox_1.addItem("仓库管理人员");
	    comboBox_1.addItem("营业厅业务员");
	    comboBox_1.addItem("快递员");
	    comboBox_1.setSelectedIndex(0);
		this.add(comboBox_1);

		button = new JButton("确认");
		button.setBounds(139, 228, 61, 29);
		this.add(button);

		button_1 = new JButton("取消");
		button_1.setBounds(212, 228, 61, 29);
		this.add(button_1);

		button.addActionListener(adminlistener);
		button_1.addActionListener(adminlistener);
		button_2.addActionListener(adminlistener);
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(String s) {
		this.textField_2.setText(s);;
	}

	public JComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox<String> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public JButton getButton() {
		return button;
	}

	

	public JButton getButton_1() {
		return button_1;
	}

	public void setButton_1(JButton button_1) {
		this.button_1 = button_1;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(String s) {
		this.textField.setText(s);
	}


	public JLabel getLabel1() {
		return label1;
	}

	

	public JButton getButton_2() {
		return button_2;
	}

	public void setButton_2(JButton button_2) {
		this.button_2 = button_2;
	}

	private void setImage() {
		
	}

	public void setLabel1(String password) {
	   
		label1.setText(password);
	}
}
