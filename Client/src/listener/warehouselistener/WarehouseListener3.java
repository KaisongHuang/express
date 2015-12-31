package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;

import _enum.EmployeeMes;
import _enum.ResultMessage;
import logic.logicfactory.LogicFactory;
import logic.warehousebl.Warehouse;
import presentation.warehouseui.WarehouseUI3;
import presentation.warehouseui.WarehouseUI3_1;
import presentation.warehouseui.WarehouseUI3_2;
import vo.InStorageVO;

public class WarehouseListener3 implements ActionListener {
	private WarehouseUI3 ui;
	private WarehouseUI3_1 ui1;
	private WarehouseUI3_2 ui2;
	private boolean hasUI1 = false;
	private boolean hasUI2 = false;

	Warehouse warehouse ;
	private String Default="90";


	public WarehouseListener3(WarehouseUI3 ui) {
		super();
		this.ui = ui;
		warehouse=LogicFactory.getWarehouseService();
		// warehouse.setAlarm(90);
	}

	public void actionPerformed(ActionEvent e) {
		ResultMessage rm = null;
		if (e.getSource() == ui.getButton()) {// 刷新：从数据库中读取待调整的运单
			this.refresh();
		} else if (!hasUI2 && e.getSource() == ui.getButton_1()) {// 确认：提示是否确认修改，是则后台修改数据并允许button2可监听，否则不做任何修改并提示修改警戒比例
			ui2 = new WarehouseUI3_2(this);
			hasUI2 = true;
		} else if (hasUI2 && e.getSource() == ui.getButton_1())
			;
		else if (hasUI2 && e.getSource() == ui2.getButton()) {// 确认：后台数据修改
			hasUI2 = false;
			ArrayList<Object> ob = warehouse.showAdjustGoods();
			if (ob == null) {
				JOptionPane.showMessageDialog(ui, "不需要调整库存！");
				return;
			}
			for (int i = 0; i < ob.size()/2; i++) {
				InStorageVO vo1 = (InStorageVO) ob.get(2 * i);
				int[] vo2 = (int[]) ob.get(2 * i + 1);
				InStorageVO vo = new InStorageVO();
				vo.setId(vo1.getId());// textField_3
				vo.setDestination(vo1.getDestination());// textField_4
				vo.setIndate(vo1.getIndate());// comboBox_4comboBox_5comboBox_6
				vo.setPos_qu("temp");// comboBox_7
				vo.setPos_pai(vo2[0]);// comboBox_8
				vo.setPos_jia(vo2[1]);// comboBox_9
				vo.setPos_wei(vo2[2]);// comboBox_10
				vo.setWarehouseID(EmployeeMes.belongToWho);
				vo.setIsCheck(0);

				rm = warehouse.update(vo);
				check(rm);
			}

			clearTable();

			ui2.dispose();
		} else if (hasUI2 && e.getSource() == ui2.getButton_1()) {// 取消：不做任何修改
			hasUI2 = false;
			ui2.dispose();
		} else if (e.getSource() == ui.getButton_2()) {// 清空：假如确认完毕，则允许清空表格，并设置不可监听
			int n = ui.getModel().getRowCount();
			for (int i = 0; i < n; i++) {
				ui.getModel().removeRow(0);
			}
			ui.getButton_2().setEnabled(false);
		} else if (!hasUI1 && e.getSource() == ui.getButton_3()) {// 设置警戒比例
			ui1 = new WarehouseUI3_1(this,Default);
			hasUI1 = true;
		} else if (hasUI1 && e.getSource() == ui.getButton_3())
			;
		else if (hasUI1 && e.getSource() == ui1.getButton()) {// 确认：修改报警比例
			hasUI1 = false;
			rm = warehouse.setAlarm(Double.parseDouble(ui1.getTextField_1().getText())/100);
			check(rm);
			Default=ui1.getTextField_1().getText();
			ui1.dispose();
			this.refresh();
		} else if (hasUI1 && e.getSource() == ui1.getButton_1()) {// 取消：不做任何修改
			hasUI1 = false;
			ui1.dispose();
		}
	}

	private void clearTable(){
		int n=ui.getModel().getRowCount();
		for (int i = 0; i < n; i++)
			ui.getModel().removeRow(0);
	}

	private void refresh() {
		ArrayList<Object> ob = warehouse.showAdjustGoods();

		clearTable();

		for (int i = 0; i < ob.size()/2; i++) {
			Vector<Object> item = new Vector<Object>();
			InStorageVO vo1 = (InStorageVO) ob.get(2 * i);
			int[] vo2 = (int[]) ob.get(2 * i + 1);
			item.add(vo1.getId());
			item.add(vo1.getPos_qu());
			item.add(vo1.getPos_pai());
			item.add(vo1.getPos_jia());
			item.add(vo1.getPos_wei());
			item.add("temp");
			item.add(vo2[0]);
			item.add(vo2[1]);
			item.add(vo2[2]);
			ui.getModel().addRow(item);
		}

	}

	private void check(ResultMessage rm) {
		String dialog = null;
		if (rm == ResultMessage.FunctionError) {
			dialog = "网络连接出现了问题，请检查您的网络！";
		} else if (rm == ResultMessage.Fail)
			dialog = "数据更新失败！";
		else if (rm == ResultMessage.Success) {
			dialog = "数据更新成功！";
		} else if (rm == ResultMessage.UpdateFail) {
			dialog = "请不要重复创建单据";
		}
		if (dialog != null)
			ui.setText(dialog);
	}
}
