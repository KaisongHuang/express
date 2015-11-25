package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import logic.warehousebl.Warehouse;
import logic.warehouseblservice.WarehouseBlService;
import presentation.warehouseui.WarehouseUI5;

public class WarehouseListener50 implements ActionListener{
	private WarehouseUI5 ui;
	WarehouseBlService warehouseBl = new Warehouse();

	public WarehouseListener50() {
	}

	public WarehouseListener50(WarehouseUI5 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ui.getButton_1()){
			int id=Integer.parseInt(ui.getTextField().getText());
			String destination=ui.getTextField_1().getText();
			String year=(String) ui.getComboBox().getSelectedItem();
			String month=(String) ui.getComboBox_1().getSelectedItem();
			String date=(String) ui.getComboBox_2().getSelectedItem();
			String time=year+month+date;
			String qu=(String)ui.getComboBox_3().getSelectedItem();
			String pai=(String)ui.getComboBox_4().getSelectedItem();
			String jia=(String)ui.getComboBox_5().getSelectedItem();
			String wei=(String)ui.getComboBox_6().getSelectedItem();
			Vector<Object> item=new Vector<Object>();
			item.add(id);
			item.add(destination);
			item.add(time);
			item.add(qu);
			item.add(pai);
			item.add(jia);
			item.add(wei);
			ui.getData().add(item);			
		}else if(e.getSource()==ui.getButton()){
			
		}else if(e.getSource()==ui.getButton_2()){
			
		}else if(e.getSource()==ui.getButton_3()){
			
		}
	}
	
}
