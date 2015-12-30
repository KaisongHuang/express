package listener.warehouselistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;

import _enum.EmployeeMes;
import _enum.ResultMessage;
import logic.centrebl.Centre;
import logic.centreblservice.CentreBlService;
import logic.warehousebl.Warehouse;
import logic.warehouseblservice.WarehouseBlService;
import presentation.warehouseui.WarehouseUI1;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.InStorageVO;
import vo.OutStorageVO;

public class WarehouseListener1 implements ActionListener, MouseListener {

	private WarehouseUI1 ui;
	private WarehouseBlService warehouseBl = new Warehouse();
	private CentreBlService centre = new Centre();
	private ArrayList<CentreArrivalVO> arrival;
	private ArrayList<CentreTransforVO> trans;
	private boolean import_clicked = true;
	private boolean export_clicked = false;

	public WarehouseListener1(WarehouseUI1 ui) {
		super();
		this.ui = ui;
	}

	public WarehouseListener1() {

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton1()) {
			ui.getCard().show(ui.getPanel(), "import");
			setClicked(true, false);
			repaint();
		} else if (e.getSource() == ui.getButton2()) {
			ui.getCard().show(ui.getPanel(), "export");
			setClicked(false, true);
			repaint();
		}

		if (e.getSource() == ui.getButton_1()) {
			int row = ui.getModel().getRowCount();
			for (int i = 0; i < row; i++)
				ui.getModel().removeRow(0);
//			System.out.println(row);
			arrival = new ArrayList<CentreArrivalVO>();
			arrival = warehouseBl.getImport();
			System.out.println(arrival.size());
			for (int i = 0; i < arrival.size(); i++) {
				Vector<Object> rowData = new Vector<Object>();
				rowData.add(arrival.get(i).getID());
				rowData.add(warehouseBl.getSenderDestination(arrival.get(i).getID()));
				ui.getModel().addRow(rowData);
			}

		} else if (e.getSource() == ui.getButton_2()) {
			int row = ui.getModel1().getRowCount();
			for (int i = 0; i < row; i++)
				ui.getModel1().removeRow(0);

			trans = new ArrayList<CentreTransforVO>();
			trans = warehouseBl.getExport();
			for (int i = 0; i < trans.size(); i++) {
				Vector<Object> rowData = new Vector<Object>();
				rowData.add(trans.get(i).getList().get(0));
				rowData.add(trans.get(i).getArrival());
				rowData.add(trans.get(i).getCentreTransferID());
				rowData.add(trans.get(i).getTransferStyle());
				ui.getModel1().addRow(rowData);
			}

		} else if (e.getSource() == ui.getExportClearButton()) {
			System.out.println("ExportClear");
			ui.getComboBox().setSelectedIndex(0);
			ui.getComboBox_1().setSelectedIndex(0);
			ui.getComboBox_2().setSelectedIndex(0);
			// ui.getComboBox_3().setSelectedIndex(0);
		} else if (e.getSource() == ui.getImportClearButton()) {
			System.out.println("ImportClear");
			ui.getComboBox_7().setSelectedIndex(0);
			ui.getComboBox_8().setSelectedIndex(0);
			ui.getComboBox_9().setSelectedIndex(0);
			ui.getComboBox_10().setSelectedIndex(0);
		}
		if (e.getSource() == ui.getExportConfirmButton()) {
			System.out.println("export");
			int selectedRow = ui.getTable1().getSelectedRow();// 获得选中行的索引
			if (ui.getTable1().getRowCount() > 0) {
				if (selectedRow != -1) { // 存在选中行
					String id = (String) ui.getModel1().getValueAt(selectedRow, 0);
					String destination = (String) ui.getModel1().getValueAt(selectedRow, 1);
					String transferID = (String) ui.getModel1().getValueAt(selectedRow, 2);
					String transferType = (String) ui.getModel1().getValueAt(selectedRow, 3);

					String year = (String) ui.getComboBox().getSelectedItem();
					String month = (String) ui.getComboBox_1().getSelectedItem();
					String day = (String) ui.getComboBox_2().getSelectedItem();
					String date = year + month + day;

					warehouseBl.exportGoods(new OutStorageVO(id, destination, date, EmployeeMes.belongToWho,
							transferType, transferID, 0));
					ui.getModel1().removeRow(selectedRow);
				} else {
					selectedRow = 0;
					String id = (String) ui.getModel1().getValueAt(selectedRow, 0);
					String destination = (String) ui.getModel1().getValueAt(selectedRow, 1);
					String transferID = (String) ui.getModel1().getValueAt(selectedRow, 2);
					String transferType = (String) ui.getModel1().getValueAt(selectedRow, 3);

					String year = (String) ui.getComboBox().getSelectedItem();
					String month = (String) ui.getComboBox_1().getSelectedItem();
					String day = (String) ui.getComboBox_2().getSelectedItem();
					String date = year + month + day;

					warehouseBl.exportGoods(new OutStorageVO(id, destination, date, EmployeeMes.belongToWho,
							transferType, transferID, 0));
					ui.getModel1().removeRow(selectedRow);
				}

			}
		}
		if (e.getSource() == ui.getImportConfirmButton()) {
			System.out.println("import");
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (ui.getTable().getRowCount() > 0) {
				if (selectedRow != -1) { // 存在选中行
					String id = (String) ui.getModel().getValueAt(selectedRow, 0);
					String destination = (String) ui.getModel().getValueAt(selectedRow, 1);
					String date = ui.getMdp1().getText();
					date = date.replace("/", "");
					String s1 = date.substring(0, 4);
					String s2 = date.substring(4, 8);
					date = s2 + s1;
					String qu = (String) ui.getComboBox_7().getSelectedItem();
					if(qu.equals("航运区")){
						qu = "plane";
					}else if(qu.equals("铁运区")){
						qu = "train";
					}else{
						qu = "car";
					}
					int pai = Integer.parseInt((String) ui.getComboBox_8().getSelectedItem());
					int jia = Integer.parseInt((String) ui.getComboBox_9().getSelectedItem());
					int wei = Integer.parseInt((String) ui.getComboBox_10().getSelectedItem());
					warehouseBl.importGoods(
							new InStorageVO(id, date, destination, EmployeeMes.belongToWho, qu, pai, jia, wei, 0));
					ui.getModel().removeRow(selectedRow);
				} else {
					selectedRow = 0;
					String id = (String) ui.getModel().getValueAt(selectedRow, 0);
					String destination = (String) ui.getModel().getValueAt(selectedRow, 1);
					String date = ui.getMdp1().getText();
					date = date.replace("/", "");
					String s1 = date.substring(0, 4);
					String s2 = date.substring(4, 8);
					date = s2 + s1;
					String qu = (String) ui.getComboBox_7().getSelectedItem();
					if(qu.equals("航运区")){
						qu = "plane";
					}else if(qu.equals("铁运区")){
						qu = "train";
					}else{
						qu = "car";
					}
					int pai = Integer.parseInt((String) ui.getComboBox_8().getSelectedItem());
					int jia = Integer.parseInt((String) ui.getComboBox_9().getSelectedItem());
					int wei = Integer.parseInt((String) ui.getComboBox_10().getSelectedItem());
					warehouseBl.importGoods(
							new InStorageVO(id, date, destination, EmployeeMes.belongToWho, qu, pai, jia, wei, 0));
					ui.getModel().removeRow(selectedRow);
				}
			}
		}
	}

	private boolean check(OutStorageVO vo) {
		if (vo.checkIsNUll() == 0) {
			ui.setText("请将信息填写完整！");
			return false;
		}
		if (vo.checkDate() == 0) {
			ui.setText("请检查出库日期格式是否正确！");
			return false;
		}
		if (vo.checkID() == 0) {
			ui.setText("请检查货物单号是否正确！");
			return false;
		}
		if (vo.checkTransID() == 0) {
			ui.setText("请检查中转单编号是否正确！");
			return false;
		}

		return true;
	}

	private boolean check(InStorageVO vo) {
		if (vo.checkDate() == 0) {
			ui.setText("请检查入库日期是否正确！");
			return false;
		}
		if (vo.checkJia() == 0) {
			ui.setText("请检查仓库架号是否正确！");
			return false;
		}
		if (vo.checkPai() == 0) {
			ui.setText("请检查仓库排号是否正确！");
			return false;
		}
		if (vo.checkWei() == 0) {
			ui.setText("请检查仓库位号是否正确！");
			return false;
		}
		return true;
	}

	public OutStorageVO getOutStorageVO() {
		OutStorageVO out = new OutStorageVO();
		// out.setId(ui.getExportID());
		// out.setDestination(ui.getExportDestination());
		// out.setTrans_id(ui.getTrans_ID());
		out.setOutdate(ui.getExportDate());
		out.setTransportation(ui.getTransportation());
		out.setWarehouseID(EmployeeMes.belongToWho);
		out.setIsCheck(0);
		return out;
	}

	public InStorageVO getInStorageVO() {
		InStorageVO in = new InStorageVO();
		// in.setId(ui.getImportID());// textField_3
		// in.setDestination(ui.getImportDestination());// textField_4
		in.setIndate(ui.getImportDate());// comboBox_4comboBox_5comboBox_6
		in.setPos_qu(ui.getPos_qu());// comboBox_7
		in.setPos_pai(ui.getPos_pai());// comboBox_8
		in.setPos_jia(ui.getPos_jia());// comboBox_9
		in.setPos_wei(ui.getPos_wei());// comboBox_10
		in.setWarehouseID(EmployeeMes.belongToWho);
		in.setIsCheck(0);
		return in;
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

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton1()) {
			ui.getButton1().setEntered(true);
			setUnclicked();
			repaint();
		} else if (e.getSource() == ui.getButton2()) {
			ui.getButton2().setEntered(true);
			setUnclicked();
			repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		ui.getButton1().setEntered(false);
		ui.getButton2().setEntered(false);
		ui.getButton1().setClicked(import_clicked);
		ui.getButton2().setClicked(export_clicked);
		repaint();
	}

	private void setClicked(boolean b1, boolean b2) {
		import_clicked = b1;
		export_clicked = b2;
	}

	private void setUnclicked() {
		ui.getButton1().setClicked(false);
		ui.getButton2().setClicked(false);
	}

	private void repaint() {
		ui.getButton1().repaint();
		ui.getButton2().repaint();
	}

}
