package listener.managerlistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import logic.managerbl.Manager;
import logic.managerblservice.ManagerBlService;
import presentation.managerui.ManagerUI2;
import vo.AcceptVO;
import vo.CarPackVO;
import vo.CentreArrivalVO;
import vo.CentreTransforVO;
import vo.DeliverVO;
import vo.InStorageVO;
import vo.OutStorageVO;
import vo.CentrePackVO;
import vo.PayVO;
import vo.ReceiptVO;

public class ManagerListener20 implements MouseListener, ActionListener {

	private ManagerUI2 ui;
	ManagerBlService manager = new Manager();
	private int previousIndex = 0;
	private int currentTable = 0;

	public ManagerListener20(ManagerUI2 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getButton()) {
			setAllSelected();
		}
		if (e.getSource() == ui.getButton_1()) {
			undoAllSelected();
		}
		if (e.getSource() == ui.getButton_2()) {
			update();
		}

		if (e.getSource() == ui.getButton1()) {
			if (ui.getComboBox().getSelectedIndex() == 0) {
				previousIndex = 0;
				currentTable = 0;
				ui.getCard().show(ui.getPanel(), "0");
			} else if (ui.getComboBox().getSelectedIndex() == 1) {
				previousIndex = 1;
				currentTable = 2;
				refreshPayVO();
				ui.getCard().show(ui.getPanel(), "1");
			} else if (ui.getComboBox().getSelectedIndex() == 2) {
				previousIndex = 2;
				currentTable = 3;
				refreshReceiptVO();
				ui.getCard().show(ui.getPanel(), "2");
			} else if (ui.getComboBox().getSelectedIndex() == 3) {
				previousIndex = 3;
				currentTable = 4;
				refreshDeliverVO();
				ui.getCard().show(ui.getPanel(), "3");
			} else if (ui.getComboBox().getSelectedIndex() == 4) {
				previousIndex = 4;
				currentTable = 5;
				refreshCentreTransforVO();
				ui.getCard().show(ui.getPanel(), "4");
			} else if (ui.getComboBox().getSelectedIndex() == 5) {
				previousIndex = 5;
				currentTable = 6;
				refreshInStorageVO();
				ui.getCard().show(ui.getPanel(), "5");
			} else if (ui.getComboBox().getSelectedIndex() == 6) {
				previousIndex = 6;
				currentTable = 7;
				refreshOutStorageVO();
				ui.getCard().show(ui.getPanel(), "6");
			} else if (ui.getComboBox().getSelectedIndex() == 7) {
				previousIndex = 7;
				currentTable = 8;
				refreshCarPackVO();
				ui.getCard().show(ui.getPanel(), "7");
			} else if (ui.getComboBox().getSelectedIndex() == 8) {
				previousIndex = 8;
				currentTable = 9;
				refreshAcceptVO();
				ui.getCard().show(ui.getPanel(), "8");
			} else if (ui.getComboBox().getSelectedIndex() == 9) {
				previousIndex = 9;
				currentTable = 10;
				refreshCentreArrivalVO();
				ui.getCard().show(ui.getPanel(), "9");
			} else if (ui.getComboBox().getSelectedIndex() == 10) {
				previousIndex = 10;
				currentTable = 11;
				refreshCentrePackVO();
				ui.getCard().show(ui.getPanel(), "10");
			}
		} else if (e.getSource() == ui.getButton2()) {
			ui.getComboBox().setSelectedIndex(previousIndex);
		}

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
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	private void refreshPayVO() {
		clearTable(2);

		ArrayList<PayVO> vo = new ArrayList<PayVO>();
		vo = manager.checkPay();

		for (int i = 0; i < vo.size(); i++) {
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(vo.get(i).getDate());
			rowData.add(vo.get(i).getCost());
			rowData.add(vo.get(i).getPayer());
			rowData.add(vo.get(i).getPayAccount());
			rowData.add(vo.get(i).getEntry());
			rowData.add(vo.get(i).getComments());
			rowData.add(new Boolean(false));
			ui.getModel2().addRow(rowData);
		}
	}

