package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;

import logic.financebl.Finance;
import logic.logicfactory.LogicFactory;
import presentation.financeui.FinanceUI2_1;
import vo.PayVO;
import vo.ReceiptVO;

public class FinanceListener2_1 implements ActionListener{
	private FinanceUI2_1 ui;
	Finance finance;
	double income=0;
	double outcome=0;
	double balance=0;
	public FinanceListener2_1(FinanceUI2_1 ui){
		this.ui=ui;
		finance=LogicFactory.getFinanceService();
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ui.getButton()){
			int row1=ui.getModel1().getRowCount();
			for(int i=0;i<row1;i++)
				ui.getModel1().removeRow(0);
			
			int row2=ui.getModel2().getRowCount();
			for(int i=0;i<row2;i++)
				ui.getModel2().removeRow(0);
			
			ArrayList<PayVO> pay=new ArrayList<PayVO>();
			ArrayList<ReceiptVO> receipt=new ArrayList<ReceiptVO>();
			
			pay=this.getPay();
			receipt=this.getReceipt();
			
		
			
			for(int i=0;i<pay.size();i++){
				Vector<Object> rowData=new Vector<Object>();
				rowData.add(pay.get(i).getDate());
				rowData.add(pay.get(i).getPayer());
				rowData.add(pay.get(i).getCost());
				rowData.add(pay.get(i).getEntry());
				ui.getModel1().addRow(rowData);
				
				outcome+=pay.get(i).getCost();
			}
			
			for(int i=0;i<receipt.size();i++){
				Vector<Object> rowData=new Vector<Object>();
				rowData.add(receipt.get(i).getDate());
				rowData.add(receipt.get(i).getSellingArea());
				rowData.add(receipt.get(i).getNumber());
				rowData.add(receipt.get(i).getMoney());
				ui.getModel2().addRow(rowData);
				
				income+=receipt.get(i).getMoney();
			}
			
			balance=income-outcome;
			ui.getIncome().setText(""+income);
			ui.getOutcome().setText(""+outcome);
			ui.getBalance().setText(""+balance);
		}
		if(e.getSource()==ui.getMyButton()){
			finance.exportCostAndReceive(""+income, ""+outcome,""+balance);
		}
	}
	
	private ArrayList<PayVO> getPay(){
		ArrayList<Object> ob = finance.getTotal("20150101", getDate());
		ArrayList<PayVO> pay = new ArrayList<PayVO>();
		int count = finance.getCount();

		for (int i = 0; i < count; i++) {
			pay.add((PayVO) ob.get(i));
		}

		return pay;
	}
	
	private ArrayList<ReceiptVO> getReceipt(){
		
		
		ArrayList<Object> ob = finance.getTotal("20150101", getDate());

		ArrayList<ReceiptVO> receipt = new ArrayList<ReceiptVO>();
		int count = finance.getCount();

		for (int i = count; i < ob.size(); i++) {
			receipt.add((ReceiptVO) ob.get(i));
		}
		
		return receipt;
	}

	private String getDate(){
		Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
		String time="";
		
		int year = c.get(Calendar.YEAR); 
		int month = c.get(Calendar.MONTH)+1; 
		int date = c.get(Calendar.DATE); 
		
		String month1="";
		String date1="";
		
		if(month>=10)
			month1=""+month;
		else
			month1="0"+month;
		
		if(date>=10)
			date1=""+date;
		else
			date1="0"+date;
		
		
		time=year+month1+date1;		
		return time;
	}
}
