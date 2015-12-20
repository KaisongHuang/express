package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import _enum.EmployeeMes;
import _enum.ResultMessage;
import logic.warehousebl.Warehouse;
import logic.warehouseblservice.WarehouseBlService;
import presentation.warehouseui.WarehouseUI1;
import vo.InStorageVO;
import vo.OutStorageVO;

public class WarehouseListener1 implements ActionListener {

	private WarehouseUI1 ui;
	WarehouseBlService warehouseBl = new Warehouse();

	public WarehouseListener1(WarehouseUI1 ui) {
		super();
		this.ui = ui;
	}

	public WarehouseListener1() {

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
			ResultMessage rm=null;
			System.out.println("confirm");
			OutStorageVO vo=this.getOutStorageVO();
			if(!check(vo))
				return ;
			rm=warehouseBl.exportGoods(vo);
			check(rm);
		} else if (e.getSource() == ui.getImportConfirmButton()) {
			ResultMessage rm=null;
			System.out.println("export");
			InStorageVO vo=this.getInStorageVO();
			if(!check(vo))
				return ;
			rm=warehouseBl.importGoods(vo);
			check(rm);
		}
	}

	private boolean check(OutStorageVO vo){
		if(vo.checkIsNUll()==0){
			JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
			return false;
		}
		if(vo.checkDate()==0){
			JOptionPane.showMessageDialog(ui, "请检查出库日期格式是否正确！");
			return false;
		}
		if(vo.checkID()==0){
			JOptionPane.showMessageDialog(ui, "请检查货物单号是否正确！");
			return false;
		}
		if(vo.checkTransID()==0){
			JOptionPane.showMessageDialog(ui, "请检查中转单编号是否正确！");
			return false;
		}
		
		return true;
	}
	
	private boolean check(InStorageVO vo){
		if(vo.checkDate()==0){
			JOptionPane.showMessageDialog(ui, "请检查入库日期是否正确！");
			return false;
		}
		if(vo.checkJia()==0){
			JOptionPane.showMessageDialog(ui, "请检查仓库架号是否正确！");
			return false;
		}
		if(vo.checkPai()==0){
			JOptionPane.showMessageDialog(ui, "请检查仓库排号是否正确！");
			return false;
		}
		if(vo.checkWei()==0){
			JOptionPane.showMessageDialog(ui, "请检查仓库位号是否正确！");
			return false;
		}
		return true;
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
		in.setIsCheck(0);
		return in;
	}
	
	private void check(ResultMessage rm){
		String dialog=null;
		if(rm==ResultMessage.FunctionError){
			dialog="网络连接出现了问题，请检查您的网络！";
		}else if(rm==ResultMessage.Fail)
			dialog="数据更新失败！";
		else if(rm==ResultMessage.Success){
			dialog="数据更新成功！";
		}else if(rm==ResultMessage.UpdateFail){
			dialog="请不要重复创建单据";
		}
		if(dialog!=null)
			JOptionPane.showMessageDialog(ui, dialog);
	}
}
