/**
 * ManagerUI41是manager用户修改价格策略的界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import listener.managerlistener.ManagerListener4_2;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTextField;

public class ManagerUI4_2 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_2;
	private MyTextField textField_4;
	private MyTextField textField_6;
	private MyTextField textField_8;
	private MyTextField textField_1;
<<<<<<< HEAD
=======
    private MyDialog dialog;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
>>>>>>> master
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;

	ManagerListener4_2 managerlistener;

	/**
	 * Create the application.
	 * 
	 * @param card
	 */
	public ManagerUI4_2() {
		managerlistener = new ManagerListener4_2(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(Color.white);
		this.setBounds(0, 44, 790, 433);

		this.setLayout(null);
        dialog=new MyDialog();
        this.add(dialog);
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(23, 79, 743, 282);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("价格");
		lblNewLabel_1.setBounds(435, 10, 100, 18);
		panel_6.add(lblNewLabel_1);

		textField = new MyTextField();
		textField.setBounds(388, 40, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);

		textField_2 = new MyTextField();
		textField_2.setBounds(388, 69, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		textField_4 = new MyTextField();
		textField_4.setBounds(388, 102, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		textField_6 = new MyTextField();
		textField_6.setBounds(388, 134, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);

		textField_8 = new MyTextField();
		textField_8.setBounds(388, 167, 122, 30);
		panel_6.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblNewLabel = new JLabel("1");
		lblNewLabel.setBounds(51, 46, 55, 18);
		panel_6.add(lblNewLabel);

		JLabel lblNewLabel_3 = new JLabel("2");
		lblNewLabel_3.setBounds(183, 46, 55, 18);
		panel_6.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("3");
		lblNewLabel_4.setBounds(51, 108, 55, 18);
		panel_6.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("4");
		lblNewLabel_5.setBounds(51, 140, 55, 18);
		panel_6.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("5");
		lblNewLabel_6.setBounds(51, 173, 55, 18);
		panel_6.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("6");
		lblNewLabel_7.setBounds(51, 75, 55, 18);
		panel_6.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("7");
		lblNewLabel_8.setBounds(183, 75, 55, 18);
		panel_6.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("8");
		lblNewLabel_9.setBounds(183, 108, 55, 18);
		panel_6.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("9");
		lblNewLabel_10.setBounds(183, 140, 55, 18);
		panel_6.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("10");
		lblNewLabel_11.setBounds(183, 173, 55, 18);
		panel_6.add(lblNewLabel_11);

		btnNewButton_16 = new JButton("确定");
		btnNewButton_16.setBounds(122, 390, 90, 30);
		this.add(btnNewButton_16);
		btnNewButton_16.addActionListener(managerlistener);

		btnNewButton_17 = new JButton("取消");
		btnNewButton_17.setBounds(495, 390, 90, 30);
		this.add(btnNewButton_17);
		btnNewButton_17.addActionListener(managerlistener);

		JLabel label = new JLabel("\u4EF7\u683C\uFF08\u6BCF\u5343\u516C\u91CC\uFF09");
		label.setBounds(86, 49, 150, 18);
		add(label);

		textField_1 = new MyTextField();
		textField_1.setBounds(217, 43, 122, 30);
		add(textField_1);
		textField_1.setColumns(10);

	}
	public void setText(String s){
		dialog.setText(s);
	}
}
