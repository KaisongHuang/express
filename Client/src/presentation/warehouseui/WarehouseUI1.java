/**
 * WarehouseUI1是Warehouse用户的出库入库界面
 */

package presentation.warehouseui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import listener.warehouselistener.WarehouseListener1;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//出库入库界面
public class WarehouseUI1 extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton exportButton;
	private JButton importButton;
	private JButton button_3;
	private JButton button_5;
	private JButton button_1;
	private JButton button_2;
	private JPanel exportPanel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lblNewLabel_1;
	private JComboBox<String> comboBox;
	private JComboBox<String> comboBox_1;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> comboBox_3;
	private WarehouseListener1 listener;
	private CardLayout card;
	private JPanel importPanel;
	private JLabel label_7;
	private JTextField textField_3;
	private JLabel label_8;
	private JLabel label_9;
	private JTextField textField_4;
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
	
	WarehouseListener1 warehouseListener;

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
		panel.setBounds(100, 50, 532, 334);
		panel.setLayout(card);
		add(panel);

		exportPanel = new JPanel();

		exportPanel.setBackground(Color.WHITE);
		exportPanel.setLayout(null);

		label = new JLabel("快递编号:");
		label.setBounds(6, 20, 57, 15);
		exportPanel.add(label);

		textField = new JTextField();
		textField.setBounds(75, 13, 122, 27);
		exportPanel.add(textField);
		textField.setColumns(10);

		label_1 = new JLabel("出库日期:");
		label_1.setBounds(6, 138, 57, 15);
		exportPanel.add(label_1);

		label_2 = new JLabel("目的地:");
		label_2.setBounds(6, 58, 57, 15);
		exportPanel.add(label_2);

		textField_1 = new JTextField();
		textField_1.setBounds(75, 52, 122, 27);
		exportPanel.add(textField_1);
		textField_1.setColumns(10);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(75, 134, 70, 25);
		comboBox.addItem("2015");
		exportPanel.add(comboBox);

		label_3 = new JLabel("年");
		label_3.setBounds(144, 138, 23, 15);
		exportPanel.add(label_3);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(157, 134, 70, 25);
		comboBox_1.addItem("01");
		exportPanel.add(comboBox_1);

		label_4 = new JLabel("月");
		label_4.setBounds(225, 138, 13, 15);
		exportPanel.add(label_4);

		comboBox_2 = new JComboBox<String>();
		comboBox_2.setBounds(239, 134, 70, 25);
		comboBox_2.addItem("01");
		exportPanel.add(comboBox_2);

		label_5 = new JLabel("日");
		label_5.setBounds(306, 138, 23, 15);
		exportPanel.add(label_5);

		label_6 = new JLabel("装运形式:");
		label_6.setBounds(6, 179, 57, 15);
		comboBox_3.addItem("飞机");
		comboBox_3.addItem("火车");
		comboBox_3.addItem("汽车");
		exportPanel.add(label_6);

		comboBox_3 = new JComboBox<String>();
		comboBox_3.setBounds(75, 175, 70, 25);
		exportPanel.add(comboBox_3);

		lblNewLabel_1 = new JLabel("中转单编号:");
		lblNewLabel_1.setBounds(6, 98, 70, 15);
		exportPanel.add(lblNewLabel_1);

		textField_2 = new JTextField();
		textField_2.setBounds(75, 91, 122, 27);
		exportPanel.add(textField_2);
		textField_2.setColumns(10);

		button_5 = new JButton("确认");
		button_5.setBounds(51, 249, 94, 27);
		button_5.addActionListener(listener);
		exportPanel.add(button_5);

		button_3 = new JButton("清空");
		button_3.setBounds(144, 249, 94, 27);
		button_3.addActionListener(listener);
		exportPanel.add(button_3);

		button_2 = new JButton("导入");
		button_2.setBounds(239, 248, 94, 29);
		button_2.addActionListener(warehouseListener);
		exportPanel.add(button_2);

		importPanel = new JPanel();
		importPanel.setLayout(null);
		importPanel.setBackground(Color.WHITE);

		label_7 = new JLabel("快递编号:");
		label_7.setBounds(6, 12, 57, 15);
		importPanel.add(label_7);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(75, 6, 122, 27);
		importPanel.add(textField_3);

		label_8 = new JLabel("出库日期:");
		label_8.setBounds(6, 45, 57, 15);
		importPanel.add(label_8);

		label_9 = new JLabel("目的地:");
		label_9.setBounds(247, 12, 57, 15);
		importPanel.add(label_9);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(300, 6, 122, 27);
		importPanel.add(textField_4);

		comboBox_4 = new JComboBox<Object>();
		comboBox_4.setBounds(75, 39, 94, 25);
		comboBox_4.addItem("2015");
		importPanel.add(comboBox_4);

		label_10 = new JLabel("年");
		label_10.setBounds(168, 45, 20, 15);
		importPanel.add(label_10);

		comboBox_5 = new JComboBox<Object>();
		comboBox_5.setBounds(200, 41, 70, 25);
		comboBox_5.addItem("01");
		importPanel.add(comboBox_5);

		label_11 = new JLabel("月");
		label_11.setBounds(270, 45, 20, 15);
		importPanel.add(label_11);

		comboBox_6 = new JComboBox<Object>();
		comboBox_6.setBounds(318, 41, 70, 25);
		comboBox_6.addItem("01");
		importPanel.add(comboBox_6);

		label_12 = new JLabel("日");
		label_12.setBounds(390, 45, 57, 15);
		importPanel.add(label_12);

		button = new JButton("确认");
		button.setBounds(198, 126, 94, 27);
		importPanel.add(button);

		button_6 = new JButton("清空");
		button_6.setBounds(305, 126, 94, 27);
		importPanel.add(button_6);

		label_13 = new JLabel("区号:");
		label_13.setBounds(32, 85, 31, 16);
		importPanel.add(label_13);

		comboBox_7 = new JComboBox<Object>();
		comboBox_7.setBounds(75, 79, 94, 27);
		comboBox_7.addItem("航运区");
		comboBox_7.addItem("铁运区");
		comboBox_7.addItem("汽运区");
		importPanel.add(comboBox_7);

		label_14 = new JLabel("排号:");
		label_14.setBounds(167, 85, 42, 16);
		importPanel.add(label_14);

		comboBox_8 = new JComboBox<Object>();
		comboBox_8.setBounds(200, 79, 70, 27);
		comboBox_8.addItem("1");
		importPanel.add(comboBox_8);

		label_15 = new JLabel("架号:");
		label_15.setBounds(290, 85, 42, 16);
		importPanel.add(label_15);

		comboBox_9 = new JComboBox<Object>();
		comboBox_9.setBounds(318, 79, 70, 27);
		comboBox_9.addItem("1");
		importPanel.add(comboBox_9);

		label_16 = new JLabel("位号:");
		label_16.setBounds(405, 83, 61, 16);
		importPanel.add(label_16);

		comboBox_10 = new JComboBox<Object>();
		comboBox_10.setBounds(435, 79, 70, 27);
		comboBox_10.addItem("1");
		importPanel.add(comboBox_10);

		button_1 = new JButton("导入");
		button_1.setBounds(85, 126, 94, 27);
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

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
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

	public JLabel getLabel() {
		return label;
	}

	public JLabel getLabel_1() {
		return label_1;
	}

	public JLabel getLabel_2() {
		return label_2;
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

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
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

	public JLabel getLabel_7() {
		return label_7;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public JLabel getLabel_8() {
		return label_8;
	}

	public JLabel getLabel_9() {
		return label_9;
	}

	public JTextField getTextField_4() {
		return textField_4;
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

	public String getExportID() {
		return this.textField.getText();
	}

	public String getImportID() {
		return this.textField_3.getText();
	}

	public String getExportDestination() {
		return this.textField_1.getText();
	}

	public String getImportDestination() {
		return this.textField_4.getText();
	}

	public String getTrans_ID() {
		return this.textField_2.getText();
	}

	public String getTransportation() {
		return (String) comboBox_3.getSelectedItem();
	}

	private void setImage() {

	}
}
