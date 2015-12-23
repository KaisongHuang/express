package presentation.MySwing;

import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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
		((JLabel) tableHeader.getDefaultRenderer()).setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列名居中
	}

	public MyTable(DefaultTableModel tableModel) {
		super(tableModel);
		JTableHeader tableHeader = this.getTableHeader();
//		tableHeader.setReorderingAllowed(false);// 表格列不可移动
		((JLabel) tableHeader.getDefaultRenderer()).setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列名居中
	}

	public MyTable(Vector<Object> data, Vector<String> name) {
		// TODO Auto-generated constructor stub
		super(data,name);
		JTableHeader tableHeader = this.getTableHeader();
//		tableHeader.setReorderingAllowed(false);// 表格列不可移动
		((JLabel) tableHeader.getDefaultRenderer()).setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列名居中
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
}