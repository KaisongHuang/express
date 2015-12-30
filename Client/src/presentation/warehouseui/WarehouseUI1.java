/**
 * WarehouseUI1是Warehouse用户的出库入库界面
 */

package presentation.warehouseui;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.eltima.components.ui.DatePicker;

import javax.swing.JLabel;

import listener.warehouselistener.WarehouseListener1;
import presentation.MySwing.MyButton;
import presentation.MySwing.MyComboBox;
import presentation.MySwing.MyDatePicker;
import presentation.MySwing.MyDialog;
import presentation.MySwing.MySeperator;
import presentation.MySwing.MyTable;
import presentation.MySwing.SubNaviButton;

import java.util.Arrays;
import java.util.Vector;

//出库入库界面
public class WarehouseUI1 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private SubNaviButton exportButton;
	private SubNaviButton importButton;
	private MyButton button_3;
	private MyButton button_5;
	private MyButton button_1;
	private MyButton button_2;
	private JPanel exportPanel;
	private JLabel label_1;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private MyDialog dialog;
	private MyComboBox<String> comboBox;
	private MyComboBox<String> comboBox_1;
	private MyComboBox<String> comboBox_2;
	private MyComboBox<String> comboBox_3;
	private WarehouseListener1 listener;
	private CardLayout card;
	private JPanel importPanel;
	private JLabel label_8;
	private MyComboBox<Object> comboBox_4;
	private JLabel label_10;
	private MyComboBox<Object> comboBox_5;
	private JLabel label_11;
	private MyComboBox<Object> comboBox_6;
	private JLabel label_12;
	private MyButton button;
	private MyButton button_6;
	private JLabel label_13;
	private MyComboBox<Object> comboBox_7;
	private MyComboBox<Object> comboBox_8;
	private JLabel label_14;
	private JLabel label_15;
	private MyComboBox<Object> comboBox_9;
	private JLabel label_16;
	private MyComboBox<Object> comboBox_10;
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
	private MySeperator line;
	private JPanel navi_panel;
	private WarehouseListener1 warehouseListener;

	private DatePicker mdp1;

	/**
	 * Create the application.
	 */
	public WarehouseUI1() {
		warehouseListener = new WarehouseListener1(this);
		initialize();
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
		panel.setBounds(20, 50, 746, 394);
		panel.setLayout(card);
		add(panel);


        dialog=new MyDialog();
        this.add(dialog);

		exportPanel = new JPanel();

		exportPanel.setBackground(Color.WHITE);
		exportPanel.setLayout(null);
		String names1[] = { "快递编号", "目的地", "中转单号","装运形式" };
		name1 = new Vector<String>(Arrays.asList(names1));
		table1 = new MyTable(data1, name1);
		table1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table1.addMouseListener(warehouseListener);
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

		comboBox = new MyComboBox<String>();
		comboBox.setBounds(391, 80, 70, 25);
		comboBox.addItem("2015");
		exportPanel.add(comboBox);

		label_3 = new JLabel("年");
		label_3.setBounds(462, 84, 23, 15);
		exportPanel.add(label_3);

		comboBox_1 = new MyComboBox<String>();
		comboBox_1.setBounds(391, 107, 70, 25);
		comboBox_1.addItem("01");
		exportPanel.add(comboBox_1);

		label_4 = new JLabel("月");
		label_4.setBounds(462, 111, 13, 15);
		exportPanel.add(label_4);

		comboBox_2 = new MyComboBox<String>();
		comboBox_2.setBounds(391, 134, 70, 25);
		comboBox_2.addItem("01");
		exportPanel.add(comboBox_2);

		label_5 = new JLabel("日");
		label_5.setBounds(462, 138, 23, 15);
		exportPanel.add(label_5);

		label_6 = new JLabel("装运形式:");

		label_6.setBounds(6, 179, 57, 15);
		exportPanel.add(label_6);

		comboBox_3 = new MyComboBox<String>();
		comboBox_3.setBounds(75, 175, 70, 25);
		comboBox_3.addItem("飞机");
		comboBox_3.addItem("火车");
		comboBox_3.addItem("汽车");

		exportPanel.add(comboBox_3);

		button_5 = new MyButton("确认");
		button_5.setBounds(391, 202, 94, 27);
		button_5.addActionListener(listener);
		exportPanel.add(button_5);

		button_3 = new MyButton("清空");
		button_3.setBounds(391, 241, 94, 27);
		button_3.addActionListener(listener);
		exportPanel.add(button_3);

		button_2 = new MyButton("导入");
		button_2.setBounds(391, 28, 94, 29);
		button_2.addActionListener(warehouseListener);
		exportPanel.add(button_2);

		importPanel = new JPanel();
		importPanel.setLayout(null);
		importPanel.setBackground(Color.WHITE);

		String names[] = { "快递编号", "目的地" };
		name = new Vector<String>(Arrays.asList(names));
		table = new MyTable(data, name);
		table.setSelectionForeground(Color.BLACK);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.addMouseListener(warehouseListener);
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

		mdp1 = new MyDatePicker(this);
		mdp1.setBounds(393, 48, 117, 25);
		importPanel.add(mdp1);

		// comboBox_4 = new MyComboBox<Object>();
		// comboBox_4.setBounds(393, 48, 94, 25);
		// comboBox_4.addItem("2015");
		// importPanel.add(comboBox_4);
		//
		// label_10 = new JLabel("年");
		// label_10.setBounds(491, 52, 20, 15);
		// importPanel.add(label_10);
		//
		// comboBox_5 = new MyComboBox<Object>();
		// comboBox_5.setBounds(393, 79, 94, 25);
		// comboBox_5.addItem("01");
		// importPanel.add(comboBox_5);
		//
		// label_11 = new JLabel("月");
		// label_11.setBounds(491, 79, 20, 15);
		// importPanel.add(label_11);
		//
		// comboBox_6 = new MyComboBox<Object>();
		// comboBox_6.setBounds(393, 116, 94, 25);
		// comboBox_6.addItem("01");
		// importPanel.add(comboBox_6);
		//
		// label_12 = new JLabel("日");
		// label_12.setBounds(491, 120, 57, 15);
		// importPanel.add(label_12);

		button = new MyButton("确认");
		button.setBounds(334, 291, 94, 27);
		button.addActionListener(warehouseListener);
		importPanel.add(button);

		button_6 = new MyButton("清空");
		button_6.setBounds(444, 291, 94, 27);
		button_6.addActionListener(warehouseListener);
		importPanel.add(button_6);

		label_13 = new JLabel("区号:");
		label_13.setBounds(361, 100, 31, 16);
		importPanel.add(label_13);

		comboBox_7 = new MyComboBox<Object>();
		comboBox_7.setBounds(393, 95, 94, 27);
		comboBox_7.addItem("航运区");
		comboBox_7.addItem("铁运区");
		comboBox_7.addItem("汽运区");
		importPanel.add(comboBox_7);

		label_14 = new JLabel("排号:");
		label_14.setBounds(361, 142, 42, 16);
		importPanel.add(label_14);

		comboBox_8=new MyComboBox<Object>();
		comboBox_8.setBounds(393,138,94,27);
		comboBox_8.addItem("1");
		importPanel.add(comboBox_8);

		label_15 = new JLabel("架号:");
		label_15.setBounds(361, 187, 42, 16);
		importPanel.add(label_15);



		comboBox_9 = new MyComboBox<Object>();
		comboBox_9.setBounds(393, 182, 94, 27);
		comboBox_9.addItem("1");
		importPanel.add(comboBox_9);

		label_16 = new JLabel("位号:");
		label_16.setBounds(361, 241, 61, 16);
		importPanel.add(label_16);

		comboBox_10 = new MyComboBox<Object>();
		comboBox_10.setBounds(393, 230, 94, 27);
		comboBox_10.addItem("1");
		importPanel.add(comboBox_10);

		button_1 = new MyButton("导入");
		button_1.setBounds(393, 15, 94, 27);
		button_1.addActionListener(warehouseListener);
		importPanel.add(button_1);

		panel.add(importPanel, "import");
		panel.add(exportPanel, "export");

		navi_panel = new JPanel();
		navi_panel.setBounds(0, 0, 746, 44);
		navi_panel.setBackground(Color.WHITE);
		this.add(navi_panel);
		navi_panel.setLayout(null);

		exportButton = new SubNaviButton("新建出库单");
		exportButton.addActionListener(warehouseListener);
		exportButton.addMouseListener(warehouseListener);
		exportButton.setBackground(new Color(255, 248, 220));
		exportButton.setBounds(162, 0, 118, 44);
		navi_panel.add(exportButton);

		importButton = new SubNaviButton("新建入库单");
		importButton.addActionListener(warehouseListener);
		importButton.addMouseListener(warehouseListener);
		importButton.setBounds(44, 0, 118, 44);
		importButton.setClicked(true);
		navi_panel.add(importButton);

		line = new MySeperator();
		line.setBounds(44, 44, 630, 10);
		add(line);

	}


	public MyTable getTable1() {
		return table1;
	}

	public void setTable1(MyTable table1) {
		this.table1 = table1;
	}

	public MyTable getTable() {
		return table;
	}

	public DefaultTableModel getModel1() {
		return model1;
	}

	public void setText(String s){
		dialog.setText(s);
	}


	public DefaultTableModel getModel() {
		return model;
	}

	public MyButton getButton_1() {
		return button_1;
	}

	public MyButton getButton_2() {
		return button_2;
	}

	public SubNaviButton getExportButton() {
		return this.exportButton;
	}

	public SubNaviButton getImportButton() {
		return this.importButton;
	}

	public MyButton getExportClearButton() {
		return this.button_3;
	}

	public MyButton getImportClearButton() {
		return this.button_6;
	}

	public MyButton getExportConfirmButton() {
		return this.button_5;
	}

	public JPanel getPanel() {
		return this.panel;
	}

	// public CardLayout getCardLayout() {
	// return this.getCardLayout();
	// }

	public MyButton getButton_3() {
		return button_3;
	}

	public MyButton getButton_5() {
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

	public MyComboBox<String> getComboBox() {
		return comboBox;
	}

	public MyComboBox<String> getComboBox_1() {
		return comboBox_1;
	}

	public MyComboBox<String> getComboBox_2() {
		return comboBox_2;
	}

	public MyComboBox<String> getComboBox_3() {
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

	public MyComboBox<Object> getComboBox_4() {
		return comboBox_4;
	}

	public JLabel getLabel_10() {
		return label_10;
	}

	public MyComboBox<Object> getComboBox_5() {
		return comboBox_5;
	}

	public JLabel getLabel_11() {
		return label_11;
	}

	public MyComboBox<Object> getComboBox_6() {
		return comboBox_6;
	}

	public JLabel getLabel_12() {
		return label_12;
	}

	public MyButton getButton() {
		return button;
	}

	public MyButton getButton_6() {
		return button_6;
	}

	public JLabel getLabel_13() {
		return label_13;
	}

	public MyComboBox<Object> getComboBox_7() {
		return comboBox_7;
	}

	public JLabel getLabel_14() {
		return label_14;
	}

	public MyComboBox<Object> getComboBox_8() {
		return comboBox_8;
	}

	public JLabel getLabel_15() {
		return label_15;
	}

	public MyComboBox<Object> getComboBox_9() {
		return comboBox_9;
	}

	public JLabel getLabel_16() {
		return label_16;
	}

	public MyComboBox<Object> getComboBox_10() {
		return comboBox_10;
	}

	public MyButton getImportConfirmButton() {
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

	public SubNaviButton getButton1() {
		return this.importButton;
	}

	public SubNaviButton getButton2() {
		return this.exportButton;
	}

	public DatePicker getMdp1() {
		return mdp1;
	}

	public void setMdp1(DatePicker mdp1) {
		this.mdp1 = mdp1;
	}
}
