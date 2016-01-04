package presentation.financeui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

import listener.financelistener.FinanceListener2_1;
import logic.financebl.Finance;
import logic.logicfactory.LogicFactory;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyTable;
import vo.PayVO;
import vo.ReceiptVO;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Vector;

public class FinanceUI2_1 extends JPanel {

	/**
	 * Create the panel.
	 */
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel income;
	private JLabel outcome;
	private JLabel balance;
	private Vector<String> name1;
	private Vector<Object> data1;
	private MyTable table1;
	private DefaultTableModel model1;
	private JScrollPane JSP1;
	private Vector<String> name2;
	private Vector<Object> data2;
	private MyTable table2;
	private DefaultTableModel model2;
	private JScrollPane JSP2;
	private MyButton button;
	private MyButton myButton;
	private Finance finance=LogicFactory.getFinanceService();
	private FinanceListener2_1 listener;

	public FinanceUI2_1() {
		listener=new FinanceListener2_1(this);
		init();
	}

	private void init() {
		setBackground(Color.WHITE);
		setLayout(null);

		String names1[] = { "付款日期","付款人", "付款金额", "条目" };
		name1 = new Vector<String>(Arrays.asList(names1));
		table1 = new MyTable(data1, name1);
		table1.setSelectionForeground(Color.BLACK);
		table1.setSelectionBackground(new Color(210, 240, 255));
		table1.setEditableColumn(-1);
		table1.setEditableRow(-1);
		table1.setFocusable(false);
		model1 = (DefaultTableModel) table1.getModel();
		JSP1 = new JScrollPane(table1);
		JSP1.setBounds(362, 70, 347, 270);
		this.add(JSP1);

		String names2[] = { "收款日期", "收款单位", "收款人", "收款金额" };
		name2 = new Vector<String>(Arrays.asList(names2));
		table2 = new MyTable(data2, name2);
		table2.setSelectionForeground(Color.BLACK);
		table2.setSelectionBackground(new Color(210, 240, 255));
		table2.setEditableColumn(-1);
		table2.setEditableRow(-1);
		table2.setFocusable(false);
		model2 = (DefaultTableModel) table2.getModel();
		JSP2 = new JScrollPane(table2);
		JSP2.setBounds(16, 70, 347, 270);
		this.add(JSP2);
		
		double income1=0;
		double outcome1=0;
		double balance1=0;
		
		
		ArrayList<PayVO> pay=this.getPay();
		ArrayList<ReceiptVO> receipt=this.getReceipt();
		
		for(int i=0;i<pay.size();i++){
			Vector<Object> rowData=new Vector<Object>();
			rowData.add(pay.get(i).getDate());
			rowData.add(pay.get(i).getPayer());
			rowData.add(pay.get(i).getCost());
			rowData.add(pay.get(i).getEntry());
			getModel1().addRow(rowData);
			
			outcome1+=pay.get(i).getCost();
		}
		
		for(int i=0;i<receipt.size();i++){
			Vector<Object> rowData=new Vector<Object>();
			rowData.add(receipt.get(i).getDate());
			rowData.add(receipt.get(i).getSellingArea());
			rowData.add(receipt.get(i).getNumber());
			rowData.add(receipt.get(i).getMoney());
			getModel2().addRow(rowData);
			
			income1+=receipt.get(i).getMoney();
		}
		
		balance1=income1-outcome1;
		

		label = new JLabel("总收入：");
		label.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		label.setBounds(18, 25, 114, 50);
		add(label);

		label_1 = new JLabel("总支出:");
		label_1.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		label_1.setBounds(267, 25, 114, 50);
		add(label_1);

		income = new JLabel();
		income.setBounds(96, 28, 100, 42);
		income.setForeground(new Color(96, 203, 151));
		income.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		income.setHorizontalAlignment(JLabel.CENTER);
		income.setText(""+income1);
		add(income);

		outcome = new JLabel();
		outcome.setBounds(340, 28, 100, 42);
		outcome.setForeground(new Color(248, 190, 192));
		outcome.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		outcome.setHorizontalAlignment(JLabel.CENTER);
		outcome.setText(""+outcome1);
		add(outcome);

		label_2 = new JLabel("－");
		label_2.setBounds(208, 35, 57, 50);
		label_2.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 40));
		add(label_2);

		label_3 = new JLabel("＝");
		label_3.setBounds(440, 30, 61, 60);
		label_3.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 40));
		add(label_3);

		label_4 = new JLabel("总利润:");
		label_4.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		label_4.setBounds(493, 25, 114, 50);
		add(label_4);

		balance = new JLabel();
		balance.setBounds(566, 28, 112, 49);
		balance.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		balance.setForeground(new Color(179, 216, 253));
		balance.setHorizontalAlignment(JLabel.CENTER);
		balance.setText(""+balance1);
		add(balance);

		label_5 = new JLabel("(元)");
		label_5.setFont(new Font("Adobe Gothic Std", Font.PLAIN, 20));
		label_5.setBounds(662, 25, 114, 50);
		add(label_5);
		
		button = new MyButton("刷新");
		button.setBounds(470, 352, 117, 29);
		button.addActionListener(listener);
		add(button);
		
		myButton = new MyButton("导出");
		myButton.setBounds(592, 352, 117, 29);
		myButton.addActionListener(listener);
		add(myButton);

	}

	public JLabel getIncome() {
		return income;
	}

	public JLabel getOutcome() {
		return outcome;
	}

	public JLabel getBalance() {
		return balance;
	}

	public MyTable getTable1() {
		return table1;
	}

	public DefaultTableModel getModel1() {
		return model1;
	}

	public MyTable getTable2() {
		return table2;
	}

	public DefaultTableModel getModel2() {
		return model2;
	}

	public MyButton getButton() {
		return button;
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