	private void refreshReceiptVO() {
		clearTable(3);

		ArrayList<ReceiptVO> vo = new ArrayList<ReceiptVO>();
		vo = manager.checkReceipt();

		for (int i = 0; i < vo.size(); i++) {
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(vo.get(i).getDate());
			rowData.add(vo.get(i).getMoney());
			rowData.add(vo.get(i).getNumber());
			rowData.add(new Boolean(false));
			ui.getModel3().addRow(rowData);
		}
	}

	private void refreshDeliverVO() {
		clearTable(4);

		ArrayList<DeliverVO> vo = new ArrayList<DeliverVO>();
		vo = manager.checkDeliver();

		for (int i = 0; i < vo.size(); i++) {
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(vo.get(i).getDate());
			rowData.add(vo.get(i).getBarCode());
			rowData.add(vo.get(i).getNumber());
			rowData.add(new Boolean(false));
			ui.getModel4().addRow(rowData);
		}
	}

	private void refreshCentreTransforVO() {
		clearTable(5);

		ArrayList<CentreTransforVO> vo = new ArrayList<CentreTransforVO>();
		vo = manager.checkTrans();

		for (int i = 0; i < vo.size(); i++) {
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(vo.get(i).getTransferStyle());
			rowData.add(vo.get(i).getDateOfGetin());
			rowData.add(vo.get(i).getCentreTransferID());
			rowData.add(vo.get(i).getBanHao());
			rowData.add(vo.get(i).getStart());
			rowData.add(vo.get(i).getArrival());
			rowData.add(vo.get(i).getHuoGuiHao());
			rowData.add(vo.get(i).getJianZhuangYuan());
			rowData.add(vo.get(i).getList());
			rowData.add(vo.get(i).getFee());
			rowData.add(new Boolean(false));
			ui.getModel5().addRow(rowData);
		}
	}

	private void refreshInStorageVO() {
		clearTable(6);

		ArrayList<InStorageVO> vo = new ArrayList<InStorageVO>();
		vo = manager.checkImport();

		for (int i = 0; i < vo.size(); i++) {
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(vo.get(i).getId());
			rowData.add(vo.get(i).getIndate());
			rowData.add(vo.get(i).getDestination());
			rowData.add(vo.get(i).getWarehouseID());
			rowData.add(vo.get(i).getPos_qu());
			rowData.add(vo.get(i).getPos_pai());
			rowData.add(vo.get(i).getPos_jia());
			rowData.add(vo.get(i).getPos_wei());
			rowData.add(new Boolean(false));
			ui.getModel6().addRow(rowData);
		}
	}

	private void refreshOutStorageVO() {
		clearTable(7);

		ArrayList<OutStorageVO> vo = new ArrayList<OutStorageVO>();
		vo = manager.checkExport();

		for (int i = 0; i < vo.size(); i++) {
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(vo.get(i).getId());
			rowData.add(vo.get(i).getOutdate());
			rowData.add(vo.get(i).getDestination());
			rowData.add(vo.get(i).getWarehouseID());
			rowData.add(vo.get(i).getTransportation());
			rowData.add(vo.get(i).getTrans_id());
			rowData.add(new Boolean(false));
			ui.getModel7().addRow(rowData);
		}
	}

	private void refreshCarPackVO() {
		clearTable(8);

		ArrayList<CarPackVO> vo = new ArrayList<CarPackVO>();
		vo = manager.checkPack();

		for (int i = 0; i < vo.size(); i++) {
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(vo.get(i).getDate());
			rowData.add(vo.get(i).getSellingArea());
			rowData.add(vo.get(i).getNumber());
			rowData.add(vo.get(i).getDestination());
			rowData.add(vo.get(i).getCarID());
			rowData.add(vo.get(i).getSupervisor());
			rowData.add(vo.get(i).getSupercargo());
			rowData.add(vo.get(i).getList());
			rowData.add(vo.get(i).getFee());
			rowData.add(new Boolean(false));
			ui.getModel8().addRow(rowData);
		}
	}

