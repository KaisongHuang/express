package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import logic.logicfactory.LogicFactory;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI4_1;
import vo.SalaryVO;

public class ManagerListener4_1 implements MouseListener, ActionListener {

	private ManagerUI4_1 ui;
	private ManagerBlService managerbl ;

	public ManagerListener4_1(ManagerUI4_1 ui) {
		super();
		this.ui = ui;managerbl=LogicFactory.getManagerService();
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getBtnNewButton_14()) {
			String manager_method = (String) ui.getComboBox().getSelectedItem();
			String courier_method = (String) ui.getComboBox_1().getSelectedItem();
			String admin_method = (String) ui.getComboBox_2().getSelectedItem();
			String finance_method = (String) ui.getComboBox_3().getSelectedItem();
			String warehouse_method = (String) ui.getComboBox_4().getSelectedItem();
			String sellingarea_method = (String) ui.getComboBox_5().getSelectedItem();
			String centre_method = (String) ui.getComboBox_6().getSelectedItem();

			double manager_salary = Double.parseDouble(ui.getMyTextField().getText());
			double courier_salary = Double.parseDouble(ui.getMyTextField_1().getText());
			double admin_salary = Double.parseDouble(ui.getMyTextField_2().getText());
			double finance_salary = Double.parseDouble(ui.getMyTextField_3().getText());
			double warehouse_salary = Double.parseDouble(ui.getMyTextField_4().getText());
			double sellingarea_salary = Double.parseDouble(ui.getMyTextField_5().getText());
			double centre_salary = Double.parseDouble(ui.getMyTextField_6().getText());

			SalaryVO manager = new SalaryVO("manager", manager_method, manager_salary);
			SalaryVO courier = new SalaryVO("courier", courier_method, courier_salary);
			SalaryVO admin = new SalaryVO("admin", admin_method, admin_salary);
			SalaryVO finance = new SalaryVO("finance", finance_method, finance_salary);
			SalaryVO warehouse = new SalaryVO("warehouse", warehouse_method, warehouse_salary);
			SalaryVO sellingarea = new SalaryVO("sellingarea", sellingarea_method, sellingarea_salary);
			SalaryVO centre = new SalaryVO("centre", centre_method, centre_salary);

			managerbl.updateSalary(manager);
			managerbl.updateSalary(courier);
			managerbl.updateSalary(admin);
			managerbl.updateSalary(finance);
			managerbl.updateSalary(warehouse);
			managerbl.updateSalary(sellingarea);
			managerbl.updateSalary(centre);

		}
		if (e.getSource() == ui.getBtnNewButton_15()) {
			ArrayList<SalaryVO> arr = managerbl.getSalary();
			SalaryVO manager=arr.get(0);
			SalaryVO courier=arr.get(1);
			SalaryVO admin=arr.get(2);
			SalaryVO finance=arr.get(3);
			SalaryVO warehouse=arr.get(4);
			SalaryVO sellingarea=arr.get(5);
			SalaryVO centre=arr.get(6);
			
			ui.getComboBox().setSelectedItem(manager.getSalaryMethod());
			ui.getComboBox_1().setSelectedItem(courier.getSalaryMethod());
			ui.getComboBox_2().setSelectedItem(admin.getSalaryMethod());
			ui.getComboBox_3().setSelectedItem(finance.getSalaryMethod());
			ui.getComboBox_4().setSelectedItem(warehouse.getSalaryMethod());
			ui.getComboBox_5().setSelectedItem(sellingarea.getSalaryMethod());
			ui.getComboBox_6().setSelectedItem(centre.getSalaryMethod());
			
			ui.getMyTextField().setText(""+manager.getMoney());
			ui.getMyTextField_1().setText(""+courier.getMoney());
			ui.getMyTextField_2().setText(""+admin.getMoney());
			ui.getMyTextField_3().setText(""+finance.getMoney());
			ui.getMyTextField_4().setText(""+warehouse.getMoney());
			ui.getMyTextField_5().setText(""+sellingarea.getMoney());
			ui.getMyTextField_6().setText(""+centre.getMoney());
			
		}
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
