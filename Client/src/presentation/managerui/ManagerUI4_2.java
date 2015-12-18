/**
 * ManagerUI41是manager用户修改价格策略的界面
 */

package presentation.managerui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.managerlistener.ManagerListener4_2;


public class ManagerUI4_2 extends JPanel{


	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_1;

	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;

	ManagerListener4_2 managerlistener;

	/**
	 * Create the application.
	 * @param card
	 */
	public ManagerUI4_2(CardLayout card) {
		managerlistener = new ManagerListener4_2(this,card);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(new Color(158, 211, 238));
		this.setBounds(137, 115, 745, 440);

		this.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(192, 192, 192));
		panel_5.setBounds(0, 0, 743, 49);
		this.add(panel_5);
		panel_5.setLayout(null);

		btnNewButton_12 = new JButton("\u5236\u5B9A\u85AA\u6C34\u7B56\u7565");
		btnNewButton_12.setBounds(25, 11, 150, 30);
		panel_5.add(btnNewButton_12);
		btnNewButton_12.addActionListener(managerlistener);

		btnNewButton_13 = new JButton("\u5236\u5B9A\u8DDD\u79BB\u4EF7\u683C");
		btnNewButton_13.setBackground(new Color(255, 248, 220));
		btnNewButton_13.setBounds(182, 11, 150, 30);
		panel_5.add(btnNewButton_13);
		btnNewButton_13.addActionListener(managerlistener);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 106, 743, 282);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("价格");
		lblNewLabel_1.setBounds(435, 10, 100, 18);
		panel_6.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(388, 40, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(388, 69, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(388, 102, 122, 30);
		panel_6.add(textField_4);
		textField_4.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(388, 134, 122, 30);
		panel_6.add(textField_6);
		textField_6.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(388, 167, 122, 30);
		panel_6.add(textField_8);
		textField_8.setColumns(10);

		btnNewButton_14 = new JButton("\u4E0A\u4E00\u9875");
		btnNewButton_14.setBounds(193, 231, 90, 30);
		panel_6.add(btnNewButton_14);
		btnNewButton_14.addActionListener(managerlistener);

		btnNewButton_15 = new JButton("\u4E0B\u4E00\u9875");
		btnNewButton_15.setBounds(365, 231, 90, 30);
		panel_6.add(btnNewButton_15);
		btnNewButton_15.addActionListener(managerlistener);

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
		label.setBounds(0, 81, 150, 18);
		add(label);

		textField_1 = new JTextField();
		textField_1.setBounds(103, 75, 122, 30);
		add(textField_1);
		textField_1.setColumns(10);

	}
}
