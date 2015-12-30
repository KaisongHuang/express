/**
 * AdminUI2是admin用户修改账户权限的界面
 */

package presentation.adminui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import listener.adminlistener.AdminListener2;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyComboBox;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;

public class AdminUI2 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private MyTextField textField;
	private JLabel label1;
	private MyTextField textField_2;

	private MyComboBox<String> comboBox_1;
    private MyDialog dialog;
	private MyButton search;
	private MyButton confirm;
	private MyButton clear;
	AdminListener2 adminlistener;
	private int width;
	private int height;

	/**
	 * Create the application.
	 *
	 * @param j
	 * @param i
	 */
	public AdminUI2(int i, int j) {
		adminlistener = new AdminListener2(this);
		width = i;
		height = j;

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

		JLabel label_2 = new JLabel("账户名:");
		label_2.setBounds(66, 34, 61, 16);
		this.add(label_2);

		dialog=new MyDialog();
		this.add(dialog);
		textField_2 = new MyTextField();
		textField_2.setBounds(139, 28, 134, 28);
		this.add(textField_2);
		textField_2.setColumns(10);

		search = new MyButton("查询");
		search.setBounds(300, 28, 61, 29);
		this.add(search);

		JLabel label_4 = new JLabel("姓名：");
		label_4.setBounds(66, 74, 61, 16);
		this.add(label_4);

		textField = new MyTextField();
		textField.setBounds(139, 75, 134, 28);
		this.add(textField);

		JLabel label_1 = new JLabel("密码：");
		label_1.setBounds(66, 125, 61, 16);
		this.add(label_1);

		label1 = new JLabel();
		label1.setBounds(139, 123, 134, 28);
		this.add(label1);

		JLabel label_3 = new JLabel("权限:");
		label_3.setBounds(66, 176, 61, 16);
		this.add(label_3);

		comboBox_1 = new MyComboBox<String>();
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

		confirm = new MyButton("确认");
		confirm.setBounds(139, 228, 61, 29);
		this.add(confirm);

		clear = new MyButton("清空");
		clear.setBounds(212, 228, 61, 29);
		this.add(clear);

		search.addActionListener(adminlistener);
		search.addMouseListener(adminlistener);
		confirm.addActionListener(adminlistener);
		confirm.addMouseListener(adminlistener);
		clear.addActionListener(adminlistener);
		clear.addMouseListener(adminlistener);
	}
	public MyTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(String s) {
		this.textField_2.setText(s);
		;
	}

	public MyComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(MyComboBox<String> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	private void setImage() {

	}

	public void setLabel1(String password) {

		label1.setText(password);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public MyTextField getTextField() {
		return textField;
	}

	public void setTextField(String text) {
		textField.setText(text);
	}

	public JLabel getLabel1() {
		return label1;
	}

	public AdminListener2 getAdminlistener() {
		return adminlistener;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public MyButton getSearch() {
		return search;
	}

	public void setSearch(MyButton search) {
		this.search = search;
	}

	public MyButton getConfirm() {
		return confirm;
	}

	public void setConfirm(MyButton confirm) {
		this.confirm = confirm;
	}

	public MyButton getClear() {
		return clear;
	}

	public void setClear(MyButton cancle) {
		this.clear = cancle;
	}

	public void setText(String s){
		dialog.setText(s);
	}

}
