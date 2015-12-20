/**
 * ManagerUI4是manager用户的制定薪水策略的界面
 */

package presentation.managerui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import listener.managerlistener.ManagerListener4_1;

import javax.swing.JComboBox;

public class ManagerUI4_1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;

	private JComboBox<?> comboBox;
	private JComboBox<?> comboBox_1;
	private JComboBox<?> comboBox_2;
	private JComboBox<?> comboBox_3;
	private JComboBox<?> comboBox_4;
	private JComboBox<?> comboBox_5;
	private JComboBox<?> comboBox_6;

	ManagerListener4_1 managerlistener;

	/**
	 * Create the application.
	 * 
	 * @param card
	 */
	public ManagerUI4_1() {
		managerlistener = new ManagerListener4_1(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(new Color(158, 211, 238));

		this.setBounds(0, 44, 746, 394);

		this.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("总经理：");
		lblNewLabel_1.setBounds(48, 84, 100, 18);
		this.add(lblNewLabel_1);

		comboBox = new JComboBox<Object>();
		comboBox.setBounds(129, 79, 100, 28);
		this.add(comboBox);

		JLabel lblNewLabel_2 = new JLabel("仓库管理员：");
		lblNewLabel_2.setBounds(48, 152, 100, 18);
		this.add(lblNewLabel_2);

		comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(129, 147, 100, 28);
		this.add(comboBox_1);

		JLabel lblNewLabel_3 = new JLabel("营业厅业务员");
		lblNewLabel_3.setBounds(48, 222, 100, 18);
		this.add(lblNewLabel_3);

		comboBox_2 = new JComboBox<Object>();
		comboBox_2.setBounds(129, 217, 100, 28);
		this.add(comboBox_2);

		JLabel lblNewLabel_4 = new JLabel("财务人员：");
		lblNewLabel_4.setBounds(312, 84, 100, 18);
		this.add(lblNewLabel_4);

		comboBox_3 = new JComboBox<Object>();
		comboBox_3.setBounds(402, 79, 100, 28);
		this.add(comboBox_3);

		JLabel lblNewLabel_5 = new JLabel("中转中心业务员");
		lblNewLabel_5.setBounds(312, 152, 110, 18);
		this.add(lblNewLabel_5);

		comboBox_4 = new JComboBox<Object>();
		comboBox_4.setBounds(402, 147, 100, 28);
		this.add(comboBox_4);

		JLabel lblNewLabel_6 = new JLabel("快递员：");
		lblNewLabel_6.setBounds(312, 222, 100, 18);
		this.add(lblNewLabel_6);

		comboBox_5 = new JComboBox<Object>();
		comboBox_5.setBounds(402, 217, 100, 28);
		this.add(comboBox_5);

		JLabel lblNewLabel_7 = new JLabel("管理员：");
		lblNewLabel_7.setBounds(48, 287, 100, 18);
		this.add(lblNewLabel_7);

		comboBox_6 = new JComboBox<Object>();
		comboBox_6.setBounds(129, 282, 100, 28);
		this.add(comboBox_6);

		btnNewButton_14 = new JButton("确定");
		btnNewButton_14.setBounds(301, 293, 100, 30);
		this.add(btnNewButton_14);
		btnNewButton_14.addActionListener(managerlistener);

		btnNewButton_15 = new JButton("取消");
		btnNewButton_15.setBounds(402, 293, 100, 30);
		this.add(btnNewButton_15);
		btnNewButton_15.addActionListener(managerlistener);

	}

	public JButton getBtnNewButton_14() {
		return btnNewButton_14;
	}

	public void setBtnNewButton_14(JButton btnNewButton_14) {
		this.btnNewButton_14 = btnNewButton_14;
	}

	public JButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	public void setBtnNewButton_15(JButton btnNewButton_15) {
		this.btnNewButton_15 = btnNewButton_15;
	}

	public JComboBox<?> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<?> comboBox) {
		this.comboBox = comboBox;
	}

	public JComboBox<?> getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox<?> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public JComboBox<?> getComboBox_2() {
		return comboBox_2;
	}

	public void setComboBox_2(JComboBox<?> comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

	public JComboBox<?> getComboBox_3() {
		return comboBox_3;
	}

	public void setComboBox_3(JComboBox<?> comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}

	public JComboBox<?> getComboBox_4() {
		return comboBox_4;
	}

	public void setComboBox_4(JComboBox<?> comboBox_4) {
		this.comboBox_4 = comboBox_4;
	}

	public JComboBox<?> getComboBox_5() {
		return comboBox_5;
	}

	public void setComboBox_5(JComboBox<?> comboBox_5) {
		this.comboBox_5 = comboBox_5;
	}

	public JComboBox<?> getComboBox_6() {
		return comboBox_6;
	}

	public void setComboBox_6(JComboBox<?> comboBox_6) {
		this.comboBox_6 = comboBox_6;
	}

}
