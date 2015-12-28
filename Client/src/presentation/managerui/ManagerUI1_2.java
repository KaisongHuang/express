/**
 * ManagerUI11是manager用户的机构管理的更新界面
 */

package presentation.managerui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import listener.managerlistener.ManagerListener1_2;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTextField;

public class ManagerUI1_2 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyTextField textField;
	private MyTextField textField_1;
	private MyTextField textField_3;

	private MyButton search;
	private MyButton update;
	

	ManagerListener1_2 managerlistener;

	/**
	 * Create the application.
	 * 
	 * @param card
	 */
	public ManagerUI1_2() {
		managerlistener = new ManagerListener1_2(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBackground(Color.white);
		this.setBounds(0, 44, 746, 394);

		this.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("机构编号：");
		lblNewLabel_1.setBounds(75, 72, 100, 18);
		this.add(lblNewLabel_1);

		textField = new MyTextField();
		textField.setBounds(151, 66, 122, 30);
		this.add(textField);
		textField.setColumns(10);

		search = new MyButton("查询");
		search.setBounds(300, 66, 100, 30);
		this.add(search);
		search.addActionListener(managerlistener);
        search.addMouseListener(managerlistener);
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(75, 125, 485, 111);
		this.add(panel_6);
		panel_6.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("机构信息");
		lblNewLabel_2.setBounds(209, 19, 100, 18);
		panel_6.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("机构编号：");
		lblNewLabel_3.setBounds(6, 75, 100, 18);
		panel_6.add(lblNewLabel_3);

		textField_1 = new MyTextField();
		textField_1.setBounds(83, 63, 122, 30);
		panel_6.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("机构编号：");
		lblNewLabel_5.setBounds(258, 75, 100, 18);
		panel_6.add(lblNewLabel_5);

		textField_3 = new MyTextField();
		textField_3.setBounds(332, 63, 122, 30);
		panel_6.add(textField_3);
		textField_3.setColumns(10);

		update = new MyButton("更新");
		update.setBounds(410, 66, 100, 30);
		this.add(update);
		update.addActionListener(managerlistener);
        update.addMouseListener(managerlistener);
	
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

	public MyTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(MyTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public MyButton getSearch() {
		return search;
	}

	public MyButton getUpdate() {
		return update;
	}

	



}
