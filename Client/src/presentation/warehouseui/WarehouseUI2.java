package presentation.warehouseui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class WarehouseUI2 extends JPanel {
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JButton button_1;
	private JButton button_2;
	private JComboBox<?> comboBox;
	private JComboBox<?> comboBox_1;
	private JComboBox<?> comboBox_2;
	private JComboBox<?> comboBox_3;
	private JComboBox<?> comboBox_4;
	private JComboBox<?> comboBox_5;
	private JTextArea textArea;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTable table;
	private JScrollPane JSP;
	private String[] name = { "快递编号", "入库日期", "目的地", "区号", "排号", "架号", "位号" };
	private String[][] data = {};
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the application.
	 */
	public WarehouseUI2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBounds(136, 115, 746, 438);
		this.setLayout(null);

		table = new JTable(data, name);
		JSP = new JScrollPane(table);
		JSP.setBounds(34, 29, 444, 300);
		this.add(JSP);

		label_8 = new JLabel("库存查看");
		label_8.setBounds(608, 33, 57, 15);
		this.add(label_8);

		label_9 = new JLabel("开始日期:");
		label_9.setBounds(490, 103, 57, 15);
		this.add(label_9);

		label_10 = new JLabel("结束日期:");
		label_10.setBounds(490, 130, 57, 15);
		this.add(label_10);

		comboBox = new JComboBox<Object>();
		comboBox.setBounds(545, 98, 64, 25);
		this.add(comboBox);

		label_11 = new JLabel("年");
		label_11.setBounds(608, 103, 12, 15);
		this.add(label_11);

		comboBox_1 = new JComboBox<Object>();
		comboBox_1.setBounds(621, 98, 44, 25);
		this.add(comboBox_1);

		label_12 = new JLabel("月");
		label_12.setBounds(663, 103, 12, 15);
		this.add(label_12);

		comboBox_2 = new JComboBox<Object>();
		comboBox_2.setBounds(677, 98, 44, 25);
		this.add(comboBox_2);

		label_13 = new JLabel("日");
		label_13.setBounds(720, 103, 12, 15);
		this.add(label_13);

		comboBox_3 = new JComboBox<Object>();
		comboBox_3.setBounds(545, 125, 64, 25);
		this.add(comboBox_3);

		label_14 = new JLabel("年");
		label_14.setBounds(608, 130, 12, 15);
		this.add(label_14);

		comboBox_4 = new JComboBox<Object>();
		comboBox_4.setBounds(621, 125, 44, 25);
		this.add(comboBox_4);

		label_15 = new JLabel("月");
		label_15.setBounds(663, 130, 12, 15);
		this.add(label_15);

		comboBox_5 = new JComboBox<Object>();
		comboBox_5.setBounds(677, 125, 44, 25);
		this.add(comboBox_5);

		label_16 = new JLabel("日");
		label_16.setBounds(720, 130, 12, 15);
		this.add(label_16);

		button_1 = new JButton("查询");
		button_1.setBounds(545, 170, 64, 27);
		this.add(button_1);

		button_2 = new JButton("清空");
		button_2.setBounds(657, 170, 64, 27);
		this.add(button_2);

		label_17 = new JLabel("入库数量(件)：");
		label_17.setBounds(490, 222, 80, 15);
		this.add(label_17);

		JLabel label = new JLabel("出库数量(件)：");
		label.setBounds(490, 260, 80, 15);
		add(label);

		JLabel lblji = new JLabel("库存合计(件)：");
		lblji.setBounds(490, 293, 80, 15);
		add(lblji);

		textArea = new JTextArea();
		textArea.setBounds(582, 216, 80, 27);
		textArea.setEditable(false);
		add(textArea);

		textArea_1 = new JTextArea();
		textArea_1.setBounds(582, 254, 80, 27);
		textArea_1.setEditable(false);
		add(textArea_1);

		textArea_2 = new JTextArea();
		textArea_2.setBounds(582, 287, 80, 27);
		textArea_2.setEditable(false);
		add(textArea_2);
	}

	public JTable getTable() {
		return table;
	}

	public JLabel getLabel_8() {
		return label_8;
	}

	public JLabel getLabel_9() {
		return label_9;
	}

	public JLabel getLabel_10() {
		return label_10;
	}

	public JLabel getLabel_11() {
		return label_11;
	}

	public JLabel getLabel_12() {
		return label_12;
	}

	public JLabel getLabel_13() {
		return label_13;
	}

	public JLabel getLabel_14() {
		return label_14;
	}

	public JLabel getLabel_15() {
		return label_15;
	}

	public JLabel getLabel_16() {
		return label_16;
	}

	public JLabel getLabel_17() {
		return label_17;
	}

	public JButton getButton_1() {
		return button_1;
	}

	public JButton getButton_2() {
		return button_2;
	}

	public JComboBox<?> getComboBox() {
		return comboBox;
	}

	public JComboBox<?> getComboBox_1() {
		return comboBox_1;
	}

	public JComboBox<?> getComboBox_2() {
		return comboBox_2;
	}

	public JComboBox<?> getComboBox_3() {
		return comboBox_3;
	}

	public JComboBox<?> getComboBox_4() {
		return comboBox_4;
	}

	public JComboBox<?> getComboBox_5() {
		return comboBox_5;
	}

	public void setData(String[][] data) {
		this.data = data;
	}

	public String getBeginDate() {
		String year = (String) this.comboBox.getSelectedItem();
		String month = (String) this.comboBox_1.getSelectedItem();
		String date = (String) this.comboBox_2.getSelectedItem();
		return year + month + date;
	}

	public String getEndDate() {
		String year = (String) this.comboBox_3.getSelectedItem();
		String month = (String) this.comboBox_4.getSelectedItem();
		String date = (String) this.comboBox_5.getSelectedItem();
		return year + month + date;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public JTextArea getTextArea_1() {
		return textArea_1;
	}

	public JTextArea getTextArea_2() {
		return textArea_2;
	}
}
