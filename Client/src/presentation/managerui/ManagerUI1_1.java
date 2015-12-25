/**
 * ManagerUI1是manager用户的机构管理的查询界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import listener.managerlistener.ManagerListener1_1;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTextField;

public class ManagerUI1_1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MyTextField textField;

	private MyButton search;

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_10;

	ManagerListener1_1 managerlistener;

	/**
	 * Create the application.
	 * 
	 * @param card
	 */
	public ManagerUI1_1() {
		managerlistener = new ManagerListener1_1(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(Color.white);
		this.setBounds(0, 44, 746, 394);

		this.setLayout(null);

		lblNewLabel_1 = new JLabel("机构编号：");
		lblNewLabel_1.setBounds(117, 63, 100, 18);
		this.add(lblNewLabel_1);

		textField = new MyTextField();
		textField.setBounds(188, 57, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		search = new MyButton("查询");
		search.setBounds(360, 58, 100, 30);
		this.add(search);
		search.addActionListener(managerlistener);
        search.addMouseListener(managerlistener);
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(117, 143, 481, 84);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_2 = new JLabel("机构编号：");
		lblNewLabel_2.setBounds(6, 35, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_4 = new JLabel("111");
		lblNewLabel_4.setBounds(103, 35, 100, 18);
		panel_6.add(lblNewLabel_4);

		lblNewLabel_6 = new JLabel("机构名称：");
		lblNewLabel_6.setBounds(244, 35, 100, 18);
		panel_6.add(lblNewLabel_6);

		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(357, 35, 100, 18);
		panel_6.add(lblNewLabel_7);

		lblNewLabel_10 = new JLabel("机构信息");
		lblNewLabel_10.setBounds(186, 6, 100, 18);
		panel_6.add(lblNewLabel_10);

	

	}

	public MyTextField getTextField() {
		return textField;
	}

	public void setTextField(MyTextField textField) {
		this.textField = textField;
	}

	public MyButton getSearch() {
		return search;
	}

	

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}

	public JLabel getLblNewLabel_4() {
		return lblNewLabel_4;
	}

	public void setLblNewLabel_4(JLabel lblNewLabel_4) {
		this.lblNewLabel_4 = lblNewLabel_4;
	}

	public JLabel getLblNewLabel_6() {
		return lblNewLabel_6;
	}

	public void setLblNewLabel_6(JLabel lblNewLabel_6) {
		this.lblNewLabel_6 = lblNewLabel_6;
	}

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
	}

	public JLabel getLblNewLabel_10() {
		return lblNewLabel_10;
	}

	public void setLblNewLabel_10(JLabel lblNewLabel_10) {
		this.lblNewLabel_10 = lblNewLabel_10;
	}

	

}
