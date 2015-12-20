package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;

import logic.financebl.Finance;
import po.PayPO;
import po.ReceiptPO;
import presentation.financeui.FinanceUI3;

public class FinanceListener3 implements ActionListener {
	private FinanceUI3 ui;
	Finance finance = new Finance();

	public FinanceListener3(FinanceUI3 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.getButton()) {
			String year1 = (String) ui.getComboBox().getSelectedItem();
			String month1 = (String) ui.getComboBox_1().getSelectedItem();
			String day1 = (String) ui.getComboBox_2().getSelectedItem();

			String year2 = (String) ui.getComboBox_3().getSelectedItem();
			String month2 = (String) ui.getComboBox_4().getSelectedItem();
			String day2 = (String) ui.getComboBox_5().getSelectedItem();

			String begin = year1 + month1 + day1;
			String end = year2 + month2 + day2;

			ArrayList<Object> ob = finance.getTotal(begin, end);

			if(!check(ob))
				return ;
			ArrayList<PayPO> pay = new ArrayList<PayPO>();
			ArrayList<ReceiptPO> receipt = new ArrayList<ReceiptPO>();
			int count = finance.getCount();

			for (int i = 0; i < count; i++) {
				pay.add((PayPO) ob.get(i));
			}

			for (int i = count; i < ob.size(); i++) {
				receipt.add((ReceiptPO) ob.get(i));
			}

			Vector<Object> data1 = new Vector<Object>();
			Vector<Object> data2 = new Vector<Object>();
			// "付款日期", "付款账号", "付款人", "付款金额", "条目", "备注"
			for (int i = 0; i < pay.size(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(pay.get(i).getDate());
				item.add(pay.get(i).getPayAccount());
				item.add(pay.get(i).getPayer());
				item.add(pay.get(i).getCost());
				item.add(pay.get(i).getEntry());
				item.add(pay.get(i).getComments());
				data1.add(item);
			}
			// "收款日期", "收款单位", "收款快递员", "收款金额"
			for (int i = 0; i < receipt.size(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(receipt.get(i).getDate());
				item.add(receipt.get(i).getSellingArea());
				item.add(receipt.get(i).getNumber());
				item.add(receipt.get(i).getMoney());
				data2.add(item);
			}
			
			ui.setData1(data1);
			ui.setData2(data2);
		}
	}
	private boolean check(ArrayList<Object> ob){
		if(ob==null){
			JOptionPane.showMessageDialog(ui, "请将信息填写完整！");
			return false;
		}
		return true;
	}

}
