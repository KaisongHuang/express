package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import logic.financebl.Finance;
import presentation.financeui.FinanceUI1;
import vo.ReceiptVO;

public class FinanceListener1 implements ActionListener {
	private FinanceUI1 ui;
	Finance finance = new Finance();

	public FinanceListener1(FinanceUI1 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.getButton()) {
			String year = (String) ui.getComboBox().getSelectedItem();
			String month = (String) ui.getComboBox_1().getSelectedItem();
			String day = (String) ui.getComboBox_2().getSelectedItem();

			String date = year + month + day;
			String sellingArea = (String) ui.getComboBox_3().getSelectedItem();

			ArrayList<ReceiptVO> vo = finance.checkReceipt(date, sellingArea);


			Vector<Object> data = new Vector<Object>();
			double sum = 0;

			for (int i = 0; i < vo.size(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(vo.get(i).getDate());
				item.add(vo.get(i).getSellingArea());
				item.add(vo.get(i).getNumber());
				item.add(vo.get(i).getMoney());
				data.add(item);
				sum = sum + vo.get(i).getMoney();
			}

			ui.setData(data);
			ui.getTextArea().setText("" + sum);
		}
	}
	
}
