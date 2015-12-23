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
import presentation.MySwing.Button;


public class AdminUI2 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	public Button getSearch() {
		return search;
	}

	public void setSearch(Button search) {
		this.search = search;
	}

	public Button getConfirm() {
		return confirm;
	}

	public void setConfirm(Button confirm) {
		this.confirm = confirm;
	}

	public Button getCancle() {
		return cancle;
	}

	public void setCancle(Button cancle) {
		this.cancle = cancle;
	}

	private JTextField textField;
	private JLabel label1;
	private JTextField textField_2;

	private JComboBox<String> comboBox_1;

	private Button search;
	private Button confirm;
	private Button cancle;

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
		
		JLabel label_2 = new JLabel("账户名:");
		label_2.setBounds(66, 34, 61, 16);
		this.add(label_2);

		textField_2 = new JTextField();
		textField_2.setBounds(139, 28, 134, 28);
		this.add(textField_2);
		textField_2.setColumns(10);

		search = new Button("查询");
		search.setBounds(300, 28, 61, 29);
		this.add(search);

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

		confirm = new Button("确认");
		confirm.setBounds(139, 228, 61, 29);
		this.add(confirm);

		cancle = new Button("取消");
		cancle.setBounds(212, 228, 61, 29);
		this.add(cancle);

		search.addActionListener(adminlistener);
		confirm.addActionListener(adminlistener);
		cancle.addActionListener(adminlistener);
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

	private void setImage() {
		
	}

	public void setLabel1(String password) {
	   
		label1.setText(password);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(String text){
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
	
}
