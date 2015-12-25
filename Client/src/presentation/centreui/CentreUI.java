/**
 * CentreUI是centre用户中转转入的界面
 */

package presentation.centreui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import listener.centrelistener.CentreListener0;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTextField;

import javax.swing.JComboBox;

public class CentreUI extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;
	private MyTextField textField_2;
	private MyTextField textField_3;
	private JComboBox<String> comboBox;
	private MyButton confirm;
	private MyButton cancle;
	CentreListener0 centreListener;
	private int width;
	private int height;
	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public CentreUI(int i, int j) {

		centreListener = new CentreListener0(this);
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

		this.setBounds(136, 116, 746, 437);
		this.setBackground(Color.white);
		this.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(120, 29, 464, 204);
		this.add(panel_5);
		panel_5.setLayout(null);

		JLabel label = new JLabel("\u4E2D\u8F6C\u4E2D\u5FC3\u5230\u8FBE\u5355");
		label.setBounds(184, 6, 109, 18);
		panel_5.add(label);

		JLabel lblNewLabel_1 = new JLabel("托运单号：");
		lblNewLabel_1.setBounds(17, 39, 100, 18);
		panel_5.add(lblNewLabel_1);

		textField = new MyTextField();
		textField.setBounds(99, 36, 122, 30);
		panel_5.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("到达日期：");
		lblNewLabel_2.setBounds(253, 42, 100, 18);
		panel_5.add(lblNewLabel_2);

		textField_1 = new MyTextField();
		textField_1.setBounds(320, 33, 122, 30);
		panel_5.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("中转编号：");
		lblNewLabel_3.setBounds(17, 93, 100, 18);
		panel_5.add(lblNewLabel_3);

		textField_2 = new MyTextField();
		textField_2.setBounds(99, 87, 122, 30);
		panel_5.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("出发地：");
		lblNewLabel_4.setBounds(253, 93, 100, 18);
		panel_5.add(lblNewLabel_4);

		textField_3 = new MyTextField();
		textField_3.setBounds(320, 87, 122, 30);
		panel_5.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("状态：");
		lblNewLabel_5.setBounds(17, 155, 100, 18);
		panel_5.add(lblNewLabel_5);

		comboBox = new JComboBox<String>();
		comboBox.addItem("完整");
		comboBox.addItem("损坏");
		comboBox.addItem("丢失");
		comboBox.setSelectedItem(0);
		comboBox.setBounds(99, 150, 122, 28);
		panel_5.add(comboBox);

		confirm = new MyButton("确认");
		confirm.setBounds(89, 340, 90, 30);
		this.add(confirm);
		confirm.addActionListener(centreListener);

		cancle = new MyButton("清空");
		cancle.setBounds(493, 340, 90, 30);
		this.add(cancle);
		confirm.addActionListener(centreListener);
		confirm.addMouseListener(centreListener);
		cancle.addActionListener(centreListener);
		cancle.addMouseListener(centreListener);

	}

	public MyButton getConfirm() {
		return confirm;
	}

	

	public MyButton getCancle() {
		return cancle;
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

	public MyTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(MyTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}
	private void setImage() {

	}
}
