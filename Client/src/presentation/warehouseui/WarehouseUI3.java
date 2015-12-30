/**
 * WarehouseUI3是Warehouse用户的库存报警界面
 */

package presentation.warehouseui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

import listener.warehouselistener.WarehouseListener3;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MyTable;

public class WarehouseUI3 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private MyTable table;
	private DefaultTableModel model;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private MyButton button;
	private MyButton button_1;
	private MyButton button_2;
	private MyButton button_3;
	WarehouseListener3 warehouseListener;
    private MyDialog dialog;
	/**
	 * Create the application.
	 */
	public WarehouseUI3() {
		warehouseListener = new WarehouseListener3(this);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);
		this.setBackground(Color.white);
		String names[] = { "快递编号", "原区号", "原排号", "原架号", "原位号", "现区号", "现排号", "现架号", "现位号" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(15, 29, 692, 326);
		this.add(JSP);

		dialog=new MyDialog();
		this.add(dialog);
		button = new MyButton("刷新");
		button.setBounds(18, 369, 94, 27);
		button.addActionListener(warehouseListener);
		add(button);

		button_1 = new MyButton("确认");
		button_1.setBounds(124, 369, 94, 27);
		button_1.addActionListener(warehouseListener);
		add(button_1);

		button_2 = new MyButton("清空");
		button_2.setBounds(230, 369, 94, 27);
		button_2.addActionListener(warehouseListener);
		add(button_2);

		button_3 = new MyButton("设置报警比例");
		button_3.setBounds(593, 367, 114, 27);
		button_3.addActionListener(warehouseListener);
		add(button_3);
	}
	public void setText(String s){
		dialog.setText(s);
	}
	public MyTable getTable() {
		return table;
	}

	public DefaultTableModel getModel() {
		return model;
	}

	public Vector<Object> getData() {
		return data;
	}

	public void setData(Vector<Object> data) {
		this.data = data;
	}

	public MyButton getButton() {
		return button;
	}

	public MyButton getButton_1() {
		return button_1;
	}

	public MyButton getButton_2() {
		return button_2;
	}

	public MyButton getButton_3() {
		return button_3;
	}

}
