package presentation.MySwing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class MyTable extends JTable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int editableRow;
	private int editableCol;

	public MyTable() {
		super();
		JTableHeader tableHeader = this.getTableHeader();
//		tableHeader.setReorderingAllowed(false);// 表格列不可移动
		//((JLabel) tableHeader.getDefaultRenderer()).setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列名居中
		tableHeader.setPreferredSize(new Dimension(0, 20));
		tableHeader.setDefaultRenderer(new headerRender());
	}

	public MyTable(DefaultTableModel tableModel) {
		super(tableModel);
		JTableHeader tableHeader = this.getTableHeader();
//		tableHeader.setReorderingAllowed(false);// 表格列不可移动
	//	((JLabel) tableHeader.getDefaultRenderer()).setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列名居中
		tableHeader.setPreferredSize(new Dimension(0, 20));
		tableHeader.setDefaultRenderer(new headerRender());
	}

	public MyTable(Vector<Object> data, Vector<String> name) {
		// TODO Auto-generated constructor stub
		super(data,name);
		JTableHeader tableHeader = this.getTableHeader();
//		tableHeader.setReorderingAllowed(false);// 表格列不可移动
		//((JLabel) tableHeader.getDefaultRenderer()).setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列名居中
		tableHeader.setPreferredSize(new Dimension(0, 20));
		tableHeader.setDefaultRenderer(new headerRender());
	}

	@Override
	public boolean isCellEditable(int row, int col) {
		if (col == editableCol || row == editableRow)
			return true;
		else
			return false;
	}

	public void setEditableColumn(int col) {
		this.editableCol = col;
	}

	public void setEditableRow(int row) {
		this.editableRow = row;
	}

	public void setHorizontalAlignment(int align) {
		if (align == JLabel.CENTER) {
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();// 设置table内容居中
			tcr.setHorizontalAlignment(JLabel.CENTER);
			// tcr.setHorizontalAlignment(SwingConstants.CENTER);// 这句和上句作用一样
			this.setDefaultRenderer(Object.class, tcr);
		}
		if (align == JLabel.LEFT) {
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();// 设置table内容居中
			tcr.setHorizontalAlignment(JLabel.LEFT);
			// tcr.setHorizontalAlignment(SwingConstants.CENTER);// 这句和上句作用一样
			this.setDefaultRenderer(Object.class, tcr);
		}
		if (align == JLabel.RIGHT) {
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();// 设置table内容居中
			tcr.setHorizontalAlignment(JLabel.RIGHT);
			// tcr.setHorizontalAlignment(SwingConstants.CENTER);// 这句和上句作用一样
			this.setDefaultRenderer(Object.class, tcr);
		}
	}
	
	/** 
	 * 隐藏表格中的某一列 
	 * @param table  表格 
	 * @param index  要隐藏的列 的索引
	 */ 
	public void hideColumn(int index){ 
	    TableColumn tc= this.getColumnModel().getColumn(index); 
	    tc.setMaxWidth(0); 
	    tc.setPreferredWidth(0); 
	    tc.setMinWidth(0); 
	    tc.setWidth(0); 
	    this.getTableHeader().getColumnModel().getColumn(index).setMaxWidth(0); 
	    this.getTableHeader().getColumnModel().getColumn(index).setMinWidth(0); 
	}
	
	

}

class headerRender extends DefaultTableCellRenderer {
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		label.setText("      "+value.toString());
		//label.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
	
		Dimension d = label.getSize();
		//d.height = 36;
		label.setBackground(new Color(158, 211, 240));
		label.setSize(d);
		label.setOpaque(true);
		return label;
	}

	JLabel label = new JLabel();
}

