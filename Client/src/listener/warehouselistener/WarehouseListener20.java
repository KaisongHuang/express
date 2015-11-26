package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import logic.warehousebl.Warehouse;
import po.InStoragePO;
import presentation.warehouseui.WarehouseUI2;

public class WarehouseListener20 implements ActionListener {
	private WarehouseUI2 ui;
	Warehouse warehouse = new Warehouse();

	public WarehouseListener20(WarehouseUI2 ui) {
		super();
		this.ui = ui;
	}

	@SuppressWarnings({ "unchecked", "null" })
	public void actionPerformed(ActionEvent e) {
		// enquireButton
		if (e.getSource() == ui.getButton_1()) {
			// 快递编号，入库日期，目的地，区号，排号，架号，位号
			// 库存查看(设定一个时间段，查看此时间段内的出／入库数量，存储位置，库存数量要有合计)
			ArrayList<Object> arr = warehouse.checkWarehouse(ui.getBeginDate(), ui.getEndDate());
			ArrayList<InStoragePO> po = null;
			String inNum = "" + warehouse.getInNum();
			String outNum = "" + warehouse.getOutNum();
			String total = "" + warehouse.getTotal();
			Vector<Object> data = null;

			ui.getTextArea().setText(inNum);
			ui.getTextArea_1().setText(outNum);
			ui.getTextArea_2().setText(total);
			for (int i = 0; i < warehouse.getInNum(); i++) {
				po = (ArrayList<InStoragePO>) arr.get(i);
			}
			for (int i = 0; i < warehouse.getInNum(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(po.get(i).getId());
				item.add(po.get(i).getIndate());
				item.add(po.get(i).getDestination());
				item.add(po.get(i).getPos_qu());
				item.add(po.get(i).getPos_pai());
				item.add(po.get(i).getPos_jia());
				item.add(po.get(i).getPos_wei());
				data.addElement(item);

			}
			ui.setData(data);
		}
		// clearButton
		else if (e.getSource() == ui.getButton_2()) {
			System.out.println("clear");
			ui.getComboBox().setSelectedIndex(0);
			ui.getComboBox_1().setSelectedIndex(0);
			ui.getComboBox_2().setSelectedIndex(0);
			ui.getComboBox_3().setSelectedIndex(0);
			ui.getComboBox_4().setSelectedIndex(0);
			ui.getComboBox_5().setSelectedIndex(0);
		}
	}

}
