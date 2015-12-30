/**
 * ManagerUI4是manager用户的制定薪水策略的界面
 */

package presentation.managerui;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JLabel;
import listener.managerlistener.ManagerListener4_1;
<<<<<<< HEAD
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
=======
import presentation.MySwing.MyDialog;

>>>>>>> master
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTextField;
import vo.SalaryVO;

import javax.swing.JComboBox;

public class ManagerUI4_1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MyButton btnNewButton_14;
	private MyButton btnNewButton_15;

	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private JComboBox<String> comboBox_4;
	private JComboBox<String> comboBox_5;
	private JComboBox<String> comboBox_6;
	private MyDialog dialog;
	private MyTextField myTextField;
	private MyTextField myTextField_1;
	private MyTextField myTextField_2;
	private MyTextField myTextField_3;
	private MyTextField myTextField_4;
	private MyTextField myTextField_5;
	private MyTextField myTextField_6;
	private ManagerListener4_1 managerlistener;

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

		setBackground(Color.white);

		this.setBounds(0, 44, 746, 394);

		this.setLayout(null);
        dialog=new MyDialog();
        this.add(dialog);
		JLabel lblNewLabel_1 = new JLabel("总经理：");
		lblNewLabel_1.setBounds(48, 59, 100, 18);
		this.add(lblNewLabel_1);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(160, 55, 100, 28);
		comboBox.addItem("按月");
		comboBox.addItem("计次");
		comboBox.addItem("提成");
		this.add(comboBox);

		JLabel lblNewLabel_2 = new JLabel("仓库管理员：");
		lblNewLabel_2.setBounds(48, 187, 100, 18);
		this.add(lblNewLabel_2);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(160, 85, 100, 28);
		comboBox_1.addItem("按月");
		comboBox_1.addItem("计次");
		comboBox_1.addItem("提成");
		this.add(comboBox_1);

		JLabel lblNewLabel_3 = new JLabel("营业厅业务员:");
		lblNewLabel_3.setBounds(48, 217, 100, 18);
		this.add(lblNewLabel_3);

		comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(160, 118, 100, 28);
		comboBox_2.addItem("按月");
		comboBox_2.addItem("计次");
		comboBox_2.addItem("提成");
		this.add(comboBox_2);

		JLabel lblNewLabel_4 = new JLabel("财务人员：");
		lblNewLabel_4.setBounds(48, 154, 100, 18);
		this.add(lblNewLabel_4);

		comboBox_3 = new JComboBox<String>();
		comboBox_3.setBounds(160, 150, 100, 28);
		comboBox_3.addItem("按月");
		comboBox_3.addItem("计次");
		comboBox_3.addItem("提成");
		this.add(comboBox_3);

		JLabel lblNewLabel_5 = new JLabel("中转中心业务员:");
		lblNewLabel_5.setBounds(48, 250, 110, 18);
		this.add(lblNewLabel_5);

		comboBox_4 = new JComboBox<String>();
		comboBox_4.setBounds(160, 182, 100, 28);
		comboBox_4.addItem("按月");
		comboBox_4.addItem("计次");
		comboBox_4.addItem("提成");
		this.add(comboBox_4);

		JLabel lblNewLabel_6 = new JLabel("快递员：");
		lblNewLabel_6.setBounds(48, 89, 100, 18);
		this.add(lblNewLabel_6);

		comboBox_5 = new JComboBox<String>();
		comboBox_5.setBounds(160, 213, 100, 28);
		comboBox_5.addItem("按月");
		comboBox_5.addItem("计次");
		comboBox_5.addItem("提成");
		this.add(comboBox_5);

		JLabel lblNewLabel_7 = new JLabel("管理员：");
		lblNewLabel_7.setBounds(48, 122, 100, 18);
		this.add(lblNewLabel_7);

		comboBox_6 = new JComboBox<String>();
		comboBox_6.setBounds(160, 246, 100, 28);
		comboBox_6.addItem("按月");
		comboBox_6.addItem("计次");
		comboBox_6.addItem("提成");
		this.add(comboBox_6);

		btnNewButton_14 = new MyButton("确定");
		btnNewButton_14.setBounds(98, 293, 100, 30);
		this.add(btnNewButton_14);
		btnNewButton_14.addActionListener(managerlistener);

		btnNewButton_15 = new MyButton("取消");
		btnNewButton_15.setBounds(210, 293, 100, 30);
		this.add(btnNewButton_15);
		btnNewButton_15.addActionListener(managerlistener);

		myTextField = new MyTextField();
		myTextField.setBounds(272, 54, 100, 28);
		add(myTextField);

		myTextField_1 = new MyTextField();
		myTextField_1.setBounds(272, 85, 100, 28);
		add(myTextField_1);

		myTextField_2 = new MyTextField();
		myTextField_2.setBounds(272, 117, 100, 28);
		add(myTextField_2);

		myTextField_3 = new MyTextField();
		myTextField_3.setBounds(272, 149, 100, 28);
		add(myTextField_3);

		myTextField_4 = new MyTextField();
		myTextField_4.setBounds(272, 181, 100, 28);
		add(myTextField_4);

		myTextField_5 = new MyTextField();
		myTextField_5.setBounds(272, 213, 100, 28);
		add(myTextField_5);

		myTextField_6 = new MyTextField();
		myTextField_6.setBounds(272, 245, 100, 28);
		add(myTextField_6);
		
		setData();
	}

	public MyTextField getMyTextField() {
		return myTextField;
	}

	public MyTextField getMyTextField_1() {
		return myTextField_1;
	}

	public MyTextField getMyTextField_2() {
		return myTextField_2;
	}

	public MyTextField getMyTextField_3() {
		return myTextField_3;
	}

	public MyTextField getMyTextField_4() {
		return myTextField_4;
	}

	public MyTextField getMyTextField_5() {
		return myTextField_5;
	}

	public MyTextField getMyTextField_6() {
		return myTextField_6;
	}

	public MyButton getBtnNewButton_14() {
		return btnNewButton_14;
	}

	public MyButton getBtnNewButton_15() {
		return btnNewButton_15;
	}

	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox<String> comboBox) {
		this.comboBox = comboBox;
	}

	public JComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public void setComboBox_1(JComboBox<String> comboBox_1) {
		this.comboBox_1 = comboBox_1;
	}

	public JComboBox<String> getComboBox_2() {
		return comboBox_2;
	}

	public void setComboBox_2(JComboBox<String> comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

	public JComboBox<String> getComboBox_3() {
		return comboBox_3;
	}

	public void setComboBox_3(JComboBox<String> comboBox_3) {
		this.comboBox_3 = comboBox_3;
	}

	public JComboBox<String> getComboBox_4() {
		return comboBox_4;
	}

	public void setComboBox_4(JComboBox<String> comboBox_4) {
		this.comboBox_4 = comboBox_4;
	}

	public JComboBox<String> getComboBox_5() {
		return comboBox_5;
	}

	public void setComboBox_5(JComboBox<String> comboBox_5) {
		this.comboBox_5 = comboBox_5;
	}

	public JComboBox<String> getComboBox_6() {
		return comboBox_6;
	}

	public void setComboBox_6(JComboBox<String> comboBox_6) {
		this.comboBox_6 = comboBox_6;
	}
	
	private void setData(){
		ManagerBlService managerbl=new Manager();
		
		ArrayList<SalaryVO> arr = managerbl.getSalary();
		SalaryVO manager=arr.get(0);
		SalaryVO courier=arr.get(1);
		SalaryVO admin=arr.get(2);
		SalaryVO finance=arr.get(3);
		SalaryVO warehouse=arr.get(4);
		SalaryVO sellingarea=arr.get(5);
		SalaryVO centre=arr.get(6);
		
		getComboBox().setSelectedItem(manager.getSalaryMethod());
		getComboBox_1().setSelectedItem(courier.getSalaryMethod());
		getComboBox_2().setSelectedItem(admin.getSalaryMethod());
		getComboBox_3().setSelectedItem(finance.getSalaryMethod());
		getComboBox_4().setSelectedItem(warehouse.getSalaryMethod());
		getComboBox_5().setSelectedItem(sellingarea.getSalaryMethod());
		getComboBox_6().setSelectedItem(centre.getSalaryMethod());
		
		getMyTextField().setText(""+manager.getMoney());
		getMyTextField_1().setText(""+courier.getMoney());
		getMyTextField_2().setText(""+admin.getMoney());
		getMyTextField_3().setText(""+finance.getMoney());
		getMyTextField_4().setText(""+warehouse.getMoney());
		getMyTextField_5().setText(""+sellingarea.getMoney());
		getMyTextField_6().setText(""+centre.getMoney());
	}

}
