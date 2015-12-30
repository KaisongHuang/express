package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import _enum.Opera;
import _enum.Operation;
import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI4_2;
import vo.AccountVO;
import vo.DistanceAndFeeVO;

public class ManagerListener4_2 implements MouseListener, ActionListener {

	private ManagerUI4_2 ui;
	ManagerBlService manager = new Manager();

	public ManagerListener4_2(ManagerUI4_2 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getMyButton()) {
			String city1=ui.getMyTextField().getText();
			String city2=ui.getMyTextField_1().getText();
			double distance=Double.parseDouble(ui.getMyTextField_2().getText());
			double fee=Double.parseDouble(ui.getTextField_1().getText());
			
			Vector<Object> rowData=new Vector<Object>();
			rowData.add(city1);
			rowData.add(city2);
			rowData.add(distance);
			
			manager.manageDistance(new DistanceAndFeeVO(city1,city2,distance,fee), Opera.);
			ui.getModel().addRow(rowData);
		}
		if (e.getSource() == ui.getMyButton_1()) {
			String city1=ui.getMyTextField().getText();
			String city2=ui.getMyTextField_1().getText();
			double distance=Double.parseDouble(ui.getMyTextField_2().getText());
			double fee=Double.parseDouble(ui.getTextField_1().getText());
			
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 是否存在选中行
			{
				// 修改指定的值：
				ui.getModel().setValueAt(city1, selectedRow, 0);
				ui.getModel().setValueAt(city2, selectedRow, 1);
				ui.getModel().setValueAt(distance, selectedRow, 2);
				// table.setValueAt(arg0, arg1, arg2)
			}
			manager.manageDistance(new DistanceAndFeeVO(city1,city2,distance,fee), Opera.);
		}
		if (e.getSource() == ui.getMyButton_2()) {
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			String city1=ui.getMyTextField().getText();
			String city2=ui.getMyTextField_1().getText();
			double distance=Double.parseDouble(ui.getMyTextField_2().getText());
			double fee=Double.parseDouble(ui.getTextField_1().getText());
			
			manager.manageDistance(new DistanceAndFeeVO(city1,city2,distance,fee), Opera.);

			if (selectedRow != -1) // 存在选中行
				ui.getModel().removeRow(selectedRow); // 删除行
			
			ui.getMyTextField().setText("");
			ui.getMyTextField_1().setText("");
			ui.getMyTextField_2().setText("");
		}
		if (e.getSource() == ui.getMyButton_3()) {
			double fee=Double.parseDouble(ui.getTextField_1().getText());
			manager.updateFee(fee);
		}
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getTable()) {
			int selectedRow = ui.getTable().getSelectedRow(); // 获得选中行索引
			
			String city1=(String) ui.getModel().getValueAt(selectedRow, 0);
			String city2=(String) ui.getModel().getValueAt(selectedRow, 1);
			double distance=(Double) ui.getModel().getValueAt(selectedRow, 1);
			
			ui.getMyTextField().setText(city1);
			ui.getMyTextField_1().setText(city2); // 给文本框赋值
			ui.getMyTextField_2().setText(""+distance);
		}
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
