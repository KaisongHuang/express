package presentation.financeui;

import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import listener.financelistener.FinanceListener4;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FinanceUI4_1 extends JPanel {

	/**
	 * 
	 */
	private MyButton ret;
	private static final long serialVersionUID = 1L;
	private MyTable table;
	private DefaultTableModel model;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	FinanceListener4 financeListener4;
	private int height = 600;
	private int width = 900;
    private MyDialog dialog;
	/**
	 * Create the panel.
	 */
	public FinanceUI4_1(FinanceListener4 financeListener4) {
		this.financeListener4 = financeListener4;
		initialize();
		// this.setImage();
		this.setVisible(true);
	}

	private void initialize() {
		this.setLayout(null);
		setBackground(Color.white);
		String names[] = { "账户", "余额" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(80, 60, 506, 316);
		this.add(JSP);
		dialog=new MyDialog();
		this.add(dialog);
		ret = new MyButton("返回");
		ret.setBounds(80, 19, 75, 29);
		ret.addActionListener(financeListener4);
		ret.addMouseListener(financeListener4);
		add(ret);
	}
	public void setText(String s){
		dialog.setText(s);
	}	
	public void setErrorText(String s){
		dialog.setErrorText(s);
	}
	public MyButton getRet() {
		return ret;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}

	public DefaultTableModel getModel() {
		return model;
	}
}