	private void refreshAcceptVO() {
		clearTable(9);

		ArrayList<AcceptVO> vo = new ArrayList<AcceptVO>();
		vo = manager.checkAccept();

		for (int i = 0; i < vo.size(); i++) {
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(vo.get(i).getDate());
			rowData.add(vo.get(i).getBarCode());
			rowData.add(vo.get(i).getStart());
			rowData.add(vo.get(i).getState());
			rowData.add(new Boolean(false));
			ui.getModel9().addRow(rowData);
		}
	}

	private void refreshCentreArrivalVO() {
		clearTable(10);

		ArrayList<CentreArrivalVO> vo = new ArrayList<CentreArrivalVO>();
		vo = manager.checkArrival();

		for (int i = 0; i < vo.size(); i++) {
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(vo.get(i).getCentreID());
			rowData.add(vo.get(i).getGetDate());
			rowData.add(vo.get(i).getTransferID());
			rowData.add(vo.get(i).getStart());
			rowData.add(vo.get(i).getExpressState());
			rowData.add(new Boolean(false));
			ui.getModel10().addRow(rowData);
		}
	}

	private void refreshCentrePackVO() {
		clearTable(11);

		ArrayList<CentrePackVO> vo = new ArrayList<CentrePackVO>();
		vo = manager.checkCentrePack();

		for (int i = 0; i < vo.size(); i++) {
			Vector<Object> rowData = new Vector<Object>();
			rowData.add(vo.get(i).getDataOfGetin());
			rowData.add(vo.get(i).getCentreTransferID());
			rowData.add(vo.get(i).getArrival());
			rowData.add(vo.get(i).getCarID());
			rowData.add(vo.get(i).getJianZhuangYuan());
			rowData.add(vo.get(i).getYaYunYuan());
			rowData.add(vo.get(i).getList());
			rowData.add(vo.get(i).getFee());
			rowData.add(new Boolean(false));
			ui.getModel11().addRow(rowData);
		}
	}

	private void clearTable(int p) {
		int n;
		switch (p) {
		case 2:
			n = ui.getModel2().getRowCount();
			for (int i = 0; i < n; i++)
				ui.getModel2().removeRow(0);
			break;
		case 3:
			n = ui.getModel3().getRowCount();
			for (int i = 0; i < n; i++)
				ui.getModel3().removeRow(0);
			break;
		case 4:
			n = ui.getModel4().getRowCount();
			for (int i = 0; i < n; i++)
				ui.getModel4().removeRow(0);
			break;
		case 5:
			n = ui.getModel5().getRowCount();
			for (int i = 0; i < n; i++)
				ui.getModel5().removeRow(0);
			break;
		case 6:
			n = ui.getModel6().getRowCount();
			for (int i = 0; i < n; i++)
				ui.getModel6().removeRow(0);
			break;
		case 7:
			n = ui.getModel7().getRowCount();
			for (int i = 0; i < n; i++)
				ui.getModel7().removeRow(0);
			break;
		case 8:
			n = ui.getModel8().getRowCount();
			for (int i = 0; i < n; i++)
				ui.getModel8().removeRow(0);
			break;
		case 9:
			n = ui.getModel9().getRowCount();
			for (int i = 0; i < n; i++)
				ui.getModel9().removeRow(0);
			break;
		case 10:
			n = ui.getModel10().getRowCount();
			for (int i = 0; i < n; i++)
				ui.getModel10().removeRow(0);
			break;
		case 11:
			n = ui.getModel11().getRowCount();
			for (int i = 0; i < n; i++)
				ui.getModel11().removeRow(0);
			break;
		}

	}

