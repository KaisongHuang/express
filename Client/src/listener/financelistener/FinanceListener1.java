package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;

import logic.financebl.Finance;
import presentation.MySwing.MyButton;
import presentation.financeui.FinanceUI1;
import vo.ReceiptVO;

public class FinanceListener1 implements ActionListener ,MouseListener{
	private FinanceUI1 ui;
	Finance finance = new Finance();

	public FinanceListener1(FinanceUI1 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ui.getSearch()) {
			//clear table
			for(int i=0;i<ui.getTable().getRowCount();i++){
				ui.getModel().removeRow(0);
			}
			
			String year = (String) ui.getComboBox().getSelectedItem();
			String month = (String) ui.getComboBox_1().getSelectedItem();
			String day = (String) ui.getComboBox_2().getSelectedItem();

			String date = year + month + day;
			String sellingArea = (String) ui.getComboBox_3().getSelectedItem();

			ArrayList<ReceiptVO> vo = finance.checkReceipt(date, sellingArea);
            if(!check(vo))
            	return ;

			double sum = 0;

			for (int i = 0; i < vo.size(); i++) {
				Vector<Object> item = new Vector<Object>();
				item.add(vo.get(i).getDate());
				item.add(vo.get(i).getSellingArea());
				item.add(vo.get(i).getNumber());
				item.add(vo.get(i).getMoney());
				ui.getModel().addRow(item);
				sum = sum + vo.get(i).getMoney();
			}

			ui.getTextArea().setText("" + sum);
		}
	}
	
	private boolean check(ArrayList<ReceiptVO> vo){
		if(vo==null){
			JOptionPane.showMessageDialog(ui, "查询的信息不存在！");
			return false;
		}
		return true;
			
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getSearch()) {
			MyButton button=ui.getSearch();
			button.setEntered(false);
			button.setPressed(true);
			button.repaint();
		}
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getSearch()) {
			MyButton button=ui.getSearch();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == ui.getSearch()) {
			MyButton button=ui.getSearch();
			button.setEntered(true);
			button.setPressed(false);
			button.repaint();
		}
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getSearch()){
			MyButton button=ui.getSearch();
		    button.setEntered(false);
		    button.repaint();
		}
	}
}
