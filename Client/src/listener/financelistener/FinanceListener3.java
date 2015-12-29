package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import logic.financebl.Finance;
import presentation.financeui.FinanceUI3;
import vo.PayVO;
import vo.ReceiptVO;

public class FinanceListener3 implements ActionListener, MouseListener {
	private FinanceUI3 ui;
	Finance finance = new Finance();

	public FinanceListener3(FinanceUI3 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.getSearch()) {
			//clear table
			int n1=ui.getModel1().getRowCount();
			for (int i = 0; i < n1; i++) {
				ui.getModel1().removeRow(0);
			}

			int n2=ui.getModel2().getRowCount();
			for (int i = 0; i < n2; i++) {
				ui.getModel2().removeRow(0);
			}

			String year1 = (String) ui.getComboBox().getSelectedItem();
			String month1 = (String) ui.getComboBox_1().getSelectedItem();
			String day1 = (String) ui.getComboBox_2().getSelectedItem();

			String year2 = (String) ui.getComboBox_3().getSelectedItem();
			String month2 = (String) ui.getComboBox_4().getSelectedItem();
			String day2 = (String) ui.getComboBox_5().getSelectedItem();

			String begin = year1 + month1 + day1;
			String end = year2 + month2 + day2;

			ArrayList<Object> ob = finance.getTotal(begin, end);

			if (!check(ob))
				return;
			ArrayList<PayVO> pay = new ArrayList<PayVO>();
			ArrayList<ReceiptVO> receipt = new ArrayList<ReceiptVO>();
			int count = finance.getCount();

			for (int i = 0; i < count; i++) {
				pay.add((PayVO) ob.get(i));
			}

			for (int i = count; i < ob.size(); i++) {
				receipt.add((ReceiptVO) ob.get(i));
			}

			// "付款日期", "付款账号", "付款人", "付款金额", "条目", "备注"
			for (int i = 0; i < pay.size(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(pay.get(i).getDate());
				item.add(pay.get(i).getPayAccount());
				item.add(pay.get(i).getPayer());
				item.add(pay.get(i).getCost());
				item.add(pay.get(i).getEntry());
				item.add(pay.get(i).getComments());
				ui.getModel1().addRow(item);
			}
			// "收款日期", "收款单位", "收款快递员", "收款金额"
			for (int i = 0; i < receipt.size(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(receipt.get(i).getDate());
				item.add(receipt.get(i).getSellingArea());
				item.add(receipt.get(i).getNumber());
				item.add(receipt.get(i).getMoney());
				ui.getModel2().addRow(item);
			}

		}else if(e.getSource()==ui.getExport()){
			ArrayList<PayVO> list1=new ArrayList<PayVO>();
			ArrayList<ReceiptVO> list2=new ArrayList<ReceiptVO>();
			DefaultTableModel table2=ui.getModel2();
			for(int i=0;i<table2.getRowCount();i++){
			    list2.add(new ReceiptVO((Double)table2.getValueAt(i, 3),(String)table2.getValueAt(i, 0),(String)table2.getValueAt(i, 1),(String)table2.getValueAt(i, 2),null,0));
			}
			DefaultTableModel table1=ui.getModel1();
			for(int i=0;i<table1.getRowCount();i++){
				list1.add(new PayVO((String)table1.getValueAt(i, 0),(String)table1.getValueAt(i, 2),(String)table1.getValueAt(i, 1),
						(String)table1.getValueAt(i, 4),(String)table1.getValueAt(i, 5),(Double)table1.getValueAt(i, 3),0));
			}
			finance.exportPay(list1);
			finance.exportReceipt(list2);
		}
	}

	private boolean check(ArrayList<Object> ob) {
		if (ob == null) {
			JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
			return false;
		}
		return true;
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
	}
}
