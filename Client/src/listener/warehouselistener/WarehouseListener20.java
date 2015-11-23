package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import logic.warehousebl.Warehouse;
import logic.warehouseblservice.WarehouseBlService;
import presentation.warehouseui.WarehouseUI2;

public class WarehouseListener20 implements ActionListener {
	private WarehouseUI2 ui;
	WarehouseBlService warehouseBl = new Warehouse();

	public WarehouseListener20(WarehouseUI2 ui) {
		super();
		this.ui = ui;
	}

	public WarehouseListener20() {

	}

	public void actionPerformed(ActionEvent e) {
		// enquireButton
		if (e.getSource() == ui.getButton_1()) {
			//快递编号，入库日期，目的地，区号，排号，架号，位号
			ArrayList<Object> arr=warehouseBl.checkWarehouse(ui.getBeginDate(),ui.getEndDate());
			
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
