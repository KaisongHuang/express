/**
 * SellingAreaUI1是SellingArea用户的接受与派件界面
 */

package presentation.sellingareaui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;

import listener.sellingarealistener.SellingAreaListener10;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyComboBox;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MySeperator;
import presentation.MySwing.MyTextField;



public class SellingAreaUI1 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;
	private MyTextField textField_2;
	private MyTextField textField_3;
	private MyTextField textField_4;
	private MyTextField textField_5;
	private MyComboBox<String> comboBox;
    private MyDialog dialog;
	private MyButton btnNewButton_10;
	private MyButton btnNewButton_11;
	private MySeperator line;

	SellingAreaListener10 sellingarealistener;

	@SuppressWarnings("unused")
	private int width;
	private int height;

	/**
	 * Create the application.
	 * @param j
	 * @param i
	 */
	public SellingAreaUI1(int i, int j) {
		sellingarealistener = new SellingAreaListener10(this);
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



		this.setBackground(Color.white);
		this.setBounds(136, 114, 720,480);

		this.setLayout(null);

		dialog=new MyDialog();
		this.add(dialog);
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(6, 6, 699, 153);
		panel_5.setBackground(Color.WHITE);
		this.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("接收单");
		lblNewLabel_1.setBounds(308, 0, 100, 18);
		panel_5.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("订单条形码：");
		lblNewLabel_2.setBounds(6, 45, 100, 18);
		panel_5.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("到达日期：");
		lblNewLabel_3.setBounds(6, 98, 100, 18);
		panel_5.add(lblNewLabel_3);

		textField = new MyTextField();
		textField.setBounds(98, 39, 122, 30);
		panel_5.add(textField);
		textField.setColumns(10);

		textField_1 = new MyTextField();
		textField_1.setBounds(98, 92, 122, 30);
		panel_5.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("出发地：");
		lblNewLabel_4.setBounds(344, 45, 100, 18);
		panel_5.add(lblNewLabel_4);

		textField_2 = new MyTextField();
		textField_2.setBounds(467, 39, 122, 30);
		panel_5.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("到达状态：");
		lblNewLabel_5.setBounds(344, 98, 100, 18);
		panel_5.add(lblNewLabel_5);

		comboBox = new MyComboBox<String>();
		comboBox.setBounds(467, 93, 122, 28);
		comboBox.addItem("完整");
		comboBox.addItem("损坏");
		comboBox.addItem("丢失");
		comboBox.setSelectedIndex(0);
		panel_5.add(comboBox);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(6, 184, 699, 153);
		panel_6.setBackground(Color.WHITE);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("派件单");
		lblNewLabel_6.setBounds(306, 6, 100, 18);
		panel_6.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("订单编号：");
		lblNewLabel_7.setBounds(6, 43, 100, 18);
		panel_6.add(lblNewLabel_7);

		textField_3 = new MyTextField();
		textField_3.setBounds(119, 37, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("派件员：");
		lblNewLabel_8.setBounds(344, 43, 100, 18);
		panel_6.add(lblNewLabel_8);

		textField_4 = new MyTextField();
		textField_4.setBounds(476, 37, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("到达日期：");
		lblNewLabel_9.setBounds(6, 101, 100, 18);
		panel_6.add(lblNewLabel_9);

		textField_5 = new MyTextField();
		textField_5.setBounds(119, 95, 122, 30);
		panel_6.add(textField_5);
		textField_5.setColumns(10);

		btnNewButton_10 = new MyButton("\u786E\u8BA4");
		btnNewButton_10.setBounds(82, 381, 90, 30);
		this.add(btnNewButton_10);

		btnNewButton_11 = new MyButton("\u6E05\u7A7A");
		btnNewButton_11.setBounds(492, 381, 90, 30);
		this.add(btnNewButton_11);

		btnNewButton_10.addActionListener(sellingarealistener);
		btnNewButton_10.addMouseListener(sellingarealistener);
		btnNewButton_11.addActionListener(sellingarealistener);
		btnNewButton_11.addMouseListener(sellingarealistener);
		
		line=new MySeperator();
		line.setBounds(16, 170, 669, 10);
		add(line);

	}

	public void setText(String s){
		dialog.setText(s);;
	}
	public void setErrorText(String s){
		dialog.setErrorText(s);;
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

	public MyTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(MyTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public MyTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(MyTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public MyComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(MyComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public MyButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public void setBtnNewButton_10(MyButton btnNewButton_10) {
		this.btnNewButton_10 = btnNewButton_10;
	}

	public MyButton getBtnNewButton_11() {
		return btnNewButton_11;
	}

	public void setBtnNewButton_11(MyButton btnNewButton_11) {
		this.btnNewButton_11 = btnNewButton_11;
	}
	private void setImage() {

	}
}