	private void setAllSelected() {
		int n = getCurrentTable().getColumnCount() - 1;
		for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
			getCurrentTable().setValueAt(true, i, n);
		}
	}

	private void undoAllSelected() {
		int n = getCurrentTable().getColumnCount() - 1;
		for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
			getCurrentTable().setValueAt(false, i, n);
		}
	}

	private DefaultTableModel getCurrentTable() {
		switch (currentTable) {
		case 2:
			return ui.getModel2();
		case 3:
			return ui.getModel3();
		case 4:
			return ui.getModel4();
		case 5:
			return ui.getModel5();
		case 6:
			return ui.getModel6();
		case 7:
			return ui.getModel7();
		case 8:
			return ui.getModel8();
		case 9:
			return ui.getModel9();
		case 10:
			return ui.getModel10();
		case 11:
			return ui.getModel11();
		default:
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	private void update() {
		switch (currentTable) {
		case 2: {
			int column = getCurrentTable().getColumnCount() - 1;
			for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
				if ((Boolean) getCurrentTable().getValueAt(i, column)) {
					manager.checkDocument(new PayVO((String) getCurrentTable().getValueAt(i, 0),
							(String) getCurrentTable().getValueAt(i, 2), (String) getCurrentTable().getValueAt(i, 3),
							(String) getCurrentTable().getValueAt(i, 4), (String) getCurrentTable().getValueAt(i, 5),
							(Double) getCurrentTable().getValueAt(i, 1), 1));
					getCurrentTable().removeRow(i);
					i--;
				}

			}
			break;
		}
		case 3: {
			int column = getCurrentTable().getColumnCount() - 1;
			for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
				if ((Boolean) getCurrentTable().getValueAt(i, column)) {
					manager.checkDocument(new ReceiptVO((Double) getCurrentTable().getValueAt(i, 1),
							(String) getCurrentTable().getValueAt(i, 0), (String) getCurrentTable().getValueAt(i, 2),
							(String) getCurrentTable().getValueAt(i, 3),
							(ArrayList<String>) getCurrentTable().getValueAt(i, 4), 1));
					getCurrentTable().removeRow(i);
					i--;
				}

			}
			break;
		}
		case 4: {
			int column = getCurrentTable().getColumnCount() - 1;
			for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
				if ((Boolean) getCurrentTable().getValueAt(i, column)) {
					manager.checkDocument(new DeliverVO((String) getCurrentTable().getValueAt(i, 0),
							(String) getCurrentTable().getValueAt(i, 1), (String) getCurrentTable().getValueAt(i, 2),
							1));
					getCurrentTable().removeRow(i);
					i--;
				}

			}
			break;
		}
		case 5: {
			int column = getCurrentTable().getColumnCount() - 1;
			for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
				if ((Boolean) getCurrentTable().getValueAt(i, column)) {
					manager.checkDocument(new CentreTransforVO((String) getCurrentTable().getValueAt(i, 0),
							(String) getCurrentTable().getValueAt(i, 1), (String) getCurrentTable().getValueAt(i, 2),
							(String) getCurrentTable().getValueAt(i, 3), (String) getCurrentTable().getValueAt(i, 4),
							(String) getCurrentTable().getValueAt(i, 5), (String) getCurrentTable().getValueAt(i, 6),
							(String) getCurrentTable().getValueAt(i, 7),
							(ArrayList<String>) getCurrentTable().getValueAt(i, 8),
							(Double) getCurrentTable().getValueAt(i, 9), 1));
					getCurrentTable().removeRow(i);
					i--;
				}

			}
			break;
		}
		case 6: {
			int column = getCurrentTable().getColumnCount() - 1;
			for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
				if ((Boolean) getCurrentTable().getValueAt(i, column)) {
					manager.checkDocument(new InStorageVO((String) getCurrentTable().getValueAt(i, 0),
							(String) getCurrentTable().getValueAt(i, 1), (String) getCurrentTable().getValueAt(i, 2),
							(String) getCurrentTable().getValueAt(i, 3), (String) getCurrentTable().getValueAt(i, 4),
							(Integer) getCurrentTable().getValueAt(i, 5), (Integer) getCurrentTable().getValueAt(i, 6),
							(Integer) getCurrentTable().getValueAt(i, 7), 1));
					getCurrentTable().removeRow(i);
					i--;
				}

			}
			break;
		}
		case 7: {
			int column = getCurrentTable().getColumnCount() - 1;
			for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
				if ((Boolean) getCurrentTable().getValueAt(i, column)) {
					manager.checkDocument(new OutStorageVO((String) getCurrentTable().getValueAt(i, 0),
							(String) getCurrentTable().getValueAt(i, 2), (String) getCurrentTable().getValueAt(i, 1),
							(String) getCurrentTable().getValueAt(i, 3), (String) getCurrentTable().getValueAt(i, 4),
							(String) getCurrentTable().getValueAt(i, 5), 1));
					getCurrentTable().removeRow(i);
					i--;
				}

			}
			break;
		}
		case 8: {
			int column = getCurrentTable().getColumnCount() - 1;
			for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
				if ((Boolean) getCurrentTable().getValueAt(i, column)) {
					manager.checkDocument(new CarPackVO((String) getCurrentTable().getValueAt(i, 0),
							(String) getCurrentTable().getValueAt(i, 1), (String) getCurrentTable().getValueAt(i, 2),
							(String) getCurrentTable().getValueAt(i, 3), (String) getCurrentTable().getValueAt(i, 4),
							(String) getCurrentTable().getValueAt(i, 5), (String) getCurrentTable().getValueAt(i, 6),
							(String) getCurrentTable().getValueAt(i, 7),
							(ArrayList<String>) getCurrentTable().getValueAt(i, 8),
							(Double) getCurrentTable().getValueAt(i, 9), 1));
					getCurrentTable().removeRow(i);
					i--;
				}

			}
			break;
		}
		case 9: {
			int column = getCurrentTable().getColumnCount() - 1;
			for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
				if ((Boolean) getCurrentTable().getValueAt(i, column)) {
					manager.checkDocument(new AcceptVO((String) getCurrentTable().getValueAt(i, 0),
							(String) getCurrentTable().getValueAt(i, 1), (String) getCurrentTable().getValueAt(i, 2),
							(String) getCurrentTable().getValueAt(i, 3), (String) getCurrentTable().getValueAt(i, 4),
							1));
					getCurrentTable().removeRow(i);
					i--;
				}

			}
			break;
		}
		case 10: {
			int column = getCurrentTable().getColumnCount() - 1;
			for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
				if ((Boolean) getCurrentTable().getValueAt(i, column)) {
					manager.checkDocument(new CentreArrivalVO((String) getCurrentTable().getValueAt(i, 0),
							(String) getCurrentTable().getValueAt(i, 1), (String) getCurrentTable().getValueAt(i, 2),
							(String) getCurrentTable().getValueAt(i, 3), (String) getCurrentTable().getValueAt(i, 4),
							1));
//					System.out.println((String) getCurrentTable().getValueAt(i, 0));
//					System.out.println((String) getCurrentTable().getValueAt(i, 1));
//					System.out.println((String) getCurrentTable().getValueAt(i, 2));
//					System.out.println((String) getCurrentTable().getValueAt(i, 3));
//					System.out.println((String) getCurrentTable().getValueAt(i, 4));
//					System.out.println(1);
					getCurrentTable().removeRow(i);
					i--;
				}

			}
			break;
		}
		case 11: {
			int column = getCurrentTable().getColumnCount() - 1;
			for (int i = 0; i < getCurrentTable().getRowCount(); i++) {
				if ((Boolean) getCurrentTable().getValueAt(i, column)) {
					manager.checkDocument(new CentrePackVO((String) getCurrentTable().getValueAt(i, 0),
							(String) getCurrentTable().getValueAt(i, 1), (String) getCurrentTable().getValueAt(i, 2),
							(String) getCurrentTable().getValueAt(i, 3), (String) getCurrentTable().getValueAt(i, 4),
							(String) getCurrentTable().getValueAt(i, 5),
							(ArrayList<String>) getCurrentTable().getValueAt(i, 6),
							(Double) getCurrentTable().getValueAt(i, 7), 1));
					getCurrentTable().removeRow(i);
					i--;
				}

			}
			break;
		}
		}
	}
}
