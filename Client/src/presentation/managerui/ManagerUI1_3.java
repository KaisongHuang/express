/**
 * ManagerUI12是manager用户的机构管理的删除界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import listener.managerlistener.ManagerListener1_3;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTextField;

public class ManagerUI1_3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MyTextField textField;

	
	
	private MyButton search;
	private MyButton delete;
	

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;

	ManagerListener1_3 managerlistener;

	public ManagerUI1_3() {
		managerlistener = new ManagerListener1_3(this);
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
		lblNewLabel_1.setBounds(104, 63, 100, 18);
		this.add(lblNewLabel_1);

		textField = new MyTextField();
		textField.setBounds(191, 57, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		search = new MyButton("查询");
		search.setBounds(325, 57, 100, 30);
		this.add(search);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(104, 112, 477, 113);
		this.add(panel_6);
		panel_6.setLayout(null);

		lblNewLabel_2 = new JLabel("机构信息");
		lblNewLabel_2.setBounds(164, 6, 100, 18);
		panel_6.add(lblNewLabel_2);

		lblNewLabel_3 = new JLabel("机构编号：");
		lblNewLabel_3.setBounds(25, 56, 100, 18);
		panel_6.add(lblNewLabel_3);

		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(116, 56, 100, 18);
		panel_6.add(lblNewLabel_5);

		lblNewLabel_7 = new JLabel("机构编号：");
		lblNewLabel_7.setBounds(294, 56, 100, 18);
		panel_6.add(lblNewLabel_7);

		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(368, 56, 100, 18);
		panel_6.add(lblNewLabel_8);

		delete = new MyButton("删除");
		delete.setBounds(437, 57, 100, 30);
		this.add(delete);


		search.addActionListener(managerlistener);
		search.addMouseListener(managerlistener);
		delete.addActionListener(managerlistener);
	    delete.addMouseListener(managerlistener);

	}

	public MyTextField getTextField() {
		return textField;
	}

	public void setTextField(MyTextField textField) {
		this.textField = textField;
	}

	public MyButton getSearch(){
		return search;
	}

	public MyButton getDelete() {
		return delete;
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

	public JLabel getLblNewLabel_3() {
		return lblNewLabel_3;
	}

	public void setLblNewLabel_3(JLabel lblNewLabel_3) {
		this.lblNewLabel_3 = lblNewLabel_3;
	}

	public JLabel getLblNewLabel_5() {
		return lblNewLabel_5;
	}

	public void setLblNewLabel_5(JLabel lblNewLabel_5) {
		this.lblNewLabel_5 = lblNewLabel_5;
	}

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
	}

	public JLabel getLblNewLabel_8() {
		return lblNewLabel_8;
	}

	public void setLblNewLabel_8(JLabel lblNewLabel_8) {
		this.lblNewLabel_8 = lblNewLabel_8;
	}

}
