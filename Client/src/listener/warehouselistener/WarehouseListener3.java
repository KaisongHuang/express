package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import _enum.EmployeeMes;
import logic.warehousebl.Warehouse;
import po.InStoragePO;
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
	Warehouse warehouse = new Warehouse();

	public WarehouseListener3(WarehouseUI3 ui) {
		super();
		this.ui = ui;

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.getButton()) {// 刷新：从数据库中读取待调整的运单
			ArrayList<Object> ob = warehouse.showAdjustGoods();
			Vector<Object> data = new Vector<Object>();

			for (int i = 0; i < ob.size(); i++) {
				Vector<Object> item = new Vector<Object>();
				InStoragePO po1 = (InStoragePO) ob.get(2 * i);
				InStoragePO po2 = (InStoragePO) ob.get(2 * i + 1);
				item.add(po1.getId());
				item.add(po1.getPos_qu());
				item.add(po1.getPos_pai());
				item.add(po1.getPos_jia());
				item.add(po1.getPos_wei());
				item.add(po2.getPos_qu());
				item.add(po2.getPos_pai());
				item.add(po2.getPos_jia());
				item.add(po2.getPos_wei());
				data.add(item);
			}

			ui.setData(data);
		} else if (!hasUI2 && e.getSource() == ui.getButton_1()) {// 确认：提示是否确认修改，是则后台修改数据并允许button2可监听，否则不做任何修改并提示修改警戒比例
			ui2 = new WarehouseUI3_2(this);
			hasUI2 = true;
		} else if (hasUI2 && e.getSource() == ui.getButton_1())
			;
		else if (hasUI2 && e.getSource() == ui2.getButton()) {// 确认：后台数据修改
			hasUI2 = false;
			ArrayList<Object> ob = warehouse.showAdjustGoods();
			Vector<Object> data = new Vector<Object>();

			for (int i = 0; i < ob.size(); i++) {
				InStoragePO po1 = (InStoragePO) ob.get(2 * i);
				InStoragePO po2 = (InStoragePO) ob.get(2 * i + 1);
				InStorageVO vo = new InStorageVO();
				vo.setId(po1.getId());// textField_3
				vo.setDestination(po1.getDestination());// textField_4
				vo.setIndate(po1.getIndate());// comboBox_4comboBox_5comboBox_6
				vo.setPos_qu(po2.getPos_qu());// comboBox_7
				vo.setPos_pai(po2.getPos_pai());// comboBox_8
				vo.setPos_jia(po2.getPos_jia());// comboBox_9
				vo.setPos_wei(po2.getPos_wei());// comboBox_10
				vo.setWarehouseID(EmployeeMes.belongToWho);
				vo.setIsCheck(0);

				warehouse.importGoods(vo);
			}

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
			ui1 = new WarehouseUI3_1(this);
			hasUI1 = true;
		} else if (hasUI1 && e.getSource() == ui.getButton_3())
			;
		else if (hasUI1 && e.getSource() == ui1.getButton()) {// 确认：修改报警比例
			hasUI1 = false;
			warehouse.setAlarm(Double.parseDouble(ui1.getTextArea_1().getText()));
			ui1.dispose();
		} else if (hasUI1 && e.getSource() == ui1.getButton_1()) {// 取消：不做任何修改
			hasUI1 = false;
			ui1.dispose();
		}
	}
}
