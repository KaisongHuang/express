/**
 * SellingAreaUI2是SellingArea用户的收款界面
 */

package presentation.sellingareaui;

import java.awt.Color;
import java.awt.Image;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import listener.sellingarealistener.SellingAreaListener20;
import javax.swing.JComboBox;

public class SellingAreaUI2 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int width;
	private int height;
	private JTable table;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private DefaultTableModel model;
	private JTable table1;
	private JScrollPane JSP1;
	private Vector<String> name1;
	private Vector<Object> data1;
	private DefaultTableModel model1;
	SellingAreaListener20 sellingarealistener;

	/**
	 * Create the application.
	 * 
	 * @param j
	 * @param i
	 */
	public SellingAreaUI2(int i, int j) {
		sellingarealistener = new SellingAreaListener20(this);
		width = i;
		height = j;
		initialize();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(new Color(158, 211, 238));
		this.setBounds(136, 114, 742, 533);
		this.setLayout(null);

		String names[] = { "收款日期", "收款金额", "收款快递员" };
		name = new Vector<String>(Arrays.asList(names));
		table = new JTable(data, name);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(28, 28, 444, 298);
		this.add(JSP);
		
		String names1[] = { "快递订单条形码号" };
		name1 = new Vector<String>(Arrays.asList(names1));
		table1 = new JTable(data1, name1);
		model1 = (DefaultTableModel) table1.getModel();
		JSP1 = new JScrollPane(table1);
		JSP1.setBounds(472, 28, 236, 298);
		this.add(JSP1);
		
		JLabel label = new JLabel("收款日期：");
		label.setBounds(28, 368, 79, 16);
		add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(90, 364, 79, 27);
		add(comboBox);
	}
}
