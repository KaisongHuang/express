/**
 * WarehouseUI1是Warehouse用户的出库入库界面
 */

package presentation.warehouseui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import listener.warehouselistener.WarehouseListener1;
import presentation.MySwing.MyTable;
import presentation.MySwing.MyTextField;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Vector;
import java.awt.event.ActionEvent;

//出库入库界面
public class WarehouseUI1 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JButton exportButton;
	private JButton importButton;
	private JButton button_3;
	private JButton button_5;
	private JButton button_1;
	private JButton button_2;
	private JPanel exportPanel;
	private JLabel label_1;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private WarehouseListener1 listener;
	private CardLayout card;
	private JPanel importPanel;
	private JLabel label_8;
	private JComboBox<Object> comboBox_4;
	private JLabel label_10;
	private JComboBox<Object> comboBox_5;
	private JLabel label_11;
	private JComboBox<Object> comboBox_6;
	private JLabel label_12;
	private JButton button;
	private JButton button_6;
	private JLabel label_13;
	private JComboBox<Object> comboBox_7;
	private JLabel label_14;
	private JComboBox<Object> comboBox_8;
	private JLabel label_15;
	private JComboBox<Object> comboBox_9;
	private JLabel label_16;
	private JComboBox<Object> comboBox_10;
	private JPanel panel;

	private MyTable table;
	private DefaultTableModel model;
	private JScrollPane JSP;
	private Vector<String> name;
	private Vector<Object> data;
	private MyTable table1;
	private DefaultTableModel model1;
	private JScrollPane JSP1;
	private Vector<String> name1;
	private Vector<Object> data1;

	private WarehouseListener1 warehouseListener;


	/**
	 * Create the application.
	 */
	public WarehouseUI1() {
		warehouseListener = new WarehouseListener1(this);
		initialize();
		this.setImage();
		this.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		this.setBackground(Color.white);
		listener = new WarehouseListener1(this);
		card = new CardLayout(0, 0);
		this.setBounds(0, 0, 746, 438);
		this.setLayout(null);
		panel = new JPanel();
		panel.setBounds(100, 50, 532, 350);
		panel.setLayout(card);
		add(panel);



		exportPanel = new JPanel();

		exportPanel.setBackground(Color.WHITE);
		exportPanel.setLayout(null);
		String names1[] = { "快递编号", "目的地","中转单编号" };
		name1 = new Vector<String>(Arrays.asList(names1));
		table1 = new MyTable(data1, name1);
		table1.setSelectionForeground(Color.BLACK);
		table1.setSelectionBackground(new Color(210, 240, 255));
		table1.setEditableColumn(-1);
		table1.setEditableRow(-1);
		table1.setFocusable(false);
		model1 = (DefaultTableModel) table1.getModel();
		JSP1 = new JScrollPane(table1);
		JSP1.setBounds(4, 18, 317, 300);
		exportPanel.add(JSP1);

		label_1 = new JLabel("出库日期:");
		label_1.setBounds(333, 84, 57, 15);
		exportPanel.add(label_1);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(391, 80, 70, 25);
		comboBox.addItem("2015");
		exportPanel.add(comboBox);

		label_3 = new JLabel("年");
		label_3.setBounds(462, 84, 23, 15);
		exportPanel.add(label_3);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(391, 107, 70, 25);
		comboBox_1.addItem("01");
		exportPanel.add(comboBox_1);

		label_4 = new JLabel("月");
		label_4.setBounds(462, 111, 13, 15);
		exportPanel.add(label_4);

		comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(391, 165, 70, 25);
		comboBox_2.addItem("01");
		exportPanel.add(comboBox_2);

		label_5 = new JLabel("日");
		label_5.setBounds(462, 138, 23, 15);
		exportPanel.add(label_5);

		label_6 = new JLabel("装运形式:");

		label_6.setBounds(6, 179, 57, 15);
		exportPanel.add(label_6);

		comboBox_3 = new JComboBox<String>();
		comboBox_3.setBounds(75, 175, 70, 25);
		comboBox_3.addItem("飞机");
		comboBox_3.addItem("火车");
		comboBox_3.addItem("汽车");

		exportPanel.add(comboBox_3);

		button_5 = new JButton("确认");
		button_5.setBounds(391, 202, 94, 27);
		button_5.addActionListener(listener);
		exportPanel.add(button_5);

		button_3 = new JButton("清空");
		button_3.setBounds(391, 241, 94, 27);
		button_3.addActionListener(listener);
		exportPanel.add(button_3);

		button_2 = new JButton("导入");
		button_2.setBounds(391, 14, 94, 29);
		button_2.addActionListener(warehouseListener);
		exportPanel.add(button_2);

		importPanel = new JPanel();
		importPanel.setLayout(null);
		importPanel.setBackground(Color.WHITE);

		String names[] = { "快递编号", "目的地" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionBackground(new Color(210, 240, 255));
		table.setEditableColumn(-1);
		table.setEditableRow(-1);
		table.setFocusable(false);
		model = (DefaultTableModel) table.getModel();
		JSP = new JScrollPane(table);
		JSP.setBounds(6, 18, 317, 300);
		importPanel.add(JSP);

		label_8 = new JLabel("入库日期:");
		label_8.setBounds(335, 52, 57, 15);
		importPanel.add(label_8);

		comboBox_4 = new JComboBox<Object>();
		comboBox_4.setBounds(393, 48, 94, 25);
		comboBox_4.addItem("2015");
		importPanel.add(comboBox_4);

		label_10 = new JLabel("年");
		label_10.setBounds(491, 52, 20, 15);
		importPanel.add(label_10);

		comboBox_5 = new JComboBox<Object>();
		comboBox_5.setBounds(393, 79, 70, 25);
		comboBox_5.addItem("01");
		importPanel.add(comboBox_5);

		label_11 = new JLabel("月");
		label_11.setBounds(491, 79, 20, 15);
		importPanel.add(label_11);

		comboBox_6 = new JComboBox<Object>();
		comboBox_6.setBounds(393, 116, 70, 25);
		comboBox_6.addItem("01");
		importPanel.add(comboBox_6);

		label_12 = new JLabel("日");
		label_12.setBounds(491, 120, 57, 15);
		importPanel.add(label_12);

		button = new JButton("确认");
		button.setBounds(339, 267, 94, 27);
		importPanel.add(button);

		button_6 = new JButton("清空");
		button_6.setBounds(432, 267, 94, 27);
		importPanel.add(button_6);

		label_13 = new JLabel("区号:");
		label_13.setBounds(361, 151, 31, 16);
		importPanel.add(label_13);

		comboBox_7 = new JComboBox<Object>();
		comboBox_7.setBounds(393, 147, 94, 27);
		comboBox_7.addItem("航运区");
		comboBox_7.addItem("铁运区");
		comboBox_7.addItem("汽运区");
		importPanel.add(comboBox_7);

		label_14 = new JLabel("排号:");
		label_14.setBounds(361, 179, 42, 16);
		importPanel.add(label_14);

		comboBox_8 = new JComboBox<Object>();
		comboBox_8.setBounds(393, 175, 70, 27);
		comboBox_8.addItem("1");
		importPanel.add(comboBox_8);

		label_15 = new JLabel("架号:");
		label_15.setBounds(361, 207, 42, 16);
		importPanel.add(label_15);

		comboBox_9 = new JComboBox<Object>();
		comboBox_9.setBounds(393, 203, 70, 27);
		comboBox_9.addItem("1");
		importPanel.add(comboBox_9);

		label_16 = new JLabel("位号:");
		label_16.setBounds(361, 239, 61, 16);
		importPanel.add(label_16);

		comboBox_10 = new JComboBox<Object>();
		comboBox_10.setBounds(393, 235, 70, 27);
		comboBox_10.addItem("1");
		importPanel.add(comboBox_10);

		button_1 = new JButton("导入");
		button_1.setBounds(393, 15, 94, 27);
		button_1.addActionListener(warehouseListener);
		importPanel.add(button_1);

		panel.add(importPanel, "import");
		panel.add(exportPanel, "export");

		exportButton = new JButton("新建出库单");
		exportButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel, "export");
			}
		});
		exportButton.setBackground(new Color(255, 248, 220));
		exportButton.setBounds(206, 11, 94, 27);
		this.add(exportButton);

		importButton = new JButton("新建入库单");
		importButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				card.show(panel, "import");
			}
		});
		importButton.setBounds(100, 11, 94, 27);
		this.add(importButton);

	}

	public DefaultTableModel getModel() {
		return model;
	}

	public JButton getButton_1() {
		return button_1;
	}

	public JButton getButton_2() {
		return button_2;
	}

	public JButton getExportButton() {
		return this.exportButton;
	}

	public JButton getImportButton() {
		return this.importButton;
	}

	public JButton getExportClearButton() {
		return this.button_3;
	}

	public JButton getImportClearButton() {
		return this.button_6;
	}

	public JButton getExportConfirmButton() {
		return this.button_5;
	}

	public JPanel getPanel() {
		return this.panel;
	}

	public CardLayout getCardLayout() {
		return this.getCardLayout();
	}


	public JButton getButton_3() {
		return button_3;
	}

	public JButton getButton_5() {
		return button_5;
	}

	public JPanel getExportPanel() {
		return exportPanel;
	}



	public JLabel getLabel_1() {
		return label_1;
	}


	public JLabel getLabel_3() {
		return label_3;
	}

	public JLabel getLabel_4() {
		return label_4;
	}

	public JLabel getLabel_5() {
		return label_5;
	}

	public JLabel getLabel_6() {
		return label_6;
	}


	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	public JComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public JComboBox<String> getComboBox_2() {
		return comboBox_2;
	}

	public JComboBox<String> getComboBox_3() {
		return comboBox_3;
	}

	public WarehouseListener1 getListener() {
		return listener;
	}

	public CardLayout getCard() {
		return card;
	}

	public JPanel getImportPanel() {
		return importPanel;
	}


	public JLabel getLabel_8() {
		return label_8;
	}


	public JComboBox<Object> getComboBox_4() {
		return comboBox_4;
	}

	public JLabel getLabel_10() {
		return label_10;
	}

	public JComboBox<Object> getComboBox_5() {
		return comboBox_5;
	}

	public JLabel getLabel_11() {
		return label_11;
	}

	public JComboBox<Object> getComboBox_6() {
		return comboBox_6;
	}

	public JLabel getLabel_12() {
		return label_12;
	}

	public JButton getButton() {
		return button;
	}

	public JButton getButton_6() {
		return button_6;
	}

	public JLabel getLabel_13() {
		return label_13;
	}

	public JComboBox<Object> getComboBox_7() {
		return comboBox_7;
	}

	public JLabel getLabel_14() {
		return label_14;
	}

	public JComboBox<Object> getComboBox_8() {
		return comboBox_8;
	}

	public JLabel getLabel_15() {
		return label_15;
	}

	public JComboBox<Object> getComboBox_9() {
		return comboBox_9;
	}

	public JLabel getLabel_16() {
		return label_16;
	}

	public JComboBox<Object> getComboBox_10() {
		return comboBox_10;
	}

	public JButton getImportConfirmButton() {
		return this.button;
	}

	public String getPos_qu() {
		return (String) comboBox_7.getSelectedItem();
	}

	public int getPos_pai() {
		return (Integer) comboBox_8.getSelectedItem();
	}

	public int getPos_jia() {
		return (Integer) comboBox_9.getSelectedItem();
	}

	public int getPos_wei() {
		return (Integer) comboBox_10.getSelectedItem();
	}

	public String getExportDate() {
		String year = (String) comboBox.getSelectedItem();
		String month = (String) comboBox_1.getSelectedItem();
		String date = (String) comboBox_2.getSelectedItem();
		return year + month + date;
	}

	public String getImportDate() {
		String year = (String) comboBox_4.getSelectedItem();
		String month = (String) comboBox_5.getSelectedItem();
		String date = (String) comboBox_6.getSelectedItem();
		return year + month + date;
	}


	public String getTransportation() {
		return (String) comboBox_3.getSelectedItem();
	}

	private void setImage() {

	}
}
