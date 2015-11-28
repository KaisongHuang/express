package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import _enum.EmployeeMes;
import logic.warehousebl.Warehouse;
import logic.warehouseblservice.WarehouseBlService;
import presentation.warehouseui.WarehouseUI1;
import vo.InStorageVO;
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
		else if (e.getSource() == ui.getExportConfirmButton()) {
			System.out.println("confirm");
			warehouseBl.exportGoods(this.getOutStorageVO());
		} else if (e.getSource() == ui.getImportConfirmButton()) {
			System.out.println("export");
			warehouseBl.importGoods(this.getInStorageVO());
		}
	}

	public OutStorageVO getOutStorageVO() {
		OutStorageVO out = new OutStorageVO();
		out.setId(ui.getExportID());
		out.setDestination(ui.getExportDestination());
		out.setTrans_id(ui.getTrans_ID());
		out.setOutdate(ui.getExportDate());
		out.setTransportation(ui.getTransportation());
		out.setWarehouseID(EmployeeMes.belongToWho);
		out.setIsCheck(0);
		return out;
	}

	public InStorageVO getInStorageVO() {
		InStorageVO in = new InStorageVO();
		in.setId(ui.getImportID());// textField_3
		in.setDestination(ui.getImportDestination());// textField_4
		in.setIndate(ui.getImportDate());// comboBox_4comboBox_5comboBox_6
		in.setPos_qu(ui.getPos_qu());// comboBox_7
		in.setPos_pai(ui.getPos_pai());// comboBox_8
		in.setPos_jia(ui.getPos_jia());// comboBox_9
		in.setPos_wei(ui.getPos_wei());// comboBox_10
		in.setWarehouseID(EmployeeMes.belongToWho);
		in.setIsCheck(1);
		return in;
	}
}
