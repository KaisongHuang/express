/**
 * ManagerUI13是manager用户的机构管理的增加界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.managerlistener.ManagerListener1_4;

public class ManagerUI1_4 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_2;

	private JButton btnNewButton_15;
	private JButton btnNewButton_16;

	ManagerListener1_4 managerlistener;

	/**
	 * Create the application.
	 * 
	 * @param card
	 */
	public ManagerUI1_4() {
		managerlistener = new ManagerListener1_4(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(Color.white);
		this.setBounds(0, 44, 746, 394);

		this.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setBounds(113, 92, 517, 117);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("机构信息");
		lblNewLabel_1.setBounds(216, 6, 100, 18);
		panel_6.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("机构编号：");
		lblNewLabel_2.setBounds(17, 54, 100, 18);
		panel_6.add(lblNewLabel_2);

		textField = new JTextField();
		textField.setBounds(98, 48, 122, 30);
		panel_6.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("机构名称：");
		lblNewLabel_4.setBounds(270, 54, 100, 18);
		panel_6.add(lblNewLabel_4);

		textField_2 = new JTextField();
		textField_2.setBounds(347, 48, 122, 30);
		panel_6.add(textField_2);
		textField_2.setColumns(10);

		btnNewButton_15 = new JButton("确定");
		btnNewButton_15.setBounds(224, 277, 100, 30);
		this.add(btnNewButton_15);

		btnNewButton_16 = new JButton("取消");
		btnNewButton_16.setBounds(459, 277, 100, 30);
		this.add(btnNewButton_16);

		btnNewButton_15.addActionListener(managerlistener);
		btnNewButton_16.addActionListener(managerlistener);

	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	public void setBtnNewButton_15(JButton btnNewButton_15) {
		this.btnNewButton_15 = btnNewButton_15;
	}

	public JButton getBtnNewButton_16() {
		return btnNewButton_16;
	}

	public void setBtnNewButton_16(JButton btnNewButton_16) {
		this.btnNewButton_16 = btnNewButton_16;
	}


}
