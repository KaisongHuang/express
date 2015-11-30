package listener.financelistener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import logic.financebl.Finance;
import logic.financeblservice.FinanceBlService;
import presentation.financeui.FinanceUI2;
import vo.PayVO;

public class FinanceListener2 implements ActionListener {
	private FinanceUI2 ui;
	FinanceBlService financeBl = new Finance();

	public FinanceListener2(FinanceUI2 ui) {
		super();
		this.ui = ui;
	}

	public void actionPerformed(ActionEvent e) {
		// add
		if (e.getSource() == ui.getButton()) {
			String year = (String) ui.getComboBox_1().getSelectedItem();
			String month = (String) ui.getComboBox_2().getSelectedItem();
			String day = (String) ui.getComboBox_3().getSelectedItem();

			String date = year + month + day;
			double money = Double.parseDouble(ui.getTextField_1().getText());
			String payer = ui.getTextField_2().getText();
			String payAccount = ui.getTextField_3().getText();
			String entry = (String) ui.getComboBox().getSelectedItem();
			String comments = ui.getTextField_4().getText();

			Vector<Object> item = new Vector<Object>();
			item.add(date);
			item.add(money);
			item.add(payer);
			item.add(payAccount);
			item.add(entry);
			item.add(comments);

			ui.getModel().addRow(item);
		}
		// clear
		else if (e.getSource() == ui.getButton_1()) {
			ui.getComboBox().setSelectedIndex(0);
			ui.getComboBox_1().setSelectedIndex(0);
			ui.getComboBox_2().setSelectedIndex(0);
			ui.getComboBox_3().setSelectedIndex(0);
			ui.getTextField_1().setText("");
			ui.getTextField_2().setText("");
			ui.getTextField_3().setText("");
			ui.getTextField_4().setText("");
		}

		// excel
		// else if(e.getSource()==ui.getButton_2()){}

		// delete
		else if (e.getSource() == ui.getBtnNewButton()) {
			int selectedRow = ui.getTable().getSelectedRow();// 获得选中行的索引
			if (selectedRow != -1) // 存在选中行
			{
				ui.getModel().removeRow(selectedRow); // 删除行
			}
		}
		// done
		else if (e.getSource() == ui.getButton_3()) {
			final JFrame jf = new JFrame();
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setBounds(300, 300, 450, 150);
			JPanel contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			jf.setContentPane(contentPane);
			contentPane.setLayout(null);

			JButton button = new JButton("保存");
			button.setBounds(86, 75, 117, 29);
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < ui.getTable().getRowCount(); i++) {
						PayVO vo = new PayVO();
						Vector<Object> rowData = new Vector<Object>();
						for (int j = 0; j < 6; j++) {
							rowData.add(ui.getTable().getValueAt(i, j));
						}
						vo.setDate((String) rowData.get(0));
						vo.setPayAccount((String) rowData.get(1));
						vo.setPayer((String) rowData.get(2));
						vo.setCost((Double) rowData.get(3));
						vo.setEntry((String) rowData.get(4));
						vo.setComments((String) rowData.get(5));
						vo.setIsCheck(0);
						financeBl.createCost(vo);
					}

				}
			});
			contentPane.add(button);

			JButton button_1 = new JButton("继续修改");
			button_1.setBounds(245, 75, 117, 29);
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					jf.dispose();
				}
			});
			contentPane.add(button_1);

			JLabel label = new JLabel("是否保存新建的库存信息？");
			label.setBounds(149, 47, 244, 16);
			contentPane.add(label);
		}
	}

}
