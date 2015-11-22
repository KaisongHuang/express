package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import logic.warehousebl.Warehouse;
import logic.warehouseblservice.WarehouseBlService;
import presentation.warehouseui.WarehouseUI1;
import vo.OutStorageVO;

public class WarehouseListener10 implements ActionListener {

	private WarehouseUI1 ui;
	WarehouseBlService warehouseBl = new Warehouse();

	public WarehouseListener10(WarehouseUI1 ui) {
		super();
		this.ui = ui;
	}

	public WarehouseListener10() {

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getImportButton()) {
			System.out.println("ImportPanel");
			ui.getCardLayout().show(ui.getPanel(), "import");
		} else if (e.getSource() == ui.getExportButton()) {
			System.out.println("ExportPanel");
			ui.getCardLayout().show(ui.getPanel(), "export");
		} else if (e.getSource() == ui.getExportClearButton()) {
			System.out.println("ExportClear");
			ui.getComboBox().setSelectedIndex(0);
			ui.getComboBox_1().setSelectedIndex(0);
			ui.getComboBox_2().setSelectedIndex(0);
			ui.getComboBox_3().setSelectedIndex(0);
		} else if (e.getSource() == ui.getImportClearButton()) {
			System.out.println("ImportClear");
			ui.getComboBox_4().setSelectedIndex(0);
			ui.getComboBox_5().setSelectedIndex(0);
			ui.getComboBox_6().setSelectedIndex(0);
			ui.getComboBox_7().setSelectedIndex(0);
			ui.getComboBox_8().setSelectedIndex(0);
			ui.getComboBox_9().setSelectedIndex(0);
			ui.getComboBox_10().setSelectedIndex(0);
		}
		// else if (e.getSource() == ui.getBackButton()) {
		// System.out.println("back");
		// }
		else if (e.getSource() == ui.getConfirmButton()) {
			System.out.println("confirm");
			warehouseBl.exportGoods(this.getOutStorageVO());
		}
	}

	public OutStorageVO getOutStorageVO() {
		OutStorageVO out = new OutStorageVO();
		out.setId(Integer.parseInt(ui.getID()));
		out.setDestination(ui.getDestination());
		out.setTrans_id(Integer.parseInt(ui.getTrans_ID()));
		out.setOutdate(ui.getDate());
		out.setTransportation(ui.getTransportation());
		return out;
	}
}
