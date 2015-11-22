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
		if (e.getSource() == ui.getExportButton()) {
			System.out.println("New Export");

		} else if (e.getSource() == ui.getImportButton()) {
			System.out.println("New Import");

		} else if (e.getSource() == ui.getClearButton()) {
			System.out.println("clear");
			
		} 
//		else if (e.getSource() == ui.getBackButton()) {
//			System.out.println("back");
//		} 
		else if (e.getSource() == ui.getConfirmButton()) {
			System.out.println("confirm");
			warehouseBl.exportGoods(this.getOutStorageVO());
		}
	}
	
	public OutStorageVO getOutStorageVO(){
		OutStorageVO out=new OutStorageVO();
		out.setId(Integer.parseInt(ui.getID()));
		out.setDestination(ui.getDestination());
		out.setTrans_id(Integer.parseInt(ui.getTrans_ID()));
		out.setOutdate(ui.getDate());
		out.setTransportation(ui.getTransportation());
		return out;
	}
}
