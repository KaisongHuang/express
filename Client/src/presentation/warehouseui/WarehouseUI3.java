package presentation.warehouseui;


import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;

import java.util.Arrays;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class WarehouseUI3 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;

	/**
	 * Create the application.
	 */
	public WarehouseUI3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		
		String names[] = { "快递编号", "原区号", "原排号", "原架号", "原位号","现区号", "现排号", "现架号", "现位号" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(36, 32, 678, 326);
		this.add(JSP);
		
		JButton button = new JButton("确认");
		button.setBounds(130, 380, 94, 27);
		add(button);
		
		JButton button_1 = new JButton("取消");
		button_1.setBounds(266, 380, 94, 27);
		add(button_1);
		
		JButton button_2 = new JButton("清空");
		button_2.setBounds(404, 380, 94, 27);
		add(button_2);
		
		JButton button_3 = new JButton("设置报警比例");
		button_3.setBounds(538, 380, 114, 27);
		add(button_3);
	}
}
